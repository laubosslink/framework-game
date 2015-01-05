package Modele;

public abstract class CarteDragonModele extends CarteModele {
Membre m;
String couleur;
public Membre getM() {
	return m;
}
public String getCouleur() {
	return couleur;
}
public CarteDragonModele(Membre m, String couleur) {
	super();
	this.m = m;
	this.couleur = couleur;
}
}
