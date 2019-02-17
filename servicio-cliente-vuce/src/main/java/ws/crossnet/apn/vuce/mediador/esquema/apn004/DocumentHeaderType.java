
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentHeaderType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DocumentHeaderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PetitionerTradeParty" type="{VUCE_CommonTypes_D08B}TradePartyType" minOccurs="0"/>
 *         &lt;element name="PersonTradeParty" type="{VUCE_CommonTypes_D08B}TradePartyType" minOccurs="0"/>
 *         &lt;element name="CustomsAgentTradeParty" type="{VUCE_CommonTypes_D08B}TradePartyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentHeaderType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
         "petitionerTradeParty", "personTradeParty", "customsAgentTradeParty"
    })
public class DocumentHeaderType {

    @XmlElement(name = "PetitionerTradeParty")
    protected TradePartyType petitionerTradeParty;
    @XmlElement(name = "PersonTradeParty")
    protected TradePartyType personTradeParty;
    @XmlElement(name = "CustomsAgentTradeParty")
    protected TradePartyType customsAgentTradeParty;

    /**
     * Gets the value of the petitionerTradeParty property.
     *
     * @return
     *     possible object is
     *     {@link TradePartyType }
     *
     */
    public TradePartyType getPetitionerTradeParty() {
        return petitionerTradeParty;
    }

    /**
     * Sets the value of the petitionerTradeParty property.
     *
     * @param value
     *     allowed object is
     *     {@link TradePartyType }
     *
     */
    public void setPetitionerTradeParty(TradePartyType value) {
        this.petitionerTradeParty = value;
    }

    /**
     * Gets the value of the personTradeParty property.
     *
     * @return
     *     possible object is
     *     {@link TradePartyType }
     *
     */
    public TradePartyType getPersonTradeParty() {
        return personTradeParty;
    }

    /**
     * Sets the value of the personTradeParty property.
     *
     * @param value
     *     allowed object is
     *     {@link TradePartyType }
     *
     */
    public void setPersonTradeParty(TradePartyType value) {
        this.personTradeParty = value;
    }

    /**
     * Gets the value of the customsAgentTradeParty property.
     *
     * @return
     *     possible object is
     *     {@link TradePartyType }
     *
     */
    public TradePartyType getCustomsAgentTradeParty() {
        return customsAgentTradeParty;
    }

    /**
     * Sets the value of the customsAgentTradeParty property.
     *
     * @param value
     *     allowed object is
     *     {@link TradePartyType }
     *
     */
    public void setCustomsAgentTradeParty(TradePartyType value) {
        this.customsAgentTradeParty = value;
    }

}
