//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:38:37 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn005;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResourcePlanMeasureTypeContentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourcePlanMeasureTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DC"/>
 *     &lt;enumeration value="HR"/>
 *     &lt;enumeration value="UN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourcePlanMeasureTypeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:ResourcePlanMeasureType:D08B")
@XmlEnum
public enum ResourcePlanMeasureTypeContentType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69671="urn:un:unece:uncefact:codelist:standard:UNECE:ResourcePlanMeasureType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Direct costs&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69671="urn:un:unece:uncefact:codelist:standard:UNECE:ResourcePlanMeasureType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Resources are measured by the direct costs.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    DC,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69671="urn:un:unece:uncefact:codelist:standard:UNECE:ResourcePlanMeasureType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Hours&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69671="urn:un:unece:uncefact:codelist:standard:UNECE:ResourcePlanMeasureType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Resources are measured by the labour hours.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    HR,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69671="urn:un:unece:uncefact:codelist:standard:UNECE:ResourcePlanMeasureType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Other units&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69671="urn:un:unece:uncefact:codelist:standard:UNECE:ResourcePlanMeasureType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Resources are measured by other units.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    UN;

    public String value() {
        return name();
    }

    public static ResourcePlanMeasureTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
