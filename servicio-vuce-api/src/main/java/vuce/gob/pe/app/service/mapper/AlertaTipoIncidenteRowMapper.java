package vuce.gob.pe.app.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import vuce.gob.pe.app.dto.DetalleAlertaTipoIncidenteDTO;

public class AlertaTipoIncidenteRowMapper  implements RowMapper<DetalleAlertaTipoIncidenteDTO> {
	
	public static final Logger logger = LoggerFactory.getLogger(AlertaTipoIncidenteRowMapper.class);
	
	LobHandler lobHandler = new DefaultLobHandler();
	
	@Override
	public DetalleAlertaTipoIncidenteDTO mapRow(ResultSet rs, int rowNum) throws SQLException {		
		DetalleAlertaTipoIncidenteDTO detalle = new DetalleAlertaTipoIncidenteDTO();
		detalle.setTipoTransmision(rs.getInt("TIPO_MENSAJE"));
		byte[] requestXmlData = lobHandler.getBlobAsBytes(rs,"XML");
		if(requestXmlData!=null) {
			detalle.setArchivoXml(new String(requestXmlData));
		}
		detalle.setFechaHora(rs.getDate("FECHA_REGISTRO"));
		detalle.setAntiguedad(rs.getInt("ANTIGUEDAD"));
		detalle.setError(rs.getString("ERROR"));
		return detalle;
	}

}
