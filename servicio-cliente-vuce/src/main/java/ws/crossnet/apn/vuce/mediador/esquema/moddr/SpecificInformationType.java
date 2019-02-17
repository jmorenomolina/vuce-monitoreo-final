
package ws.crossnet.apn.vuce.mediador.esquema.moddr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpecificInformationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SpecificInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NroSUCE" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}CodeType" minOccurs="0"/>
 *         &lt;element name="NroDR" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificInformationType", namespace = "ModReusableAggregateBusinessInformationEntity", propOrder = {
         "nroSUCE", "nroDR"
    })
public class SpecificInformationType {

    @XmlElement(name = "NroSUCE")
    protected CodeType nroSUCE;
    @XmlElement(name = "NroDR")
    protected CodeType nroDR;

    /**
     * Gets the value of the nroSUCE property.
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getNroSUCE() {
        return nroSUCE;
    }

    /**
     * Sets the value of the nroSUCE property.
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setNroSUCE(CodeType value) {
        this.nroSUCE = value;
    }

    /**
     * Gets the value of the nroDR property.
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getNroDR() {
        return nroDR;
    }

    /**
     * Sets the value of the nroDR property.
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setNroDR(CodeType value) {
        this.nroDR = value;
    }

}
