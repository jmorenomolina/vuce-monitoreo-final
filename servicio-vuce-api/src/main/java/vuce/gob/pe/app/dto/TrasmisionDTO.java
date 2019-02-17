package vuce.gob.pe.app.dto;

import java.util.Date;

public class TrasmisionDTO {
	
	private String tipo;	
	private Integer tieneIncidente;
	private Integer tipoIncidente;
	private Integer entidadId;
	private String entidadSigla;
	private String tipoMensaje;
	private String nombreMensaje;
	private String xml;
	private String ebxml;
	private String error;
	private Integer vcId;
	private Integer estadoVc;
	private Integer veId;
	private String nombreEstadoVc;
	private Integer estadoVe;
	private String nombreEstadoVe;
	private String tipoDocumento;
	private String nombreDocumento;
	private String numeroDocumento;
	private Date fechaRegistroSalida;
	private Date fechaActualizacionSalida;
	private Integer antiguedadSalida;
	private String formato;
	private Date fechaRegistroEntrada;
	private Date fechaActualizacionEntrada;
	private Integer antiguedadEntrada;
	
	
	
	public Integer getEstadoVc() {
		return estadoVc;
	}
	public void setEstadoVc(Integer estadoVc) {
		this.estadoVc = estadoVc;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public Integer getTieneIncidente() {
		return tieneIncidente;
	}
	public void setTieneIncidente(Integer tieneIncidente) {
		this.tieneIncidente = tieneIncidente;
	}
	public Integer getTipoIncidente() {
		return tipoIncidente;
	}
	public void setTipoIncidente(Integer tipoIncidente) {
		this.tipoIncidente = tipoIncidente;
	}
	public Integer getEntidadId() {
		return entidadId;
	}
	public void setEntidadId(Integer entidadId) {
		this.entidadId = entidadId;
	}
	public String getEntidadSigla() {
		return entidadSigla;
	}
	public void setEntidadSigla(String entidadSigla) {
		this.entidadSigla = entidadSigla;
	}
	public String getTipoMensaje() {
		return tipoMensaje;
	}
	public void setTipoMensaje(String tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
	}
	public String getNombreMensaje() {
		return nombreMensaje;
	}
	public void setNombreMensaje(String nombreMensaje) {
		this.nombreMensaje = nombreMensaje;
	}
	public String getXml() {
		return xml;
	}
	public void setXml(String xml) {
		this.xml = xml;
	}
	public String getEbxml() {
		return ebxml;
	}
	public void setEbxml(String ebxml) {
		this.ebxml = ebxml;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public Integer getVcId() {
		return vcId;
	}
	public void setVcId(Integer vcId) {
		this.vcId = vcId;
	}
	public Integer getVeId() {
		return veId;
	}
	public void setVeId(Integer veId) {
		this.veId = veId;
	}
	public String getNombreEstadoVc() {
		return nombreEstadoVc;
	}
	public void setNombreEstadoVc(String nombreEstadoVc) {
		this.nombreEstadoVc = nombreEstadoVc;
	}
	public Integer getEstadoVe() {
		return estadoVe;
	}
	public void setEstadoVe(Integer estadoVe) {
		this.estadoVe = estadoVe;
	}
	public String getNombreEstadoVe() {
		return nombreEstadoVe;
	}
	public void setNombreEstadoVe(String nombreEstadoVe) {
		this.nombreEstadoVe = nombreEstadoVe;
	}
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public String getNombreDocumento() {
		return nombreDocumento;
	}
	public void setNombreDocumento(String nombreDocumento) {
		this.nombreDocumento = nombreDocumento;
	}
	public String getNumeroDocumento() {
		return numeroDocumento;
	}
	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}
	public Date getFechaRegistroSalida() {
		return fechaRegistroSalida;
	}
	public void setFechaRegistroSalida(Date fechaRegistroSalida) {
		this.fechaRegistroSalida = fechaRegistroSalida;
	}
	public Date getFechaActualizacionSalida() {
		return fechaActualizacionSalida;
	}
	public void setFechaActualizacionSalida(Date fechaActualizacionSalida) {
		this.fechaActualizacionSalida = fechaActualizacionSalida;
	}
	public Integer getAntiguedadSalida() {
		return antiguedadSalida;
	}
	public void setAntiguedadSalida(Integer antiguedadSalida) {
		this.antiguedadSalida = antiguedadSalida;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public Date getFechaRegistroEntrada() {
		return fechaRegistroEntrada;
	}
	public void setFechaRegistroEntrada(Date fechaRegistroEntrada) {
		this.fechaRegistroEntrada = fechaRegistroEntrada;
	}
	public Date getFechaActualizacionEntrada() {
		return fechaActualizacionEntrada;
	}
	public void setFechaActualizacionEntrada(Date fechaActualizacionEntrada) {
		this.fechaActualizacionEntrada = fechaActualizacionEntrada;
	}
	public Integer getAntiguedadEntrada() {
		return antiguedadEntrada;
	}
	public void setAntiguedadEntrada(Integer antiguedadEntrada) {
		this.antiguedadEntrada = antiguedadEntrada;
	}
	
	@Override
	public String toString() {
		return "TrasmisionDTO [tipo=" + tipo + ", tieneIncidente=" + tieneIncidente + ", tipoIncidente=" + tipoIncidente
				+ ", entidadId=" + entidadId + ", entidadSigla=" + entidadSigla + ", tipoMensaje=" + tipoMensaje
				+ ", nombreMensaje=" + nombreMensaje + ", xml=" + xml + ", ebxml=" + ebxml + ", error=" + error
				+ ", vcId=" + vcId + ", veId=" + veId + ", nombreEstadoVc=" + nombreEstadoVc + ", estadoVe=" + estadoVe
				+ ", nombreEstadoVe=" + nombreEstadoVe + ", tipoDocumento=" + tipoDocumento + ", nombreDocumento="
				+ nombreDocumento + ", numeroDocumento=" + numeroDocumento + ", fechaRegistroSalida="
				+ fechaRegistroSalida + ", fechaActualizacionSalida=" + fechaActualizacionSalida + ", antiguedadSalida="
				+ antiguedadSalida + ", formato=" + formato + ", fechaRegistroEntrada=" + fechaRegistroEntrada
				+ ", fechaActualizacionEntrada=" + fechaActualizacionEntrada + ", antiguedadEntrada="
				+ antiguedadEntrada + "]";
	}
	
	
	
}
