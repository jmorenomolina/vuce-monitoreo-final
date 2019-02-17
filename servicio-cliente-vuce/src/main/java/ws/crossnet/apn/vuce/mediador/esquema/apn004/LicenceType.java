
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for LicenceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="LicenceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LicenceFlag" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
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
         "licenceFlag", "licenceNumber", "licenceType", "grantYear", "lastRenovationDate", "modifyDate", "expedient",
         "expirationDate", "companyType", "providedByTradeParty", "conformityFlag", "modifyInformation"
    })
public class LicenceType {

    @XmlElement(name = "LicenceFlag")
    protected TextType licenceFlag;
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
     * Gets the value of the licenceFlag property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getLicenceFlag() {
        return licenceFlag;
    }

    /**
     * Sets the value of the licenceFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setLicenceFlag(TextType value) {
        this.licenceFlag = value;
    }

    /**
     * Gets the value of the licenceNumber property.
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
     * Sets the value of the licenceNumber property.
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
     * Gets the value of the licenceType property.
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
     * Sets the value of the licenceType property.
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
     * Gets the value of the grantYear property.
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
     * Sets the value of the grantYear property.
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
     * Gets the value of the lastRenovationDate property.
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
     * Sets the value of the lastRenovationDate property.
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
     * Gets the value of the modifyDate property.
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
     * Sets the value of the modifyDate property.
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
     * Gets the value of the expedient property.
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
     * Sets the value of the expedient property.
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
     * Gets the value of the expirationDate property.
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
     * Sets the value of the expirationDate property.
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
     * Gets the value of the companyType property.
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
     * Sets the value of the companyType property.
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
     * Gets the value of the providedByTradeParty property.
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
     * Sets the value of the providedByTradeParty property.
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
     * Gets the value of the conformityFlag property.
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
     * Sets the value of the conformityFlag property.
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
     * Gets the value of the modifyInformation property.
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
     * Sets the value of the modifyInformation property.
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
