
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual, a group, or a body having a role in a business function.
 *
 * <p>Java class for TradePartyType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TradePartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="LastName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="IdentificationType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="Identification" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="IdentificationAlternativeType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="IdentificationAlternative" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="TradeAddress" type="{VUCE_CommonTypes_D08B}TradeAddressType" minOccurs="0"/>
 *         &lt;element name="Ubigeo" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="TelephoneUniversalCommunication" type="{VUCE_CommonTypes_D08B}UniversalCommunicationType" minOccurs="0"/>
 *         &lt;element name="FaxUniversalCommunication" type="{VUCE_CommonTypes_D08B}UniversalCommunicationType" minOccurs="0"/>
 *         &lt;element name="EmailUniversalCommunication" type="{VUCE_CommonTypes_D08B}UniversalCommunicationType" minOccurs="0"/>
 *         &lt;element name="MobileTelephoneUniversalCommunication" type="{VUCE_CommonTypes_D08B}UniversalCommunicationType" minOccurs="0"/>
 *         &lt;element name="Activity" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="Reference" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="LegalRepresentativeName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="LegalRepresentativeIdentificationType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="LegalRepresentativeIdentification" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="LegalRepresentativeTradeAddress" type="{VUCE_CommonTypes_D08B}TradeAddressType" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}CodeType" minOccurs="0"/>
 *         &lt;element name="SucursalName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}CodeType" minOccurs="0"/>
 *         &lt;element name="Role" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="National" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}IndicatorType" minOccurs="0"/>
 *         &lt;element name="Position" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePartyType", namespace = "VUCE_CommonTypes_D08B", propOrder = {
         "name", "lastName", "identificationType", "identification", "identificationAlternativeType",
         "identificationAlternative", "tradeAddress", "ubigeo", "telephoneUniversalCommunication",
         "faxUniversalCommunication", "emailUniversalCommunication", "mobileTelephoneUniversalCommunication",
         "activity", "reference", "legalRepresentativeName", "legalRepresentativeIdentificationType",
         "legalRepresentativeIdentification", "legalRepresentativeTradeAddress", "type", "sucursalName", "role",
         "national", "position"
    })
public class TradePartyType {

    @XmlElement(name = "Name")
    protected TextType name;
    @XmlElement(name = "LastName")
    protected TextType lastName;
    @XmlElement(name = "IdentificationType")
    protected TextType identificationType;
    @XmlElement(name = "Identification")
    protected TextType identification;
    @XmlElement(name = "IdentificationAlternativeType")
    protected TextType identificationAlternativeType;
    @XmlElement(name = "IdentificationAlternative")
    protected TextType identificationAlternative;
    @XmlElement(name = "TradeAddress")
    protected TradeAddressType tradeAddress;
    @XmlElement(name = "Ubigeo")
    protected TextType ubigeo;
    @XmlElement(name = "TelephoneUniversalCommunication")
    protected UniversalCommunicationType telephoneUniversalCommunication;
    @XmlElement(name = "FaxUniversalCommunication")
    protected UniversalCommunicationType faxUniversalCommunication;
    @XmlElement(name = "EmailUniversalCommunication")
    protected UniversalCommunicationType emailUniversalCommunication;
    @XmlElement(name = "MobileTelephoneUniversalCommunication")
    protected UniversalCommunicationType mobileTelephoneUniversalCommunication;
    @XmlElement(name = "Activity")
    protected TextType activity;
    @XmlElement(name = "Reference")
    protected TextType reference;
    @XmlElement(name = "LegalRepresentativeName")
    protected TextType legalRepresentativeName;
    @XmlElement(name = "LegalRepresentativeIdentificationType")
    protected TextType legalRepresentativeIdentificationType;
    @XmlElement(name = "LegalRepresentativeIdentification")
    protected TextType legalRepresentativeIdentification;
    @XmlElement(name = "LegalRepresentativeTradeAddress")
    protected TradeAddressType legalRepresentativeTradeAddress;
    @XmlElement(name = "Type")
    protected CodeType type;
    @XmlElement(name = "SucursalName")
    protected CodeType sucursalName;
    @XmlElement(name = "Role")
    protected TextType role;
    @XmlElement(name = "National")
    protected Boolean national;
    @XmlElement(name = "Position")
    protected TextType position;

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setName(TextType value) {
        this.name = value;
    }

    /**
     * Gets the value of the lastName property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setLastName(TextType value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the identificationType property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getIdentificationType() {
        return identificationType;
    }

    /**
     * Sets the value of the identificationType property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setIdentificationType(TextType value) {
        this.identificationType = value;
    }

    /**
     * Gets the value of the identification property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getIdentification() {
        return identification;
    }

    /**
     * Sets the value of the identification property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setIdentification(TextType value) {
        this.identification = value;
    }

    /**
     * Gets the value of the identificationAlternativeType property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getIdentificationAlternativeType() {
        return identificationAlternativeType;
    }

    /**
     * Sets the value of the identificationAlternativeType property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setIdentificationAlternativeType(TextType value) {
        this.identificationAlternativeType = value;
    }

    /**
     * Gets the value of the identificationAlternative property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getIdentificationAlternative() {
        return identificationAlternative;
    }

    /**
     * Sets the value of the identificationAlternative property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setIdentificationAlternative(TextType value) {
        this.identificationAlternative = value;
    }

    /**
     * Gets the value of the tradeAddress property.
     *
     * @return
     *     possible object is
     *     {@link TradeAddressType }
     *
     */
    public TradeAddressType getTradeAddress() {
        return tradeAddress;
    }

