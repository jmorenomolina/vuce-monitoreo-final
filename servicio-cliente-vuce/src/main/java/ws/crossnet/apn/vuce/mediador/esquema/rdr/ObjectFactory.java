//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.03.22 a las 02:21:00 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.rdr;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.crossnet.apn.vuce.mediador.esquemasvuce.otro package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SolicitudRectificacionDR_QNAME = new QName("SolicitudRectificacionDR-1.0", "solicitudRectificacionDR");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.crossnet.apn.vuce.mediador.esquemasvuce.otro
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SolicitudRectificacionDRType }
     * 
     */
    public SolicitudRectificacionDRType createSolicitudRectificacionDRType() {
        return new SolicitudRectificacionDRType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolicitudRectificacionDRType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "SolicitudRectificacionDR-1.0", name = "solicitudRectificacionDR")
    public JAXBElement<SolicitudRectificacionDRType> createSolicitudRectificacionDR(SolicitudRectificacionDRType value) {
        return new JAXBElement<SolicitudRectificacionDRType>(_SolicitudRectificacionDR_QNAME, SolicitudRectificacionDRType.class, null, value);
    }

}
