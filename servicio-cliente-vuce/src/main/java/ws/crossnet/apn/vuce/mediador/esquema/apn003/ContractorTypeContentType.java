//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:37:09 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn003;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ContractorTypeContentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ContractorTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DRS"/>
 *     &lt;enumeration value="PAC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ContractorTypeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:ContractorType:D08B")
@XmlEnum
public enum ContractorTypeContentType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6ContractorType="urn:un:unece:uncefact:codelist:standard:UNECE:ContractorType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Direct Reporting Subcontractor&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6ContractorType="urn:un:unece:uncefact:codelist:standard:UNECE:ContractorType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Subcontractor that reports directly to the customer or client.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    DRS,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6ContractorType="urn:un:unece:uncefact:codelist:standard:UNECE:ContractorType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Primary or Associate Contractor&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm6ContractorType="urn:un:unece:uncefact:codelist:standard:UNECE:ContractorType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Primary contractor or associate contractor&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    PAC;

    public String value() {
        return name();
    }

    public static ContractorTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
