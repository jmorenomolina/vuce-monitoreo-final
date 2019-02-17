package vuce.gob.pe.app.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Service;

import vuce.gob.pe.app.dto.AlertaTipoIncidenteDTO;
import vuce.gob.pe.app.dto.ConfiguracionMonitoreoDTO;
import vuce.gob.pe.app.dto.DetalleAlertaIncidente6DTO;
import vuce.gob.pe.app.dto.DetalleAlertaTipoIncidenteDTO;
import vuce.gob.pe.app.dto.MensajeSalidaDTO;
import vuce.gob.pe.app.dto.RequestFiltrarTransmisionesDTO;
import vuce.gob.pe.app.dto.TrasmisionDTO;
import vuce.gob.pe.app.dto.TrasmisionIncidenteDTO;
import vuce.gob.pe.app.repository.TransmisionesRepository;
import vuce.gob.pe.app.service.mapper.AlertaTipoIncidenteRowMapper;
import vuce.gob.pe.app.service.mapper.ObtenerConfiguracionMonitoreoRowMapper;
import vuce.gob.pe.app.service.mapper.TramisionIncidenteRowMapper;
import vuce.gob.pe.app.service.mapper.TramisionRowMapper;
import vuce.gob.pe.app.util.RestAppException;

/**
 *
 * @author cquevedo
 */
@Service
public class TransmisionesServiceImpl  implements TransmisionesService {

	public static final Logger logger = LoggerFactory.getLogger(TransmisionesServiceImpl.class);

	@Autowired
	private TransmisionesRepository transmisionesRepository;

	@PersistenceContext
	private EntityManager entityManager;

	@Autowired
	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;
	private SimpleJdbcCall simpleJdbcCall;

	private final String ESQUEMA = "MTSRC";

	private final String PACKAGE = "PROYECTO_BUS";

	private final String FUN_OBTENER_TX_CON_INCIDENTE = "OBTENER_TX_CON_INCIDENTES";
	private final String FUN_OBTENER_TX_CON_INCIDENTE_RETURN = "tCursor";

	@Override
	public List<TrasmisionIncidenteDTO> obtenerTransmisionesConIncidente(Date fechaInicio, Date fechaFin)
			throws RestAppException {
		try {

			logger.info(
					"[TransmisionesServiceImpl]-> obtenerTransmisionesConIncidente   fecha_inicio: [{}] fecha_fin: [{}]",
					fechaInicio, fechaFin);
			
			jdbcTemplate = new JdbcTemplate(dataSource);
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName(FUN_OBTENER_TX_CON_INCIDENTE)
					.withSchemaName(ESQUEMA).withCatalogName(PACKAGE)
					.returningResultSet(FUN_OBTENER_TX_CON_INCIDENTE_RETURN, new TramisionIncidenteRowMapper());
			SqlParameterSource in = new MapSqlParameterSource().addValue("fecha_inicio", fechaInicio)
					.addValue("fecha_fin", fechaFin);
			Map<String, Object> result = simpleJdbcCall.execute(in);
			List<TrasmisionIncidenteDTO> response =  (List) result.get(FUN_OBTENER_TX_CON_INCIDENTE_RETURN);	
			return response;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RestAppException("500", "Error al ejecutar el procedimiento almacenado", e.getMessage(), e);
		}
	}

	private final String PC_OBTENER_CONF_MONITOREO = "OBTENER_CONFIG_MONITOREO";
	private final String PC_OBTENER_CONF_MONITOREO_RETURN = "TCURSOR";

	@Override
	public List<ConfiguracionMonitoreoDTO> obtenerConfiguracionMonitoreo(Integer entidadId) throws RestAppException {
		try {

			jdbcTemplate = new JdbcTemplate(dataSource);
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName(PC_OBTENER_CONF_MONITOREO)
					.withSchemaName(ESQUEMA).withCatalogName(PACKAGE)
					.returningResultSet(PC_OBTENER_CONF_MONITOREO_RETURN, new ObtenerConfiguracionMonitoreoRowMapper());
			SqlParameterSource in = new MapSqlParameterSource().addValue("ENTIDAD_ID", entidadId);
			Map<String, Object> result = simpleJdbcCall.execute(in);
			List<ConfiguracionMonitoreoDTO> response =  (List) result.get(PC_OBTENER_CONF_MONITOREO_RETURN);
			return response;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RestAppException("500", "Error al ejecutar el procedimiento almacenado", e.getMessage(), e);
		}
	}

