package pe.gob.vuce.monitoreo.entity;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;;

@Entity
@Table(name = "OPERACION")
public class Operacion {

	@Id
	private String idMensaje;
	private String descripcionFalla;
	private Date fechaHoraRespuesta;
	private Date fechaHoraSolicitud;
	private int hayFalla = 1;
	private String nombreOperacion;
	private String nombreUsuario;
	private String version;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "operacion")
	private List<TransmisionEntrada> transmisionesEntrada;

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "operacion")
	private List<TransmisionSalida> transmisionesSalida;

	public Operacion() {
		super();
	}

	public String getDescripcionFalla() {
		return descripcionFalla;
	}

	public Date getFechaHoraRespuesta() {
		return fechaHoraRespuesta;
	}

	public Date getFechaHoraSolicitud() {
		return fechaHoraSolicitud;
	}

	public int getHayFalla() {
		return hayFalla;
	}

	public String getIdMensaje() {
		return idMensaje;
	}

	public String getNombreOperacion() {
		return nombreOperacion;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public List<TransmisionSalida> getTransmisionesSalida() {
		return transmisionesSalida;
	}

	public String getVersion() {
		return version;
	}

	public void setDescripcionFalla(String descripcionFalla) {
		this.descripcionFalla = descripcionFalla;
	}

	public void setFechaHoraRespuesta(Date fechaHoraRespuesta) {
		this.fechaHoraRespuesta = fechaHoraRespuesta;
	}

	public void setFechaHoraSolicitud(Date fechaHoraSolicitud) {
		this.fechaHoraSolicitud = fechaHoraSolicitud;
	}

	public void setHayFalla(int hayFalla) {
		this.hayFalla = hayFalla;
	}

	public void setIdMensaje(String idMensaje) {
		this.idMensaje = idMensaje;
	}

	public void setNombreOperacion(String nombreOperacion) {
		this.nombreOperacion = nombreOperacion;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public List<TransmisionEntrada> getTransmisionesEntrada() {
		return transmisionesEntrada;
	}

	public void setTransmisionesEntrada(List<TransmisionEntrada> transmisiones_entrada) {
		this.transmisionesEntrada = transmisiones_entrada;
		for (Iterator<TransmisionEntrada> iterator = transmisiones_entrada.iterator(); iterator.hasNext();) {
			TransmisionEntrada notificacion = (TransmisionEntrada) iterator.next();
			notificacion.setOperacion(this);
		}
	}

	public void setTransmisionesSalida(List<TransmisionSalida> transmisionesSalida) {
		this.transmisionesSalida = transmisionesSalida;
		for (Iterator<TransmisionSalida> iterator = transmisionesSalida.iterator(); iterator.hasNext();) {
			TransmisionSalida transmisionSalida = (TransmisionSalida) iterator.next();
			transmisionSalida.setOperacion(this);
		}
	}

	public void setVersion(String version) {
		this.version = version;
	}
}
