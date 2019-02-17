//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:39:48 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn006;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The attached documents
 * 
 * <p>Clase Java para AttachedDocumentType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AttachedDocumentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AttachedName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="DocumentName" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AttachedDocumentType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
    "attachedName",
    "documentName"
})
public class AttachedDocumentType {

    @XmlElement(name = "AttachedName")
    protected TextType attachedName;
    @XmlElement(name = "DocumentName")
    protected TextType documentName;

    /**
     * Obtiene el valor de la propiedad attachedName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getAttachedName() {
        return attachedName;
    }

    /**
     * Define el valor de la propiedad attachedName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setAttachedName(TextType value) {
        this.attachedName = value;
    }

    /**
     * Obtiene el valor de la propiedad documentName.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDocumentName() {
        return documentName;
    }

    /**
     * Define el valor de la propiedad documentName.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDocumentName(TextType value) {
        this.documentName = value;
    }

}
