
package ws.crossnet.apn.vuce.mediador.esquema.moddr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DutyTaxFeeTypeCodeContentType.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DutyTaxFeeTypeCodeContentType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AAA"/>
 *     &lt;enumeration value="AAB"/>
 *     &lt;enumeration value="AAC"/>
 *     &lt;enumeration value="AAD"/>
 *     &lt;enumeration value="AAE"/>
 *     &lt;enumeration value="AAF"/>
 *     &lt;enumeration value="AAG"/>
 *     &lt;enumeration value="AAH"/>
 *     &lt;enumeration value="AAI"/>
 *     &lt;enumeration value="AAJ"/>
 *     &lt;enumeration value="AAK"/>
 *     &lt;enumeration value="AAL"/>
 *     &lt;enumeration value="ADD"/>
 *     &lt;enumeration value="BOL"/>
 *     &lt;enumeration value="CAP"/>
 *     &lt;enumeration value="CAR"/>
 *     &lt;enumeration value="COC"/>
 *     &lt;enumeration value="CST"/>
 *     &lt;enumeration value="CUD"/>
 *     &lt;enumeration value="CVD"/>
 *     &lt;enumeration value="ENV"/>
 *     &lt;enumeration value="EXC"/>
 *     &lt;enumeration value="EXP"/>
 *     &lt;enumeration value="FET"/>
 *     &lt;enumeration value="FRE"/>
 *     &lt;enumeration value="GCN"/>
 *     &lt;enumeration value="GST"/>
 *     &lt;enumeration value="ILL"/>
 *     &lt;enumeration value="IMP"/>
 *     &lt;enumeration value="IND"/>
 *     &lt;enumeration value="LAC"/>
 *     &lt;enumeration value="LCN"/>
 *     &lt;enumeration value="LDP"/>
 *     &lt;enumeration value="LOC"/>
 *     &lt;enumeration value="LST"/>
 *     &lt;enumeration value="MCA"/>
 *     &lt;enumeration value="MCD"/>
 *     &lt;enumeration value="OTH"/>
 *     &lt;enumeration value="PDB"/>
 *     &lt;enumeration value="PDC"/>
 *     &lt;enumeration value="PRF"/>
 *     &lt;enumeration value="SCN"/>
 *     &lt;enumeration value="SSS"/>
 *     &lt;enumeration value="STT"/>
 *     &lt;enumeration value="SUP"/>
 *     &lt;enumeration value="SUR"/>
 *     &lt;enumeration value="SWT"/>
 *     &lt;enumeration value="TAC"/>
 *     &lt;enumeration value="TOT"/>
 *     &lt;enumeration value="TOX"/>
 *     &lt;enumeration value="TTA"/>
 *     &lt;enumeration value="VAD"/>
 *     &lt;enumeration value="VAT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 *
 */
@XmlType(name = "DutyTaxFeeTypeCodeContentType",
         namespace = "urn:un:unece:uncefact:codelist:standard:UNECE:DutyTaxFeeTypeCode:D08B")
