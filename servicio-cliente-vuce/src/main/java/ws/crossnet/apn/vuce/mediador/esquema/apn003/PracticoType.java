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
 * <p>Clase Java para PracticoType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PracticoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Licence" type="{APNReusableAggregateBusinessInformationEntity}LicenceType" minOccurs="0"/>
 *         &lt;element name="TrailerZone" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="PracticoTradeParty" type="{VUCE_CommonTypes_D08B}TradePartyType" minOccurs="0"/>
 *         &lt;element name="ExpirationDate" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}DateType" minOccurs="0"/>
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
    "licence",
    "trailerZone",
    "practicoTradeParty",
    "expirationDate"
})
public class PracticoType {

    @XmlElement(name = "Licence")
    protected LicenceType licence;
    @XmlElement(name = "TrailerZone")
    protected TextType trailerZone;
    @XmlElement(name = "PracticoTradeParty")
    protected TradePartyType practicoTradeParty;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;

    /**
     * Obtiene el valor de la propiedad licence.
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
     * Define el valor de la propiedad licence.
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
     * Obtiene el valor de la propiedad trailerZone.
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
     * Define el valor de la propiedad trailerZone.
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
     * Obtiene el valor de la propiedad practicoTradeParty.
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
     * Define el valor de la propiedad practicoTradeParty.
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

}
