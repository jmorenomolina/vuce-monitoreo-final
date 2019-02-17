//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:39:48 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn006;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual, a group, or a body having a role in a business function.
 * 
 * <p>Clase Java para TradePartyType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TradePartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="lastName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
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
    "name",
    "lastName",
    "identificationType",
    "identification",
    "identificationAlternativeType",
    "identificationAlternative",
    "tradeAddress",
    "ubigeo",
    "telephoneUniversalCommunication",
    "faxUniversalCommunication",
    "emailUniversalCommunication",
    "mobileTelephoneUniversalCommunication",
    "activity",
    "reference",
    "legalRepresentativeName",
    "legalRepresentativeIdentificationType",
    "legalRepresentativeIdentification",
    "legalRepresentativeTradeAddress",
    "type",
    "sucursalName",
    "role",
    "national",
    "position"
})
public class TradePartyType {

    @XmlElement(name = "Name")
    protected TextType name;
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
     * Obtiene el valor de la propiedad name.
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
     * Define el valor de la propiedad name.
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
     * Obtiene el valor de la propiedad lastName.
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
     * Define el valor de la propiedad lastName.
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
     * Obtiene el valor de la propiedad identificationType.
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
     * Define el valor de la propiedad identificationType.
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
     * Obtiene el valor de la propiedad identification.
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
     * Define el valor de la propiedad identification.
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
     * Obtiene el valor de la propiedad identificationAlternativeType.
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
     * Define el valor de la propiedad identificationAlternativeType.
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
     * Obtiene el valor de la propiedad identificationAlternative.
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
     * Define el valor de la propiedad identificationAlternative.
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
     * Obtiene el valor de la propiedad tradeAddress.
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
     * Define el valor de la propiedad tradeAddress.
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
     * Obtiene el valor de la propiedad ubigeo.
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
     * Define el valor de la propiedad ubigeo.
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
     * Obtiene el valor de la propiedad telephoneUniversalCommunication.
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
     * Define el valor de la propiedad telephoneUniversalCommunication.
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
     * Obtiene el valor de la propiedad faxUniversalCommunication.
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
     * Define el valor de la propiedad faxUniversalCommunication.
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
     * Obtiene el valor de la propiedad emailUniversalCommunication.
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
     * Define el valor de la propiedad emailUniversalCommunication.
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
     * Obtiene el valor de la propiedad mobileTelephoneUniversalCommunication.
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
     * Define el valor de la propiedad mobileTelephoneUniversalCommunication.
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
     * Obtiene el valor de la propiedad activity.
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
     * Define el valor de la propiedad activity.
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
     * Obtiene el valor de la propiedad reference.
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
     * Define el valor de la propiedad reference.
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
     * Obtiene el valor de la propiedad legalRepresentativeName.
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
     * Define el valor de la propiedad legalRepresentativeName.
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
     * Obtiene el valor de la propiedad legalRepresentativeIdentificationType.
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
     * Define el valor de la propiedad legalRepresentativeIdentificationType.
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
     * Obtiene el valor de la propiedad legalRepresentativeIdentification.
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
     * Define el valor de la propiedad legalRepresentativeIdentification.
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
     * Obtiene el valor de la propiedad legalRepresentativeTradeAddress.
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
     * Define el valor de la propiedad legalRepresentativeTradeAddress.
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
     * Obtiene el valor de la propiedad type.
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
     * Define el valor de la propiedad type.
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
     * Obtiene el valor de la propiedad sucursalName.
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
     * Define el valor de la propiedad sucursalName.
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
     * Obtiene el valor de la propiedad role.
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
     * Define el valor de la propiedad role.
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
     * Obtiene el valor de la propiedad national.
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
     * Define el valor de la propiedad national.
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
     * Obtiene el valor de la propiedad position.
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
     * Define el valor de la propiedad position.
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