	private final String PC_FILTRAR_TRANSMISIONES = "FILTRAR_TRANSMISIONES";
	private final String PC_OBTENER_TX_CON_INCIDENTE_RETURN = "TCURSOR";
	
	@Override
	public List<TrasmisionDTO> filtrarTransmisiones(RequestFiltrarTransmisionesDTO request) throws RestAppException {
		try {
			jdbcTemplate = new JdbcTemplate(dataSource);
			
			
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName(PC_FILTRAR_TRANSMISIONES)
					.withSchemaName(ESQUEMA).withCatalogName(PACKAGE)
					.returningResultSet(PC_OBTENER_TX_CON_INCIDENTE_RETURN, new TramisionRowMapper());
		
			SqlParameterSource in = new MapSqlParameterSource().addValue("CODIGO_ENTIDAD", request.getCodigoEntidad())
					.addValue("FECHA_INICIO", request.getFechaInicio()).addValue("FECHA_FIN", request.getFechaFin())
					.addValue("TIPO_MENSAJE", request.getTipoMensaje())
					.addValue("TIPO_DOCUMENTO", request.getTipoDocumento())
					.addValue("NUMERO_DOCUMENTO", request.getNumeroDocumento())
					.addValue("TIPO_TRANSMISION", request.getTipoTransmision())
					.addValue("TIPO_INCIDENTE", request.getTipoIncidente()).addValue("ESTADO_VC", request.getEstadoVc())
					.addValue("ESTADO_VE", request.getEstadoVe()).addValue("VC_ID", request.getVcId())
					.addValue("VE_ID", request.getVeId());
		
			Map<String, Object> result = simpleJdbcCall.execute(in);
	
			List<TrasmisionDTO>  response = (List) result.get(PC_OBTENER_TX_CON_INCIDENTE_RETURN);
			
		
			return response;			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RestAppException("500", "Error al ejecutar el procedimiento almacenado", e.getMessage(), e);
		}

	}

	private final String REENVIAR_TX_SALIDA_CON_ERROR = "REENVIAR_TX_SALIDA_CON_ERROR";

	@Override
	public MensajeSalidaDTO reenviarTransaccionSalidaConError(Integer vcId, String vcTransaccion, Integer veId,
			String veTransaccion) throws RestAppException {
		try {
			jdbcTemplate = new JdbcTemplate(dataSource);
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withSchemaName(ESQUEMA)
					.withProcedureName(REENVIAR_TX_SALIDA_CON_ERROR).withCatalogName(PACKAGE);
			SqlParameterSource in = new MapSqlParameterSource().addValue("VC_ID_IN", vcId)
					.addValue("VC_TRANSACCION", vcTransaccion).addValue("VE_ID_IN", veId)
					.addValue("VE_TRANSACCION", veTransaccion);
			Map<String, Object> result = simpleJdbcCall.execute(in);
			MensajeSalidaDTO mensaje = new MensajeSalidaDTO();
			BigDecimal resultadoValor = (BigDecimal) result.get("RESULTADO_VALOR");
			if (resultadoValor != null) {
				mensaje.setResultadoValor(resultadoValor.intValueExact());
				mensaje.setResultadoMensaje((String) result.get("RESULTADO_MENSAJE"));
			} else {
				mensaje.setResultadoMensaje("-1");
				mensaje.setResultadoMensaje("No se proceso mensaje de respuesta");
			}
			return mensaje;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RestAppException("500", "Error al ejecutar el procedimiento almacenado", e.getMessage(), e);
		}
	}

	private final String HABILITAR_TRANSMISIONES = "HABILITAR_TRANSMISIONES";

