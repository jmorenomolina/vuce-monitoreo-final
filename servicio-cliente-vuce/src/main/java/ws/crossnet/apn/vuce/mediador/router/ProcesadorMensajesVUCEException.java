package ws.crossnet.apn.vuce.mediador.router;

public class ProcesadorMensajesVUCEException extends Exception {

	private static final long serialVersionUID = 1L;

	public ProcesadorMensajesVUCEException() {
		}

	public ProcesadorMensajesVUCEException(String message) {
		super(message);
		
	}

	public ProcesadorMensajesVUCEException(Throwable cause) {
		super(cause);
	}

	public ProcesadorMensajesVUCEException(String message, Throwable cause) {
		super(message, cause);
	}

	public ProcesadorMensajesVUCEException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
