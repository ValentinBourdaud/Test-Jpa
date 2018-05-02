package fr.banque;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestBanque {

	private static final Logger LOG = LoggerFactory.getLogger(TestBanque.class);

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
		EntityManager em = entityManagerFactory.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		
		Banque banque = new Banque("Banque Populaire", null);
		Adress adress = new Adress(7, "Rue des Recollets", 44200, "Nantes");
		Compte compte = new Compte("1321321", 1500.0, null, null);
		
		Client cli = new Client(1,"Durant", "Robert", LocalDate.of(1993, 12, 01), banque, adress);
		
		em.persist(cli);
		et.commit();
		em.close();
		entityManagerFactory.close();
		
		

	}

}
