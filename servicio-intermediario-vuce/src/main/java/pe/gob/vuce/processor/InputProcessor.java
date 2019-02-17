package pe.gob.vuce.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import pe.gob.vuce.entidad.Operacion;

public class InputProcessor implements Processor {

	private static final String SOAP_ACTION = "SOAPAction";
	private static final String OPERACION = "operacion";
	private static final String USUARIO = "usuario";
	private static final String SOLICITUD = "solicitud";

	@Override
	public void process(final Exchange exchange) throws Exception {
		
		final org.apache.camel.Message in = exchange.getIn();
		final String payload = in.getBody(String.class);
		final String operacion = (String) in.getHeader(SOAP_ACTION);
		Operacion solicitud = new Operacion(payload);
		solicitud.setIdMensaje(exchange.getExchangeId());
		solicitud.setNombreOperacion(in.getHeader(SOAP_ACTION, String.class));
		exchange.setProperty(SOLICITUD, solicitud);
		exchange.setProperty(USUARIO, solicitud.getNombreUsuario());
		exchange.setProperty(OPERACION, operacion);
		
	}

	

}
