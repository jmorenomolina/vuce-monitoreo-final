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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DocumentHeaderType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
    "petitionerTradeParty",
    "personTradeParty",
    "customsAgentTradeParty"
})
public class DocumentHeaderType {

    @XmlElement(name = "PetitionerTradeParty")
    protected TradePartyType petitionerTradeParty;
    @XmlElement(name = "PersonTradeParty")
    protected TradePartyType personTradeParty;
    @XmlElement(name = "CustomsAgentTradeParty")
    protected TradePartyType customsAgentTradeParty;

    /**
     * Obtiene el valor de la propiedad petitionerTradeParty.
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
     * Define el valor de la propiedad petitionerTradeParty.
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
     * Obtiene el valor de la propiedad personTradeParty.
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
     * Define el valor de la propiedad personTradeParty.
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
     * Obtiene el valor de la propiedad customsAgentTradeParty.
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
     * Define el valor de la propiedad customsAgentTradeParty.
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
