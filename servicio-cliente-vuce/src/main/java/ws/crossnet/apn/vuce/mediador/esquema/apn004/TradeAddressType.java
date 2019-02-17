
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The location at which a particular trade related organization or person may be found or reached.
 *
 * <p>Java class for TradeAddressType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TradeAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StreetName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeAddressType", namespace = "VUCE_CommonTypes_D08B", propOrder = { "streetName" })
public class TradeAddressType {

    @XmlElement(name = "StreetName")
    protected TextType streetName;

    /**
     * Gets the value of the streetName property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getStreetName() {
        return streetName;
    }

    /**
     * Sets the value of the streetName property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setStreetName(TextType value) {
        this.streetName = value;
    }

}
