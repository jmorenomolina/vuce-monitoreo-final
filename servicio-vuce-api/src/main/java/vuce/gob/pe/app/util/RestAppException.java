package vuce.gob.pe.app.util;

public class RestAppException extends Exception {

	private static final long serialVersionUID = -8999932578270387947L;
	

	String code;
	String developerMessage;
	
	public RestAppException() { }

	public RestAppException(int status, String code, String message) {
		super(message);
		this.code = code;
	}
	
	
	public RestAppException(String code, String message, String developerMessage,Exception ex) {
		super(message,ex);
		this.code = code;
		this.developerMessage = developerMessage;
	}

	public String getCode() {
		return code;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}


	public void setCode(String code) {
		this.code = code;
	}

	public void setDeveloperMessage(String developerMessage) {
		this.developerMessage = developerMessage;
	}


	
					
}

