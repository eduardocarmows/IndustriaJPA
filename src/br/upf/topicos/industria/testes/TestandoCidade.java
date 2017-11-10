package br.upf.topicos.industria.testes;


import static org.junit.Assert.assertEquals;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import org.junit.Test;

import br.upf.topicos.industria.entidades.Cidade;

public class TestandoCidade{
	//Informa os valores para cadastrar
	private String NomeCidade = "";
	private String NomeUF = "RS";
	
	@Test
	public void TestPercistCidade() throws Exception{
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("IndustriaJPA");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		

		//Seta os valores para o objeto
		Cidade cidade = new Cidade();
		cidade.setNome(this.NomeCidade);
		cidade.setUf(this.NomeUF);
		em.persist(cidade);
		
		//Busca cidade cadastrada		
		Query q = em.createQuery("select c from Cidade c where nome = :nome");
		q.setParameter("nome", NomeCidade);
		System.out.println("Cidade Cadastrada: "+((Cidade)q.getSingleResult()).getNome() + "/"+((Cidade)q.getSingleResult()).getUf());
		
		//Verifica se a cidade cadastrada é a mesma que vc informou na variavel
		assertEquals(NomeCidade, ((Cidade)q.getSingleResult()).getNome());
		
		em.getTransaction().commit();
		em.close();
	}
	
}
