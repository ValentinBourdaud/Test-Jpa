package fr.jpa;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {

	@Id
	private Integer id;
	@Column(name = "NOM", length = 30, nullable = false, unique = true)
	private String nom;
	@Column(name = "PRENOM", length = 30, nullable = false, unique = true)
	private String prenom;
	@OneToMany(mappedBy = "client")
	private Set <Emprunt> emprunt;


	public Client(){
		emprunt = new HashSet<Emprunt>();
		
	}

	public int getId (){
		return id;
	}
	
	public String getNom(){
		return nom;
		
	}
	public String getPrenom(){
		return prenom;
		
	}
	
	public String toString(){
		return ("lala") ;
	}
}