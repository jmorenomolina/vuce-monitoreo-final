package pe.gob.vuce.monitoreo.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSMISION_SALIDA")

public class TransmisionSalida {

	@Id
	private int idTransmision;
	private String numeroDocumento;
	private String tipoDocumento;
	private String tipoMensaje;
	private String ebXML;
	private long tamanoAdjuntos;
	private String mensajeXML;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MENSAJE")
	private Operacion operacion;

	public Operacion getOperacion() {
		return operacion;
	}

	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}

	public TransmisionSalida() {
		super();
	}

	public int getIdTransmision() {
		return idTransmision;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public String getTipoMensaje() {
		return tipoMensaje;
	}

	public void setIdTransmision(int idTransmision) {
		this.idTransmision = idTransmision;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public void setTipoMensaje(String tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
	}

	public String getEbXML() {
		return ebXML;
	}

	public void setEbXML(String ebXML) {
		this.ebXML = ebXML;
	}

	public String getMensajeXML() {
		return mensajeXML;
	}

	public void setMensajeXML(String mensajeXML) {
		this.mensajeXML = mensajeXML;
	}

	public long getTamanoAdjuntos() {
		return tamanoAdjuntos;
	}

	public void setTamanoAdjuntos(long tamanoAdjuntos) {
		this.tamanoAdjuntos = tamanoAdjuntos;
	}
}
