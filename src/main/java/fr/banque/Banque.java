package fr.banque;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "banque")
public class Banque {

	@Column(name = "NAME")
	private String nom;
	
	@OneToMany(mappedBy="banque")
	private Set<Client> clients;
	
	
	public Banque(){
		
	}
	
	public String getNom(){
		return nom;
	}
	
	public String toString(){
		return ("Le nom de la banque est " + this.nom);
	}
}