    /**
     * Sets the value of the tradeAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link TradeAddressType }
     *
     */
    public void setTradeAddress(TradeAddressType value) {
        this.tradeAddress = value;
    }

    /**
     * Gets the value of the ubigeo property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getUbigeo() {
        return ubigeo;
    }

    /**
     * Sets the value of the ubigeo property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setUbigeo(TextType value) {
        this.ubigeo = value;
    }

    /**
     * Gets the value of the telephoneUniversalCommunication property.
     *
     * @return
     *     possible object is
     *     {@link UniversalCommunicationType }
     *
     */
    public UniversalCommunicationType getTelephoneUniversalCommunication() {
        return telephoneUniversalCommunication;
    }

    /**
     * Sets the value of the telephoneUniversalCommunication property.
     *
     * @param value
     *     allowed object is
     *     {@link UniversalCommunicationType }
     *
     */
    public void setTelephoneUniversalCommunication(UniversalCommunicationType value) {
        this.telephoneUniversalCommunication = value;
    }

    /**
     * Gets the value of the faxUniversalCommunication property.
     *
     * @return
     *     possible object is
     *     {@link UniversalCommunicationType }
     *
     */
    public UniversalCommunicationType getFaxUniversalCommunication() {
        return faxUniversalCommunication;
    }

    /**
     * Sets the value of the faxUniversalCommunication property.
     *
     * @param value
     *     allowed object is
     *     {@link UniversalCommunicationType }
     *
     */
    public void setFaxUniversalCommunication(UniversalCommunicationType value) {
        this.faxUniversalCommunication = value;
    }

    /**
     * Gets the value of the emailUniversalCommunication property.
     *
     * @return
     *     possible object is
     *     {@link UniversalCommunicationType }
     *
     */
    public UniversalCommunicationType getEmailUniversalCommunication() {
        return emailUniversalCommunication;
    }

    /**
     * Sets the value of the emailUniversalCommunication property.
     *
     * @param value
     *     allowed object is
     *     {@link UniversalCommunicationType }
     *
     */
    public void setEmailUniversalCommunication(UniversalCommunicationType value) {
        this.emailUniversalCommunication = value;
    }

    /**
     * Gets the value of the mobileTelephoneUniversalCommunication property.
     *
     * @return
     *     possible object is
     *     {@link UniversalCommunicationType }
     *
     */
    public UniversalCommunicationType getMobileTelephoneUniversalCommunication() {
        return mobileTelephoneUniversalCommunication;
    }

    /**
     * Sets the value of the mobileTelephoneUniversalCommunication property.
     *
     * @param value
     *     allowed object is
     *     {@link UniversalCommunicationType }
     *
     */
    public void setMobileTelephoneUniversalCommunication(UniversalCommunicationType value) {
        this.mobileTelephoneUniversalCommunication = value;
    }

    /**
     * Gets the value of the activity property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getActivity() {
        return activity;
    }

    /**
     * Sets the value of the activity property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setActivity(TextType value) {
        this.activity = value;
    }

    /**
     * Gets the value of the reference property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setReference(TextType value) {
        this.reference = value;
    }

    /**
     * Gets the value of the legalRepresentativeName property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getLegalRepresentativeName() {
        return legalRepresentativeName;
    }

    /**
     * Sets the value of the legalRepresentativeName property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setLegalRepresentativeName(TextType value) {
        this.legalRepresentativeName = value;
    }

    /**
     * Gets the value of the legalRepresentativeIdentificationType property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getLegalRepresentativeIdentificationType() {
        return legalRepresentativeIdentificationType;
    }

    /**
     * Sets the value of the legalRepresentativeIdentificationType property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setLegalRepresentativeIdentificationType(TextType value) {
        this.legalRepresentativeIdentificationType = value;
    }

    /**
     * Gets the value of the legalRepresentativeIdentification property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getLegalRepresentativeIdentification() {
        return legalRepresentativeIdentification;
    }

    /**
     * Sets the value of the legalRepresentativeIdentification property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setLegalRepresentativeIdentification(TextType value) {
        this.legalRepresentativeIdentification = value;
    }

    /**
     * Gets the value of the legalRepresentativeTradeAddress property.
     *
     * @return
     *     possible object is
     *     {@link TradeAddressType }
     *
     */
    public TradeAddressType getLegalRepresentativeTradeAddress() {
        return legalRepresentativeTradeAddress;
    }

    /**
     * Sets the value of the legalRepresentativeTradeAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link TradeAddressType }
     *
     */
    public void setLegalRepresentativeTradeAddress(TradeAddressType value) {
        this.legalRepresentativeTradeAddress = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setType(CodeType value) {
        this.type = value;
    }

    /**
     * Gets the value of the sucursalName property.
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getSucursalName() {
        return sucursalName;
    }

    /**
     * Sets the value of the sucursalName property.
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setSucursalName(CodeType value) {
        this.sucursalName = value;
    }

    /**
     * Gets the value of the role property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setRole(TextType value) {
        this.role = value;
    }

    /**
     * Gets the value of the national property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isNational() {
        return national;
    }

    /**
     * Sets the value of the national property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setNational(Boolean value) {
        this.national = value;
    }

    /**
     * Gets the value of the position property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getPosition() {
        return position;
    }

    /**
     * Sets the value of the position property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setPosition(TextType value) {
        this.position = value;
    }

}
