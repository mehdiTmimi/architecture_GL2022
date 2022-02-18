package com.gl.beans;

public class Etudiant {

	private String cne;
	private String nom;
	private String prenom;
	private Option option;
	
	public Etudiant() {
		super();
	}
	
	public Etudiant(String cne, String nom, String prenom) {
		super();
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
	}

	public String getCne() {
		return cne;
	}
	public void setCne(String cne) {
		this.cne = cne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Option getOption() {
		return option;
	}
	public void setOption(Option option) {
		this.option = option;
	}
	
}
