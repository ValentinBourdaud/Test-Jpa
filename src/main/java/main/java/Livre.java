package main.java;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Livre {

	@Id
	private Integer id;
	@Column(name = "TITRE", length = 30, nullable = false, unique = true)
	private String titre;
	@Column(name = "AUTEUR", length = 30, nullable = false, unique = true)
	private String auteur;


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
	
	public String toString(){
		return ("L'ID est " + this.id + ", le titre est " + this.titre + ", et l'auteur est " + this.auteur);
	}
}
