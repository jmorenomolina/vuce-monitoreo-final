
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InsuranceShipType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="InsuranceShipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="RegisterNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsuranceShipType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
         "insuranceNumber", "registerNumber"
    })
public class InsuranceShipType {

    @XmlElement(name = "InsuranceNumber")
    protected TextType insuranceNumber;
    @XmlElement(name = "RegisterNumber")
    protected TextType registerNumber;

    /**
     * Gets the value of the insuranceNumber property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getInsuranceNumber() {
        return insuranceNumber;
    }

    /**
     * Sets the value of the insuranceNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setInsuranceNumber(TextType value) {
        this.insuranceNumber = value;
    }

    /**
     * Gets the value of the registerNumber property.
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
     * Sets the value of the registerNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setRegisterNumber(TextType value) {
        this.registerNumber = value;
    }

}
