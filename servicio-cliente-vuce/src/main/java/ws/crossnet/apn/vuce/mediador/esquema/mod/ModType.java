
package ws.crossnet.apn.vuce.mediador.esquema.mod;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Formato Modificacion
 *
 * <p>Java class for modType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="modType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SpecificInformation" type="{ModReusableAggregateBusinessInformationEntity}SpecificInformationType"/>
 *         &lt;element name="ExchangeDocument" type="{ModReusableAggregateBusinessInformationEntity}ExchangeDocumentType"/>
 *         &lt;element name="AttachedDocument" type="{ModReusableAggregateBusinessInformationEntity}AttachedDocumentType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modType", namespace = "urn:peru:vuce:data:standard:Mod:1", propOrder = {
         "specificInformation", "exchangeDocument", "attachedDocument"
    })
public class ModType {

    @XmlElement(name = "SpecificInformation", required = true)
    protected SpecificInformationType specificInformation;
    @XmlElement(name = "ExchangeDocument", required = true)
    protected ExchangeDocumentType exchangeDocument;
    @XmlElement(name = "AttachedDocument", required = true)
    protected List<AttachedDocumentType> attachedDocument;

    /**
     * Gets the value of the specificInformation property.
     *
     * @return
     *     possible object is
     *     {@link SpecificInformationType }
     *
     */
    public SpecificInformationType getSpecificInformation() {
        return specificInformation;
    }

    /**
     * Sets the value of the specificInformation property.
     *
     * @param value
     *     allowed object is
     *     {@link SpecificInformationType }
     *
     */
    public void setSpecificInformation(SpecificInformationType value) {
        this.specificInformation = value;
    }

    /**
     * Gets the value of the exchangeDocument property.
     *
     * @return
     *     possible object is
     *     {@link ExchangeDocumentType }
     *
     */
    public ExchangeDocumentType getExchangeDocument() {
        return exchangeDocument;
    }

    /**
     * Sets the value of the exchangeDocument property.
     *
     * @param value
     *     allowed object is
     *     {@link ExchangeDocumentType }
     *
     */
    public void setExchangeDocument(ExchangeDocumentType value) {
        this.exchangeDocument = value;
    }

    /**
     * Gets the value of the attachedDocument property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedDocument property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedDocument().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachedDocumentType }
     *
     *
     */
    public List<AttachedDocumentType> getAttachedDocument() {
        if (attachedDocument == null) {
            attachedDocument = new ArrayList<AttachedDocumentType>();
        }
        return this.attachedDocument;
    }

}
