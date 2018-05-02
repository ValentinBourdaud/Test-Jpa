package fr.banque;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "banque")
public class Banque {
	
	@Id
	
	private int id;

	@Column(name = "NAME")
	private String nom;
	
	@OneToMany(mappedBy="banque")
	private Set<Client> clients;

	
	
	public Banque(String nom) {
		super();
		this.nom = nom;
		this.clients = new HashSet<Client>();
			;
	}
	
	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Set<Client> getClients() {
		return clients;
	}

	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}
	
	

}
