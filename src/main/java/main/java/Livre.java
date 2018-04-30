package main.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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

	public Livre(){
		
	}

	public int getId (){
		return id;
	}
	
	public String getTitre(){
		return titre;
		
	}
	public String getAuteur(){
		return auteur;
		
	}
}
