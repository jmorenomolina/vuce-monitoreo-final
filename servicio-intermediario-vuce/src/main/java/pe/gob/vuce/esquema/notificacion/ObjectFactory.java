//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.03.09 a las 03:25:02 PM COT 
//


package pe.gob.vuce.esquema.notificacion;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.crossnet.apn.vuce.notificacion package. 
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

    private final static QName _Documento_QNAME = new QName("Notificacion-1.0", "documento");
    private final static QName _DocumentoReferencia_QNAME = new QName("Notificacion-1.0", "documentoReferencia");
    private final static QName _Notificacion_QNAME = new QName("Notificacion-1.0", "notificacion");
    private final static QName _Errores_QNAME = new QName("Notificacion-1.0", "errores");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.crossnet.apn.vuce.notificacion
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DocumentoType }
     * 
     */
    public DocumentoType createDocumentoType() {
        return new DocumentoType();
    }

    /**
     * Create an instance of {@link DocumentoReferenciaType }
     * 
     */
    public DocumentoReferenciaType createDocumentoReferenciaType() {
        return new DocumentoReferenciaType();
    }

    /**
     * Create an instance of {@link NotificacionType }
     * 
     */
    public NotificacionType createNotificacionType() {
        return new NotificacionType();
    }

    /**
     * Create an instance of {@link ErroresType }
     * 
     */
    public ErroresType createErroresType() {
        return new ErroresType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Notificacion-1.0", name = "documento")
    public JAXBElement<DocumentoType> createDocumento(DocumentoType value) {
        return new JAXBElement<DocumentoType>(_Documento_QNAME, DocumentoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentoReferenciaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Notificacion-1.0", name = "documentoReferencia")
    public JAXBElement<DocumentoReferenciaType> createDocumentoReferencia(DocumentoReferenciaType value) {
        return new JAXBElement<DocumentoReferenciaType>(_DocumentoReferencia_QNAME, DocumentoReferenciaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NotificacionType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Notificacion-1.0", name = "notificacion")
    public JAXBElement<NotificacionType> createNotificacion(NotificacionType value) {
        return new JAXBElement<NotificacionType>(_Notificacion_QNAME, NotificacionType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErroresType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "Notificacion-1.0", name = "errores")
    public JAXBElement<ErroresType> createErrores(ErroresType value) {
        return new JAXBElement<ErroresType>(_Errores_QNAME, ErroresType.class, null, value);
    }

}
