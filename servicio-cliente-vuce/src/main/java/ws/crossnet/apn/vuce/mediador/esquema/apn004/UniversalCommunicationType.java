
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The exchange of thoughts, messages, or information, as universally exchanged by speech, signals, writing, or behaviour between persons and/or organizations.
 *
 * <p>Java class for UniversalCommunicationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UniversalCommunicationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CompleteNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="UniformResourceIdentifier" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="AreaNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UniversalCommunicationType", namespace = "VUCE_CommonTypes_D08B", propOrder = {
         "completeNumber", "uniformResourceIdentifier", "areaNumber"
    })
public class UniversalCommunicationType {

    @XmlElement(name = "CompleteNumber")
    protected TextType completeNumber;
    @XmlElement(name = "UniformResourceIdentifier")
    protected TextType uniformResourceIdentifier;
    @XmlElement(name = "AreaNumber")
    protected TextType areaNumber;

    /**
     * Gets the value of the completeNumber property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getCompleteNumber() {
        return completeNumber;
    }

    /**
     * Sets the value of the completeNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setCompleteNumber(TextType value) {
        this.completeNumber = value;
    }

    /**
     * Gets the value of the uniformResourceIdentifier property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getUniformResourceIdentifier() {
        return uniformResourceIdentifier;
    }

    /**
     * Sets the value of the uniformResourceIdentifier property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setUniformResourceIdentifier(TextType value) {
        this.uniformResourceIdentifier = value;
    }

    /**
     * Gets the value of the areaNumber property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getAreaNumber() {
        return areaNumber;
    }

    /**
     * Sets the value of the areaNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setAreaNumber(TextType value) {
        this.areaNumber = value;
    }

}
