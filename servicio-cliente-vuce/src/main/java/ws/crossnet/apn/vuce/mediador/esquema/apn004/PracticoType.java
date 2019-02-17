
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PracticoType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="PracticoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Licence" type="{APNReusableAggregateBusinessInformationEntity}LicenceType" minOccurs="0"/>
 *         &lt;element name="TrailerZone" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="SequencePolicy" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="PracticoTradeParty" type="{VUCE_CommonTypes_D08B}TradePartyType" minOccurs="0"/>
 *         &lt;element name="InsurancePolicy" type="{APNReusableAggregateBusinessInformationEntity}InsurancePolicyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PracticoType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
         "licence", "trailerZone", "sequencePolicy", "practicoTradeParty", "insurancePolicy"
    })
public class PracticoType {

    @XmlElement(name = "Licence")
    protected LicenceType licence;
    @XmlElement(name = "TrailerZone")
    protected TextType trailerZone;
    @XmlElement(name = "SequencePolicy")
    protected TextType sequencePolicy;
    @XmlElement(name = "PracticoTradeParty")
    protected TradePartyType practicoTradeParty;
    @XmlElement(name = "InsurancePolicy")
    protected InsurancePolicyType insurancePolicy;

    /**
     * Gets the value of the licence property.
     *
     * @return
     *     possible object is
     *     {@link LicenceType }
     *
     */
    public LicenceType getLicence() {
        return licence;
    }

    /**
     * Sets the value of the licence property.
     *
     * @param value
     *     allowed object is
     *     {@link LicenceType }
     *
     */
    public void setLicence(LicenceType value) {
        this.licence = value;
    }

    /**
     * Gets the value of the trailerZone property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getTrailerZone() {
        return trailerZone;
    }

    /**
     * Sets the value of the trailerZone property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setTrailerZone(TextType value) {
        this.trailerZone = value;
    }

    /**
     * Gets the value of the sequencePolicy property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getSequencePolicy() {
        return sequencePolicy;
    }

    /**
     * Sets the value of the sequencePolicy property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setSequencePolicy(TextType value) {
        this.sequencePolicy = value;
    }

    /**
     * Gets the value of the practicoTradeParty property.
     *
     * @return
     *     possible object is
     *     {@link TradePartyType }
     *
     */
    public TradePartyType getPracticoTradeParty() {
        return practicoTradeParty;
    }

    /**
     * Sets the value of the practicoTradeParty property.
     *
     * @param value
     *     allowed object is
     *     {@link TradePartyType }
     *
     */
    public void setPracticoTradeParty(TradePartyType value) {
        this.practicoTradeParty = value;
    }

    /**
     * Gets the value of the insurancePolicy property.
     *
     * @return
     *     possible object is
     *     {@link InsurancePolicyType }
     *
     */
    public InsurancePolicyType getInsurancePolicy() {
        return insurancePolicy;
    }

    /**
     * Sets the value of the insurancePolicy property.
     *
     * @param value
     *     allowed object is
     *     {@link InsurancePolicyType }
     *
     */
    public void setInsurancePolicy(InsurancePolicyType value) {
        this.insurancePolicy = value;
    }

}
