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
 * <p>Clase Java para SecurityClassificationTypeContentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="SecurityClassificationTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="GC"/>
 *     &lt;enumeration value="GNC"/>
 *     &lt;enumeration value="GS"/>
 *     &lt;enumeration value="GTS"/>
 *     &lt;enumeration value="UNC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecurityClassificationTypeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B")
@XmlEnum
public enum SecurityClassificationTypeContentType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69677="urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Competition sensitive&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69677="urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Information which provides a competitive advantage.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    CS,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69677="urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Government confidential&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69677="urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Information which is defined by a government entity as confidential.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    GC,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69677="urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Government non-classified&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69677="urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Information which is defined by a government entity as not confidential.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    GNC,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69677="urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Government secret&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69677="urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Information which is defined by a government entity as secret.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    GS,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69677="urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Government top secret&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69677="urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Information which is defined by a government entity as having the highest level of secrecy.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    GTS,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69677="urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Unclassified&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69677="urn:un:unece:uncefact:codelist:standard:UNECE:SecurityClassificationType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Information which is openly available.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    UNC;

    public String value() {
        return name();
    }

    public static SecurityClassificationTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
