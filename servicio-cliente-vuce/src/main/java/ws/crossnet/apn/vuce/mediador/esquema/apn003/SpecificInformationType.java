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
 * <p>Clase Java para SpecificInformationType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SpecificInformationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DeclarationFlag" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="AgreeFlag" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="ProcedureType" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="ModifyInformation" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}CodeType" minOccurs="0"/>
 *         &lt;element name="MetaProcedure" type="{urn:un:unece:uncefact:data:standard:UnqualifiedDataType:7}TextType" minOccurs="0"/>
 *         &lt;element name="LicenceType" type="{APNReusableAggregateBusinessInformationEntity}LicenceType" minOccurs="0"/>
 *         &lt;element name="ManagerMaritimeTerminal" type="{VUCE_CommonTypes_D08B}TradePartyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SpecificInformationType", namespace = "APNReusableAggregateBusinessInformationEntity", propOrder = {
    "declarationFlag",
    "agreeFlag",
    "procedureType",
    "modifyInformation",
    "metaProcedure",
    "licenceType",
    "managerMaritimeTerminal"
})
public class SpecificInformationType {

    @XmlElement(name = "DeclarationFlag")
    protected TextType declarationFlag;
    @XmlElement(name = "AgreeFlag")
    protected TextType agreeFlag;
    @XmlElement(name = "ProcedureType")
    protected TextType procedureType;
    @XmlElement(name = "ModifyInformation")
    protected CodeType modifyInformation;
    @XmlElement(name = "MetaProcedure")
    protected TextType metaProcedure;
    @XmlElement(name = "LicenceType")
    protected LicenceType licenceType;
    @XmlElement(name = "ManagerMaritimeTerminal")
    protected TradePartyType managerMaritimeTerminal;

    /**
     * Obtiene el valor de la propiedad declarationFlag.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getDeclarationFlag() {
        return declarationFlag;
    }

    /**
     * Define el valor de la propiedad declarationFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setDeclarationFlag(TextType value) {
        this.declarationFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad agreeFlag.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getAgreeFlag() {
        return agreeFlag;
    }

    /**
     * Define el valor de la propiedad agreeFlag.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setAgreeFlag(TextType value) {
        this.agreeFlag = value;
    }

    /**
     * Obtiene el valor de la propiedad procedureType.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getProcedureType() {
        return procedureType;
    }

    /**
     * Define el valor de la propiedad procedureType.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setProcedureType(TextType value) {
        this.procedureType = value;
    }

    /**
     * Obtiene el valor de la propiedad modifyInformation.
     * 
     * @return
     *     possible object is
     *     {@link CodeType }
     *     
     */
    public CodeType getModifyInformation() {
        return modifyInformation;
    }

    /**
     * Define el valor de la propiedad modifyInformation.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeType }
     *     
     */
    public void setModifyInformation(CodeType value) {
        this.modifyInformation = value;
    }

    /**
     * Obtiene el valor de la propiedad metaProcedure.
     * 
     * @return
     *     possible object is
     *     {@link TextType }
     *     
     */
    public TextType getMetaProcedure() {
        return metaProcedure;
    }

    /**
     * Define el valor de la propiedad metaProcedure.
     * 
     * @param value
     *     allowed object is
     *     {@link TextType }
     *     
     */
    public void setMetaProcedure(TextType value) {
        this.metaProcedure = value;
    }

    /**
     * Obtiene el valor de la propiedad licenceType.
     * 
     * @return
     *     possible object is
     *     {@link LicenceType }
     *     
     */
    public LicenceType getLicenceType() {
        return licenceType;
    }

    /**
     * Define el valor de la propiedad licenceType.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenceType }
     *     
     */
    public void setLicenceType(LicenceType value) {
        this.licenceType = value;
    }

    /**
     * Obtiene el valor de la propiedad managerMaritimeTerminal.
     * 
     * @return
     *     possible object is
     *     {@link TradePartyType }
     *     
     */
    public TradePartyType getManagerMaritimeTerminal() {
        return managerMaritimeTerminal;
    }

    /**
     * Define el valor de la propiedad managerMaritimeTerminal.
     * 
     * @param value
     *     allowed object is
     *     {@link TradePartyType }
     *     
     */
    public void setManagerMaritimeTerminal(TradePartyType value) {
        this.managerMaritimeTerminal = value;
    }

}
