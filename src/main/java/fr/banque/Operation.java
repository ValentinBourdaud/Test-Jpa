package fr.banque;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class Operation {

	private LocalDateTime date;
	private Double montant;
	private String motif;
}
