
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 * <pre>
 * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
 * &lt;ccts:UniqueID xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;UN02000003&lt;/ccts:UniqueID&gt;
 * </pre>
 *
 * <pre>
 * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
 * &lt;ccts:Acronym xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;DT&lt;/ccts:Acronym&gt;
 * </pre>
 *
 * <pre>
 * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
 * &lt;ccts:DictionaryEntryName xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Country_ Identifier. Type&lt;/ccts:DictionaryEntryName&gt;
 * </pre>
 *
 * <pre>
 * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
 * &lt;ccts:Version xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;1.0&lt;/ccts:Version&gt;
 * </pre>
 *
 * <pre>
 * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
 * &lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A character string to identify and distinguish uniquely, one instance of a country in an identification scheme from all other objects within the same scheme.&lt;/ccts:Definition&gt;
 * </pre>
 *
 * <pre>
 * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
 * &lt;ccts:PrimaryRepresentationTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Identifier&lt;/ccts:PrimaryRepresentationTerm&gt;
 * </pre>
 *
 * <pre>
 * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
 * &lt;ccts:PrimitiveType xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;String&lt;/ccts:PrimitiveType&gt;
 * </pre>
 *
 * <pre>
 * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
 * &lt;ccts:DataTypeQualifierTerm xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Country&lt;/ccts:DataTypeQualifierTerm&gt;
 * </pre>
 *
 *
 * <p>Java class for CountryIDType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CountryIDType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;urn:un:unece:uncefact:identifierlist:standard:5:ISO316612A:SecondEdition2006VI-4>ISOTwoletterCountryCodeIdentifierContentType">
 *       &lt;attribute name="schemeID" type="{http://www.w3.org/2001/XMLSchema}token" />
 *       &lt;attribute name="schemeAgencyID" type="{urn:un:unece:uncefact:codelist:standard:6:3055:D08B}AgencyIdentificationCodeContentType" />
 *       &lt;attribute name="schemeVersionID" type="{http://www.w3.org/2001/XMLSchema}token" fixed="second edition 2006" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryIDType", propOrder = { "value" })
public class CountryIDType {

    @XmlValue
    protected ISOTwoletterCountryCodeIdentifierContentType value;
    @XmlAttribute(name = "schemeID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemeID;
    @XmlAttribute(name = "schemeAgencyID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String schemeAgencyID;
    @XmlAttribute(name = "schemeVersionID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemeVersionID;

    /**
     * Gets the value of the value property.
     *
     * @return
     *     possible object is
     *     {@link ISOTwoletterCountryCodeIdentifierContentType }
     *
     */
    public ISOTwoletterCountryCodeIdentifierContentType getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     *
     * @param value
     *     allowed object is
     *     {@link ISOTwoletterCountryCodeIdentifierContentType }
     *
     */
    public void setValue(ISOTwoletterCountryCodeIdentifierContentType value) {
        this.value = value;
    }

    /**
     * Gets the value of the schemeID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSchemeID() {
        return schemeID;
    }

    /**
     * Sets the value of the schemeID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSchemeID(String value) {
        this.schemeID = value;
    }

    /**
     * Gets the value of the schemeAgencyID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSchemeAgencyID() {
        return schemeAgencyID;
    }

    /**
     * Sets the value of the schemeAgencyID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSchemeAgencyID(String value) {
        this.schemeAgencyID = value;
    }

    /**
     * Gets the value of the schemeVersionID property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSchemeVersionID() {
        if (schemeVersionID == null) {
            return "second edition 2006";
        } else {
            return schemeVersionID;
        }
    }

    /**
     * Sets the value of the schemeVersionID property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSchemeVersionID(String value) {
        this.schemeVersionID = value;
    }

}
