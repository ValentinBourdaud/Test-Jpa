package fr.banque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "livretA")
public class LivretA extends Compte {
	
	
	
	@Column(name = "TAUX")
	private Double taux;

	public LivretA(String nom, Double solde, String numero, Client client, Double taux) {
		super(nom, solde, numero, client);
		this.taux = taux;
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}
	

	
}