package Modele;

public abstract class CarteEffetModele implements CarteModele {
boolean piege;
public CarteEffetModele(boolean piege, boolean gain, String nom) {
	super();
	this.piege = piege;
	this.gain = gain;
	this.nom = nom;
}
public boolean isPiege() {
	return piege;
}
public boolean isGain() {
	return gain;
}
public String getNom() {
	return nom;
}
boolean gain;
String nom;
}