	@Override
	public MensajeSalidaDTO habilitarTransmision(Integer veId) throws RestAppException {
		try {
			jdbcTemplate = new JdbcTemplate(dataSource);
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withSchemaName(ESQUEMA)
					.withProcedureName(HABILITAR_TRANSMISIONES).withCatalogName(PACKAGE);
			SqlParameterSource in = new MapSqlParameterSource().addValue("VE_ID_IN", veId);
			Map<String, Object> result = simpleJdbcCall.execute(in);
			MensajeSalidaDTO mensaje = new MensajeSalidaDTO();
			BigDecimal resultadoValor = (BigDecimal) result.get("RESULTADO_VALOR");

			if (resultadoValor != null) {
				mensaje.setResultadoValor(resultadoValor.intValueExact());
				mensaje.setResultadoMensaje((String) result.get("RESULTADO_MENSAJE"));
			} else {
				mensaje.setResultadoMensaje("-1");
				mensaje.setResultadoMensaje("No se proceso mensaje de respuesta");
			}			
			return mensaje;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RestAppException("500", "Error al ejecutar el procedimiento almacenado", e.getMessage(), e);
		}

	}

	private final String REPROC_TX_ENTRADA_CON_ERROR = "REPROC_TX_ENTRADA_CON_ERROR";

	@Override
	public MensajeSalidaDTO reprocesarTransaccionEntradaConError(Integer vcId, String vcTransaccion, Integer veId,
			String veTransaccion) throws RestAppException {
		try {
			jdbcTemplate = new JdbcTemplate(dataSource);
			
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withSchemaName(ESQUEMA)
					.withProcedureName(REPROC_TX_ENTRADA_CON_ERROR).withCatalogName(PACKAGE);
			SqlParameterSource in = new MapSqlParameterSource().addValue("VC_ID_IN", veId).addValue("VC_TRANSACCION", veId)
					.addValue("VE_ID_IN", veId).addValue("VE_TRANSACCION", vcId);
			Map<String, Object> result = simpleJdbcCall.execute(in);
			MensajeSalidaDTO mensaje = new MensajeSalidaDTO();
			BigDecimal resultadoValor = (BigDecimal) result.get("RESULTADO_VALOR");
			if (resultadoValor != null) {
				mensaje.setResultadoValor(resultadoValor.intValueExact());
				mensaje.setResultadoMensaje((String) result.get("RESULTADO_MENSAJE"));
			} else {
				mensaje.setResultadoMensaje("-1");
				mensaje.setResultadoMensaje("No se proceso mensaje de respuesta");
			}
			return mensaje;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RestAppException("500", "Error al ejecutar el procedimiento almacenado", e.getMessage(), e);
		}
	}

	private final String ANULAR_TX_ENTRADA_CON_ERROR = "ANULAR_TX_ENTRADA_CON_ERROR";

	@Override
	public MensajeSalidaDTO anularTransaccionEntradaConError(Integer veId, String veTransaccion, Integer vcId,
			String vcTransaccion) throws RestAppException {
		try {
			jdbcTemplate = new JdbcTemplate(dataSource);
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withSchemaName(ESQUEMA)
					.withProcedureName(ANULAR_TX_ENTRADA_CON_ERROR).withCatalogName(PACKAGE);
			SqlParameterSource in = new MapSqlParameterSource().addValue("VE_ID_IN", veId)
					.addValue("VE_TRANSACCION", veTransaccion).addValue("VC_ID_IN", vcId)
					.addValue("VC_TRANSACCION", vcTransaccion);
			Map<String, Object> result = simpleJdbcCall.execute(in);
			MensajeSalidaDTO mensaje = new MensajeSalidaDTO();
			BigDecimal resultadoValor = (BigDecimal) result.get("RESULTADO_VALOR");
			if (resultadoValor != null) {
				mensaje.setResultadoValor(resultadoValor.intValueExact());
				mensaje.setResultadoMensaje((String) result.get("RESULTADO_MENSAJE"));
			} else {
				mensaje.setResultadoMensaje("-1");
				mensaje.setResultadoMensaje("No se proceso mensaje de respuesta");
			}
			
			return mensaje;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RestAppException("500", "Error al ejecutar el procedimiento almacenado", e.getMessage(), e);
		}
	}

