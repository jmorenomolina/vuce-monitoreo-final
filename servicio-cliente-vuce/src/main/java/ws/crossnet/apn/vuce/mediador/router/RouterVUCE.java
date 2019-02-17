package ws.crossnet.apn.vuce.mediador.router;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import javax.activation.DataHandler;

import ws.crossnet.apn.vucentws.esquemas.TransaccionType;

public class RouterVUCE {

	public static final String MENSAJE_ADJUNTOS = "adjuntos.zip";
	public static final String MENSAJE_EBXML = "formatoEBXML.xml";
	public static final String MENSAJE_XML = "mensaje.xml";
	public static final String TMP = "./";
	private ClienteServicioVUCE servicioVUCE;

	public RouterVUCE() {
		super();
		servicioVUCE = new ClienteServicioVUCE();
	}

	/**
	 * Este método es ejecutado periodicamente para extraer los mensajes de VUCE
	 * Aclaración: De VUCE se recibe un arreglo de archivos ZIP
	 */
	public void obtenerTransaccionesPendientes(List<DataHandler> dhList) {
		// Se recibe un arreglo de zip
		for (Iterator<DataHandler> iterator = dhList.iterator(); iterator.hasNext();) {
			// datahandler contiene un archivo zip
			leerTransaccion((DataHandler) iterator.next());
		}
	}

	public void obtenerTransaccionesPendientes() throws ProcesadorMensajesVUCEException {
		// Se recibe un arreglo de zip desde VUCE
		List<DataHandler> dhList = servicioVUCE.obtenerTransaccionesConReintento();
		obtenerTransaccionesPendientes(dhList);
	}

	public void eliminarTransaccionesPendientes() throws ProcesadorMensajesVUCEException {
		// Se recibe un arreglo de zip desde VUCE
		List<DataHandler> dhList = servicioVUCE.obtenerTransaccionesConReintento();
		// Se recibe un arreglo de zip
		for (Iterator<DataHandler> iterator = dhList.iterator(); iterator.hasNext();) {
			// datahandler contiene un archivo zip
			TransaccionType tx = leerTransaccion((DataHandler) iterator.next());
			servicioVUCE.confirmarRecepcionCorrectaMensaje(tx);
			System.out.println("Transmision " + tx.getIdTransmision() + " eliminada");
		}
	}

	/**
	 * Este metodo procesa una mensaje N de VUCE.
	 * 
	 * @param dataHandler
	 *            Archivo zip
	 * @throws ProcesadorMensajesVUCEException
	 * @throws Exception
	 */
	private TransaccionType leerTransaccion(DataHandler dataHandler) {

		TransaccionType transaccion = null;
		ZipEntry ze = null;
		String payload = null;
		File zipFile = null;
		RouterVUCEHelper vuceHelper = new RouterVUCEHelper();
		boolean transaccionRegistrada = false;
		String transaccionXML = "";
		try (ZipInputStream zis = new ZipInputStream(dataHandler.getInputStream(), Charset.forName("ISO-8859-1"))) {

			while ((ze = zis.getNextEntry()) != null) {

				// Extrae el mensaje XML de la transmision
				String entryName = ze.getName();
				if (entryName.equals(MENSAJE_XML)) {

					transaccionXML = vuceHelper.extraerXML(zis);
					transaccion = vuceHelper.extraerMensajeXML(transaccionXML);

					if (transaccionRegistrada) {
						System.out.println("Transacción procesada correctamente: Código de transmisión="
								+ transaccion.getIdTransmision() + ", Tipo de mensaje=" + transaccion.getTipoMensaje());
						servicioVUCE.confirmarRecepcionCorrectaMensaje(transaccion);
						break;
					}

					zis.closeEntry();
				}

				// Extrae el archivo EBXML.
				if (entryName.equals(MENSAJE_EBXML)) {
					payload = vuceHelper.extraerXML(zis); // Leer el ebXML
					// TEMPORAL: RouterVUCEHelper.guardarEBXML2Alfresco(payload,
					// transaccion.getDocumento().getNumero());
					// System.out.println("ebXML: " + payload);
					zis.closeEntry();
				}

				// Los archivos adjuntos vienen en un zip
				if (entryName.equals(MENSAJE_ADJUNTOS) && (esN1(transaccion) || esN61(transaccion))) {
					// Copia los archivos adjuntos hacia una carpeta llamada con
					// el numero de orden en Alfresco
					// Primero hay que guardar el archizo zip hacia el disco
					// duro
					// Solo en algunos mensajes está permitido subir adjuntos
					// Nota: Por el momento solo recibimos adjuntos en N1
					procesarTransaccion(transaccion, payload, transaccionXML);
					vuceHelper.extraerAdjuntos(transaccion, zis);
					zis.closeEntry();
					transaccionRegistrada = true;
				}
			}
			// Invoca al método específico responsable de atender la transacción
			if (!transaccionRegistrada) {
				procesarTransaccion(transaccion, payload, transaccionXML);
			}

		} catch (Throwable e) {

			if (transaccion != null) {

				System.out.print(
						"Transacción procesada incorrectamente: Código de transmisión="
								+ transaccion.getIdTransmision() + ", Tipo de mensaje=" + transaccion.getTipoMensaje());

				servicioVUCE.confirmarRecepcionErroneaMensaje(transaccion, e);

			}

		} finally {

			if (zipFile != null) {
				zipFile.delete();
			}
		}
		return transaccion;

	}

	private void procesarTransaccion(TransaccionType transaccion, String payload, String transaccionXML)
			throws Exception {

		System.out.println("Transacción procesada correctamente: Código de transmisión="
				+ transaccion.getIdTransmision() + ", Tipo de mensaje=" + transaccion.getTipoMensaje());

		servicioVUCE.confirmarRecepcionCorrectaMensaje(transaccion);
	}

	private boolean esN1(TransaccionType transaccion) {
		return "N1".indexOf(transaccion.getTipoMensaje()) >= 0;
	}

	private boolean esN61(TransaccionType transaccion) {
		return "N61".indexOf(transaccion.getTipoMensaje()) >= 0;
	}

}
