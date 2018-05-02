package fr.banque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "compte")
public class Compte {
	@Column(name = "NAME")
	private String nom;
	@Column(name = "SOLDE")
	private Double solde;
	
	public String getNom(){
		return nom;
	}
	
	public Double getSolde(){
		return solde;
	}
	
	public String toString (){
		return ("Le nom du compte est "+ this.nom + " et son solde est de " + this.solde);
	}
}
