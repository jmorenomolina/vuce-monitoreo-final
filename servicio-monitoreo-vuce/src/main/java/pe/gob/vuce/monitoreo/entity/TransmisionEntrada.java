package pe.gob.vuce.monitoreo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TRANSMISION_ENTRADA")
public class TransmisionEntrada {

	@Id
	@Column(name = "ID_MENSAJE")
	private String idMensaje;
		
	@Column(name = "NUMERO_DOCUMENTO")
	private String numeroDocumento;

	@Column(name = "TIPO_DOCUMENTO")
	private String tipoDocumento;

	@Column(name = "TIPO_MENSAJE")
	private String tipoMensaje;

	@Lob
	private String xml;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_MENSAJE", insertable = false, updatable = false )
	private Operacion operacion;

	public TransmisionEntrada() {
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

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public void setTipoMensaje(String tipoMensaje) {
		this.tipoMensaje = tipoMensaje;
	}

	public Operacion getOperacion() {
		return operacion;
	}

	public void setOperacion(Operacion operacion) {
		this.operacion = operacion;
	}

	public String getXml() {
		return xml;
	}

	public void setXml(String xml) {
		this.xml = xml;
	}

	public String getIdMensaje() {
		return idMensaje;
	}

	public void setIdMensaje(String idMensaje) {
		this.idMensaje = idMensaje;
	}

}
