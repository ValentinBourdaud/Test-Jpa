package fr.banque;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "assuranceVie")
public class AssuranceVie {

	@Column(name = "DATE_FIN")
	private LocalDate dateFin;
	
	@Column(name = "TAUX")
	private Double taux; 
	
	public AssuranceVie(){
		
	}
	
	public LocalDate getDateFin(){
		return dateFin;
	}
	
	public Double taux(){
		return taux;
	}
	
	public String toString (){
		return ("L'assurance vie prend fin le " + this.dateFin + " et son taux est de " + this.taux);
	}
}
