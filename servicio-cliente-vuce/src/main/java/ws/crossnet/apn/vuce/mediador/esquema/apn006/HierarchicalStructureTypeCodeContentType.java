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
 * <p>Clase Java para HierarchicalStructureTypeCodeContentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="HierarchicalStructureTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="IMP"/>
 *     &lt;enumeration value="IMS"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="OBS"/>
 *     &lt;enumeration value="RBS"/>
 *     &lt;enumeration value="WBS"/>
 *     &lt;enumeration value="ZZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "HierarchicalStructureTypeCodeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B")
@XmlEnum
public enum HierarchicalStructureTypeCodeContentType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Integrated master plan&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An event-driven plan that documents the significant accomplishments necessary to complete the work and ties each accomplishment to a key program event.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    IMP,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Integrated master schedule&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An integrated and networked schedule of tasks required to complete a defined work effort or scope of work.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    IMS,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Milestone hierarchy&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A hierarchy of specific project milestones.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MS,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Organizational breakdown structure&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A structure that defines how an entity is organized.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    OBS,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Resource breakdown structure&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A structure that defines the resource classifications necessary to complete a project.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    RBS,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Work breakdown structure&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A structure that defines the work that must be accomplished to complete a project.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    WBS,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mutually defined&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69661="urn:un:unece:uncefact:codelist:standard:UNECE:HierarchicalStructureTypeCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mutually agreed upon hierarchical structure type.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ZZZ;

    public String value() {
        return name();
    }

    public static HierarchicalStructureTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
