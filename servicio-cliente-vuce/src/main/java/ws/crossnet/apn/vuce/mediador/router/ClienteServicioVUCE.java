package ws.crossnet.apn.vuce.mediador.router;

import java.util.List;

import javax.activation.DataHandler;

import ws.crossnet.apn.vuce.mediador.esquema.notificacion.DocumentoReferenciaType;
import ws.crossnet.apn.vuce.mediador.esquema.notificacion.DocumentoType;
import ws.crossnet.apn.vuce.mediador.esquema.notificacion.ErroresType;
import ws.crossnet.apn.vuce.mediador.esquema.notificacion.NotificacionType;
import ws.crossnet.apn.vuce.vucentws.VucentWS;
import ws.crossnet.apn.vuce.vucentws.VucentWSPortType;
import ws.crossnet.apn.vucentws.esquemas.TransaccionType;

public class ClienteServicioVUCE {

	private static final int ENTIDAD = 70;
	private static final int MAXIMO_INTENTOS = 3;
	// No borrar - private static final int ERROR_EN_LA_RECEPCION = 1;
	private static final int RECIBIDO_CORRECTAMENTE = 0;

	private VucentWSPortType servicioVUCE = null;
	private final String BUZON = "B";

	public ClienteServicioVUCE() {
		servicioVUCE = new VucentWS().getVucentWSHttpSoap11Endpoint();
	}

	public void confirmarRecepcionCorrectaMensaje(TransaccionType tx) {
		servicioVUCE.confirmarRecepcionMensaje(tx.getIdTransmision(), RECIBIDO_CORRECTAMENTE, "");
	}

	public void confirmarRecepcionErroneaMensaje(TransaccionType tx, Throwable e) {
		// servicioVUCE.confirmarRecepcionMensaje(tx.getIdTransmision(),
		// ERROR_EN_LA_RECEPCION, "Error reportado por APN");
	}

	public void enviarNotificacionConReintento(DataHandler xmlNotificacion, DataHandler ebXML, DataHandler adjuntos)
			throws ProcesadorMensajesVUCEException {
		int intento = 1;
		System.out.println("Iniciando envío de notificación a vuce");
		while (intento <= MAXIMO_INTENTOS) {
			try {
				System.out.println("Intento de envío: " + intento);
				servicioVUCE.enviarNotificaciones(xmlNotificacion, ebXML, adjuntos);
				// DEBUG:
				RouterVUCEHelper.guardarDataHandler_("Adjuntos", adjuntos, "zip");
				RouterVUCEHelper.guardarDataHandler_("ebXML", ebXML, "zip");
				System.out.println("Fin del envío de la notificación con éxito");
				break;
			} catch (Throwable e) {
				intento++;
				delay();
				System.out.println(e);
				if (intento == MAXIMO_INTENTOS + 1) {
					System.out.println("Fin del envío de la notificación sin éxito");
					throw new ProcesadorMensajesVUCEException(e.getMessage());
				}
			}
		}
	}

	public void enviarNotificacion(NotificacionType notificacion, String ebXML, DataHandler adjuntos)
			throws ProcesadorMensajesVUCEException {

		if (notificacion.getNumeroNotificacion() == 0) {

			int numNotificacion = 100;
			notificacion.setNumeroNotificacion(numNotificacion);

			if (notificacion.getDocumento().getTipo().equals(BUZON)) {
				DocumentoType documento = notificacion.getDocumento();
				documento.setNumero(Integer.toString(numNotificacion));
				notificacion.setDocumento(documento);
			}
		}

		notificacion.setEntidad(ENTIDAD);
		String numeroDocumento = "N/A";
		String numeroDocumentoReferencia = "N/A";
		String tipoDocumentoReferencia = "N/A";
		String tipoDocumento = "N/A";
		String notificacionString = "N/A";

		try {

			DocumentoReferenciaType docReferencia = notificacion.getDocumentoReferencia();
			if (docReferencia == null) {
				docReferencia = new DocumentoReferenciaType();
				docReferencia.setNumero("");
				docReferencia.setTipo("");
				notificacion.setDocumentoReferencia(docReferencia);
			}

			ErroresType errores = notificacion.getErrores();
			if (errores == null) {
				errores = new ErroresType();
				notificacion.setErrores(errores);
			}

			String texto = notificacion.getTexto();
			if (texto == null) {
				texto = "";
				notificacion.setTexto(texto);
			}

			notificacionString = RouterVUCEHelper.convertirNotificacionXML(notificacion);
			DataHandler xmlNotificacion = new javax.activation.DataHandler(notificacionString,
					"text/plain; charset=UTF-8");

			DocumentoType documento = notificacion.getDocumento();
			DocumentoReferenciaType documentoReferencia = notificacion.getDocumentoReferencia();

			if (documento != null) {
				numeroDocumento = notificacion.getDocumento().getNumero();
				tipoDocumento = notificacion.getDocumento().getTipo();
			}

			if (documentoReferencia != null) {
				numeroDocumentoReferencia = notificacion.getDocumentoReferencia().getNumero();
				tipoDocumentoReferencia = notificacion.getDocumentoReferencia().getTipo();
			}

			DataHandler ebXMLDh = null;
			if (ebXML != null) {
				ebXMLDh = RouterVUCEHelper.comprimirCadenaTexto(ebXML);
			}
			enviarNotificacionConReintento(xmlNotificacion, ebXMLDh, adjuntos);

		} catch (Exception e) {

			System.out.println(e);

			throw new ProcesadorMensajesVUCEException("No se pudo enviar la notificación debido a: " + e.getMessage(),
					e);

		}

	}

	public void enviarNotificacion(NotificacionType notificacion) throws ProcesadorMensajesVUCEException {
		enviarNotificacion(notificacion, null, null);
	}

	public void enviarNotificacion(NotificacionType notificacion, DataHandler adjuntos)
			throws ProcesadorMensajesVUCEException {
		enviarNotificacion(notificacion, null, adjuntos);
	}

	public List<DataHandler> obtenerTransaccionesConReintento() throws ProcesadorMensajesVUCEException {
		System.out.println("Iniciando procesamiento de transacciones");
		int intento = 1;
		List<DataHandler> dhList = null;
		while (intento <= MAXIMO_INTENTOS) {
			try {
				System.out.println("Intento de envío: " + intento);
				dhList = (List<DataHandler>) servicioVUCE.obtenerTransaccionesPendientes(ENTIDAD);
				System.out.println("Fin de procesamiento de transacciones con éxito");
				break;
			} catch (Throwable e) {
				intento++;
				delay();
				System.out.println(e);
				if (intento == MAXIMO_INTENTOS + 1) {
					System.out.println("Fin de procesamiento de transacciones sin éxito");
					throw new ProcesadorMensajesVUCEException("Fin de procesamiento de transacciones sin éxito", e);
				}
			}
		}

		return dhList;
	}

	private static void delay() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
		}
	}

}
