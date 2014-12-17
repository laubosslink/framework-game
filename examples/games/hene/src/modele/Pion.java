package modele;

public abstract class Pion  extends MaterielModele{
	
	private int _indice;
	
	public void deplacer(int f) {
		_indice += f;
	}

}
