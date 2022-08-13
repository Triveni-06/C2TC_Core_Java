package c2tc.b18.tri.repo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Configuration {
	private static EntityManager entityManager;
	private static EntityManagerFactory entityManagerFactory;
	
	public static void getEntityManagerFactory() {
		entityManagerFactory=Persistence.createEntityManagerFactory("JPA-PU");
	}
	public static EntityManager getEntityManager() {
		entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}

}
