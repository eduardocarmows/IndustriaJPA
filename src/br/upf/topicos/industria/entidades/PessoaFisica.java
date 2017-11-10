package br.upf.topicos.industria.entidades;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;

/**
 * Entity implementation class for Entity: PessoaFisica
 *
 */
@Entity
public class PessoaFisica extends Pessoa implements Serializable {

	@Length(min=14, max=14, message="O CPF deve ter entre {min} e {max} caracteres!")
	@NotEmpty(message="Deve informar o CPF!")
	@CPF(message="O CPF � inv�lido!")
	private String cpf;
	@Length(max=20)
	@NotEmpty(message="Deve informar o RG!")
	private String rg;
	@Past(message="A data de nascimento deve estar no passado!")
	@NotNull(message="A data de nascimento deve ser informada!")
	private Date dataNascimento;
	private static final long serialVersionUID = 1L;

	public PessoaFisica() {
		super();
	}   
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}   
	public String getRg() {
		return this.rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}   
	public Date getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
   
}
