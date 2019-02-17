
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ServiceType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="ModalityService" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="StateFlag" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
         "serviceType", "modalityService", "stateFlag"
    })
public class ServiceType {

    @XmlElement(name = "ServiceType")
    protected TextType serviceType;
    @XmlElement(name = "ModalityService")
    protected TextType modalityService;
    @XmlElement(name = "StateFlag")
    protected TextType stateFlag;

    /**
     * Gets the value of the serviceType property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getServiceType() {
        return serviceType;
    }

    /**
     * Sets the value of the serviceType property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setServiceType(TextType value) {
        this.serviceType = value;
    }

    /**
     * Gets the value of the modalityService property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getModalityService() {
        return modalityService;
    }

    /**
     * Sets the value of the modalityService property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setModalityService(TextType value) {
        this.modalityService = value;
    }

    /**
     * Gets the value of the stateFlag property.
     *
     * @return
     *     possible object is
     *     {@link TextType }
     *
     */
    public TextType getStateFlag() {
        return stateFlag;
    }

    /**
     * Sets the value of the stateFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link TextType }
     *
     */
    public void setStateFlag(TextType value) {
        this.stateFlag = value;
    }

}
