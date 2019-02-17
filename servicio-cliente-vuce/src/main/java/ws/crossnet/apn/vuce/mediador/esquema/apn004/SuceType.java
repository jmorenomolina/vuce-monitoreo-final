
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for suceType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="suceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentHeader" type="{APNReusableAggregateBusinessInformationEntity}DocumentHeaderType"/>
 *         &lt;element name="SpecificInformation" type="{APNReusableAggregateBusinessInformationEntity}SpecificInformationType" maxOccurs="unbounded"/>
 *         &lt;element name="Port" type="{APNReusableAggregateBusinessInformationEntity}PortType" minOccurs="0"/>
 *         &lt;element name="Service" type="{APNReusableAggregateBusinessInformationEntity}ServiceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ShipInformation" type="{APNReusableAggregateBusinessInformationEntity}ShipInformationType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Practico" type="{APNReusableAggregateBusinessInformationEntity}PracticoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Diver" type="{APNReusableAggregateBusinessInformationEntity}DiverType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InsurancePolicy" type="{APNReusableAggregateBusinessInformationEntity}InsurancePolicyType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Provider" type="{APNReusableAggregateBusinessInformationEntity}ProviderType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="InsuranceShip" type="{APNReusableAggregateBusinessInformationEntity}InsuranceShipType" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "suceType", namespace = "urn:peru:vuce:data:standard:APN004:1", propOrder = {
         "documentHeader", "specificInformation", "port", "service", "shipInformation", "practico", "diver",
         "insurancePolicy", "provider", "insuranceShip", "attachedDocuments"
    })
@XmlRootElement
public class SuceType {

    @XmlElement(name = "DocumentHeader", required = true)
    protected DocumentHeaderType documentHeader;
    @XmlElement(name = "SpecificInformation", required = true)
    protected List<SpecificInformationType> specificInformation;
    @XmlElement(name = "Port")
    protected PortType port;
    @XmlElement(name = "Service")
    protected List<ServiceType> service;
    @XmlElement(name = "ShipInformation")
    protected List<ShipInformationType> shipInformation;
    @XmlElement(name = "Practico")
    protected List<PracticoType> practico;
    @XmlElement(name = "Diver")
    protected List<DiverType> diver;
    @XmlElement(name = "InsurancePolicy")
    protected List<InsurancePolicyType> insurancePolicy;
    @XmlElement(name = "Provider")
    protected List<ProviderType> provider;
    @XmlElement(name = "InsuranceShip")
    protected List<InsuranceShipType> insuranceShip;
    @XmlElement(name = "AttachedDocuments", required = true)
    protected List<AttachedDocumentType> attachedDocuments;

    /**
     * Gets the value of the documentHeader property.
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
     * Sets the value of the documentHeader property.
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
     * Gets the value of the port property.
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
     * Sets the value of the port property.
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
     * Gets the value of the service property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceType }
     *
     *
     */
    public List<ServiceType> getService() {
        if (service == null) {
            service = new ArrayList<ServiceType>();
        }
        return this.service;
    }

    /**
     * Gets the value of the shipInformation property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shipInformation property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShipInformation().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ShipInformationType }
     *
     *
     */
    public List<ShipInformationType> getShipInformation() {
        if (shipInformation == null) {
            shipInformation = new ArrayList<ShipInformationType>();
        }
        return this.shipInformation;
    }

    /**
     * Gets the value of the practico property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the practico property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPractico().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PracticoType }
     *
     *
     */
    public List<PracticoType> getPractico() {
        if (practico == null) {
            practico = new ArrayList<PracticoType>();
        }
        return this.practico;
    }

    /**
     * Gets the value of the diver property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the diver property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDiver().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DiverType }
     *
     *
     */
    public List<DiverType> getDiver() {
        if (diver == null) {
            diver = new ArrayList<DiverType>();
        }
        return this.diver;
    }

    /**
     * Gets the value of the insurancePolicy property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insurancePolicy property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsurancePolicy().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsurancePolicyType }
     *
     *
     */
    public List<InsurancePolicyType> getInsurancePolicy() {
        if (insurancePolicy == null) {
            insurancePolicy = new ArrayList<InsurancePolicyType>();
        }
        return this.insurancePolicy;
    }

    /**
     * Gets the value of the provider property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the provider property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvider().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProviderType }
     *
     *
     */
    public List<ProviderType> getProvider() {
        if (provider == null) {
            provider = new ArrayList<ProviderType>();
        }
        return this.provider;
    }

    /**
     * Gets the value of the insuranceShip property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the insuranceShip property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsuranceShip().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InsuranceShipType }
     *
     *
     */
    public List<InsuranceShipType> getInsuranceShip() {
        if (insuranceShip == null) {
            insuranceShip = new ArrayList<InsuranceShipType>();
        }
        return this.insuranceShip;
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
