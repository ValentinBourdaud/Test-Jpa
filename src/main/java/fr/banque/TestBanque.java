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
		LivretA l1= new LivretA("Compte Cheque", 154873.0, "454542154", cli2, 1.7);
		AssuranceVie a1 = new AssuranceVie("Assurance vie", 14523.0, "44454154", cli2, LocalDate.of(1986, 01, 17), 1.4);
		
		et.begin();
		em.persist(banque2);
		em.persist(cli2);
		em.persist(l1);
		em.persist(a1);
		et.commit();
		
		
		
		Banque banque3 = new Banque("Credit Mutuel");
		Adress adress3= new Adress(28, "Rue des Chicanes", 73000, "Chambery");
		Client cli3 = new Client(3, "Braille", "Louis", LocalDate.of(1854, 11, 24), banque3, adress3);
		LivretA l2= new LivretA("Livret A", 1454.0, "4756510001", cli3, 1.9);
		AssuranceVie a2 = new AssuranceVie("Assurance vie", 14522210.0, "474753636", cli3, LocalDate.of(1947, 10, 27), 1.9);
		
		et.begin();
		em.persist(banque3);
		em.persist(cli3);
		em.persist(l2);
		em.persist(a2);
		et.commit();
		
		
		em.close();
		entityManagerFactory.close();
		
		

	}

}
