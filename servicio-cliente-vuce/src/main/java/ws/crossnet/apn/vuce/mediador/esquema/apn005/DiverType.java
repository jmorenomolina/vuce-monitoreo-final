//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:38:37 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para DiverType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DiverType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CarnetNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="RegisterNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="DiverTradeParty" type="{VUCE_CommonTypes_D08B}TradePartyType" minOccurs="0"/>
 *         &lt;element name="Category" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
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
@XmlType(name = "DiverType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
    "carnetNumber",
    "registerNumber",
    "diverTradeParty",
    "category",
    "expirationDate"
})
public class DiverType {

    @XmlElement(name = "CarnetNumber")
    protected TextType carnetNumber;
    @XmlElement(name = "RegisterNumber")
    protected TextType registerNumber;
    @XmlElement(name = "DiverTradeParty")
    protected TradePartyType diverTradeParty;
    @XmlElement(name = "Category")
    protected TextType category;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;

    /**
     * Obtiene el valor de la propiedad carnetNumber.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCarnetNumber() {
        return carnetNumber;
    }

    /**
     * Define el valor de la propiedad carnetNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCarnetNumber(TextType value) {
        this.carnetNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad registerNumber.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getRegisterNumber() {
        return registerNumber;
    }

    /**
     * Define el valor de la propiedad registerNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setRegisterNumber(TextType value) {
        this.registerNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad diverTradeParty.
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
     * Define el valor de la propiedad diverTradeParty.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyType }
     *     
     */
    public void setDiverTradeParty(TradePartyType value) {
        this.diverTradeParty = value;
    }

    /**
     * Obtiene el valor de la propiedad category.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getCategory() {
        return category;
    }

    /**
     * Define el valor de la propiedad category.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCategory(TextType value) {
        this.category = value;
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
