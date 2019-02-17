
package ws.crossnet.apn.vuce.mediador.esquema.moddr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The attached documents
 *
 * <p>Java class for AttachedDocumentType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
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
@XmlType(name = "AttachedDocumentType", namespace = "ModReusableAggregateBusinessInformationEntity", propOrder = {
         "attachedName", "documentName"
    })
public class AttachedDocumentType {

    @XmlElement(name = "AttachedName")
    protected TextType attachedName;
    @XmlElement(name = "DocumentName")
    protected TextType documentName;

    /**
     * Gets the value of the attachedName property.
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
     * Sets the value of the attachedName property.
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
     * Gets the value of the documentName property.
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
     * Sets the value of the documentName property.
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
