package vuce.gob.pe.app.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.lob.DefaultLobHandler;
import org.springframework.jdbc.support.lob.LobHandler;

import vuce.gob.pe.app.dto.TrasmisionDTO;
import vuce.gob.pe.app.service.TransmisionesServiceImpl;

public class TramisionRowMapper  implements RowMapper<TrasmisionDTO> {
	
	public static final Logger logger = LoggerFactory.getLogger(TransmisionesServiceImpl.class);
	
	LobHandler lobHandler = new DefaultLobHandler();
	
	@Override
	public TrasmisionDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		
		TrasmisionDTO transmision = new TrasmisionDTO();
		transmision.setTipo(rs.getString("TIPO"));	
		transmision.setTieneIncidente(rs.getInt("TIENE_INCIDENTE"));
		transmision.setTipoIncidente(rs.getInt("TIPO_INCIDENTE"));
		transmision.setEntidadId(rs.getInt("ENTIDAD_ID"));
		transmision.setEntidadSigla(rs.getString("ENTIDAD_SIGLAS"));
		transmision.setTipoMensaje(rs.getString("MENSAJE_TIPO"));
		transmision.setNombreMensaje(rs.getString("MENSAJE_NOM"));
		
		byte[] requestXmlData = lobHandler.getBlobAsBytes(rs,"ADJUNTO_MENSAJE");
		if(requestXmlData!=null) {
			transmision.setXml(new String(requestXmlData));
		}
	
		byte[] requestEbxmlData = lobHandler.getBlobAsBytes(rs,"ADJUNTO_EBXML");
		if(requestEbxmlData!=null) {
			transmision.setEbxml(new String(requestEbxmlData));
		}
		
		transmision.setError(rs.getString("ERROR"));
		transmision.setVcId(rs.getInt("VC_ID"));
		transmision.setVeId(rs.getInt("VE_ID"));
		transmision.setEstadoVc(rs.getInt("VC_ESTADO"));		
		transmision.setNombreEstadoVc(rs.getString("VC_ESTADO_NOM"));		
		transmision.setEstadoVe(rs.getInt("VE_ESTADO"));
		transmision.setNombreEstadoVe(rs.getString("VE_ESTADO_NOM"));
		transmision.setTipoDocumento(rs.getString("DOCUMENTO_TIPO"));
		transmision.setNombreDocumento(rs.getString("DOCUMENTO_NOM"));
		transmision.setNumeroDocumento(rs.getString("DOCUMENTO_NUM"));		
		transmision.setFechaRegistroSalida(rs.getDate("FECHA_REGISTRO_SALIDA"));
		transmision.setFechaActualizacionSalida(rs.getDate("FECHA_ACTUALIZACION_SALIDA"));
		transmision.setAntiguedadSalida(rs.getInt("ANTIGUEDAD_SALIDA"));
		transmision.setFormato(rs.getString("FORMATO"));
		
		transmision.setFechaRegistroEntrada(rs.getDate("FECHA_REGISTRO_ENTRADA"));
		transmision.setFechaActualizacionEntrada(rs.getDate("FECHA_ACTUALIZACION_ENTRADA"));
		transmision.setAntiguedadEntrada(rs.getInt("ANTIGUEDAD_ENTRADA"));		
		return transmision;
	}

}
