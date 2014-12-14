
public class De implements Materiel{
	int nbFaces;
	
	public void add_materiel(){
	
	}
	
	public De(int nbFaces){
		this.nbFaces = nbFaces;
	}

	public int getNbFaces() {
		return nbFaces;
	}

	public void setNbFaces(int nbFaces) {
		this.nbFaces = nbFaces;
	}
	
	public int lanceDe(){
		return (int) (Math.random() * ( nbFaces - 1 )) + 1;
	}
}
