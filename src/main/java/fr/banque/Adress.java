package fr.banque;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Adress {
	
	private int numero;
	private String rue;
	private int codePostal;
	private String ville;

}
