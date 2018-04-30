package main.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestJpa {

	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Livre book = em.find(Livre.class, 1);

		if (book != null) {
			LOG.info("Le livre est = " + book.getTitre());

		}
		Query query = em.createQuery("select l from Livre l where l.titre = 'Germinal'");
		Livre l = (Livre)query.getSingleResult();
		LOG.info("L'auteur est = " + l.toString());
		
		em.close();

	}

}