	private final String REPROC_TX_ENTRADA_N8_CON_ERROR = "REPROC_TX_ENTRADA_N8_CON_ERROR";

	@Override
	public MensajeSalidaDTO reporcesarTransaccionEntradaN8ConError(Integer entidadId, Date fechaInicio, Date fechaFin)
			throws RestAppException {
		try {
			jdbcTemplate = new JdbcTemplate(dataSource);
			
			
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withSchemaName(ESQUEMA)
					.withProcedureName(REPROC_TX_ENTRADA_N8_CON_ERROR).withCatalogName(PACKAGE);
			SqlParameterSource in = new MapSqlParameterSource().addValue("ENTIDAD_ID_IN", entidadId)
					.addValue("FECHA_INICIO", fechaInicio).addValue("FECHA_FIN", fechaFin);
			Map<String, Object> result = simpleJdbcCall.execute(in);
			MensajeSalidaDTO mensaje = new MensajeSalidaDTO();
			BigDecimal resultadoValor = (BigDecimal) result.get("RESULTADO_VALOR");
			if (resultadoValor != null) {
				mensaje.setResultadoValor(resultadoValor.intValueExact());
				mensaje.setResultadoMensaje((String) result.get("RESULTADO_MENSAJE"));
			} else {
				mensaje.setResultadoMensaje("-1");
				mensaje.setResultadoMensaje("No se proceso mensaje de respuesta");
			}
			
			return mensaje;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RestAppException("500", "Error al ejecutar el procedimiento almacenado", e.getMessage(), e);
		}
	}

	private final String ACTUALIZAR_CONFIG_MONITOREO = "ACTUALIZAR_CONFIG_MONITOREO";

	@Override
	public void actualizarConfiguracionMonitoreo(Integer entidadId, String correoSoporte, String slaNombre,
			Integer slaValor, String estado) throws RestAppException {
		try {

			jdbcTemplate = new JdbcTemplate(dataSource);	
			
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withSchemaName(ESQUEMA)
					.withProcedureName(ACTUALIZAR_CONFIG_MONITOREO).withCatalogName(PACKAGE);
			SqlParameterSource in = new MapSqlParameterSource().addValue("ID_ENTIDAD", entidadId)
					.addValue("CORREO_SOPORTE", correoSoporte).addValue("SLA_NOMBRE", slaNombre)
					.addValue("SLA_VALOR", slaValor).addValue("ESTADO", estado);
			simpleJdbcCall.execute(in);
			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RestAppException("500", "Error al ejecutar el procedimiento almacenado", e.getMessage(), e);
		}
	}

	private final String DETENER_TRANSMISIONES = "DETENER_TRANSMISIONES";

	@Override
	public MensajeSalidaDTO detenerTrasmision(Integer entidadId, Date fechaInicio, Date fechaFin)
			throws RestAppException {
		try {
			jdbcTemplate = new JdbcTemplate(dataSource);
			
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withSchemaName(ESQUEMA)
					.withProcedureName(DETENER_TRANSMISIONES).withCatalogName(PACKAGE);
			SqlParameterSource in = new MapSqlParameterSource().addValue("ENTIDAD_ID_IN", entidadId)
					.addValue("FECHA_INICIO", fechaInicio).addValue("FECHA_FIN", fechaFin);
			Map<String, Object> result = simpleJdbcCall.execute(in);
			BigDecimal resultadoValor = (BigDecimal) result.get("RESULTADO_VALOR");
			MensajeSalidaDTO mensaje = new MensajeSalidaDTO();
			if (resultadoValor != null) {
				mensaje.setResultadoValor(resultadoValor.intValueExact());
				mensaje.setResultadoMensaje((String) result.get("RESULTADO_MENSAJE"));
			} else {
				mensaje.setResultadoMensaje("-1");
				mensaje.setResultadoMensaje("No se proceso mensaje de respuesta");
			}
			
			return mensaje;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RestAppException("500", "Error al ejecutar el procedimiento almacenado", e.getMessage(), e);
		}
	}

	
	
	private final String OBTENER_TRANSMISIONES_ALERTA_INCIDENTE = "OBTENER_DET_ALERTA_INCIDENTE6";
	
