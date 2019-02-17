//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:39:48 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn006;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Formato 006 - Aprobaci�n de los Reglamentos Internos de Entidades que explotan infraestructura Portuaria de uso Publico en el Pais y Sus modificatorias.
 * 
 * <p>Clase Java para suceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="suceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentHeader" type="{APNReusableAggregateBusinessInformationEntity}DocumentHeaderType"/>
 *         &lt;element name="SpecificInformation" type="{APNReusableAggregateBusinessInformationEntity}SpecificInformationType" maxOccurs="unbounded"/>
 *         &lt;element name="Port" type="{APNReusableAggregateBusinessInformationEntity}PortType" minOccurs="0"/>
 *         &lt;element name="AttachedDocuments" type="{APNReusableAggregateBusinessInformationEntity}AttachedDocumentType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "suceType", namespace = "urn:peru:vuce:data:standard:APN006:1", propOrder = {
    "documentHeader",
    "specificInformation",
    "port",
    "attachedDocuments"
})
public class SuceType {

    @XmlElement(name = "DocumentHeader", required = true)
    protected DocumentHeaderType documentHeader;
    @XmlElement(name = "SpecificInformation", required = true)
    protected List<SpecificInformationType> specificInformation;
    @XmlElement(name = "Port")
    protected PortType port;
    @XmlElement(name = "AttachedDocuments", required = true)
    protected List<AttachedDocumentType> attachedDocuments;

    /**
     * Obtiene el valor de la propiedad documentHeader.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHeaderType }
     *     
     */
    public DocumentHeaderType getDocumentHeader() {
        return documentHeader;
    }

    /**
     * Define el valor de la propiedad documentHeader.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHeaderType }
     *     
     */
    public void setDocumentHeader(DocumentHeaderType value) {
        this.documentHeader = value;
    }

    /**
     * Gets the value of the specificInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specificInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecificInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecificInformationType }
     * 
     * 
     */
    public List<SpecificInformationType> getSpecificInformation() {
        if (specificInformation == null) {
            specificInformation = new ArrayList<SpecificInformationType>();
        }
        return this.specificInformation;
    }

    /**
     * Obtiene el valor de la propiedad port.
     * 
     * @return
     *     possible object is
     *     {@link PortType }
     *     
     */
    public PortType getPort() {
        return port;
    }

    /**
     * Define el valor de la propiedad port.
     * 
     * @param value
     *     allowed object is
     *     {@link PortType }
     *     
     */
    public void setPort(PortType value) {
        this.port = value;
    }

    /**
     * Gets the value of the attachedDocuments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachedDocuments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachedDocuments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttachedDocumentType }
     * 
     * 
     */
    public List<AttachedDocumentType> getAttachedDocuments() {
        if (attachedDocuments == null) {
            attachedDocuments = new ArrayList<AttachedDocumentType>();
        }
        return this.attachedDocuments;
    }

}
