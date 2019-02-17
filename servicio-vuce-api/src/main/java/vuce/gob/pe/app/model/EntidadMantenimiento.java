package vuce.gob.pe.app.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cquevedo
 */
@Entity
@Table(name = "ENTIDADMANTENIMIENTO", schema="MTOBJ")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "EntidadMantenimiento.findAll", query = "SELECT e FROM EntidadMantenimiento e")
})
public class EntidadMantenimiento implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@Column(name = "ID_ENTIDAD_MANTENIMIENTO")
	private Integer idEntidadMantenimiento;		
	
	@Column(name = "ID_ENTIDAD")
	private Integer idEntidad;	
	
	@Transient
	private String nombreEntidad;
	
	
	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_INICIO")
	private Date fechaInicio;		

	@Temporal(TemporalType.DATE)
	@Column(name = "FECHA_FIN")
	private Date fechaFin;
	
	
	public Integer getIdEntidadMantenimiento() {
		return idEntidadMantenimiento;
	}

	public void setIdEntidadMantenimiento(Integer idEntidadMantenimiento) {
		this.idEntidadMantenimiento = idEntidadMantenimiento;
	}

	public Integer getIdEntidad() {
		return idEntidad;
	}

	public void setIdEntidad(Integer idEntidad) {
		this.idEntidad = idEntidad;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getNombreEntidad() {
		return nombreEntidad;
	}

	public void setNombreEntidad(String nombreEntidad) {
		this.nombreEntidad = nombreEntidad;
	}
	
	
	
	
	
}
