
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiverType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DiverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Licence" type="{APNReusableAggregateBusinessInformationEntity}LicenceType" minOccurs="0"/>
 *         &lt;element name="DiverTradeParty" type="{VUCE_CommonTypes_D08B}TradePartyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiverType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
         "licence", "diverTradeParty" })
public class DiverType {

    @XmlElement(name = "Licence")
    protected LicenceType licence;
    @XmlElement(name = "DiverTradeParty")
    protected TradePartyType diverTradeParty;

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
     * Gets the value of the diverTradeParty property.
     *
     * @return
     *     possible object is
     *     {@link TradePartyType }
     *
     */
    public TradePartyType getDiverTradeParty() {
        return diverTradeParty;
    }

    /**
     * Sets the value of the diverTradeParty property.
     *
     * @param value
     *     allowed object is
     *     {@link TradePartyType }
     *
     */
    public void setDiverTradeParty(TradePartyType value) {
        this.diverTradeParty = value;
    }

}
