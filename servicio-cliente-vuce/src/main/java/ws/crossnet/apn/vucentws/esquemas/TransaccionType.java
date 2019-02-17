//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantaci�n de la referencia de enlace (JAXB) XML v2.2.8-b130911.1802 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perder�n si se vuelve a compilar el esquema de origen. 
// Generado el: 2016.12.07 a las 05:48:06 PM COT 
//


package ws.crossnet.apn.vucentws.esquemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para TransaccionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TransaccionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="idTransmision" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="tipoMensaje" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="formato" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="documento" type="{Transaccion-1.0}DocumentoType"/>
 *         &lt;element name="documentoReferencia" type="{Transaccion-1.0}DocumentoReferenciaType"/>
 *         &lt;element name="notificacionesResueltas" type="{Transaccion-1.0}NotificacionesResueltasType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlRootElement(name="transaccion")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransaccionType", propOrder = {
    "idTransmision",
    "tipoMensaje",
    "formato",
    "documento",
    "documentoReferencia",
    "notificacionesResueltas"
})
public class TransaccionType {

    @Override
	public String toString() {
		return "TransaccionType [idTransmision=" + idTransmision + ", tipoMensaje=" + tipoMensaje + "]";
	}

	protected int idTransmision;
    @XmlElement(required = true)
    protected String tipoMensaje;
    @XmlElement(required = true)
    protected String formato;
    @XmlElement(required = true)
    protected DocumentoType documento;
    @XmlElement(required = true)
    protected DocumentoReferenciaType documentoReferencia;
    protected NotificacionesResueltasType notificacionesResueltas;

    /**
     * Obtiene el valor de la propiedad idTransmision.
     * 
     */
    public int getIdTransmision() {
        return idTransmision;
    }

    /**
     * Define el valor de la propiedad idTransmision.
     * 
     */
    public void setIdTransmision(int value) {
        this.idTransmision = value;
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
     * Obtiene el valor de la propiedad formato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormato() {
        return formato;
    }

    /**
     * Define el valor de la propiedad formato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormato(String value) {
        this.formato = value;
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
     * Obtiene el valor de la propiedad notificacionesResueltas.
     * 
     * @return
     *     possible object is
     *     {@link NotificacionesResueltasType }
     *     
     */
    public NotificacionesResueltasType getNotificacionesResueltas() {
        return notificacionesResueltas;
    }

    /**
     * Define el valor de la propiedad notificacionesResueltas.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificacionesResueltasType }
     *     
     */
    public void setNotificacionesResueltas(NotificacionesResueltasType value) {
        this.notificacionesResueltas = value;
    }

}
