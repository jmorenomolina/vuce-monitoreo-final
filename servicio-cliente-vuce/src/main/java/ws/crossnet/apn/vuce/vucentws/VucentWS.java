package ws.crossnet.apn.vuce.vucentws;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2016-12-07T10:31:32.913-05:00
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "VucentWS", 
                  wsdlLocation = "no se usa",
                  targetNamespace = "http://entidad.ws.remoting.ve.vuce.mincetur.gob.pe/") 
public class VucentWS extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://entidad.ws.remoting.ve.vuce.mincetur.gob.pe/", "VucentWS");
    public final static QName VucentWSHttpSoap11Endpoint = new QName("http://entidad.ws.remoting.ve.vuce.mincetur.gob.pe/", "VucentWSHttpSoap11Endpoint");
    static {
        URL url = null;
        try {
        	url = VucentWS.class.getClassLoader().getResource("Proxy_VucentWS.wsdl");
        } catch (Exception e) {
            java.util.logging.Logger.getLogger(VucentWS.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/APN/Arquitectura/Workspace/apn-integracion-vuce-mediador/src/main/resources/Proxy_VucentWS.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public VucentWS(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public VucentWS(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public VucentWS() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public VucentWS(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public VucentWS(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public VucentWS(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns VucentWSPortType
     */
    @WebEndpoint(name = "VucentWSHttpSoap11Endpoint")
    public VucentWSPortType getVucentWSHttpSoap11Endpoint() {
        return super.getPort(VucentWSHttpSoap11Endpoint, VucentWSPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns VucentWSPortType
     */
    @WebEndpoint(name = "VucentWSHttpSoap11Endpoint")
    public VucentWSPortType getVucentWSHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(VucentWSHttpSoap11Endpoint, VucentWSPortType.class, features);
    }

}
