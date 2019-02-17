package pe.gob.vuce.alertas.service.temporal;

public class ExtraerCadena {

	public static void main(String[] args) {
		
		String xml = "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\r\n" + 
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
				"";
		
		System.out.println(extraerValorDeXML(xml,"<tipo>","</tipo>"));

	}

	public static String extraerValorDeXML(String xml, String etiquetaInicial,String etiquetaFinal) {
		int beginIndex = xml.indexOf(etiquetaInicial) + etiquetaInicial.length();
		int endIndex = xml.indexOf(etiquetaFinal);
		return xml.substring(beginIndex, endIndex);
	}
}
