
package ws.crossnet.apn.vuce.vucentws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerResultadoSincronizacionTablas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerResultadoSincronizacionTablas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idEntidad" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idProcesoSincronizacion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerResultadoSincronizacionTablas", propOrder = {
    "idEntidad",
    "idProcesoSincronizacion"
})
public class ObtenerResultadoSincronizacionTablas {

    protected int idEntidad;
    protected int idProcesoSincronizacion;

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
     * Obtiene el valor de la propiedad idProcesoSincronizacion.
     * 
     */
    public int getIdProcesoSincronizacion() {
        return idProcesoSincronizacion;
    }

    /**
     * Define el valor de la propiedad idProcesoSincronizacion.
     * 
     */
    public void setIdProcesoSincronizacion(int value) {
        this.idProcesoSincronizacion = value;
    }

}
