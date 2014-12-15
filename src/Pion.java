
public class Pion implements Materiel{
	String couleur;
	String reference;
	public void add_materiel(){
		
	}
	
	public Pion(String couleur, String reference){
		this.couleur = couleur;
		this.reference = reference;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}
}
