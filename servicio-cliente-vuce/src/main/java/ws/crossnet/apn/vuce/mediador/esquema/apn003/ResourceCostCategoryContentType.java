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
 * <p>Clase Java para ResourceCostCategoryContentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceCostCategoryContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LAB"/>
 *     &lt;enumeration value="MAT"/>
 *     &lt;enumeration value="ODC"/>
 *     &lt;enumeration value="SBC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceCostCategoryContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:ResourceCostCategory:D08B")
@XmlEnum
public enum ResourceCostCategoryContentType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69669="urn:un:unece:uncefact:codelist:standard:UNECE:ResourceCostCategory:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Labour&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69669="urn:un:unece:uncefact:codelist:standard:UNECE:ResourceCostCategory:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Labour used to produce an item.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    LAB,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69669="urn:un:unece:uncefact:codelist:standard:UNECE:ResourceCostCategory:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Material&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69669="urn:un:unece:uncefact:codelist:standard:UNECE:ResourceCostCategory:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Material used to produce an item.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MAT,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69669="urn:un:unece:uncefact:codelist:standard:UNECE:ResourceCostCategory:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Other direct cost&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69669="urn:un:unece:uncefact:codelist:standard:UNECE:ResourceCostCategory:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A cost directly incurred to produce an item other than labour or materials.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ODC,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69669="urn:un:unece:uncefact:codelist:standard:UNECE:ResourceCostCategory:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Subcontract&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69669="urn:un:unece:uncefact:codelist:standard:UNECE:ResourceCostCategory:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;The cost of any work subcontracted out to another entity to produce an item.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    SBC;

    public String value() {
        return name();
    }

    public static ResourceCostCategoryContentType fromValue(String v) {
        return valueOf(v);
    }

}