@XmlEnum
public enum DutyTaxFeeTypeCodeContentType {


    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Petroleum tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A tax levied on the volume of petroleum being transacted.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    AAA,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Provisional countervailing duty cash&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Countervailing duty paid in cash prior to a formal finding of subsidization by Customs.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    AAB,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Provisional countervailing duty bond&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Countervailing duty paid by posting a bond during an investigation period prior to a formal decision on subsidization by Customs.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    AAC,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tobacco tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A tax levied on tobacco products.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    AAD,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Energy fee&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;General fee or tax for the use of energy.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    AAE,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Coffee tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A tax levied specifically on coffee products.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    AAF,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Harmonised sales tax, Canadian&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A harmonized sales tax consisting of a goods and service tax, a Canadian provincial sales tax and, as applicable, a Quebec sales tax which is recoverable.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    AAG,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Quebec sales tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A sales tax charged within the Canadian province of Quebec which is recoverable.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    AAH,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Canadian provincial sales tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A sales tax charged within Canadian provinces which is non-recoverable.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    AAI,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tax on replacement part&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A tax levied on a replacement part, where the original part is returned.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    AAJ,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Mineral oil tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tax that is levied specifically on products containing mineral oil.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    AAK,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Special tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;To indicate a special type of tax.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    AAL,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Anti-dumping duty&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Duty applied to goods ruled to have been dumped in an import market at a price lower than that in the exporter's domestic market.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    ADD,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Stamp duty (Imposta di Bollo)&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tax required in Italy, which may be fixed or graduated in various circumstances (e.g. VAT exempt documents or bank receipts).&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    BOL,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Agricultural levy&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Levy imposed on agricultural products where there is a difference between the selling price between trading countries.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    CAP,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Car tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A tax that is levied on the value of the automobile.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    CAR,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Paper consortium tax (Italy)&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Italian Paper consortium tax.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    COC,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Commodity specific tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tax related to a specified commodity, e.g. illuminants, salts.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    CST,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Customs duty&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Duties laid down in the Customs tariff, to which goods are liable on entering or leaving the Customs territory (CCC).&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    CUD,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Countervailing duty&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A duty on imported goods applied for compensate for subsidies granted to those goods in the exporting country.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    CVD,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Environmental tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tax assessed for funding or assuring environmental protection or clean-up.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    ENV,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Excise duty&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Customs or fiscal authorities code to identify a specific or ad valorem levy on a specific commodity, applied either domestically or at time of importation.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    EXC,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Agricultural export rebate&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Monetary rebate given to the seller in certain circumstances when agricultural products are exported.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    EXP,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Federal excise tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tax levied by the federal government on the manufacture of specific items.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    FET,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Free&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;No tax levied.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    FRE,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;General construction tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;General tax for construction.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    GCN,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Goods and services tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tax levied on the final consumption of goods and services throughout the production and distribution chain.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    GST,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Illuminants tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tax of illuminants.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    ILL,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Import tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tax assessed on imports.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    IMP,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Individual tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A tax levied based on an individual's ability to pay.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    IND,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Business license fee&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Government assessed charge for permit to do business.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    LAC,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Local construction tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Local tax for construction.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    LCN,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Light dues payable&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Fee levied on a vessel to pay for port navigation lights.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    LDP,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Local sales tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Assessment charges on sale of goods or services by city, borough country or other taxing authorities below state or provincial level.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    LOC,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Lust tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tax imposed for clean-up of leaky underground storage tanks.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    LST,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Monetary compensatory amount&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Levy on Common Agricultural Policy (European Union) goods used to compensate for fluctuating currencies between member states.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    MCA,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Miscellaneous cash deposit&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Duty paid and held on deposit, by Customs, during an investigation period prior to a final decision being made on any aspect related to imported goods (except valuation) by Customs.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    MCD,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Other taxes&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Unspecified, miscellaneous tax charges.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    OTH,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Provisional duty bond&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Anti-dumping duty paid by posting a bond during an investigation period prior to a formal decision on dumping by Customs.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    PDB,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Provisional duty cash&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Anti-dumping duty paid in cash prior to a formal finding of dumping by Customs.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    PDC,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Preference duty&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Duties laid down in the Customs tariff, to which goods are liable on entering or leaving the Customs territory falling under a preferential regime such as Generalised System of Preferences (GSP).&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    PRF,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Special construction tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Special tax for construction.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    SCN,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Shifted social securities&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Social securities share of the invoice amount to be paid directly to the social securities collector.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    SSS,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;State/provincial sales tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;All applicable sale taxes by authorities at the state or provincial level, below national level.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    STT,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Suspended duty&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Duty suspended or deferred from payment.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    SUP,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Surtax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A tax or duty applied on and in addition to existing duties and taxes.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    SUR,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Shifted wage tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Wage tax share of the invoice amount to be paid directly to the tax collector(s office).&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    SWT,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Alcohol mark tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A tax levied based on the type of alcohol being obtained.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    TAC,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Total&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;The summary amount of all taxes.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    TOT,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Turnover tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tax levied on the total sales/turnover of a corporation.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    TOX,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tonnage taxes&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Tax levied based on the vessel's net tonnage.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    TTA,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Valuation deposit&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Duty paid and held on deposit, by Customs, during an investigation period prior to a formal decision on valuation of the goods being made.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    VAD,

    /**
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Name xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;Value added tax&lt;/ccts:Name&gt;
     * </pre>
     *
     * <pre>
     * &lt;?xml version = '1.0' encoding = 'UTF-8'?&gt;
     * &lt;ccts:Description xmlns:ccts="urn:un:unece:uncefact:documentation:standard:CoreComponentsTechnicalSpecification:2"&gt;A tax on domestic or imported goods applied to the value added at each stage in the production/distribution cycle.&lt;/ccts:Description&gt;
     * </pre>
     *
     *
     */
    VAT;

    public String value() {
        return name();
    }

    public static DutyTaxFeeTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
