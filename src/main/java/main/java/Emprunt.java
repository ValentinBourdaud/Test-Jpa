package main.java;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emprunt")
public class Emprunt {

	@Id
	private Integer id;
	@Id
	private Integer idclient;
	@Column(name = "DATE_DEBUT")
	private LocalDateTime datedebut;
	@Column(name = "DATE_FIN")
	private LocalDateTime datefin;
	@Column(name = "DELAI")
	private Integer delai;

	public Emprunt() {

	}

	public int getId() {
		return id;
	}

	public int getIdClient() {
		return idclient;
	}

	public LocalDateTime getDateDebut() {
		return datedebut;

	}

	public LocalDateTime getDateFin() {
		return datefin;

	}

	public String toString() {
		return null;
	}
}