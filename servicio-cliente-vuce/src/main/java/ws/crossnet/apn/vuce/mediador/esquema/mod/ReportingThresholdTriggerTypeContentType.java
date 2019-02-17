
package ws.crossnet.apn.vuce.mediador.esquema.mod;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ReportingThresholdTriggerTypeContentType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ReportingThresholdTriggerTypeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="BTH"/>
 *     &lt;enumeration value="PCT"/>
 *     &lt;enumeration value="VAL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ReportingThresholdTriggerTypeContentType",
         namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:ReportingThresholdTriggerType:D08B")
@XmlEnum
public enum ReportingThresholdTriggerTypeContentType {


    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Value and percent&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Both value and percent can be used.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    BTH,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Percent&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;The percentage of the value is used.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    PCT,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Value&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;The actual value is used.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    VAL;

    public String value() {
        return name();
    }

    public static ReportingThresholdTriggerTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
