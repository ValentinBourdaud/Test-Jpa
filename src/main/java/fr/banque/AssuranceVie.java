package fr.banque;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "assuranceVie")
public class AssuranceVie extends Compte {

	
	
	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	
	@Column(name = "TAUX")
	private Double taux;

	public AssuranceVie(String nom, Double solde, String numero, Client client, LocalDate dateFin, Double taux) {
		super(nom, solde, numero, client);
		this.dateFin = dateFin;
		this.taux = taux;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	} 
	
	
}
