package modele;

public class Batonnet extends MaterielModele{
	
	public static int blanche = 1;
	public static int noir = 0;	
	
	public int lancer(){
		return (int) Math.random()*1;
	}

}
