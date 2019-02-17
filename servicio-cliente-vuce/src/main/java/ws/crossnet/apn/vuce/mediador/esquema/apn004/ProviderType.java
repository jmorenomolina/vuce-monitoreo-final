
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProviderType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
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
         "registerNumber", "socialObject", "socialCapital", "municipalLicence"
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
     * Gets the value of the registerNumber property.
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
     * Sets the value of the registerNumber property.
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
     * Gets the value of the socialObject property.
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
     * Sets the value of the socialObject property.
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
     * Gets the value of the socialCapital property.
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
     * Sets the value of the socialCapital property.
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
     * Gets the value of the municipalLicence property.
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
     * Sets the value of the municipalLicence property.
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
