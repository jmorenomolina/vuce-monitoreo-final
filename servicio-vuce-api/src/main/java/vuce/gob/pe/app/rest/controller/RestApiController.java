package vuce.gob.pe.app.rest.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vuce.gob.pe.app.dto.AlertaTipoIncidenteDTO;
import vuce.gob.pe.app.dto.ConfiguracionMonitoreoDTO;
import vuce.gob.pe.app.dto.ConfiguracionMonitoreoResponseDTO;
import vuce.gob.pe.app.dto.DetalleAlertaIncidente6DTO;
import vuce.gob.pe.app.dto.MensajeSalidaDTO;
import vuce.gob.pe.app.dto.RequestFiltrarTransmisionesDTO;
import vuce.gob.pe.app.dto.TrasmisionDTO;
import vuce.gob.pe.app.dto.TrasmisionIncidenteDTO;
import vuce.gob.pe.app.model.EntidadMante;
import vuce.gob.pe.app.model.EntidadMantenimiento;
import vuce.gob.pe.app.model.FrecuenciaLectura;
import vuce.gob.pe.app.model.Parametro;
import vuce.gob.pe.app.repository.EntidadManteRepository;
import vuce.gob.pe.app.repository.EntidadMantenimientoRepository;
import vuce.gob.pe.app.repository.FrecuenciaLecturaRepository;
import vuce.gob.pe.app.repository.ParametroRepository;
import vuce.gob.pe.app.rest.parameter.ConfiguracionMonitoreoInput;
import vuce.gob.pe.app.rest.parameter.ConfiguracionMonitoreoObtenerInput;
import vuce.gob.pe.app.rest.parameter.HabilitarInput;
import vuce.gob.pe.app.rest.parameter.TransmisionDetenerInput;
import vuce.gob.pe.app.rest.parameter.EntidadMantenimientoInput;
import vuce.gob.pe.app.rest.parameter.TransmisonEntradaN8Input;
import vuce.gob.pe.app.rest.parameter.TrasmisionInput;
import vuce.gob.pe.app.service.TransmisionesService;
import vuce.gob.pe.app.service.mapper.ConverterToConfiguracionMonitoreoResponseDTO;
import vuce.gob.pe.app.util.Converter;
import vuce.gob.pe.app.util.RestAppException;
import java.util.Comparator;
import java.util.NoSuchElementException;
/**
 *
 * @author cquevedo
 */
@CrossOrigin
@RestController
@RequestMapping("/api")
public class RestApiController {

	public static final Logger logger = LoggerFactory.getLogger(RestApiController.class);
	

	
	@Autowired
	private final EntidadManteRepository repositoryEntidadMante = null;
	
	@Autowired
	private final EntidadMantenimientoRepository repositoryEntidadMantenimiento = null;
	
	
	@Autowired
	private final FrecuenciaLecturaRepository frecuenciaLecturaEntidad = null;
	
	
	@Autowired
	private final ParametroRepository repositoryParametro = null;	
	

	@Autowired
	private final TransmisionesService repositoryTransmisionesService = null;

