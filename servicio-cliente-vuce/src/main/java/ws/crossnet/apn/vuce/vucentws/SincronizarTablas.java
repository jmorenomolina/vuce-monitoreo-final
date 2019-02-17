
package ws.crossnet.apn.vuce.vucentws;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para sincronizarTablas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="sincronizarTablas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idEntidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="xmlMensaje" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="xmlTablas" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sincronizarTablas", propOrder = {
    "idEntidad",
    "xmlMensaje",
    "xmlTablas"
})
public class SincronizarTablas {

    protected int idEntidad;
    @XmlMimeType("application/octet-stream")
    protected DataHandler xmlMensaje;
    @XmlMimeType("application/octet-stream")
    protected DataHandler xmlTablas;

    /**
     * Obtiene el valor de la propiedad idEntidad.
     * 
     */
    public int getIdEntidad() {
        return idEntidad;
    }

    /**
     * Define el valor de la propiedad idEntidad.
     * 
     */
    public void setIdEntidad(int value) {
        this.idEntidad = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlMensaje.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getXmlMensaje() {
        return xmlMensaje;
    }

    /**
     * Define el valor de la propiedad xmlMensaje.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setXmlMensaje(DataHandler value) {
        this.xmlMensaje = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlTablas.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getXmlTablas() {
        return xmlTablas;
    }

    /**
     * Define el valor de la propiedad xmlTablas.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setXmlTablas(DataHandler value) {
        this.xmlTablas = value;
    }

}
