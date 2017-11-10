package br.upf.topicos.industria.entidades;

import java.io.Serializable;
import java.lang.Float;
import java.lang.Integer;
import java.lang.String;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.TemporalType.DATE;
import static javax.persistence.CascadeType.ALL;

/**
 * Entity implementation class for Entity: Recebimento
 *
 */
@Entity

public class Recebimento implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "RecebimentoId")
	@SequenceGenerator(name = "RecebimentoId", sequenceName = "RecebimentoId", allocationSize = 1)
	private Integer id;
	@Temporal(DATE)
	private Date data;
	private String numeroNota;
	private Float totalProdutos;
	private Float valorFrete;
	private Float totalCompra;
	@OneToMany(cascade = ALL, orphanRemoval = true, mappedBy = "recebimento")
	private List<RecebimentoItem> itensRecebidos;
	@ManyToOne(optional = false)
	@NotNull(message="O fornecedor deve ser informado!")
	private PessoaJuridica fornecedor;

	private static final long serialVersionUID = 1L;

	public Recebimento() {
		super();
		itensRecebidos = new ArrayList<>();
	}   
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}   
	public String getNumeroNota() {
		return this.numeroNota;
	}

	public void setNumeroNota(String numeroNota) {
		this.numeroNota = numeroNota;
	}   
	public Float getTotalProdutos() {
		return this.totalProdutos;
	}

	public void setTotalProdutos(Float totalProdutos) {
		this.totalProdutos = totalProdutos;
	}   
	public Float getValorFrete() {
		return this.valorFrete;
	}

	public void setValorFrete(Float valorFrete) {
		this.valorFrete = valorFrete;
	}   
	public Float getTotalCompra() {
		return this.totalCompra;
	}

	public void setTotalCompra(Float totalCompra) {
		this.totalCompra = totalCompra;
	}   
	public List<RecebimentoItem> getItensRecebidos() {
		return this.itensRecebidos;
	}

	public void setItensRecebidos(List<RecebimentoItem> itensRecebidos) {
		this.itensRecebidos = itensRecebidos;
	}
	public PessoaJuridica getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(PessoaJuridica fornecedor) {
		this.fornecedor = fornecedor;
	}
   
}
