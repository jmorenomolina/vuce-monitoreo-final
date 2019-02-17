package vuce.gob.pe.app.service.mapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import vuce.gob.pe.app.dto.ConfiguracionMonitoreoDTO;
import vuce.gob.pe.app.dto.ConfiguracionMonitoreoResponseDTO;
import vuce.gob.pe.app.model.EntidadMante;

public class ConverterToConfiguracionMonitoreoResponseDTO {	

  private ConverterToConfiguracionMonitoreoResponseDTO() {
	  super();
  }

  public static List<ConfiguracionMonitoreoResponseDTO> converter(List<EntidadMante> entidades ,List<ConfiguracionMonitoreoDTO> configuraciones) {
	  List<ConfiguracionMonitoreoResponseDTO> response = new ArrayList<>();
	  if(Optional.ofNullable(configuraciones).isPresent() && !configuraciones.isEmpty()) {
		  for(ConfiguracionMonitoreoDTO configuracion : configuraciones) {
			  EntidadMante entidad = ConverterToConfiguracionMonitoreoResponseDTO.findByEntidadId(configuracion, entidades);
			  if(Optional.ofNullable(entidad).isPresent()) {
				 ConfiguracionMonitoreoResponseDTO configuracionAux = ConverterToConfiguracionMonitoreoResponseDTO.findByConfiguracionMonitoreoResponseDTO(response, entidad);
				 if(Optional.ofNullable(configuracionAux).isPresent()) {
					 ConverterToConfiguracionMonitoreoResponseDTO.updateConfigMonitoreo(configuracionAux,configuracion.getSla(), configuracion.getValor());
				 } else {
					 ConfiguracionMonitoreoResponseDTO configNew = ConverterToConfiguracionMonitoreoResponseDTO.createConfigMonitoreo(entidad, configuracion.getSla(), configuracion.getValor());
					 response.add(configNew);
				 }				  
			  }
		  }
	  }	  
	  return response;
  }
  
  private static ConfiguracionMonitoreoResponseDTO findByConfiguracionMonitoreoResponseDTO(List<ConfiguracionMonitoreoResponseDTO> response,EntidadMante entidad) {
	  return response.stream().filter(e->e.getEntidadId().equals(entidad.getIdEntidad())).findAny().orElse(null);
  }
  
  private static EntidadMante findByEntidadId(ConfiguracionMonitoreoDTO configuracion,List<EntidadMante> entidades) {
	  return entidades.stream().filter(e->e.getIdEntidad().equals(configuracion.getEntidadId())).findAny().orElse(null);
  }
  
  private final static String SLA1="SLA_DISPONIBILIDAD_TRAN_SALIDA";
  
  private final static String SLA2="SLA_CONFIRMACION_TRAN_SALIDA";
  
  private final static String SLA3="SLA_PROCESAMIENTO_TRAN_ENTRADA";
  
  private final static String SLA4="SLA_FRECUENCIA_LECTURA";
  
  private final static String SLA5="SLA_MONITOREO_FREC_LECTURA";
  
  private static ConfiguracionMonitoreoResponseDTO createConfigMonitoreo(EntidadMante entidad,String sla,Integer valor) {
	  ConfiguracionMonitoreoResponseDTO conf= new ConfiguracionMonitoreoResponseDTO();
	  conf.setEntidad(entidad.getDescripcion());
	  conf.setEntidadId(entidad.getIdEntidad());
	  if(SLA1.equalsIgnoreCase(sla) ) {
		  conf.setValorSla1(valor);
	  }else if(SLA2.equalsIgnoreCase(sla)) {
		  conf.setValorSla2(valor);
	  }else if(SLA3.equalsIgnoreCase(sla) ) {
		  conf.setValorSla3(valor);
	  }else if(SLA4.equalsIgnoreCase(sla)) {
		  conf.setValorSla4(valor);
	  }else if(SLA5.equalsIgnoreCase(sla)) {
		  conf.setValorSla5(valor);
	  }
	  return conf;
  }
  
  private static ConfiguracionMonitoreoResponseDTO updateConfigMonitoreo(ConfiguracionMonitoreoResponseDTO conf,String sla,Integer valor) {
      if(SLA1.equalsIgnoreCase(sla)) {
		  conf.setValorSla1(valor);
	  }else if(SLA2.equalsIgnoreCase(sla) ) {
		  conf.setValorSla2(valor);
	  }else if(SLA3.equalsIgnoreCase(sla)) {
		  conf.setValorSla3(valor);
	  }else if(SLA4.equalsIgnoreCase(sla)) {
		  conf.setValorSla4(valor);
	  }else if(SLA5.equalsIgnoreCase(sla) ) {
		  conf.setValorSla5(valor);
	  }
	  return conf;
  }
}