	@Override
	public DetalleAlertaIncidente6DTO obtenerDetalleAlertaIncidente6(Integer entidadId) throws RestAppException {
		try {
			jdbcTemplate = new JdbcTemplate(dataSource);
			
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withSchemaName(ESQUEMA)
					.withProcedureName(OBTENER_TRANSMISIONES_ALERTA_INCIDENTE).withCatalogName(PACKAGE);
			SqlParameterSource in = new MapSqlParameterSource().addValue("ENTIDAD_ID_IN", entidadId);
			
			Map<String, Object> result = simpleJdbcCall.execute(in);
			String nombreEntidad = (String) result.get("ENTIDAD_NOMBRE");
			DetalleAlertaIncidente6DTO response = new DetalleAlertaIncidente6DTO();			
			if (nombreEntidad != null) {
				response.setNombreEntidad(nombreEntidad);				
				BigDecimal cantidadTxSalida = (BigDecimal) result.get("CANTIDAD_TX_SALIDA");
				BigDecimal cantidadSolicitudRn1 = (BigDecimal) result.get("CANTIDAD_SOLICITUD_RN1");
				BigDecimal cantidadSolicitudRn2 = (BigDecimal) result.get("CANTIDAD_SOLICITUD_RN2");
				response.setCantidadTxSalida(cantidadTxSalida.intValueExact());
				response.setCantidadSolicitudRN1(cantidadSolicitudRn1.intValueExact());
				response.setCantidadSolicitudRN2(cantidadSolicitudRn2.intValueExact());				
			} else {
				response.setNombreEntidad("");
			}
			
			return response;
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RestAppException("500", "Error al ejecutar el procedimiento almacenado", e.getMessage(), e);
		}
	}
	
	

	private final String PC_OBTENER_DETALLE_ALERTA_TIPO_INC = "OBTENER_DET_ALERTA_TPINCIDENTE";
	private final String PC_OBTENER_DETALLE_ALERTA_TIPO_INC_RETURN = "T_CURSOR_TX";
	

	@Override
	public AlertaTipoIncidenteDTO obtenerDetalleAlertaTipoIncidente(Integer entidadId, Integer tipoIncidente)throws RestAppException {
		try {
			jdbcTemplate = new JdbcTemplate(dataSource);
			simpleJdbcCall = new SimpleJdbcCall(jdbcTemplate).withProcedureName(PC_OBTENER_DETALLE_ALERTA_TIPO_INC)
					.withSchemaName(ESQUEMA).withCatalogName(PACKAGE)
					.returningResultSet(PC_OBTENER_DETALLE_ALERTA_TIPO_INC_RETURN, new AlertaTipoIncidenteRowMapper());
		
			SqlParameterSource in = new MapSqlParameterSource()
					.addValue("ENTIDAD_ID_IN", entidadId)
					.addValue("TIPO_INCIDENTE_IN", tipoIncidente);
		
			Map<String, Object> result = simpleJdbcCall.execute(in);	
			AlertaTipoIncidenteDTO response = new AlertaTipoIncidenteDTO();
			String nombreEntidad = (String) result.get("ENTIDAD_NOMBRE");
			response.setNombreEntidad(nombreEntidad);
			BigDecimal cantidadTxIncidente = (BigDecimal) result.get("CANTIDAD_TX_INCIDENTE");
			response.setCantidadTxIncidente(cantidadTxIncidente.intValueExact());
			BigDecimal duracion = (BigDecimal) result.get("TX_DURACION");
			response.setDuracion(duracion.intValueExact());
			Date fechaHora = (Date) result.get("TX_FECHA_HORA");
			response.setFechaHora(fechaHora);
			List<DetalleAlertaTipoIncidenteDTO>  detalle = (List) result.get(PC_OBTENER_DETALLE_ALERTA_TIPO_INC_RETURN);
			response.setAlertaIncidentes(detalle);
			return response;			
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			throw new RestAppException("500", "Error al ejecutar el procedimiento almacenado", e.getMessage(), e);
		}
	}
	
	
	
	
	

}
