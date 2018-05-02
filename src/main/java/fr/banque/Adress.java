package fr.banque;

import javax.persistence.Embeddable;


@Embeddable
public class Adress {
	
	private int numero;
	private String rue;
	private int codePostal;
	private String ville;
	
	public int getNumero(){
		return numero;
	}
	
	public String getRue(){
		return rue;
	}

	public int getCodePostal(){
		return codePostal;
	}
	
	public String getVille(){
		return ville;
	}
	
	public String toString(){
		return ("");
	}
}
