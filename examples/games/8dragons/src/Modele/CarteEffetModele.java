package Modele;

public class CarteEffetModele extends CarteModele {
boolean piege;
boolean gain;
Effet e;
public CarteEffetModele(boolean piege, Effet e) {
	super("effet");
	this.piege = piege;
	this.gain = !gain;
	this.e = e;
}
public boolean isPiege() {
	return piege;
}
public boolean isGain() {
	return gain;
}
public Effet getNom() {
	return e;
}

}
