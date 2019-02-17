package pe.gob.vuce.alertas.service;

import java.io.StringWriter;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import pe.gob.vuce.alertas.dto.AlertaTipoIncidenteDTO;
import pe.gob.vuce.alertas.dto.IncidenteCorreoDTO;
import pe.gob.vuce.alertas.dto.IncidenteDTO;
import pe.gob.vuce.alertas.dto.TipoAlertaDTO;

@Service
public class GestorAlertasService {

	private static final String INFORME_INCIDENTES_PLANTILLA = "PlantillaCorreo.vm";

	public GestorAlertasService() {
		super();
	}

	public List<TipoAlertaDTO> obtenerTipoAlertas() {
		// Extraer los datos de la base de datos
		TipoAlertaDTO c1 = new TipoAlertaDTO("APN", "usuariovuce@gmail.com", "usuariovuce@gmail.com", 1, 2, 1,
				"Demora en la confirmación de las transmisiones generadas en VUCE para la entidad");
		TipoAlertaDTO c2 = new TipoAlertaDTO("SENASA", "usuariovuce@gmail.com", "usuariovuce@gmail.com", 1, 2, 6,
				"Demora en la lectura para el recojo de transmisiones generadas en VUCE para la entidad");
		List<TipoAlertaDTO> tiposAlertas = new ArrayList<TipoAlertaDTO>();
		tiposAlertas.add(c1);
		tiposAlertas.add(c2);
		return tiposAlertas;
	}

	public AlertaTipoIncidenteDTO obtenerAlertaTipoIncidente6(String nombreEntidad) {
		// Extraer los datos de la base de datos
		AlertaTipoIncidenteDTO dto = new AlertaTipoIncidenteDTO();
		dto.setCantidadSolicitudRN1(2);
		dto.setCantidadSolicitudRN2(3);
		dto.setCantidadTxSalida(100);
		return dto;
	}

	public AlertaTipoIncidenteDTO obtenerAlertasTiposIncidente(String nombreEntidad) {
		// Extraer los datos de la base de datos
		AlertaTipoIncidenteDTO dto = new AlertaTipoIncidenteDTO();
		dto.setCantidadTxIncidente(200);
		dto.setDuracion(100);
		dto.setFechaHora(new Date());

		List<IncidenteDTO> alertaIncidentes = new ArrayList<IncidenteDTO>();
		IncidenteDTO dati = new IncidenteDTO();
		dati.setAntiguedad(100);
		dati.setArchivoXml("<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\r\n" + 
				"<transaccion \r\n" + 
				"    xsi:schemaLocation=\"Transaccion-1.0 Transaccion-1.0.xsd\"\r\n" + 
				"    xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\"  \r\n" + 
				"    xmlns=\"Transaccion-1.0\" >\r\n" + 
				"    <idTransmision>8623833</idTransmision>\r\n" + 
				"    <tipoMensaje>N1</tipoMensaje>\r\n" + 
				"    <formato>APN004</formato>\r\n" + 
				"    <documento>\r\n" + 
				"        <tipo>O</tipo>\r\n" + 
				"        <numero>2017005615</numero>\r\n" + 
				"        <fecha>2017-05-16</fecha>\r\n" + 
				"        <monto>0.0</monto>\r\n" + 
				"    </documento>\r\n" + 
				"    <documentoReferencia>\r\n" + 
				"        <tipo></tipo>\r\n" + 
				"        <numero></numero>\r\n" + 
				"    </documentoReferencia>\r\n" + 
				"    <notificacionesResueltas>\r\n" + 
				"    \r\n" + 
				"        \r\n" + 
				"        <notificacion></notificacion>\r\n" + 
				"        \r\n" + 
				"        \r\n" + 
				"    </notificacionesResueltas>\r\n" + 
				"</transaccion>\r\n" + 
				"");
		dati.setFechaHora(new Date());
		dati.setTipoTransmision(1);
		dati.setError("Errororororororororororororooror");
		alertaIncidentes.add(dati);
		dati.setTipoTransmision(2);
		alertaIncidentes.add(dati);
		dati.setTipoTransmision(4);
		alertaIncidentes.add(dati);
		dto.setIncidentes(alertaIncidentes);
		return dto;
	}

