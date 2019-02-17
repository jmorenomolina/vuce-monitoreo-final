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
 * <p>Clase Java para ScheduleTaskTypeContentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ScheduleTaskTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="FA"/>
 *     &lt;enumeration value="HAM"/>
 *     &lt;enumeration value="MS"/>
 *     &lt;enumeration value="SA"/>
 *     &lt;enumeration value="SUM"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ScheduleTaskTypeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B")
@XmlEnum
public enum ScheduleTaskTypeContentType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Activity&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;An activity is a single atomic unit of work to be accomplished.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    AC,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Finish activity&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Last task in a networked schedule.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    FA,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Hammock&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;This task type is used to create a pseudo-summary over detailed tasks that are not subordinate to this task.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    HAM,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Milestone&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A milestone is a specific goal to be accomplished within a project.  Milestones typically have zero duration.&lt;/ccts:Description&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Start activity&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;First task in a networked schedule.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    SA,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Summary&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69675="urn:un:unece:uncefact:codelist:standard:UNECE:ScheduleTaskType:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A summary task summarizes detailed subordinate activities.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    SUM;

    public String value() {
        return name();
    }

    public static ScheduleTaskTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
