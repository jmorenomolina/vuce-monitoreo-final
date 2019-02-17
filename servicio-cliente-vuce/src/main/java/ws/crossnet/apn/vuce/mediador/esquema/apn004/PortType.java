
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
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
         "seaPort", "portScope", "category", "portAddress", "ubigeo", "maritimeTerminal", "companyType"
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
     * Gets the value of the seaPort property.
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
     * Sets the value of the seaPort property.
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
     * Gets the value of the portScope property.
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
     * Sets the value of the portScope property.
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
     * Gets the value of the category property.
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
     * Sets the value of the category property.
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
     * Gets the value of the portAddress property.
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
     * Sets the value of the portAddress property.
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
     * Gets the value of the maritimeTerminal property.
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
     * Sets the value of the maritimeTerminal property.
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
     * Gets the value of the companyType property.
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
     * Sets the value of the companyType property.
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
