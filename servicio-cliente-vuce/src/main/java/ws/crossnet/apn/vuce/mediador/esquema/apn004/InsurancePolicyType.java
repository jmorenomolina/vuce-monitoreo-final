
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for InsurancePolicyType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="InsurancePolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InsuranceType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="InsuranceNumber" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="InsuranceName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="InsuranceMount" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}AmountType" minOccurs="0"/>
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
@XmlType(name = "InsurancePolicyType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
         "insuranceType", "insuranceNumber", "insuranceName", "insuranceMount", "expirationDate"
    })
public class InsurancePolicyType {

    @XmlElement(name = "InsuranceType")
    protected TextType insuranceType;
    @XmlElement(name = "InsuranceNumber")
    protected TextType insuranceNumber;
    @XmlElement(name = "InsuranceName")
    protected TextType insuranceName;
    @XmlElement(name = "InsuranceMount")
    protected AmountType insuranceMount;
    @XmlElement(name = "ExpirationDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar expirationDate;

    /**
     * Gets the value of the insuranceType property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getInsuranceType() {
        return insuranceType;
    }

    /**
     * Sets the value of the insuranceType property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setInsuranceType(TextType value) {
        this.insuranceType = value;
    }

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
     * Gets the value of the insuranceName property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getInsuranceName() {
        return insuranceName;
    }

    /**
     * Sets the value of the insuranceName property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setInsuranceName(TextType value) {
        this.insuranceName = value;
    }

    /**
     * Gets the value of the insuranceMount property.
     *
     * @return
     *     possible object is
     *     {@link AmountType }
     *
     */
    public AmountType getInsuranceMount() {
        return insuranceMount;
    }

    /**
     * Sets the value of the insuranceMount property.
     *
     * @param value
     *     allowed object is
     *     {@link AmountType }
     *
     */
    public void setInsuranceMount(AmountType value) {
        this.insuranceMount = value;
    }

    /**
     * Gets the value of the expirationDate property.
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
     * Sets the value of the expirationDate property.
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
