
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ControlLocationType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ControlLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}NumericType" minOccurs="0"/>
 *         &lt;element name="Checkpoint" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}CodeType" minOccurs="0"/>
 *         &lt;element name="Headquarter" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}CodeType" minOccurs="0"/>
 *         &lt;element name="ExecutiveManagement" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}CodeType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ControlLocationType", namespace = "VUCE_CommonTypes_D08B", propOrder = {
         "item", "checkpoint", "headquarter", "executiveManagement"
    })
public class ControlLocationType {

    @XmlElement(name = "Item")
    protected BigDecimal item;
    @XmlElement(name = "Checkpoint")
    protected CodeType checkpoint;
    @XmlElement(name = "Headquarter")
    protected CodeType headquarter;
    @XmlElement(name = "ExecutiveManagement")
    protected CodeType executiveManagement;

    /**
     * Gets the value of the item property.
     *
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *
     */
    public BigDecimal getItem() {
        return item;
    }

    /**
     * Sets the value of the item property.
     *
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *
     */
    public void setItem(BigDecimal value) {
        this.item = value;
    }

    /**
     * Gets the value of the checkpoint property.
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getCheckpoint() {
        return checkpoint;
    }

    /**
     * Sets the value of the checkpoint property.
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setCheckpoint(CodeType value) {
        this.checkpoint = value;
    }

    /**
     * Gets the value of the headquarter property.
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getHeadquarter() {
        return headquarter;
    }

    /**
     * Sets the value of the headquarter property.
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setHeadquarter(CodeType value) {
        this.headquarter = value;
    }

    /**
     * Gets the value of the executiveManagement property.
     *
     * @return
     *     possible object is
     *     {@link CodeType }
     *
     */
    public CodeType getExecutiveManagement() {
        return executiveManagement;
    }

    /**
     * Sets the value of the executiveManagement property.
     *
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *
     */
    public void setExecutiveManagement(CodeType value) {
        this.executiveManagement = value;
    }

}
