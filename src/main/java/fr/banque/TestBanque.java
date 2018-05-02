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
		
		Banque banque2 = new Banque("BNP Paribas");
		Adress adress2 = new Adress(14, "Rue des Mouettes", 54210, "Marginy");
		Client cli2 = new Client(2, "Dupont", "Stephane", LocalDate.of(1956, 11, 07), banque2, adress2);
		Compte c1 = new Compte("Compte Cheque", 15000.00, "151545154541", cli2);
		et.begin();
		em.persist(banque2);
		em.persist(cli2);
		em.persist(c1);
		et.commit();
		
		
		em.close();
		entityManagerFactory.close();
		
		

	}

}
