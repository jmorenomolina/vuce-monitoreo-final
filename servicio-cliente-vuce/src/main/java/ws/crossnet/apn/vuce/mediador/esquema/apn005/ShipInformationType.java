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
 * <p>Clase Java para ShipInformationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
    "shipName",
    "registerNumber",
    "certificateNumber",
    "certificateExpirationDate",
    "grossTonage",
    "securityCertificateNumber",
    "securityCertificateExpirationDate",
    "maxCapacity",
    "endowmentCertificateNumber",
    "shipOwner",
    "contractType",
    "contractExpirationDate",
    "stateFlag"
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
    @XmlElement(name = "StateFlag")
    protected TextType stateFlag;

    /**
     * Obtiene el valor de la propiedad shipName.
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
     * Define el valor de la propiedad shipName.
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
     * Obtiene el valor de la propiedad registerNumber.
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
     * Define el valor de la propiedad registerNumber.
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
     * Obtiene el valor de la propiedad certificateNumber.
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
     * Define el valor de la propiedad certificateNumber.
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
     * Obtiene el valor de la propiedad certificateExpirationDate.
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
     * Define el valor de la propiedad certificateExpirationDate.
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
     * Obtiene el valor de la propiedad grossTonage.
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
     * Define el valor de la propiedad grossTonage.
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
     * Obtiene el valor de la propiedad securityCertificateNumber.
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
     * Define el valor de la propiedad securityCertificateNumber.
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
     * Obtiene el valor de la propiedad securityCertificateExpirationDate.
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
     * Define el valor de la propiedad securityCertificateExpirationDate.
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
     * Obtiene el valor de la propiedad maxCapacity.
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
     * Define el valor de la propiedad maxCapacity.
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
     * Obtiene el valor de la propiedad endowmentCertificateNumber.
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
     * Define el valor de la propiedad endowmentCertificateNumber.
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
     * Obtiene el valor de la propiedad shipOwner.
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
     * Define el valor de la propiedad shipOwner.
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
     * Obtiene el valor de la propiedad contractType.
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
     * Define el valor de la propiedad contractType.
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
     * Obtiene el valor de la propiedad contractExpirationDate.
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
     * Define el valor de la propiedad contractExpirationDate.
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
     * Obtiene el valor de la propiedad stateFlag.
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
     * Define el valor de la propiedad stateFlag.
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
