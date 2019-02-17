package vuce.gob.pe.app.dto;



public class DetalleAlertaIncidente6DTO {
	
	private String nombreEntidad;
	private Integer cantidadTxSalida;
	private Integer cantidadSolicitudRN1;
	private Integer cantidadSolicitudRN2;
	
	
	public String getNombreEntidad() {
		return nombreEntidad;
	}
	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}
	public Integer getCantidadTxSalida() {
		return cantidadTxSalida;
	}
	public void setCantidadTxSalida(Integer cantidadTxSalida) {
		this.cantidadTxSalida = cantidadTxSalida;
	}
	public Integer getCantidadSolicitudRN1() {
		return cantidadSolicitudRN1;
	}
	public void setCantidadSolicitudRN1(Integer cantidadSolicitudRN1) {
		this.cantidadSolicitudRN1 = cantidadSolicitudRN1;
	}
	public Integer getCantidadSolicitudRN2() {
		return cantidadSolicitudRN2;
	}
	public void setCantidadSolicitudRN2(Integer cantidadSolicitudRN2) {
		this.cantidadSolicitudRN2 = cantidadSolicitudRN2;
	}
	@Override
	public String toString() {
		return "DetalleAlertaIncidente6DTO [nombreEntidad=" + nombreEntidad + ", cantidadTxSalida=" + cantidadTxSalida
				+ ", cantidadSolicitudRN1=" + cantidadSolicitudRN1 + ", cantidadSolicitudRN2=" + cantidadSolicitudRN2
				+ "]";
	}
	
	
	
	
	
	
}
