package fr.jpa;

import javax.persistence.Id;

public class Compo {

	@Id
	private Integer id;
	@Id
	private Integer idlivre;
	@Id
	private Integer idemp;
	
	public Compo() {

	}

	public int getId() {
		return id;
	}
	public int getIdLivre() {
		return idlivre;
	}
	public int getIdEmp() {
		return idemp;
	}
}
