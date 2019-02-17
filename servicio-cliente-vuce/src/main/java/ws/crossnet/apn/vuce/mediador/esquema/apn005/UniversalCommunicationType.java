//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:38:37 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn005;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The exchange of thoughts, messages, or information, as universally exchanged by speech, signals, writing, or behaviour between persons and/or organizations.
 * 
 * <p>Clase Java para UniversalCommunicationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
    "completeNumber",
    "uniformResourceIdentifier",
    "areaNumber"
})
public class UniversalCommunicationType {

    @XmlElement(name = "CompleteNumber")
    protected TextType completeNumber;
    @XmlElement(name = "UniformResourceIdentifier")
    protected TextType uniformResourceIdentifier;
    @XmlElement(name = "AreaNumber")
    protected TextType areaNumber;

    /**
     * Obtiene el valor de la propiedad completeNumber.
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
     * Define el valor de la propiedad completeNumber.
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
     * Obtiene el valor de la propiedad uniformResourceIdentifier.
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
     * Define el valor de la propiedad uniformResourceIdentifier.
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
     * Obtiene el valor de la propiedad areaNumber.
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
     * Define el valor de la propiedad areaNumber.
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
