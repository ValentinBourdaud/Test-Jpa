package fr.banque;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Client {

	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public LocalDate getDateNaissance(){
		return dateNaissance;
	}
	
	public String toString(){
		return ("Le nom du client est " + this.nom + ", son prenom est " + this.prenom + " et il est né le " + this.dateNaissance);
	}
}

