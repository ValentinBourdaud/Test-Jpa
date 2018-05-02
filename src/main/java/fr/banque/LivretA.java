package fr.banque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "livretA")
public class LivretA {
	
	@Column(name = "TAUX")
	private Double taux;
	
	public LivretA(){
		
	}

	public Double getTaux(){
		return taux;
	}
	
	public String toString(){
		return ("Le livret est à taux " + this.taux);
	}
}
