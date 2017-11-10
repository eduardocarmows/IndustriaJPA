package br.upf.topicos.industria.entidades;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * Entity implementation class for Entity: RecebimentoItem
 *
 */
@Entity

public class RecebimentoItem implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "RecebimentoItemId")
	@SequenceGenerator(name = "RecebimentoItemId", sequenceName = "RecebimentoItemId", allocationSize = 1)
	private Integer id;
	@NotNull
	@DecimalMin(value="0", inclusive=false)
	private Float quantidade;
	@NotNull
	@DecimalMin(value="0", inclusive=false)
	private Float valorUnitario;
	@NotNull
	@DecimalMin(value="0", inclusive=false)
	private Float total;
	@ManyToOne(optional = false)
	@NotNull
	private MateriaPrima materiaPrima;
	@ManyToOne(optional = false)
	private Recebimento recebimento;
	private static final long serialVersionUID = 1L;

	public RecebimentoItem() {
		super();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Float getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Float quantidade) {
		this.quantidade = quantidade;
	}   
	public Float getValorUnitario() {
		return this.valorUnitario;
	}

	public void setValorUnitario(Float valorUnitario) {
		this.valorUnitario = valorUnitario;
	}   
	public Float getTotal() {
		return this.total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}   
	public MateriaPrima getMateriaPrima() {
		return this.materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}   
	public Recebimento getRecebimento() {
		return this.recebimento;
	}

	public void setRecebimento(Recebimento recebimento) {
		this.recebimento = recebimento;
	}
   
}
