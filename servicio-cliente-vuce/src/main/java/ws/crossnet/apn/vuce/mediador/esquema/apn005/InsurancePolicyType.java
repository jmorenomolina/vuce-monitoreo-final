//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:38:37 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para InsurancePolicyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InsurancePolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="InsuranceNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="InsuranceName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="InsuranceMount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}QuantityType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}DateType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsurancePolicyType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
    "insuranceType",
    "insuranceNumber",
    "insuranceName",
    "insuranceMount",
    "expirationDate"
})
public class InsurancePolicyType {

    @XmlElement(name = "InsuranceType")
    protected TextType insuranceType;
    @XmlElement(name = "InsuranceNumber")
    protected TextType insuranceNumber;
    @XmlElement(name = "InsuranceName")
    protected TextType insuranceName;
    @XmlElement(name = "InsuranceMount")
    protected QuantityType insuranceMount;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;

    /**
     * Obtiene el valor de la propiedad insuranceType.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getInsuranceType() {
        return insuranceType;
    }

    /**
     * Define el valor de la propiedad insuranceType.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setInsuranceType(TextType value) {
        this.insuranceType = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceNumber.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getInsuranceNumber() {
        return insuranceNumber;
    }

    /**
     * Define el valor de la propiedad insuranceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setInsuranceNumber(TextType value) {
        this.insuranceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getInsuranceName() {
        return insuranceName;
    }

    /**
     * Define el valor de la propiedad insuranceName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setInsuranceName(TextType value) {
        this.insuranceName = value;
    }

    /**
     * Obtiene el valor de la propiedad insuranceMount.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getInsuranceMount() {
        return insuranceMount;
    }

    /**
     * Define el valor de la propiedad insuranceMount.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setInsuranceMount(QuantityType value) {
        this.insuranceMount = value;
    }

    /**
     * Obtiene el valor de la propiedad expirationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpirationDate() {
        return expirationDate;
    }

    /**
     * Define el valor de la propiedad expirationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpirationDate(XMLGregorianCalendar value) {
        this.expirationDate = value;
    }

}
