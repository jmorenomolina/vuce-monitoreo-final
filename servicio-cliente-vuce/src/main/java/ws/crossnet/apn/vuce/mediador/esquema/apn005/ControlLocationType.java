//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:38:37 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn005;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ControlLocationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
    "item",
    "checkpoint",
    "headquarter",
    "executiveManagement"
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
     * Obtiene el valor de la propiedad item.
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
     * Define el valor de la propiedad item.
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
     * Obtiene el valor de la propiedad checkpoint.
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
     * Define el valor de la propiedad checkpoint.
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
     * Obtiene el valor de la propiedad headquarter.
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
     * Define el valor de la propiedad headquarter.
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
     * Obtiene el valor de la propiedad executiveManagement.
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
     * Define el valor de la propiedad executiveManagement.
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
