//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.04.27 a las 04:37:09 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.apn003;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ServiceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
    "serviceType",
    "modalityService",
    "stateFlag"
})
public class ServiceType {

    @XmlElement(name = "ServiceType")
    protected TextType serviceType;
    @XmlElement(name = "ModalityService")
    protected TextType modalityService;
    @XmlElement(name = "StateFlag")
    protected TextType stateFlag;

    /**
     * Obtiene el valor de la propiedad serviceType.
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
     * Define el valor de la propiedad serviceType.
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
     * Obtiene el valor de la propiedad modalityService.
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
     * Define el valor de la propiedad modalityService.
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
     * Obtiene el valor de la propiedad stateFlag.
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
     * Define el valor de la propiedad stateFlag.
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
