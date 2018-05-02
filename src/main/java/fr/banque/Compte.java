package fr.banque;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "compte")
@Inheritance(strategy = InheritanceType.JOINED)
public class Compte {
	
	
	@Id
	private int id;
	
	@Column(name="NUMERO", unique = true)
	private String numero;
	@Column(name = "NAME")
	private String nom;
	@Column(name = "SOLDE")
	private Double solde;
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	
	@ManyToMany
	@JoinTable(name="COMPTE_OPERATION",
	joinColumns = @JoinColumn(name="ID_OPERATION", referencedColumnName = "ID"),
	inverseJoinColumns = @JoinColumn(name ="ID_COMPTE", referencedColumnName = "ID")
	)
	private Set <Operation> operation;

	
	public Compte(String nom, Double solde, Client client, Set<Operation> operation) {
		super();
		this.nom = nom;
		this.solde = solde;
		this.client = client;
		this.operation = operation;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Set<Operation> getOperation() {
		return operation;
	}

	public void setOperation(Set<Operation> operation) {
		this.operation = operation;
	}

	
	
}
