//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2017.03.09 a las 03:25:02 PM COT 
//


package ws.crossnet.apn.vuce.mediador.esquema.notificacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NotificacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NotificacionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroNotificacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoMensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="entidad" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="documento" type="{Notificacion-1.0}DocumentoType"/>
 *         &lt;element name="documentoReferencia" type="{Notificacion-1.0}DocumentoReferenciaType"/>
 *         &lt;element name="texto" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="errores" type="{Notificacion-1.0}ErroresType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotificacionType", propOrder = {
    "numeroNotificacion",
    "tipoMensaje",
    "entidad",
    "documento",
    "documentoReferencia",
    "texto",
    "errores"
})
public class NotificacionType {

    protected int numeroNotificacion;
    @XmlElement(required = true)
    protected String tipoMensaje;
    protected int entidad;
    @XmlElement(required = true)
    protected DocumentoType documento;
    @XmlElement(required = true)
    protected DocumentoReferenciaType documentoReferencia;
    @XmlElement(required = true)
    protected String texto;
    @XmlElement(required = true)
    protected ErroresType errores;

    /**
     * Obtiene el valor de la propiedad numeroNotificacion.
     * 
     */
    public int getNumeroNotificacion() {
        return numeroNotificacion;
    }

    /**
     * Define el valor de la propiedad numeroNotificacion.
     * 
     */
    public void setNumeroNotificacion(int value) {
        this.numeroNotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoMensaje.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoMensaje() {
        return tipoMensaje;
    }

    /**
     * Define el valor de la propiedad tipoMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoMensaje(String value) {
        this.tipoMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad entidad.
     * 
     */
    public int getEntidad() {
        return entidad;
    }

    /**
     * Define el valor de la propiedad entidad.
     * 
     */
    public void setEntidad(int value) {
        this.entidad = value;
    }

    /**
     * Obtiene el valor de la propiedad documento.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoType }
     *     
     */
    public DocumentoType getDocumento() {
        return documento;
    }

    /**
     * Define el valor de la propiedad documento.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoType }
     *     
     */
    public void setDocumento(DocumentoType value) {
        this.documento = value;
    }

    /**
     * Obtiene el valor de la propiedad documentoReferencia.
     * 
     * @return
     *     possible object is
     *     {@link DocumentoReferenciaType }
     *     
     */
    public DocumentoReferenciaType getDocumentoReferencia() {
        return documentoReferencia;
    }

    /**
     * Define el valor de la propiedad documentoReferencia.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentoReferenciaType }
     *     
     */
    public void setDocumentoReferencia(DocumentoReferenciaType value) {
        this.documentoReferencia = value;
    }

    /**
     * Obtiene el valor de la propiedad texto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTexto() {
        return texto;
    }

    /**
     * Define el valor de la propiedad texto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTexto(String value) {
        this.texto = value;
    }

    /**
     * Obtiene el valor de la propiedad errores.
     * 
     * @return
     *     possible object is
     *     {@link ErroresType }
     *     
     */
    public ErroresType getErrores() {
        return errores;
    }

    /**
     * Define el valor de la propiedad errores.
     * 
     * @param value
     *     allowed object is
     *     {@link ErroresType }
     *     
     */
    public void setErrores(ErroresType value) {
        this.errores = value;
    }

}
