package Modele;

public class CarteDragonModele extends CarteModele {
Membre m;
Couleur c;
public Membre getM() {
	return m;
}
public Couleur getCouleur() {
	return c;
}
public CarteDragonModele(Membre m, Couleur c) {
	super("dragon");
	this.m = m;
	this.c = c;
}
}
