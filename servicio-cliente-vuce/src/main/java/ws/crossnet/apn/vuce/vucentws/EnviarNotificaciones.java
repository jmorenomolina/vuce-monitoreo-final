
package ws.crossnet.apn.vuce.vucentws;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para enviarNotificaciones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="enviarNotificaciones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="xmlNotificacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="ebXML" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="adjuntos" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "enviarNotificaciones", propOrder = {
    "xmlNotificacion",
    "ebXML",
    "adjuntos"
})
public class EnviarNotificaciones {

    @XmlMimeType("application/octet-stream")
    protected DataHandler xmlNotificacion;
    @XmlMimeType("application/octet-stream")
    protected DataHandler ebXML;
    @XmlMimeType("application/octet-stream")
    protected DataHandler adjuntos;

    /**
     * Obtiene el valor de la propiedad xmlNotificacion.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getXmlNotificacion() {
        return xmlNotificacion;
    }

    /**
     * Define el valor de la propiedad xmlNotificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setXmlNotificacion(DataHandler value) {
        this.xmlNotificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad ebXML.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getEbXML() {
        return ebXML;
    }

    /**
     * Define el valor de la propiedad ebXML.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setEbXML(DataHandler value) {
        this.ebXML = value;
    }

    /**
     * Obtiene el valor de la propiedad adjuntos.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getAdjuntos() {
        return adjuntos;
    }

    /**
     * Define el valor de la propiedad adjuntos.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setAdjuntos(DataHandler value) {
        this.adjuntos = value;
    }

}
