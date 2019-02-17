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
 * <p>Clase Java para FundingTypeCodeContentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="FundingTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="INC"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="SYR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FundingTypeCodeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:FundingTypeCode:D08B")
@XmlEnum
public enum FundingTypeCodeContentType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69659="urn:un:unece:uncefact:codelist:standard:UNECE:FundingTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Incremental&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69659="urn:un:unece:uncefact:codelist:standard:UNECE:FundingTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Funded in arbitrary increments&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    INC,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69659="urn:un:unece:uncefact:codelist:standard:UNECE:FundingTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Multi-year&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69659="urn:un:unece:uncefact:codelist:standard:UNECE:FundingTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Funded over multiple years.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MYR,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69659="urn:un:unece:uncefact:codelist:standard:UNECE:FundingTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Single year&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69659="urn:un:unece:uncefact:codelist:standard:UNECE:FundingTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Funded for a single year.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    SYR;

    public String value() {
        return name();
    }

    public static FundingTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
