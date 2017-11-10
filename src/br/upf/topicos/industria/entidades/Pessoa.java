package br.upf.topicos.industria.entidades;

import static javax.persistence.GenerationType.SEQUENCE;
import static javax.persistence.InheritanceType.JOINED;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Entity implementation class for Entity: Pessoa
 *
 */
@Entity
@Inheritance(strategy = JOINED)
public abstract class Pessoa implements Serializable {
	@Id
	@GeneratedValue(strategy = SEQUENCE, generator = "PessoaId")
	@SequenceGenerator(name = "PessoaId", sequenceName = "PessoaId", allocationSize = 1)
	private Integer id;
	@NotEmpty(message="O nome é obrigatório")
	@Length(min=2, max=60, message="O nome deve ter entre {min} e {max} caracteres!")
	private String nome;
	@NotEmpty
	@Length(max=60)
	private String endereco;
	@NotEmpty
	@Length(max=10)
	private String numero;
	@Length(max=40)
	private String complemento;
	@Length(max=40)
	private String bairro;
	@Length(max=10)
	private String cep;
	@Email(message="O e-mail não é válido!")
	@Length(max=80)
	private String email;
	@Length(max=20)
	private String telefone;
	@ManyToOne(optional = false)
	@NotNull(message="Deve informar a cidade!")
	private Cidade cidade;
	private static final long serialVersionUID = 1L;

	public Pessoa() {
		super();
	}
	
	public Pessoa(Integer id, String nome, String endereco, String numero, String complemento, String bairro,
			String cep, String email, String telefone, Cidade cidade) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.email = email;
		this.telefone = telefone;
		this.cidade = cidade;
	}



	public Pessoa(Integer id) {
		super();
		this.id = id;
	}



	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}   
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}   
	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}   
	public String getNumero() {
		return this.numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}   
	public String getComplemento() {
		return this.complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}   
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}   
	public String getCep() {
		return this.cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}   
	public Cidade getCidade() {
		return this.cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
   
}
