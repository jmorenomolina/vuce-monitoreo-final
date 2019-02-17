//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:37:09 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn003;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para LicenceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LicenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicenceNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="LicenceType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="GrantYear" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="LastRenovationDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}DateType" minOccurs="0"/>
 *         &lt;element name="ModifyDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}DateType" minOccurs="0"/>
 *         &lt;element name="Expedient" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}DateType" minOccurs="0"/>
 *         &lt;element name="CompanyType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="ProvidedByTradeParty" type="{VUCE_CommonTypes_D08B}TradePartyType" minOccurs="0"/>
 *         &lt;element name="ConformityFlag" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="ModifyInformation" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenceType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
    "licenceNumber",
    "licenceType",
    "grantYear",
    "lastRenovationDate",
    "modifyDate",
    "expedient",
    "expirationDate",
    "companyType",
    "providedByTradeParty",
    "conformityFlag",
    "modifyInformation"
})
public class LicenceType {

    @XmlElement(name = "LicenceNumber")
    protected TextType licenceNumber;
    @XmlElement(name = "LicenceType")
    protected TextType licenceType;
    @XmlElement(name = "GrantYear")
    protected TextType grantYear;
    @XmlElement(name = "LastRenovationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastRenovationDate;
    @XmlElement(name = "ModifyDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar modifyDate;
    @XmlElement(name = "Expedient")
    protected TextType expedient;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;
    @XmlElement(name = "CompanyType")
    protected TextType companyType;
    @XmlElement(name = "ProvidedByTradeParty")
    protected TradePartyType providedByTradeParty;
    @XmlElement(name = "ConformityFlag")
    protected TextType conformityFlag;
    @XmlElement(name = "ModifyInformation")
    protected TextType modifyInformation;

    /**
     * Obtiene el valor de la propiedad licenceNumber.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLicenceNumber() {
        return licenceNumber;
    }

    /**
     * Define el valor de la propiedad licenceNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLicenceNumber(TextType value) {
        this.licenceNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad licenceType.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getLicenceType() {
        return licenceType;
    }

    /**
     * Define el valor de la propiedad licenceType.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setLicenceType(TextType value) {
        this.licenceType = value;
    }

    /**
     * Obtiene el valor de la propiedad grantYear.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getGrantYear() {
        return grantYear;
    }

    /**
     * Define el valor de la propiedad grantYear.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setGrantYear(TextType value) {
        this.grantYear = value;
    }

    /**
     * Obtiene el valor de la propiedad lastRenovationDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastRenovationDate() {
        return lastRenovationDate;
    }

    /**
     * Define el valor de la propiedad lastRenovationDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastRenovationDate(XMLGregorianCalendar value) {
        this.lastRenovationDate = value;
    }

    /**
     * Obtiene el valor de la propiedad modifyDate.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModifyDate() {
        return modifyDate;
    }

    /**
     * Define el valor de la propiedad modifyDate.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModifyDate(XMLGregorianCalendar value) {
        this.modifyDate = value;
    }

    /**
     * Obtiene el valor de la propiedad expedient.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getExpedient() {
        return expedient;
    }

    /**
     * Define el valor de la propiedad expedient.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setExpedient(TextType value) {
        this.expedient = value;
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

    /**
     * Obtiene el valor de la propiedad companyType.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCompanyType() {
        return companyType;
    }

    /**
     * Define el valor de la propiedad companyType.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCompanyType(TextType value) {
        this.companyType = value;
    }

    /**
     * Obtiene el valor de la propiedad providedByTradeParty.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyType }
     *     
     */
    public TradePartyType getProvidedByTradeParty() {
        return providedByTradeParty;
    }

    /**
     * Define el valor de la propiedad providedByTradeParty.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyType }
     *     
     */
    public void setProvidedByTradeParty(TradePartyType value) {
        this.providedByTradeParty = value;
    }

    /**
     * Obtiene el valor de la propiedad conformityFlag.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getConformityFlag() {
        return conformityFlag;
    }

    /**
     * Define el valor de la propiedad conformityFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setConformityFlag(TextType value) {
        this.conformityFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad modifyInformation.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getModifyInformation() {
        return modifyInformation;
    }

    /**
     * Define el valor de la propiedad modifyInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setModifyInformation(TextType value) {
        this.modifyInformation = value;
    }

}
