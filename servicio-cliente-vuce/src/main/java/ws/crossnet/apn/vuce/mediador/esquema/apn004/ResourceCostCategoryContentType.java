
package ws.crossnet.apn.vuce.mediador.esquema.apn004;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceCostCategoryContentType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceCostCategoryContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="LAB"/>
 *     &lt;enumeration value="MAT"/>
 *     &lt;enumeration value="ODC"/>
 *     &lt;enumeration value="SBC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "ResourceCostCategoryContentType",
         namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:ResourceCostCategory:D08B")
@XmlEnum
public enum ResourceCostCategoryContentType {


    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Labour&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Labour used to produce an item.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    LAB,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Material&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Material used to produce an item.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    MAT,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Other direct cost&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A cost directly incurred to produce an item other than labour or materials.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    ODC,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Subcontract&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;The cost of any work subcontracted out to another entity to produce an item.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    SBC;

    public String value() {
        return name();
    }

    public static ResourceCostCategoryContentType fromValue(String v) {
        return valueOf(v);
    }

}
