package com.web.data;

public class FeuilleDeRoute {
	// field description 
	private String title; 
	private Chapitre contenu[];
	private int nbChapter;
	public FeuilleDeRoute(String title, int nbChapter) {
		this.title = title; 
		this.nbChapter = nbChapter; 
		this.contenu = new Chapitre[this.nbChapter];  
	}
	
	public void setChapterByIndex(String titre, String contenuDuChapitre, int delai, int index) {
		this.contenu[index] = new Chapitre(titre, contenuDuChapitre, delai);
	}
	
	public String display() {
		String resultat = ""; 
		for(int compteur = 0; compteur < this.contenu.length; compteur++) {
			resultat += this.title + " : " + this.contenu[compteur].display() + "\n";
		}
		return resultat; 
	}
	
	public String getTitle() {return this.title; }
}