	public String generarCodigoAlerta() {
		// Generar usando la base de datos
		// codigoAlerta es un correlativo para todos los incidentes
		Integer codigoAlerta = 1;
		String.format("%010d", codigoAlerta);
		return String.format("ALT-%04d", codigoAlerta);
	}

	public String generarAsunto(TipoAlertaDTO tipoAlerta, AlertaTipoIncidenteDTO alerta) {
		return "(VUCE) Alerta " + alerta.getCodigoAlerta() + " Tipo " + tipoAlerta.getTipoIncidente() + " - "
				+ tipoAlerta.getDescripcionAlerta() + " de la entidad " + tipoAlerta.getNombreEntidad();
	}

	public int getEstadoActivacionAlertaTipoIncidente() {
		// Buscar este valor en la base de datos
		// Esta valor es por tipo de incidente
		return 1;
	}

	public String generarCorreo(TipoAlertaDTO tipoAlerta, AlertaTipoIncidenteDTO alerta) {
		VelocityEngine ve = new VelocityEngine();
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath");
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		ve.init();
		VelocityContext context = new VelocityContext();

		// Parte introductoria
		context.put("nombreEntidad", tipoAlerta.getNombreEntidad());
		context.put("codigoAlerta", alerta.getCodigoAlerta());
		context.put("descripcionAlerta", tipoAlerta.getDescripcionAlerta());
		DateFormat hourdateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		context.put("fechaHoraInicio", hourdateFormat.format(new Date()));
		context.put("duracion", alerta.getDuracion());
		context.put("tipoIncidente",tipoAlerta.getTipoIncidente());

		// Tipo de incidente = 6
		if (tipoAlerta.getTipoIncidente() == 6) {
			context.put("cantidadTransmisiones", alerta.getCantidadTxSalida());
			context.put("cantidadSolicitudesSinTasa", alerta.getCantidadSolicitudRN1());
			context.put("cantidadSuceSinExpediente", alerta.getCantidadSolicitudRN2());
		} else
			// Tipo de incidentes desde 1 hasta 5
			context.put("cantidadTransmisiones", alerta.getCantidadTxIncidente());

		List<IncidenteCorreoDTO> incidentesCorreo = new ArrayList<IncidenteCorreoDTO>();
		int nro = 1;
		for (IncidenteDTO incidenteDTO : alerta.getIncidentes()) {
			IncidenteCorreoDTO incidenteCorreo = new IncidenteCorreoDTO();
			incidenteCorreo.setNro(nro++);
			incidenteCorreo.setTransmision(incidenteDTO.getTipoTransmision());
			incidenteCorreo.setAntiguedad(incidenteDTO.getAntiguedad());
			incidenteCorreo.setLogError(incidenteDTO.getError());
			incidenteCorreo.setFechaHoraGeneracion(hourdateFormat.format(incidenteDTO.getFechaHora()));
			incidenteCorreo.setNumeroDocumento(extraerValorDeXML(incidenteDTO.getArchivoXml(), "<numero>", "</numero>"));
			String tipo = extraerValorDeXML(incidenteDTO.getArchivoXml(), "<tipo>", "</tipo>");
			
			incidenteCorreo.setTipoDocumento(tipo);			
			incidentesCorreo.add(incidenteCorreo);
		}
		context.put("incidentes", incidentesCorreo);
		
		Template t = ve.getTemplate(INFORME_INCIDENTES_PLANTILLA);
		StringWriter sw = new StringWriter();
		t.merge(context, sw);
		return sw.toString();
	}

	public void registrarAlerta(TipoAlertaDTO tipoAlerta, AlertaTipoIncidenteDTO alerta) {
		// Guardar los datos básicos de la alerta en la base de datos
	}
	
	private String extraerValorDeXML(String xml, String etiquetaInicial,String etiquetaFinal) {
		int beginIndex = xml.indexOf(etiquetaInicial) + etiquetaInicial.length();
		int endIndex = xml.indexOf(etiquetaFinal);
		return xml.substring(beginIndex, endIndex);
	}
}
