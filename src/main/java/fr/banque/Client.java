package fr.banque;

import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Client {

	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "DATE_NAISSANCE")
	private LocalDate dateNaissance;
	
	@ManyToOne
	@JoinColumn(name ="ID")
	private Banque banque;
	
	@Embedded
	private Adress adress;
	
	@OneToMany(mappedBy="client")
	private Set <Compte> comptes;
	
	
	public String getNom(){
		return nom;
	}
	
	public String getPrenom(){
		return prenom;
	}
	
	public LocalDate getDateNaissance(){
		return dateNaissance;
	}
	
	private Banque getBanque (){
		return banque;
	}
	
	private Adress getAdress(){
		return adress;
	}
	
	public Set <Compte> comptes(){
		return comptes;
	}
	
	
	public String toString(){
		return ("Le nom du client est " + this.nom + ", son prenom est " + this.prenom + " et il est né le " + this.dateNaissance);
	}
}

