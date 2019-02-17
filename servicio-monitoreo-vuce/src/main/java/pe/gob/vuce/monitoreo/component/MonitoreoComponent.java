package pe.gob.vuce.monitoreo.component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.vuce.monitoreo.entity.Operacion;
import pe.gob.vuce.monitoreo.entity.TransmisionEntrada;
import pe.gob.vuce.monitoreo.entity.TransmisionSalida;
import pe.gob.vuce.monitoreo.repository.MonitoreoRepository;

@Component
@Transactional 
public class MonitoreoComponent {

	private final MonitoreoRepository mensajeriaRepository;

	@Autowired
	public MonitoreoComponent(MonitoreoRepository mensajeriaRepository) {
		super();
		this.mensajeriaRepository = mensajeriaRepository;
	}

	public void registrarOperacion(Operacion operacion) {
		try {
			mensajeriaRepository.save(verificar(operacion));
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}

	private Operacion verificar(Operacion operacion) {
		List<TransmisionSalida> transmisionesSalida = new ArrayList<TransmisionSalida>();
		for (Iterator<TransmisionSalida> iterator = operacion.getTransmisionesSalida().iterator(); iterator.hasNext();) {
			TransmisionSalida transmision = (TransmisionSalida) iterator.next();
			if (transmision.getNumeroDocumento()!=null) {
				transmisionesSalida.add(transmision);
			}
		}
		for (Iterator<TransmisionEntrada> iterator = operacion.getTransmisionesEntrada().iterator(); iterator.hasNext();) {
			TransmisionEntrada transmision = (TransmisionEntrada) iterator.next();
			transmision.setIdMensaje(operacion.getIdMensaje());
		}
		operacion.setTransmisionesSalida(transmisionesSalida);
		return operacion;
	}

}
