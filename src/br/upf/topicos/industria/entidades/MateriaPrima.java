package br.upf.topicos.industria.entidades;

import br.upf.topicos.industria.entidades.Produto;
import java.io.Serializable;
import java.lang.Float;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: MateriaPrima
 *
 */
@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class MateriaPrima extends Produto implements Serializable {

	
	private Float estoqueMinimo;
	private Float ultimoCusto;
	private Float custoMedio;
	private static final long serialVersionUID = 1L;

	public MateriaPrima() {
		super();
	}   
	public Float getEstoqueMinimo() {
		return this.estoqueMinimo;
	}

	public void setEstoqueMinimo(Float estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}   
	public Float getUltimoCusto() {
		return this.ultimoCusto;
	}

	public void setUltimoCusto(Float ultimoCusto) {
		this.ultimoCusto = ultimoCusto;
	}   
	public Float getCustoMedio() {
		return this.custoMedio;
	}

	public void setCustoMedio(Float custoMedio) {
		this.custoMedio = custoMedio;
	}
   
}
