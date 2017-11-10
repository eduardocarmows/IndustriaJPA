package br.upf.topicos.industria.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.engine.spi.SessionImplementor;
import org.hibernate.jpa.HibernateEntityManager;

public class GerirFactory {

	static EntityManagerFactory factory = null;
	
	public static EntityManager getEntityManager(){
		if ((factory == null) || (!factory.isOpen())) {
			factory = Persistence.createEntityManagerFactory("IndustriaJPA");
		}
		
		return factory.createEntityManager();
	}
	
	/*
	 Para vers�es mais antigas do Hibernate
	 
	 public static Connection getEntityManagerJDBCConnection() throws SQLException { 
	      EntityManager em = factory.createEntityManager(); 
	      Session ses = (Session) em.getDelegate(); 
	      SessionFactoryImpl sessionFactory = (SessionFactoryImpl) ses.getSessionFactory(); 
	      Connection conexao = sessionFactory.getConnectionProvider().getConnection();  
	      em.close();  
	       return conexao; 
	 } 
	 
	 */
	
	 public static Connection getEntityManagerJDBCConnection() throws SQLException { 
	      EntityManager em = getEntityManager(); 
	      HibernateEntityManager hem = (HibernateEntityManager) em;
	      SessionImplementor sim = (SessionImplementor) hem.getSession();
	      Connection conexao = sim.connection();
	      em.close();
	      return conexao; 
	  }  	
	 
	
}
