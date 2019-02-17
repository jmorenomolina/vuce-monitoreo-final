package vuce.gob.pe.app.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vuce.gob.pe.app.dto.ConfiguracionMonitoreoDTO;



public class ObtenerConfiguracionMonitoreoRowMapper  implements RowMapper<ConfiguracionMonitoreoDTO> {

	@Override
	public ConfiguracionMonitoreoDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		ConfiguracionMonitoreoDTO configuracion = new ConfiguracionMonitoreoDTO();
		configuracion.setEntidadId(rs.getInt("ID_ENTIDAD"));
		configuracion.setSla(rs.getString("SLA_NOMBRE"));
		configuracion.setValor(rs.getInt("SLA_VALOR"));
		return configuracion;
	}
	
	

}
