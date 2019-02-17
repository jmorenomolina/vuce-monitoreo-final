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
 * <p>Clase Java para DutyorTaxorFeeCategoryCodeContentType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="DutyorTaxorFeeCategoryCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="AA"/>
 *     &lt;enumeration value="AB"/>
 *     &lt;enumeration value="AC"/>
 *     &lt;enumeration value="AD"/>
 *     &lt;enumeration value="AE"/>
 *     &lt;enumeration value="B"/>
 *     &lt;enumeration value="C"/>
 *     &lt;enumeration value="E"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="H"/>
 *     &lt;enumeration value="O"/>
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="Z"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DutyorTaxorFeeCategoryCodeContentType", namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B")
@XmlEnum
public enum DutyorTaxorFeeCategoryCodeContentType {


    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Mixed tax rate&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code specifying that the rate is based on mixed tax.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    A,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Lower rate&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Tax rate is lower than standard rate.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    AA,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Exempt for resale&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A tax category code indicating the item is tax exempt when the item is bought for future resale.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    AB,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Value Added Tax (VAT) not now due for payment&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A code to indicate that the Value Added Tax (VAT) amount which is due on the current invoice is to be paid on receipt of a separate VAT payment request.&lt;/ccts:Description&gt;
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
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Value Added Tax (VAT) due from a previous invoice&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;A code to indicate that the Value Added Tax (VAT) amount of a previous invoice is to be paid.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    AD,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;VAT Reverse Charge&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code specifying that the standard VAT rate is levied from the invoicee.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    AE,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Transferred (VAT)&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;VAT not to be paid to the issuer of the invoice but directly to relevant tax authority.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    B,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Duty paid by supplier&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Duty associated with shipment of goods is paid by the supplier; customer receives goods with duty paid.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    C,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Exempt from tax&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code specifying that taxes are not applicable.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    E,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Free export item, tax not charged&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code specifying that the item is free export and taxes are not charged.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    G,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Higher rate&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code specifying a higher rate of duty or tax or fee.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    H,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Services outside scope of tax&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code specifying that taxes are not applicable to the services.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    O,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Standard rate&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code specifying the standard rate.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    S,

    /**
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Zero rated goods&lt;/ccts:Name&gt;
     * </pre>
     * 
     * 						
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2" xmlns:clm65305="urn:un:unece:uncefact:codelist:standard:UNECE:DutyorTaxorFeeCategoryCode:D08B" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;Code specifying that the goods are at a zero rate.&lt;/ccts:Description&gt;
     * </pre>
     * 
     * 					
     * 
     */
    Z;

    public String value() {
        return name();
    }

    public static DutyorTaxorFeeCategoryCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
