package vuce.gob.pe.app.dto;

import java.util.Date;
import java.util.List;

public class AlertaTipoIncidenteDTO {
	
	private String nombreEntidad;
	private Date fechaHora;
	private Integer duracion;
	private Integer cantidadTxIncidente;	
	private List<DetalleAlertaTipoIncidenteDTO> alertaIncidentes;
	
	
	public String getNombreEntidad() {
		return nombreEntidad;
	}
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}
	public Date getFechaHora() {
		return fechaHora;
	}
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	public Integer getCantidadTxIncidente() {
		return cantidadTxIncidente;
	}
	public void setCantidadTxIncidente(Integer cantidadTxIncidente) {
		this.cantidadTxIncidente = cantidadTxIncidente;
	}
	public List<DetalleAlertaTipoIncidenteDTO> getAlertaIncidentes() {
		return alertaIncidentes;
	}
	public void setAlertaIncidentes(List<DetalleAlertaTipoIncidenteDTO> alertaIncidentes) {
		this.alertaIncidentes = alertaIncidentes;
	}
	
	
	@Override
	public String toString() {
		return "AlertaTipoIncidenteDTO [nombreEntidad=" + nombreEntidad + ", fechaHora=" + fechaHora + ", duracion="
				+ duracion + ", cantidadTxIncidente=" + cantidadTxIncidente + ", alertaIncidentes=" + alertaIncidentes
				+ "]";
	}
	
	
	
	
}
