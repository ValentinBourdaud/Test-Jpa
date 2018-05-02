package fr.banque;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBanque {

	private static final Logger LOG = LoggerFactory.getLogger(TestBanque.class);

	public static void main(String[] args) {
		
		Banque banque = new Banque("Banque Populaire");
		Adress adress = new Adress(7, "Rue des Recollets", 44200, "Nantes");
		
		Client cli = new Client(1, "Durant", "Robert", LocalDate.of(1993, 12, 01), banque, adress);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(banque);
		em.persist(cli);
		et.commit();
		em.close();
		entityManagerFactory.close();
		
		

	}

}
