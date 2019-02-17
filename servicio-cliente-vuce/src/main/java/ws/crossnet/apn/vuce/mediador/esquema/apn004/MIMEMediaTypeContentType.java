
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MIMEMediaTypeContentType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MIMEMediaTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="application/activemessage"/>
 *     &lt;enumeration value="application/andrew-inset"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "MIMEMediaTypeContentType",
         namespace = "urn:un:unece:uncefact:codelist:standard:IANA:MIMEMediaType:2009-03-04")
@XmlEnum
public enum MIMEMediaTypeContentType {


    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;activemessage&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;[Shapiro] &lt;/ccts:Definition&gt;
     * </pre>
     *
     *
     */
    @XmlEnumValue("application/activemessage")
    APPLICATION_ACTIVEMESSAGE("application/activemessage"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;andrew-inset&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Definition xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;[Borenstein] &lt;/ccts:Definition&gt;
     * </pre>
     *
     *
     */
    @XmlEnumValue("application/andrew-inset")
    APPLICATION_ANDREW_INSET("application/andrew-inset");
    private final String value;

    MIMEMediaTypeContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MIMEMediaTypeContentType fromValue(String v) {
        for (MIMEMediaTypeContentType c : MIMEMediaTypeContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
