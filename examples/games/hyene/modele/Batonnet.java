package games.hyene.modele;

import Modele.MaterielModele;

public class Batonnet extends MaterielModele{
	
	public static int blanche = 1;
	public static int noir = 0;	
	
	public Batonnet(){
		
	}
	
	public int lancer(){
		return (int) Math.random()*1;
	}

}
