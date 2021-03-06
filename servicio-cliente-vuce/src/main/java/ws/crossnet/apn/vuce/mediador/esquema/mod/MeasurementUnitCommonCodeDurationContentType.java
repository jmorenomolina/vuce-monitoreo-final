
package ws.crossnet.apn.vuce.mediador.esquema.mod;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MeasurementUnitCommonCodeDurationContentType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MeasurementUnitCommonCodeDurationContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ANN"/>
 *     &lt;enumeration value="B98"/>
 *     &lt;enumeration value="C26"/>
 *     &lt;enumeration value="C47"/>
 *     &lt;enumeration value="D42"/>
 *     &lt;enumeration value="D61"/>
 *     &lt;enumeration value="D62"/>
 *     &lt;enumeration value="DAD"/>
 *     &lt;enumeration value="DAY"/>
 *     &lt;enumeration value="DEC"/>
 *     &lt;enumeration value="HT"/>
 *     &lt;enumeration value="HUR"/>
 *     &lt;enumeration value="MIN"/>
 *     &lt;enumeration value="MON"/>
 *     &lt;enumeration value="QH"/>
 *     &lt;enumeration value="RH"/>
 *     &lt;enumeration value="SAN"/>
 *     &lt;enumeration value="SEC"/>
 *     &lt;enumeration value="UD"/>
 *     &lt;enumeration value="UE"/>
 *     &lt;enumeration value="W4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "MeasurementUnitCommonCodeDurationContentType",
         namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:MeasurementUnitCommonCodeDuration:4")
@XmlEnum
public enum MeasurementUnitCommonCodeDurationContentType {


    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;year&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Unit of time equal to 365,25 days.
     * Synonym: Julian year&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    ANN("ANN"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;microsecond&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    @XmlEnumValue("B98")
    B_98("B98"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;millisecond&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    @XmlEnumValue("C26")
    C_26("C26"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;nanosecond&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    @XmlEnumValue("C47")
    C_47("C47"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;tropical year&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    @XmlEnumValue("D42")
    D_42("D42"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;minute [unit of angle]&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    @XmlEnumValue("D61")
    D_61("D61"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;second [unit of angle]&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    @XmlEnumValue("D62")
    D_62("D62"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;ten day&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A unit of time defining the number of days in multiples of 10.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    DAD("DAD"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;day&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    DAY("DAY"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;decade&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A unit of count defining the number of decades (decade: quantity equal to 10 or time equal to 10 years).&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    DEC("DEC"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;half hour&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    HT("HT"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;hour&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    HUR("HUR"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;minute [unit of time]&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    MIN("MIN"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;month&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Unit of time equal to 1/12 of a year of 365,25 days.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    MON("MON"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;quarter hour&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    QH("QH"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;running or operating hour&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A unit of time defining the number of hours of operation.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    RH("RH"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;half year (6 months)&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A unit of time defining the number of half years (6 months).&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    SAN("SAN"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;second [unit of time]&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    SEC("SEC"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;tenth minute&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    UD("UD"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;tenth hour&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    UE("UE"),

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;two week&lt;/ccts:Name&gt;
     * </pre>
     *
     *
     */
    @XmlEnumValue("W4")
    W_4("W4");
    private final String value;

    MeasurementUnitCommonCodeDurationContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MeasurementUnitCommonCodeDurationContentType fromValue(String v) {
        for (MeasurementUnitCommonCodeDurationContentType c : MeasurementUnitCommonCodeDurationContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
