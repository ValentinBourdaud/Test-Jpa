package fr.jpa;

import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emprunt")
public class Emprunt {

	@Id
	private Integer id;
	
	@Column(name = "DATE_DEBUT")
	private LocalDateTime datedebut;
	
	@Column(name = "DATE_FIN")
	private LocalDateTime datefin;
	
	@Column(name = "DELAI")
	private Integer delai;
	
	@ManyToOne
	@JoinColumn(name = "ID_CLIENT")
	private Client client;
	
	@ManyToMany
	@JoinTable(name="compo",
	joinColumns= @JoinColumn(name="ID_EMP", referencedColumnName="id"),
	inverseJoinColumns= @JoinColumn(name="ID_LIV", referencedColumnName="id"))
	private Set<Livre> livre;

	public Emprunt() {

	}

	public int getId() {
		return id;
	}


	public LocalDateTime getDateDebut() {
		return datedebut;

	}

	public LocalDateTime getDateFin() {
		return datefin;

	}
	
	public Client getClient(){
		return client;
	}
	
	public Set<Livre> getLivre(){
		return livre;
	}

	public String toString() {
		return ("L'emprunt n°" + this.id + "a débuté le " + this.datedebut + " et terminé le " + this.datefin + " avec un délai de " + this.delai + "et a été emprunté par " + this.client);
	}
}