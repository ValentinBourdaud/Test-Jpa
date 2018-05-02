package fr.banque;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "virement")
public class Virement {

	@Column(name = "BENEFICIAIRE")
	private String beneficiaire;
	
	public Virement(){
		
	}
	
	public String getBeneficiaire(){
		return beneficiaire;
	}
	
	public String toString (){
		return ("Le beneficiaire du virement est " + this.beneficiaire);
	}
}
