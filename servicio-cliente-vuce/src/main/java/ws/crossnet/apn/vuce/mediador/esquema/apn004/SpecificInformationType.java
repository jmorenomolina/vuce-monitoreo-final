
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecificInformationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SpecificInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeclarationFlag" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="AgreeFlag" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="ProcedureType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="ModifyInformation" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}CodeType" minOccurs="0"/>
 *         &lt;element name="MetaProcedure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="LicenceType" type="{APNReusableAggregateBusinessInformationEntity}LicenceType" minOccurs="0"/>
 *         &lt;element name="ManagerMaritimeTerminal" type="{VUCE_CommonTypes_D08B}TradePartyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificInformationType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
         "declarationFlag", "agreeFlag", "procedureType", "modifyInformation", "metaProcedure", "licenceType",
         "managerMaritimeTerminal"
    })
public class SpecificInformationType {

    @XmlElement(name = "DeclarationFlag")
    protected TextType declarationFlag;
    @XmlElement(name = "AgreeFlag")
    protected TextType agreeFlag;
    @XmlElement(name = "ProcedureType")
    protected TextType procedureType;
    @XmlElement(name = "ModifyInformation")
    protected CodeType modifyInformation;
    @XmlElement(name = "MetaProcedure")
    protected TextType metaProcedure;
    @XmlElement(name = "LicenceType")
    protected LicenceType licenceType;
    @XmlElement(name = "ManagerMaritimeTerminal")
    protected TradePartyType managerMaritimeTerminal;

    /**
     * Gets the value of the declarationFlag property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getDeclarationFlag() {
        return declarationFlag;
    }

    /**
     * Sets the value of the declarationFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setDeclarationFlag(TextType value) {
        this.declarationFlag = value;
    }

    /**
     * Gets the value of the agreeFlag property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getAgreeFlag() {
        return agreeFlag;
    }

    /**
     * Sets the value of the agreeFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setAgreeFlag(TextType value) {
        this.agreeFlag = value;
    }

    /**
     * Gets the value of the procedureType property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getProcedureType() {
        return procedureType;
    }

    /**
     * Sets the value of the procedureType property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setProcedureType(TextType value) {
        this.procedureType = value;
    }

    /**
     * Gets the value of the modifyInformation property.
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getModifyInformation() {
        return modifyInformation;
    }

    /**
     * Sets the value of the modifyInformation property.
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setModifyInformation(CodeType value) {
        this.modifyInformation = value;
    }

    /**
     * Gets the value of the metaProcedure property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getMetaProcedure() {
        return metaProcedure;
    }

    /**
     * Sets the value of the metaProcedure property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setMetaProcedure(TextType value) {
        this.metaProcedure = value;
    }

    /**
     * Gets the value of the licenceType property.
     *
     * @return
     *     possible object is
     *     {@link LicenceType }
     *
     */
    public LicenceType getLicenceType() {
        return licenceType;
    }

    /**
     * Sets the value of the licenceType property.
     *
     * @param value
     *     allowed object is
     *     {@link LicenceType }
     *
     */
    public void setLicenceType(LicenceType value) {
        this.licenceType = value;
    }

    /**
     * Gets the value of the managerMaritimeTerminal property.
     *
     * @return
     *     possible object is
     *     {@link TradePartyType }
     *
     */
    public TradePartyType getManagerMaritimeTerminal() {
        return managerMaritimeTerminal;
    }

    /**
     * Sets the value of the managerMaritimeTerminal property.
     *
     * @param value
     *     allowed object is
     *     {@link TradePartyType }
     *
     */
    public void setManagerMaritimeTerminal(TradePartyType value) {
        this.managerMaritimeTerminal = value;
    }

}
