package fr.banque;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Operation {
	
	@Column(name = "DATE")
	private LocalDateTime date;
	@Column(name = "MONTANT")
	private Double montant;
	@Column(name = "MOTIF")
	private String motif;
	
	
	
	public LocalDateTime getDate(){
		return date;
		
	}
	
	public Double getMontant(){
		return montant;
		
	}
	
	public String getMotif(){
		return motif;
	}
	
	public String toString(){
		return ("La date est " + this.date + " , le montant de l'operation est de " + this.montant + " et le motif est " + this.motif);
		
	}
}
