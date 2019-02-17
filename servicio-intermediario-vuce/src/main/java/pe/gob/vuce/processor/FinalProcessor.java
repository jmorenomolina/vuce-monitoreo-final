package pe.gob.vuce.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class FinalProcessor implements Processor {

	public static final String MENSAJE_XML = "mensaje.xml";

	@Override
	public void process(final Exchange exchange) throws Exception {
		exchange.getOut().setBody(exchange.getIn().getBody());
	}

}
