//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:37:09 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn003;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ProviderType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ProviderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RegisterNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}NumericType" minOccurs="0"/>
 *         &lt;element name="SocialObject" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="SocialCapital" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}QuantityType" minOccurs="0"/>
 *         &lt;element name="MunicipalLicence" type="{APNReusableAggregateBusinessInformationEntity}LicenceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProviderType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
    "registerNumber",
    "socialObject",
    "socialCapital",
    "municipalLicence"
})
public class ProviderType {

    @XmlElement(name = "RegisterNumber")
    protected BigDecimal registerNumber;
    @XmlElement(name = "SocialObject")
    protected TextType socialObject;
    @XmlElement(name = "SocialCapital")
    protected QuantityType socialCapital;
    @XmlElement(name = "MunicipalLicence")
    protected LicenceType municipalLicence;

    /**
     * Obtiene el valor de la propiedad registerNumber.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Define el valor de la propiedad registerNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setRegisterNumber(BigDecimal value) {
        this.registerNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad socialObject.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSocialObject() {
        return socialObject;
    }

    /**
     * Define el valor de la propiedad socialObject.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSocialObject(TextType value) {
        this.socialObject = value;
    }

    /**
     * Obtiene el valor de la propiedad socialCapital.
     * 
     * @return
     *     possible object is
     *     {@link QuantityType }
     *     
     */
    public QuantityType getSocialCapital() {
        return socialCapital;
    }

    /**
     * Define el valor de la propiedad socialCapital.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityType }
     *     
     */
    public void setSocialCapital(QuantityType value) {
        this.socialCapital = value;
    }

    /**
     * Obtiene el valor de la propiedad municipalLicence.
     * 
     * @return
     *     possible object is
     *     {@link LicenceType }
     *     
     */
    public LicenceType getMunicipalLicence() {
        return municipalLicence;
    }

    /**
     * Define el valor de la propiedad municipalLicence.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenceType }
     *     
     */
    public void setMunicipalLicence(LicenceType value) {
        this.municipalLicence = value;
    }

}
