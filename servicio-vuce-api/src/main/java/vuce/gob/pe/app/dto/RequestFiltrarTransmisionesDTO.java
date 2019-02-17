package vuce.gob.pe.app.dto;

import java.util.Date;

public class RequestFiltrarTransmisionesDTO {
	
	private String codigoEntidad;	
	private Date fechaInicio;
	private Date fechaFin;
	private String tipoMensaje;
	private String tipoDocumento;
	private String numeroDocumento;
	private String tipoTransmision;
	private String tipoIncidente;
	private String estadoVc;
	private String estadoVe;
	private String vcId;
	private String veId;
	
	public String getCodigoEntidad() {
		return codigoEntidad;
	}
	public void setCodigoEntidad(String codigoEntidad) {
		this.codigoEntidad = codigoEntidad;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public String getTipoMensaje() {
		return tipoMensaje;
	}
	public void setTipoMensaje(String tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
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
	public String getTipoTransmision() {
		return tipoTransmision;
	}
	public void setTipoTransmision(String tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}
	public String getTipoIncidente() {
		return tipoIncidente;
	}
	public void setTipoIncidente(String tipoIncidente) {
		this.tipoIncidente = tipoIncidente;
	}
	public String getEstadoVc() {
		return estadoVc;
	}
	public void setEstadoVc(String estadoVc) {
		this.estadoVc = estadoVc;
	}
	public String getEstadoVe() {
		return estadoVe;
	}
	public void setEstadoVe(String estadoVe) {
		this.estadoVe = estadoVe;
	}
	public String getVcId() {
		return vcId;
	}
	public void setVcId(String vcId) {
		this.vcId = vcId;
	}
	public String getVeId() {
		return veId;
	}
	public void setVeId(String veId) {
		this.veId = veId;
	}
	
	@Override
	public String toString() {
		return "RequestFiltrarTransmisionesDTO [codigoEntidad=" + codigoEntidad + ", fechaInicio=" + fechaInicio
				+ ", fechaFin=" + fechaFin + ", tipoMensaje=" + tipoMensaje + ", tipoDocumento=" + tipoDocumento
				+ ", numeroDocumento=" + numeroDocumento + ", tipoTransmision=" + tipoTransmision + ", tipoIncidente="
				+ tipoIncidente + ", estadoVc=" + estadoVc + ", estadoVe=" + estadoVe + ", vcId=" + vcId + ", veId="
				+ veId + "]";
	}
	
	
}
