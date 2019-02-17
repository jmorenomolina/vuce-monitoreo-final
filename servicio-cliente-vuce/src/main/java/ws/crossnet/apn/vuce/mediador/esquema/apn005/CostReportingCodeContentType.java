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
 * <p>Clase Java para CostReportingCodeContentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CostReportingCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DEL"/>
 *     &lt;enumeration value="DIR"/>
 *     &lt;enumeration value="DML"/>
 *     &lt;enumeration value="DRS"/>
 *     &lt;enumeration value="DTE"/>
 *     &lt;enumeration value="DTL"/>
 *     &lt;enumeration value="ENO"/>
 *     &lt;enumeration value="ENT"/>
 *     &lt;enumeration value="FEE"/>
 *     &lt;enumeration value="FNG"/>
 *     &lt;enumeration value="GA"/>
 *     &lt;enumeration value="LAB"/>
 *     &lt;enumeration value="MAT"/>
 *     &lt;enumeration value="MOO"/>
 *     &lt;enumeration value="MOT"/>
 *     &lt;enumeration value="PE"/>
 *     &lt;enumeration value="PP"/>
 *     &lt;enumeration value="QCL"/>
 *     &lt;enumeration value="RM"/>
 *     &lt;enumeration value="TM"/>
 *     &lt;enumeration value="TOT"/>
 *     &lt;enumeration value="ZZZ"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CostReportingCodeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B")
@XmlEnum
public enum CostReportingCodeContentType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Direct Engineering Labour&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs directly related to engineering labour.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    DEL,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Direct&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs directly related to a unit of work.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    DIR,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Direct Manufacturing Labour&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs directly related to manufacturing labour.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    DML,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Direct Reporting Subcontractor&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs related to a subcontractor that reports directly to the responsible contractor.&lt;/ccts:Description&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Direct Tooling and Equipment&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs directly related to tooling and equipment.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    DTE,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Direct Tooling Labour&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs directly related to labour for tooling.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    DTL,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Engineering Overhead&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indirect costs related to engineering labour resources required to complete a unit of work.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ENO,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Engineering Total&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;All costs, direct and indirect, related to engineering work.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ENT,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Fee&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indirect costs related to cost of money or other service fees.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    FEE,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Fringe&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indirect costs related to labour, materials, or other resources required to complete a unit of work.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    FNG,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;General and administrative overhead&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indirect costs related to the direction, control, and administration of a company or other entity.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    GA,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Labour overhead&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indirect costs related to labour resources required to complete a unit of work.&lt;/ccts:Description&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Material overhead&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Indirect costs related to material resources required to complete a unit of work.&lt;/ccts:Description&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Manufacturing Operations Overhead&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Total costs related to manufacturing operations.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MOO,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Manufacturing Operations Total&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Total costs related to manufacturing operations.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    MOT,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Purchased Equipment&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs related to the purchase of finished equipment.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    PE,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Purchased Parts&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs related to the purchase of manufactured parts.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    PP,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Direct Quality Control Labour&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs directly related to quality control labour.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    QCL,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Raw Materials&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Costs related to acquiring raw materials.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    RM,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Total Material&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Total costs related to material.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    TM,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Total&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Sum of all costs incurred to complete work.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    TOT,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mutually defined&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm69655="urn:un:unece:uncefact:codelist:standard:UNECE:CostReportingCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mutually agreed upon cost reporting code.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    ZZZ;

    public String value() {
        return name();
    }

    public static CostReportingCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
