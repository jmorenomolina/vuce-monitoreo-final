package vuce.gob.pe.app.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import vuce.gob.pe.app.dto.TrasmisionIncidenteDTO;

public class TramisionIncidenteRowMapper  implements RowMapper<TrasmisionIncidenteDTO> {

	@Override
	public TrasmisionIncidenteDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		TrasmisionIncidenteDTO transmision = new TrasmisionIncidenteDTO();
		transmision.setCodigoEntidad(rs.getInt("ENTIDAD_ID"));
		transmision.setSiglaEntidad(rs.getString("ENTIDAD_SIGLAS"));
		transmision.setCantidadTrasmisionEntrada(rs.getInt("TRANSMISIONES_ENTRADA"));
		transmision.setCantidadTrasmisionSalida(rs.getInt("TRANSMISIONES_SALIDA"));
		return transmision;
	}

}
