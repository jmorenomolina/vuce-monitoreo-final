package vuce.gob.pe.app.rest.parameter;

public class ConfiguracionMonitoreoInput {
	
	Integer entidadId;
	private String correoSoporte;
	private String slaNombre;
	private Integer slaValor;
	private String estado;
	

	public Integer getEntidadId() {
		return entidadId;
	}
	public void setEntidadId(Integer entidadId) {
		this.entidadId = entidadId;
	}
	
	public String getCorreoSoporte() {
		return correoSoporte;
	}
	public void setCorreoSoporte(String correoSoporte) {
		this.correoSoporte = correoSoporte;
	}
	public String getSlaNombre() {
		return slaNombre;
	}
	public void setSlaNombre(String slaNombre) {
		this.slaNombre = slaNombre;
	}
	public Integer getSlaValor() {
		return slaValor;
	}
	public void setSlaValor(Integer slaValor) {
		this.slaValor = slaValor;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
			
		
	
}
