
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TradeTransportModeType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TradeTransportModeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TypeCode" type="{urn:un:unece:uncefact:data:standard:QualifiedDataType:6}TransportModeCodeType" minOccurs="0"/>
 *         &lt;element name="Type" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeTransportModeType", namespace = "VUCE_CommonTypes_D08B", propOrder = { "typeCode", "type" })
public class TradeTransportModeType {

    @XmlElement(name = "TypeCode")
    protected TransportModeCodeType typeCode;
    @XmlElement(name = "Type")
    protected TextType type;

    /**
     * Gets the value of the typeCode property.
     *
     * @return
     *     possible object is
     *     {@link TransportModeCodeType }
     *
     */
    public TransportModeCodeType getTypeCode() {
        return typeCode;
    }

    /**
     * Sets the value of the typeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link TransportModeCodeType }
     *
     */
    public void setTypeCode(TransportModeCodeType value) {
        this.typeCode = value;
    }

    /**
     * Gets the value of the type property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setType(TextType value) {
        this.type = value;
    }

}