	private final String FORMAT_DATE = "dd/MM/yyyy";
	
	
	
	
	@RequestMapping(value = "/entidadMantenimiento", method = RequestMethod.GET)
	public ResponseEntity<List<EntidadMantenimiento>> obtenerEntidadMantenimiento() {
		List<EntidadMantenimiento> mantenimientos = (List<EntidadMantenimiento>) repositoryEntidadMantenimiento.findAll();
		
		
		if (mantenimientos.isEmpty()) {
			return new ResponseEntity<List<EntidadMantenimiento>>(HttpStatus.NO_CONTENT);
		}
		
		mantenimientos.forEach(m->{
			Optional<EntidadMante> entidad = repositoryEntidadMante.findById(m.getIdEntidad());
			m.setNombreEntidad(entidad.get().getDescripcion());			
		});
		
		
		return new ResponseEntity<>(mantenimientos, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/entidadMantenimiento/registrar", method = RequestMethod.PUT)
	public ResponseEntity<String> registrarEntidadMantenimiento(@RequestBody EntidadMantenimientoInput entidadInput) {		
		
		logger.info("registrarEntidadMantenimiento  EntidadId: [{}]  fechaInicio: [{}] fechaFin: [{}]",entidadInput.getEntidadId(),entidadInput.getFechaInicio(),entidadInput.getFechaFin());
		
		List<EntidadMantenimiento> mantenimientos = (List<EntidadMantenimiento>) repositoryEntidadMantenimiento.findAll();
		int id = 1;
		if (!mantenimientos.isEmpty()) {
			id = mantenimientos.stream().max(Comparator.comparing(EntidadMantenimiento::getIdEntidadMantenimiento)).orElseThrow(NoSuchElementException::new).getIdEntidadMantenimiento();
		}
		
		
		id++;
		logger.info("registrarEntidadMantenimiento  id generado: [{}] ",id);
				
		EntidadMantenimiento mantenimiento = new EntidadMantenimiento();	
		mantenimiento.setIdEntidadMantenimiento(id);
		mantenimiento.setIdEntidad(entidadInput.getEntidadId());		
		mantenimiento.setFechaInicio(Converter.convertToDate(entidadInput.getFechaInicio(), FORMAT_DATE));
		mantenimiento.setFechaFin(Converter.convertToDate(entidadInput.getFechaFin(), FORMAT_DATE));
		
		
		
		repositoryEntidadMantenimiento.save(mantenimiento);
		return new ResponseEntity<>("Mantenimiento de entidad registrado correctamente", HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/entidadMantenimiento", method = RequestMethod.DELETE)
	public ResponseEntity<String> eliminarEntidadMantenimiento(@RequestParam(required = false, value = "id") String id) {		
		repositoryEntidadMantenimiento.deleteById(Integer.parseInt(id));
		return new ResponseEntity<>("Mantenimiento de entidad registrado correctamente", HttpStatus.OK);
	}
	
	
	
	@RequestMapping(value = "/entidadMantenimiento/{id}", method = RequestMethod.PUT)
	public ResponseEntity<String> editarEntidadMantenimiento(@PathVariable("id") Integer id,@RequestBody EntidadMantenimientoInput entidadInput) {	
		
		logger.info("registrarEntidadMantenimiento  Id: [{}] , EntidadId: [{}]  fechaInicio: [{}] fechaFin: [{}]",id,entidadInput.getEntidadId(),entidadInput.getFechaInicio(),entidadInput.getFechaFin());
		
		EntidadMantenimiento entidadMantenimiento = repositoryEntidadMantenimiento.findById(id).get();
		if(Optional.ofNullable(entidadMantenimiento).isPresent()) {
			entidadMantenimiento.setIdEntidad(entidadInput.getEntidadId());		
			entidadMantenimiento.setFechaInicio(Converter.convertToDate(entidadInput.getFechaInicio(), FORMAT_DATE));
			entidadMantenimiento.setFechaFin(Converter.convertToDate(entidadInput.getFechaFin(), FORMAT_DATE));
			repositoryEntidadMantenimiento.save(entidadMantenimiento);
			return new ResponseEntity<>("Mantenimiento de entidad actualizado correctamente", HttpStatus.OK);
		}else{
			return new ResponseEntity<>("Mantenimiento de entidad No encontrado", HttpStatus.NOT_MODIFIED);
		}
		
		
	}
	
	
	
	@RequestMapping(value = "/frecuencialectura", method = RequestMethod.GET)
	public ResponseEntity<List<FrecuenciaLectura>> obtenerfrecuencialectura() {
		
		logger.info("obtenerfrecuencialectura [execute]");
		
		List<FrecuenciaLectura> parametros = (List<FrecuenciaLectura>) frecuenciaLecturaEntidad.findAll();
		if (parametros.isEmpty()) {
			logger.info("obtenerfrecuencialectura [lista vacia]");
			
			return new ResponseEntity<List<FrecuenciaLectura>>(HttpStatus.NO_CONTENT);
		}
		
		logger.info("obtenerfrecuencialectura [finish]");
		
		return new ResponseEntity<>(parametros, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/intervalo", method = RequestMethod.GET)
	public ResponseEntity<Parametro> intervalo() {
		List<Parametro> parametros = (List<Parametro>) repositoryParametro.findByTipoParametro("INTERVALO");
		if(Optional.ofNullable(parametros).isPresent() && !parametros.isEmpty()) {
			Parametro parametro = parametros.get(0);
			return new ResponseEntity<>(parametro, HttpStatus.OK);
		}
		return new ResponseEntity<Parametro>(HttpStatus.NO_CONTENT);
	}
	

	@RequestMapping(value = "/fechaminima", method = RequestMethod.GET)
	public ResponseEntity<Parametro> fechaMinima() {
		List<Parametro> parametros = (List<Parametro>) repositoryParametro.findByTipoParametro("FECHAMIN");
		if(Optional.ofNullable(parametros).isPresent() && !parametros.isEmpty()) {
			Parametro parametro = parametros.get(0);
			return new ResponseEntity<>(parametro, HttpStatus.OK);
		}
		return new ResponseEntity<Parametro>(HttpStatus.NO_CONTENT);
		
	}
	
	
	
	@RequestMapping(value = "/tipodocumentos", method = RequestMethod.GET)
	public ResponseEntity<List<Parametro>> tipodocumentos() {
		List<Parametro> parametros = (List<Parametro>) repositoryParametro.findByTipoParametro("TIPODOC");
		if (parametros.isEmpty()) {
			return new ResponseEntity<List<Parametro>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(parametros, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/tipomensaje", method = RequestMethod.GET)
	public ResponseEntity<List<Parametro>> tipomensajes() {
		List<Parametro> parametros = (List<Parametro>) repositoryParametro.findByTipoParametro("TIPOMSJ");
		if (parametros.isEmpty()) {
			return new ResponseEntity<List<Parametro>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(parametros, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/tipotransmision", method = RequestMethod.GET)
	public ResponseEntity<List<Parametro>> tipotransmision() {
		List<Parametro> parametros = (List<Parametro>) repositoryParametro.findByTipoParametro("TIPOTRAN");
		if (parametros.isEmpty()) {
			return new ResponseEntity<List<Parametro>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(parametros, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/tipoincidente", method = RequestMethod.GET)
	public ResponseEntity<List<Parametro>> tipoincidente() {
		List<Parametro> parametros = (List<Parametro>) repositoryParametro.findByTipoParametro("TIPOINCI");
		if (parametros.isEmpty()) {
			return new ResponseEntity<List<Parametro>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(parametros, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/estado/vucecentral", method = RequestMethod.GET)
	public ResponseEntity<List<Parametro>> estadoVuceCentral() {
		List<Parametro> parametros = (List<Parametro>) repositoryParametro.findByTipoParametro("ESTVUCCENT");
		if (parametros.isEmpty()) {
			return new ResponseEntity<List<Parametro>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(parametros, HttpStatus.OK);
	}
	
	
	@RequestMapping(value = "/estado/vuceentidad", method = RequestMethod.GET)
	public ResponseEntity<List<Parametro>> estadoVuceEntidad() {
		List<Parametro> parametros = (List<Parametro>) repositoryParametro.findByTipoParametro("ESTVUCENT");
		if (parametros.isEmpty()) {
			return new ResponseEntity<List<Parametro>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(parametros, HttpStatus.OK);
	}
	
		
	@RequestMapping(value = "/entidadesmantenimiento", method = RequestMethod.GET)
	public ResponseEntity<List<EntidadMante>> entidadesMantenimiento() {

		List<EntidadMante> entidades = (List<EntidadMante>) repositoryEntidadMante.findAll();
		if (entidades.isEmpty()) {
			return new ResponseEntity<List<EntidadMante>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(entidades, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/entidades", method = RequestMethod.GET)
	public ResponseEntity<List<EntidadMante>> entidades() {

		List<EntidadMante> entidades = (List<EntidadMante>) repositoryEntidadMante.findAllByOrderByDescripcionAsc();
		if (entidades.isEmpty()) {
			return new ResponseEntity<List<EntidadMante>>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(entidades, HttpStatus.OK);
	}

	private ResponseEntity crearMensajeRespuestaError(RestAppException e) {
		logger.info("crearMensajeRespuestaError: [{}]",e.getDeveloperMessage());
		MensajeSalidaDTO response = new MensajeSalidaDTO();
		response.setResultadoMensaje(e.getDeveloperMessage());
		response.setErrorNegocio(e.getMessage());
		response.setResultadoValor(500);
		return new ResponseEntity<>(response,HttpStatus.INTERNAL_SERVER_ERROR);

	}

	
	@RequestMapping(value = "/transmisionesconincidentes", method = RequestMethod.GET)
	public ResponseEntity<List<TrasmisionIncidenteDTO>> trasmisionesConIncidente(
			@RequestParam(required = false, value = "fechaInicio") String fechaInicio,
			@RequestParam(required = false, value = "fechaFin") String fechaFin) {
		
		logger.info("trasmisionesConIncidente  fechaInicio: [{}] fechaFin: [{}]",fechaInicio,fechaFin);
		
		List<TrasmisionIncidenteDTO> transmisiones;
		try {
			transmisiones = (List<TrasmisionIncidenteDTO>) repositoryTransmisionesService.obtenerTransmisionesConIncidente(Converter.convertToDate(fechaInicio, FORMAT_DATE), Converter.convertToDate(fechaFin, FORMAT_DATE));
			if (transmisiones.isEmpty()) {
				return new ResponseEntity<List<TrasmisionIncidenteDTO>>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(transmisiones, HttpStatus.OK);
		} catch (RestAppException e) {
			return this.crearMensajeRespuestaError(e);
		}

	}

	@RequestMapping(value = "/transmisiones", method = RequestMethod.GET)
	public ResponseEntity<List<TrasmisionDTO>> trasmisiones(

			@RequestParam(required = false, value = "entidades") String entidades,
			@RequestParam(required = false, value = "fechaInicio") String fechaInicio,
			@RequestParam(required = false, value = "fechaFin") String fechaFin,
			@RequestParam(required = false, value = "tipoMensaje") String tipoMensaje,
			@RequestParam(required = false, value = "tipoDocumento") String tipoDocumento,
			@RequestParam(required = false, value = "numeroDocumento") String numeroDocumento,
			@RequestParam(required = false, value = "tipoTransmision") String tipoTransmision,
			@RequestParam(required = false, value = "tipoIncidente") String tipoIncidente,
			@RequestParam(required = false, value = "estadoVc") String estadoVc,
			@RequestParam(required = false, value = "estadoVe") String estadoVe,
			@RequestParam(required = false, value = "vcId") String vcId,
			@RequestParam(required = false, value = "veId") String veId
			
			) {

		RequestFiltrarTransmisionesDTO request = new RequestFiltrarTransmisionesDTO();
		request.setCodigoEntidad(entidades);
		request.setFechaInicio(Converter.convertToDate(fechaInicio, FORMAT_DATE));
		request.setFechaFin(Converter.convertToDate(fechaFin, FORMAT_DATE));
		request.setTipoMensaje(tipoMensaje);
		request.setTipoDocumento(tipoDocumento);
		
		request.setTipoTransmision(tipoTransmision);
		request.setTipoIncidente(tipoIncidente);
		
		
		
		if(!Optional.ofNullable(numeroDocumento).isPresent()  ||  !"".equals(numeroDocumento)){
			request.setNumeroDocumento(numeroDocumento);
		}else {
			request.setNumeroDocumento("%");
		}
		
		if(!Optional.ofNullable(estadoVc).isPresent()  ||  !"".equals(estadoVc)){
			request.setEstadoVc(estadoVc);
		}else {
			request.setEstadoVc("%");
		}
		
		if(!Optional.ofNullable(estadoVe).isPresent()  ||  !"".equals(estadoVe)){
			request.setEstadoVe(estadoVe);
		}else {
			request.setEstadoVe("%");
		}
		
		
		if(!Optional.ofNullable(vcId).isPresent()  ||  !"".equals(vcId)){
			request.setVcId(vcId);
		}else {
			request.setVcId("%");
		}
		
		if(!Optional.ofNullable(veId).isPresent()  ||  !"".equals(veId)){
			request.setVeId(veId);
		}else {
			request.setVeId("%");
		}
		

		logger.info("Filtrar Transmisiones: " + request.toString());

		try {
			List<TrasmisionDTO> transmisiones = (List<TrasmisionDTO>) repositoryTransmisionesService
					.filtrarTransmisiones(request);
			if (transmisiones.isEmpty()) {
				return new ResponseEntity<List<TrasmisionDTO>>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(transmisiones, HttpStatus.OK);
		} catch (RestAppException e) {
			//return new ResponseEntity<List<TrasmisionDTO>>(HttpStatus.NO_CONTENT);
			return this.crearMensajeRespuestaError(e);
		}
	}

	@RequestMapping(value = "/transmision/reenviar/salida/conerror", method = RequestMethod.PUT)
	public ResponseEntity<MensajeSalidaDTO> trasmisionReenviarSalidaConError(
			@RequestBody TrasmisionInput trasmisionInput) {

		logger.info("TrasmisionReenviarSalidaConError vcId: [{}] vcTransaccion: [{}] veId: [{}] veTransaccion: [{}]",
				trasmisionInput.getVcId(), trasmisionInput.getVcTransaccion(), trasmisionInput.getVeId(), trasmisionInput.getVeTransaccion());

		try {
			MensajeSalidaDTO response = (MensajeSalidaDTO) repositoryTransmisionesService
					.reenviarTransaccionSalidaConError(trasmisionInput.getVcId(), trasmisionInput.getVcTransaccion(), trasmisionInput.getVeId(), trasmisionInput.getVeTransaccion());
			if (!Optional.ofNullable(response).isPresent()) {
				return new ResponseEntity<MensajeSalidaDTO>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (RestAppException e) {
			//return new ResponseEntity<MensajeSalidaDTO>(HttpStatus.NO_CONTENT);
			return this.crearMensajeRespuestaError(e);
		}
	}

	@RequestMapping(value = "/transmision/habilitar", method = RequestMethod.PUT)
	public ResponseEntity<MensajeSalidaDTO> transmisionHabilitar(
			@RequestBody HabilitarInput input) {
		logger.info("transmisionHabilitar  veId: [{}] ", input.getVeId());
		try {
			MensajeSalidaDTO response = (MensajeSalidaDTO) repositoryTransmisionesService.habilitarTransmision(input.getVeId());
			if (!Optional.ofNullable(response).isPresent()) {
				return new ResponseEntity<MensajeSalidaDTO>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (RestAppException e) {
			return this.crearMensajeRespuestaError(e);
		}
	}

	@RequestMapping(value = "/transmision/reprocesar/entrada/conerror", method = RequestMethod.PUT)
	public ResponseEntity<MensajeSalidaDTO> trasmisionReprocesarEntradaConError(
			@RequestBody TrasmisionInput trasmisionInput) {

		logger.info("TrasmisionReprocesarEntradaConError vcId: [{}]  vcTransaccion: [{}]", trasmisionInput.getVcId(), trasmisionInput.getVcTransaccion());
		try {
			MensajeSalidaDTO response = (MensajeSalidaDTO) repositoryTransmisionesService.reprocesarTransaccionEntradaConError(trasmisionInput.getVcId(), trasmisionInput.getVcTransaccion(), trasmisionInput.getVeId(), trasmisionInput.getVeTransaccion());
			if (!Optional.ofNullable(response).isPresent()) {
				return new ResponseEntity<MensajeSalidaDTO>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (RestAppException e) {			
			return this.crearMensajeRespuestaError(e);
		}
	}

	@RequestMapping(value = "/transmision/anular/entrada/conerror", method = RequestMethod.PUT)
	public ResponseEntity<MensajeSalidaDTO> trasmisionAnularEntradaConError(
			@RequestBody TrasmisionInput trasmisionInput) {

		logger.info("TrasmisionAnularEntradaConError veId: [{}] veTransaccion: [{}] vcId: [{}] vcTransaccion: [{}] ",
				trasmisionInput.getVeId(), trasmisionInput.getVeTransaccion(), trasmisionInput.getVcId(), trasmisionInput.getVcTransaccion());
		try {
			MensajeSalidaDTO response = (MensajeSalidaDTO) repositoryTransmisionesService
					.anularTransaccionEntradaConError(trasmisionInput.getVeId(), trasmisionInput.getVeTransaccion(), trasmisionInput.getVcId(), trasmisionInput.getVcTransaccion());
			if (!Optional.ofNullable(response).isPresent()) {
				return new ResponseEntity<MensajeSalidaDTO>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (RestAppException e) {
			return this.crearMensajeRespuestaError(e);
		}
	}

	@RequestMapping(value = "/transmision/reprocesar/entrada/n8/conerror", method = RequestMethod.PUT)
	public ResponseEntity<MensajeSalidaDTO> trasmisionReprocesarEntradaN8ConError(@RequestBody TransmisonEntradaN8Input input) {

		logger.info("TrasmisionReprocesarEntradaConError entidadId: [{}]  fechaInicio: [{}]  fechaFin: [{}]", input.getEntidadId(),
				input.getFechaInicio(), input.getFechaFin());
		try {
			MensajeSalidaDTO response = (MensajeSalidaDTO) repositoryTransmisionesService
					.reporcesarTransaccionEntradaN8ConError(input.getEntidadId(),
							Converter.convertToDate(input.getFechaInicio(), FORMAT_DATE), 
							Converter.convertToDate(input.getFechaFin(), FORMAT_DATE));
			if (!Optional.ofNullable(response).isPresent()) {
				return new ResponseEntity<MensajeSalidaDTO>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (RestAppException e) {
			return this.crearMensajeRespuestaError(e);
		}
	}

	
	@RequestMapping(value = "/transmision/obtener/configuracion/monitoreo", method = RequestMethod.PUT)
	public ResponseEntity<List<ConfiguracionMonitoreoResponseDTO>> obtenerConfiguracionMonitoreo(
			@RequestBody ConfiguracionMonitoreoObtenerInput input) {

		logger.info("obtenerConfiguracionMonitoreo entidadId: [{}] ",input.getEntidadId());
		
		try {
			List<EntidadMante> entidades = (List<EntidadMante>) repositoryEntidadMante.findAll();
			if (!entidades.isEmpty()) {			
				List<ConfiguracionMonitoreoDTO> responseConf = repositoryTransmisionesService.obtenerConfiguracionMonitoreo(input.getEntidadId());				
				List<ConfiguracionMonitoreoResponseDTO> response = ConverterToConfiguracionMonitoreoResponseDTO.converter(entidades, responseConf);				
				if (response.isEmpty()) {
					return new ResponseEntity<List<ConfiguracionMonitoreoResponseDTO>>(HttpStatus.NO_CONTENT);
				}
				return new ResponseEntity<>(response, HttpStatus.OK);				
			}else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}			
			
		} catch (RestAppException e) {
			return this.crearMensajeRespuestaError(e);
		}
	}
	
	
	@RequestMapping(value = "/transmision/actualizar/configuracion/monitoreo", method = RequestMethod.PUT)
	public ResponseEntity<MensajeSalidaDTO> actualizarConfiguracionMonitoreo(
			@RequestBody ConfiguracionMonitoreoInput input) {

		logger.info("actualizarConfiguracionMonitoreo entidadId: [{}]  correoSoporte: [{}]  slaNombre: [{}]  slaValor: [{}]   estado: [{}]",input.getEntidadId(),input.getCorreoSoporte(), input.getSlaNombre(), input.getSlaValor(), input.getEstado());
		
		try {			
				
		    if(!Optional.ofNullable(input.getEstado()).isPresent()  ||  "".equals(input.getEstado()  )){
		    	input.setEstado("A");
			}
			
			repositoryTransmisionesService.actualizarConfiguracionMonitoreo(input.getEntidadId(),input.getCorreoSoporte(), input.getSlaNombre(), input.getSlaValor(), input.getEstado());
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (RestAppException e) {
			return this.crearMensajeRespuestaError(e);
		}
	}
	
	
	@RequestMapping(value = "/transmision/detener", method = RequestMethod.PUT)
	public ResponseEntity<MensajeSalidaDTO> transmisionDetener(
			@RequestBody TransmisionDetenerInput input) {
		logger.info("transmisionHabilitar  entidadId: [{}] fechaIncio [{}]  fechaFin [{}]", input.getEntidadId(),input.getFechaInicio(),input.getFechaFin());
		try {
			MensajeSalidaDTO response = (MensajeSalidaDTO) repositoryTransmisionesService.detenerTrasmision(input.getEntidadId(),Converter.convertToDate(input.getFechaInicio(), FORMAT_DATE),Converter.convertToDate(input.getFechaFin(), FORMAT_DATE));
			if (!Optional.ofNullable(response).isPresent()) {
				return new ResponseEntity<MensajeSalidaDTO>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (RestAppException e) {
			return this.crearMensajeRespuestaError(e);
		}
	}
	
	
	
	
	@RequestMapping(value = "/detalle/alertaincidente", method = RequestMethod.GET)
	public ResponseEntity<DetalleAlertaIncidente6DTO> detalleAlertaIncidente6(@RequestParam(required = true, value = "entidad") String entidad) {

		logger.info("detalleAlertaIncidente6 entidadId: [{}] ", entidad);
		try {
			DetalleAlertaIncidente6DTO response = (DetalleAlertaIncidente6DTO) repositoryTransmisionesService.obtenerDetalleAlertaIncidente6(Integer.parseInt(entidad));
			if (!Optional.ofNullable(response).isPresent()) {
				return new ResponseEntity<DetalleAlertaIncidente6DTO>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (RestAppException e) {
			return this.crearMensajeRespuestaError(e);
		}
	}
	
	
	
	@RequestMapping(value = "/alerta/tipoincidente", method = RequestMethod.GET)
	public ResponseEntity<AlertaTipoIncidenteDTO> alertaTipoIncident(
			@RequestParam(required = true, value = "entidadId") String entidadId,
			@RequestParam(required = true, value = "tipoIncidente") String tipoIncidente
			) {

		logger.info("alertaTipoIncident entidadId: [{}] tipoIncidente: [{}]", entidadId,tipoIncidente);
		try {
			AlertaTipoIncidenteDTO response = (AlertaTipoIncidenteDTO) repositoryTransmisionesService.obtenerDetalleAlertaTipoIncidente(Integer.parseInt(entidadId),Integer.parseInt(tipoIncidente));
			if (!Optional.ofNullable(response).isPresent()) {
				return new ResponseEntity<AlertaTipoIncidenteDTO>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(response, HttpStatus.OK);
		} catch (RestAppException e) {
			return this.crearMensajeRespuestaError(e);
		}
	}
	
	

}
