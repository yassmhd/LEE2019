package com.web.data;

public class Chapitre {
	// field description 
	private String titre;
	private String contenu; 
	private int delai; 
	
	// constructor 
	public Chapitre(String titre, String contenu, int delai) {
		this.titre = titre;
		this.contenu = contenu; 
		this.delai = delai; 
	}
	
	// display 
	public String display() {
		String res =  this.titre + "\n" + this.contenu + "\n" + "Délais : " + this.delai + " mois" + "\n"; 
		return res;
	}
	
}
