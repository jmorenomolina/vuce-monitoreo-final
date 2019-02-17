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
 * <p>Clase Java para PortType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PortType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SeaPort" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="PortScope" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="Category" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="PortAddress" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="Ubigeo" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="MaritimeTerminal" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="CompanyType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
    "seaPort",
    "portScope",
    "category",
    "portAddress",
    "ubigeo",
    "maritimeTerminal",
    "companyType"
})
public class PortType {

    @XmlElement(name = "SeaPort")
    protected TextType seaPort;
    @XmlElement(name = "PortScope")
    protected TextType portScope;
    @XmlElement(name = "Category")
    protected TextType category;
    @XmlElement(name = "PortAddress")
    protected TextType portAddress;
    @XmlElement(name = "Ubigeo")
    protected TextType ubigeo;
    @XmlElement(name = "MaritimeTerminal")
    protected TextType maritimeTerminal;
    @XmlElement(name = "CompanyType")
    protected TextType companyType;

    /**
     * Obtiene el valor de la propiedad seaPort.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getSeaPort() {
        return seaPort;
    }

    /**
     * Define el valor de la propiedad seaPort.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setSeaPort(TextType value) {
        this.seaPort = value;
    }

    /**
     * Obtiene el valor de la propiedad portScope.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPortScope() {
        return portScope;
    }

    /**
     * Define el valor de la propiedad portScope.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPortScope(TextType value) {
        this.portScope = value;
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
     * Obtiene el valor de la propiedad portAddress.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getPortAddress() {
        return portAddress;
    }

    /**
     * Define el valor de la propiedad portAddress.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setPortAddress(TextType value) {
        this.portAddress = value;
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
     * Obtiene el valor de la propiedad maritimeTerminal.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getMaritimeTerminal() {
        return maritimeTerminal;
    }

    /**
     * Define el valor de la propiedad maritimeTerminal.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setMaritimeTerminal(TextType value) {
        this.maritimeTerminal = value;
    }

    /**
     * Obtiene el valor de la propiedad companyType.
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
     * Define el valor de la propiedad companyType.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setCompanyType(TextType value) {
        this.companyType = value;
    }

}
