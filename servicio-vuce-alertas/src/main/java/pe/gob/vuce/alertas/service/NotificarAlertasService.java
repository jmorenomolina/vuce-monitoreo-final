package pe.gob.vuce.alertas.service;

import java.io.UnsupportedEncodingException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import pe.gob.vuce.alertas.dto.AlertaTipoIncidenteDTO;
import pe.gob.vuce.alertas.dto.TipoAlertaDTO;

@Service
public class NotificarAlertasService {

	@Autowired
	GestorAlertasService gestorAlertasService;

	@Autowired
	EmailService emailService;

	@Autowired
	public NotificarAlertasService(pe.gob.vuce.alertas.service.EmailService emailServer,
			GestorAlertasService gestorAlertasService) {
		super();
		this.emailService = emailServer;
		this.gestorAlertasService = gestorAlertasService;
	}

	@Async
	public void enviarAlertasPorTipoIncidente(TipoAlertaDTO tipoAlerta) throws InterruptedException {

		int tipoIncidente = tipoAlerta.getTipoIncidente();
		String nombreEntidad = tipoAlerta.getNombreEntidad();
		String to = tipoAlerta.getTo();
		String cc = tipoAlerta.getCc();
		long frecuenciaVerificacion = tipoAlerta.getFrecuenciaVerificacion();
		long tiempoSuspension = tipoAlerta.getTiempoSuspension();
		AlertaTipoIncidenteDTO alertaTipoIncidente = null;
		// List<IncidenteDTO> incidentes = null;

		while (true) {

			System.out.println(nombreEntidad + " : Verificando si hay incidentees ...");

			int estadoActivacionAlertaTipoIncidente = gestorAlertasService.getEstadoActivacionAlertaTipoIncidente();

			if (estadoActivacionAlertaTipoIncidente == 1) {

				if (tipoIncidente == 6)
					alertaTipoIncidente = gestorAlertasService.obtenerAlertaTipoIncidente6(nombreEntidad);
				else {
					alertaTipoIncidente = gestorAlertasService.obtenerAlertasTiposIncidente(nombreEntidad);
				}

				if (alertaTipoIncidente != null) {

					try {

						System.out.println(nombreEntidad + " : Se encontraron incidentes");
						String codigoAlerta = gestorAlertasService.generarCodigoAlerta();
						alertaTipoIncidente.setCodigoAlerta(codigoAlerta);
						String cuerpo = gestorAlertasService.generarCorreo(tipoAlerta, alertaTipoIncidente);
						String asunto = gestorAlertasService.generarAsunto(tipoAlerta, alertaTipoIncidente);
						emailService.sendHtmlMail(to, cc, asunto,cuerpo);

					} catch (UnsupportedEncodingException | MessagingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					gestorAlertasService.registrarAlerta(tipoAlerta, alertaTipoIncidente);
					
					System.out.println(nombreEntidad + " : Correo enviado");
					System.out.println(nombreEntidad + " : La verificación de incidentes se retomará dentro de "
							+ tiempoSuspension + " minutos");

					Thread.sleep(tiempoSuspension * 60000);

				} else {

					Thread.sleep(frecuenciaVerificacion * 60000);
					System.out.println(nombreEntidad + " : La verificación de incidentes se realizará dentro de "
							+ frecuenciaVerificacion + " minutos");

				}
			}
		}
	}

}
