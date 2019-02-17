package pe.gob.vuce.alertas.dto;

public class IncidenteCorreoDTO {
	
	private Integer nro;
	private Integer transmision;
	private String tipoDocumento;
	private String numeroDocumento;
	private String fechaHoraGeneracion;
	private Integer antiguedad;
	private String logError;

	public IncidenteCorreoDTO() {
		super();
	}

	public IncidenteCorreoDTO(Integer nro, Integer transmision, String tipoDocumento, String numeroDocumento,
			String fechaHoraGeneracion, Integer antiguedad, String logError) {
		super();
		this.nro = nro;
		this.transmision = transmision;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.fechaHoraGeneracion = fechaHoraGeneracion;
		this.antiguedad = antiguedad;
		this.logError = logError;
	}

	public Integer getNro() {
		return nro;
	}

	public void setNro(Integer nro) {
		this.nro = nro;
	}

	public Integer getTransmision() {
		return transmision;
	}

	public void setTransmision(Integer transmision) {
		this.transmision = transmision;
	}


	public String getFechaHoraGeneracion() {
		return fechaHoraGeneracion;
	}

	public void setFechaHoraGeneracion(String fechaHoraGeneracion) {
		this.fechaHoraGeneracion = fechaHoraGeneracion;
	}

	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public String getLogError() {
		return logError;
	}

	public void setLogError(String logError) {
		this.logError = logError;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	
	
	
}
