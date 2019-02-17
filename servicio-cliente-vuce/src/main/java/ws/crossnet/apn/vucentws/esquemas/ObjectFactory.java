//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.12.07 a las 05:48:06 PM COT 
//


package ws.crossnet.apn.vucentws.esquemas;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.crossnet.apn.vuce.esquemas package. 
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

    private final static QName _Transaccion_QNAME = new QName("Transaccion-1.0", "transaccion");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.crossnet.apn.vuce.esquemas
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TransaccionType }
     * 
     */
    public TransaccionType createTransaccionType() {
        return new TransaccionType();
    }

    /**
     * Create an instance of {@link NotificacionesResueltasType }
     * 
     */
    public NotificacionesResueltasType createNotificacionesResueltasType() {
        return new NotificacionesResueltasType();
    }

    /**
     * Create an instance of {@link DocumentoReferenciaType }
     * 
     */
    public DocumentoReferenciaType createDocumentoReferenciaType() {
        return new DocumentoReferenciaType();
    }

    /**
     * Create an instance of {@link DocumentoType }
     * 
     */
    public DocumentoType createDocumentoType() {
        return new DocumentoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TransaccionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Transaccion-1.0", name = "transaccion")
    public JAXBElement<TransaccionType> createTransaccion(TransaccionType value) {
        return new JAXBElement<TransaccionType>(_Transaccion_QNAME, TransaccionType.class, null, value);
    }

}
