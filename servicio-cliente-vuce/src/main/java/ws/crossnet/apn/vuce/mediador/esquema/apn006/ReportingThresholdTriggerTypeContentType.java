//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:39:48 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn006;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ReportingThresholdTriggerTypeContentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportingThresholdTriggerTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BTH"/>
 *     &lt;enumeration value="PCT"/>
 *     &lt;enumeration value="VAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ReportingThresholdTriggerTypeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:ReportingThresholdTriggerType:D08B")
@XmlEnum
public enum ReportingThresholdTriggerTypeContentType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69667="urn:un:unece:uncefact:codelist:standard:UNECE:ReportingThresholdTriggerType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Value and percent&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69667="urn:un:unece:uncefact:codelist:standard:UNECE:ReportingThresholdTriggerType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Both value and percent can be used.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    BTH,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69667="urn:un:unece:uncefact:codelist:standard:UNECE:ReportingThresholdTriggerType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Percent&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69667="urn:un:unece:uncefact:codelist:standard:UNECE:ReportingThresholdTriggerType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The percentage of the value is used.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    PCT,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69667="urn:un:unece:uncefact:codelist:standard:UNECE:ReportingThresholdTriggerType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Value&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69667="urn:un:unece:uncefact:codelist:standard:UNECE:ReportingThresholdTriggerType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The actual value is used.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    VAL;

    public String value() {
        return name();
    }

    public static ReportingThresholdTriggerTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
