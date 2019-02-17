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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author cquevedo
 */
@Entity
@Table(name = "TX_PARAMETRO", schema="MTOBJ")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Parametro.findAll", query = "SELECT e FROM Parametro e"),
		@NamedQuery(name = "Parametro.findByIdCodigo", query = "SELECT e FROM Parametro e WHERE e.codigo = :codigo"),
		@NamedQuery(name = "Parametro.findByTipoParametro", query = "SELECT e FROM Parametro e WHERE e.tipoParametro = :tipoParametro"),
		@NamedQuery(name = "Parametro.findByValorParametro", query = "SELECT e FROM Parametro e WHERE e.valorParametro = :valorParametro"),
		@NamedQuery(name = "Parametro.findByDescParametro", query = "SELECT e FROM Parametro e WHERE e.descParametro = :descParametro")		
})
public class Parametro implements Serializable {


	private static final long serialVersionUID = 1L;

	@Id
	@Basic(optional = false)
	@NotNull
	@Column(name = "CODIGO")
	private Integer codigo;

	@Basic(optional = false)
	@NotNull
	@Column(name = "TIPO_PARAMETRO")
	private String tipoParametro;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "VALOR_PARAMETRO")
	private String valorParametro;
	
	@Basic(optional = false)
	@NotNull
	@Column(name = "DESC_PARAMETRO")
	private String descParametro;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getTipoParametro() {
		return tipoParametro;
	}

	public void setTipoParametro(String tipoParametro) {
		this.tipoParametro = tipoParametro;
	}

	public String getValorParametro() {
		return valorParametro;
	}

	public void setValorParametro(String valorParametro) {
		this.valorParametro = valorParametro;
	}

	public String getDescParametro() {
		return descParametro;
	}

	public void setDescParametro(String descParametro) {
		this.descParametro = descParametro;
	}
	
	

}
