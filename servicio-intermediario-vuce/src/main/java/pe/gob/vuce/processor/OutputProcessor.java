package pe.gob.vuce.processor;

import java.util.Date;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import pe.gob.vuce.entidad.Operacion;

public class OutputProcessor implements Processor {

	@Override
	public void process(final Exchange exchange) throws Exception {

		Operacion solicitud = exchange.getProperty("solicitud", Operacion.class);
		solicitud.setFechaHoraRespuesta(new Date());
		solicitud.setHayFalla(0);
		exchange.setProperty("solicitud", solicitud);
		
	}
}