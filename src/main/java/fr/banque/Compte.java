package fr.banque;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compte")
public class Compte {
	
	@Column(name = "NAME")
	private String nom;
	@Column(name = "SOLDE")
	private Double solde;
	
	@ManyToOne
	@JoinColumn(name = "ID")
	private Client client;
	
	@ManyToMany
	@JoinTable(name="COMPTE_OPERATION",
	joinColumns = @JoinColumn(name="ID", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name ="NUMERO", referencedColumnName = "NUMERO")
	)
	private Set <Operation> operation;
	
	public String getNom(){
		return nom;
	}
	
	public Double getSolde(){
		return solde;
	}
	
	public Client getClient(){
		return client;
	}
	
	public String toString (){
		return ("Le nom du compte est "+ this.nom + " et son solde est de " + this.solde);
	}
}
