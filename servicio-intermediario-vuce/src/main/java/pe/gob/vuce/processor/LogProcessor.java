package pe.gob.vuce.processor;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.activation.DataHandler;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.camel.Exchange;
import org.apache.camel.Message;
import org.apache.camel.Processor;

import com.fasterxml.jackson.databind.ObjectMapper;

import pe.gob.vuce.entidad.Operacion;
import pe.gob.vuce.entidad.TransmisionSalida;
import pe.gob.vuce.esquema.transaccion.TransaccionType;

public class LogProcessor implements Processor {

	private static final String MENSAJE_XML = "mensaje.xml";
	private static final String MENSAJE_EBXML = "formatoEBXML.xml";
	private static final String MENSAJE_ADJUNTOS = "adjuntos.zip";

	@Override
	public void process(final Exchange exchange) throws Exception {

		Operacion operacion = exchange.getProperty("solicitud", Operacion.class);
		Message in = exchange.getIn();
		Map<String, DataHandler> adjuntos = in.getAttachments();

		ZipEntry ze = null;

		ArrayList<TransmisionSalida> transmisionesSalida = new ArrayList<TransmisionSalida>();

		for (Map.Entry<String, DataHandler> entry : adjuntos.entrySet()) {

			DataHandler dataHandler = entry.getValue();
			ZipInputStream zis = null;

			TransmisionSalida transmisionSalida = new TransmisionSalida();

			// Abrir el archivo zip

			try {

				@SuppressWarnings("unused")
				InputStream is = dataHandler.getInputStream();
				DataHandler dh = new DataHandler(dataHandler.getDataSource());
				zis = new ZipInputStream(dh.getInputStream(), Charset.forName("ISO-8859-1"));

				while ((ze = zis.getNextEntry()) != null) {

					String entryName = ze.getName();

					if (entryName.equals(MENSAJE_XML)) {

						String mensajeXML = extraerXML(zis);

						try {

							TransaccionType tx = extraerMensajeXML(mensajeXML);
							transmisionSalida.setIdTransmision(tx.getIdTransmision());
							transmisionSalida.setTipoDocumento(tx.getDocumento().getTipo());
							transmisionSalida.setNumeroDocumento(tx.getDocumento().getNumero());
							transmisionSalida.setTipoMensaje(tx.getTipoMensaje());
							transmisionSalida.setMensajeXML(mensajeXML);

						} catch (Exception e) {
							System.out.println("Operacion: " + operacion.getNombreOperacion() + " | Usuario: " + operacion.getNombreUsuario() + " | Id de mensaje: " + operacion.getIdMensaje() + " | Error: " + e.getMessage());
						}

					} else

					if (entryName.equals(MENSAJE_EBXML)) {

						String ebXML = extraerXML(zis); // Leer el ebXML
						transmisionSalida.setEbXML(ebXML);

					} else

					if (entryName.equals(MENSAJE_ADJUNTOS)) {
						transmisionSalida.setTamanoAdjuntos(determinarTamanoAdjuntos(zis));
					}

					zis.closeEntry();
				}

			} finally {
				// Cerrar zip
				zis.close();
			}

			transmisionesSalida.add(transmisionSalida);

		}

		operacion.setTransmisionesSalida(transmisionesSalida);
		ObjectMapper mapper = new ObjectMapper();
		String jsonSolicitud = mapper.writeValueAsString(operacion);
		in.setBody(jsonSolicitud);

	}

	private String extraerXML(ZipInputStream zis) throws ProcesadorMensajesVUCEException {
		StringBuilder xmlSB = new StringBuilder();
		try {
			byte[] buffer = new byte[1024];
			int read;
			while ((read = zis.read(buffer, 0, 1024)) >= 0) {
				xmlSB.append(new String(buffer, 0, read, "ISO-8859-1"));
			}
		} catch (Exception e) {
			throw new ProcesadorMensajesVUCEException(e);
		}
		return xmlSB.toString();
	}

	private TransaccionType extraerMensajeXML(String xmlSB) throws ProcesadorMensajesVUCEException {
		TransaccionType transaccion = null;
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(TransaccionType.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			transaccion = (TransaccionType) unmarshaller.unmarshal(new StreamSource(new StringReader(xmlSB)));
		} catch (Exception e) {
			throw new ProcesadorMensajesVUCEException(e);
		}
		return transaccion;
	}

	private int determinarTamanoAdjuntos(ZipInputStream zis) throws ProcesadorMensajesVUCEException {
		final ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			final byte[] buffer = new byte[1024];
			int read = 0;
			while ((read = zis.read(buffer, 0, buffer.length)) != -1) {
				baos.write(buffer, 0, read);
			}
			baos.flush();
			return baos.size();
		} catch (Exception e) {
			throw new ProcesadorMensajesVUCEException(e);
		}
	}
}
