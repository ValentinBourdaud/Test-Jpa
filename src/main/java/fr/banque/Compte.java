package fr.banque;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Compte {

	private String nom;
	private Double solde;
}
