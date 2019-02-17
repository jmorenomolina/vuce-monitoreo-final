
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ShipInformationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ShipInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShipName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="RegisterNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="CertificateNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="CertificateExpirationDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}DateType" minOccurs="0"/>
 *         &lt;element name="GrossTonage" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}MeasureType" minOccurs="0"/>
 *         &lt;element name="SecurityCertificateNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="SecurityCertificateExpirationDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}DateType" minOccurs="0"/>
 *         &lt;element name="MaxCapacity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="EndowmentCertificateNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="ShipOwner" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="ContractType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="ContractExpirationDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}DateType" minOccurs="0"/>
 *         &lt;element name="Lenght" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="Sleeve" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="Power" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="StateFlag" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShipInformationType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
         "shipName", "registerNumber", "certificateNumber", "certificateExpirationDate", "grossTonage",
         "securityCertificateNumber", "securityCertificateExpirationDate", "maxCapacity", "endowmentCertificateNumber",
         "shipOwner", "contractType", "contractExpirationDate", "lenght", "sleeve", "power", "stateFlag"
    })
public class ShipInformationType {

    @XmlElement(name = "ShipName")
    protected TextType shipName;
    @XmlElement(name = "RegisterNumber")
    protected TextType registerNumber;
    @XmlElement(name = "CertificateNumber")
    protected TextType certificateNumber;
    @XmlElement(name = "CertificateExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar certificateExpirationDate;
    @XmlElement(name = "GrossTonage")
    protected MeasureType grossTonage;
    @XmlElement(name = "SecurityCertificateNumber")
    protected TextType securityCertificateNumber;
    @XmlElement(name = "SecurityCertificateExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar securityCertificateExpirationDate;
    @XmlElement(name = "MaxCapacity")
    protected TextType maxCapacity;
    @XmlElement(name = "EndowmentCertificateNumber")
    protected TextType endowmentCertificateNumber;
    @XmlElement(name = "ShipOwner")
    protected TextType shipOwner;
    @XmlElement(name = "ContractType")
    protected TextType contractType;
    @XmlElement(name = "ContractExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar contractExpirationDate;
    @XmlElement(name = "Lenght")
    protected TextType lenght;
    @XmlElement(name = "Sleeve")
    protected TextType sleeve;
    @XmlElement(name = "Power")
    protected TextType power;
    @XmlElement(name = "StateFlag")
    protected TextType stateFlag;

    /**
     * Gets the value of the shipName property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getShipName() {
        return shipName;
    }

    /**
     * Sets the value of the shipName property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setShipName(TextType value) {
        this.shipName = value;
    }

    /**
     * Gets the value of the registerNumber property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Sets the value of the registerNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setRegisterNumber(TextType value) {
        this.registerNumber = value;
    }

    /**
     * Gets the value of the certificateNumber property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getCertificateNumber() {
        return certificateNumber;
    }

    /**
     * Sets the value of the certificateNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setCertificateNumber(TextType value) {
        this.certificateNumber = value;
    }

    /**
     * Gets the value of the certificateExpirationDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCertificateExpirationDate() {
        return certificateExpirationDate;
    }

    /**
     * Sets the value of the certificateExpirationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setCertificateExpirationDate(XMLGregorianCalendar value) {
        this.certificateExpirationDate = value;
    }

    /**
     * Gets the value of the grossTonage property.
     *
     * @return
     *     possible object is
     *     {@link MeasureType }
     *
     */
    public MeasureType getGrossTonage() {
        return grossTonage;
    }

    /**
     * Sets the value of the grossTonage property.
     *
     * @param value
     *     allowed object is
     *     {@link MeasureType }
     *
     */
    public void setGrossTonage(MeasureType value) {
        this.grossTonage = value;
    }

    /**
     * Gets the value of the securityCertificateNumber property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getSecurityCertificateNumber() {
        return securityCertificateNumber;
    }

    /**
     * Sets the value of the securityCertificateNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setSecurityCertificateNumber(TextType value) {
        this.securityCertificateNumber = value;
    }

    /**
     * Gets the value of the securityCertificateExpirationDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getSecurityCertificateExpirationDate() {
        return securityCertificateExpirationDate;
    }

    /**
     * Sets the value of the securityCertificateExpirationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setSecurityCertificateExpirationDate(XMLGregorianCalendar value) {
        this.securityCertificateExpirationDate = value;
    }

    /**
     * Gets the value of the maxCapacity property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Sets the value of the maxCapacity property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setMaxCapacity(TextType value) {
        this.maxCapacity = value;
    }

    /**
     * Gets the value of the endowmentCertificateNumber property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getEndowmentCertificateNumber() {
        return endowmentCertificateNumber;
    }

    /**
     * Sets the value of the endowmentCertificateNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setEndowmentCertificateNumber(TextType value) {
        this.endowmentCertificateNumber = value;
    }

    /**
     * Gets the value of the shipOwner property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getShipOwner() {
        return shipOwner;
    }

    /**
     * Sets the value of the shipOwner property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setShipOwner(TextType value) {
        this.shipOwner = value;
    }

    /**
     * Gets the value of the contractType property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getContractType() {
        return contractType;
    }

    /**
     * Sets the value of the contractType property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setContractType(TextType value) {
        this.contractType = value;
    }

    /**
     * Gets the value of the contractExpirationDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getContractExpirationDate() {
        return contractExpirationDate;
    }

    /**
     * Sets the value of the contractExpirationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setContractExpirationDate(XMLGregorianCalendar value) {
        this.contractExpirationDate = value;
    }

    /**
     * Gets the value of the lenght property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getLenght() {
        return lenght;
    }

    /**
     * Sets the value of the lenght property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setLenght(TextType value) {
        this.lenght = value;
    }

    /**
     * Gets the value of the sleeve property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getSleeve() {
        return sleeve;
    }

    /**
     * Sets the value of the sleeve property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setSleeve(TextType value) {
        this.sleeve = value;
    }

    /**
     * Gets the value of the power property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getPower() {
        return power;
    }

    /**
     * Sets the value of the power property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setPower(TextType value) {
        this.power = value;
    }

    /**
     * Gets the value of the stateFlag property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getStateFlag() {
        return stateFlag;
    }

    /**
     * Sets the value of the stateFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setStateFlag(TextType value) {
        this.stateFlag = value;
    }

}
