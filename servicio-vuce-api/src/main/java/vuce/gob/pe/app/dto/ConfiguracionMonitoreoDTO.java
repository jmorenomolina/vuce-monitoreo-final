package vuce.gob.pe.app.dto;



public class ConfiguracionMonitoreoDTO {
	
	private Integer entidadId;
	private String sla;
	private Integer valor;
	
	public Integer getEntidadId() {
		return entidadId;
	}
	public void setEntidadId(Integer entidadId) {
		this.entidadId = entidadId;
	}
	public String getSla() {
		return sla;
	}
	public void setSla(String sla) {
		this.sla = sla;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	@Override
	public String toString() {
		return "ConfiguracionMonitoreoDTO [entidadId=" + entidadId + ", sla=" + sla + ", valor=" + valor + "]";
	}
	
	
	
	
	
}
