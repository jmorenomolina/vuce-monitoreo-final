package vuce.gob.pe.app.dto;

public class TrasmisionIncidenteDTO {
	
	private Integer codigoEntidad;
	private String siglaEntidad;
	private Integer cantidadTrasmisionEntrada;
	private Integer cantidadTrasmisionSalida;
	
	public Integer getCodigoEntidad() {
		return codigoEntidad;
	}
	public void setCodigoEntidad(Integer codigoEntidad) {
		this.codigoEntidad = codigoEntidad;
	}
	public String getSiglaEntidad() {
		return siglaEntidad;
	}
	public void setSiglaEntidad(String siglaEntidad) {
		this.siglaEntidad = siglaEntidad;
	}
	public Integer getCantidadTrasmisionEntrada() {
		return cantidadTrasmisionEntrada;
	}
	public void setCantidadTrasmisionEntrada(Integer cantidadTrasmisionEntrada) {
		this.cantidadTrasmisionEntrada = cantidadTrasmisionEntrada;
	}
	public Integer getCantidadTrasmisionSalida() {
		return cantidadTrasmisionSalida;
	}
	public void setCantidadTrasmisionSalida(Integer cantidadTrasmisionSalida) {
		this.cantidadTrasmisionSalida = cantidadTrasmisionSalida;
	}
	@Override
	public String toString() {
		return "TrasmisionIncidenteDTO [codigoEntidad=" + codigoEntidad + ", siglaEntidad=" + siglaEntidad
				+ ", cantidadTrasmisionEntrada=" + cantidadTrasmisionEntrada + ", cantidadTrasmisionSalida="
				+ cantidadTrasmisionSalida + "]";
	}
	
	
	
	
}
