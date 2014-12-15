package Materiel;

public class Carte implements Materiel{
	int numero;
	String couleur;
	
	public void add_materiel(){
		
	}
	
	public Carte(int numero, String couleur){
		this.numero = numero;
		this.couleur = couleur;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
}
