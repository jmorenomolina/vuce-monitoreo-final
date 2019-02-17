package vuce.gob.pe.app.dto;

import java.util.Date;

public class DetalleAlertaTipoIncidenteDTO {
	
	private Integer tipoTransmision;
	private String archivoXml;
	private Date fechaHora;
	private Integer antiguedad;
	private String error;
	
	public Integer getTipoTransmision() {
		return tipoTransmision;
	}
	public void setTipoTransmision(Integer tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}
	public String getArchivoXml() {
		return archivoXml;
	}
	public void setArchivoXml(String archivoXml) {
		this.archivoXml = archivoXml;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public Integer getAntiguedad() {
		return antiguedad;
	}
	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	
	@Override
	public String toString() {
		return "DetalleAlertaTipoIncidenteDTO [tipoTransmision=" + tipoTransmision + ", archivoXml=" + archivoXml
				+ ", fechaHora=" + fechaHora + ", antiguedad=" + antiguedad + ", error=" + error + "]";
	}
	
	
	
}
