package pe.gob.vuce.entidad;

public class TransmisionEntrada {

   	private String numeroDocumento;
	private String tipoDocumento;
	private String tipoMensaje;
	private String xml;

	public TransmisionEntrada() {
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public String getTipoMensaje() {
		return tipoMensaje;
	}

	public String getXml() {
		return xml;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public void setTipoMensaje(String tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

}
