package modele;

public class Case extends MaterielModele{
	
	public String toString(int indiceJoueur){
		String c = "|_|";
		if(indiceJoueur > 0)
			c = "|"+ indiceJoueur +"|";
		return c;
	}

}
