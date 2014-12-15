package Materiel;

public class Argent implements Materiel{
	String type;
	int valeur;
	
	public void add_materiel(){
		
	}
	
	public Argent(String type, int valeur){
		this.type = type;
		this.valeur = valeur;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

}
