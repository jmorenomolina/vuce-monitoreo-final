package vuce.gob.pe.app.model;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cquevedo
 */
@Entity
@Table(name = "ENTIDAD", schema="MTOBJ")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "EntidadMante.findAll", query = "SELECT e FROM EntidadMante e")
})
public class EntidadMante implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "ID_ENTIDAD")
	private Integer idEntidad;	

	@Basic(optional = false)
	@NotNull()
	@Size(min = 1, max = 50)
	@Column(name = "ENTIDAD")
	private String descripcion;

	public Integer getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(Integer idEntidad) {
		this.idEntidad = idEntidad;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}	
	
	
	
	
	
	
	
}
