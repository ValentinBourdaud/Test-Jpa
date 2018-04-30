package main.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;
import javax.persistence.Persistence;
import javax.persistence.Table;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Entity
@Table
public class Livre {

	@Id
	private Integer id;
	@Column(name = "TITRE", length = 30, nullable = false, unique = true)
	private String titre;
	@Column(name = "AUTEUR", length = 30, nullable = false, unique = true)
	private String auteur;

	private static final Logger LOG = LoggerFactory.getLogger(TestJpa.class);

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("pu_essai");
		EntityManager em = entityManagerFactory.createEntityManager();

		Livre book = em.find(Livre.class, 1);

		if (book != null) {
			LOG.info("Le livre est = " + book.titre);

		}
		em.close();
	}

}
