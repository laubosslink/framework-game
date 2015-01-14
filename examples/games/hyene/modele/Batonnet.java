package games.hyene.modele;

import Modele.MaterielModele;

public class Batonnet extends MaterielModele{
	
	//blanche = 1;
	//noir = 0;	
	
	public Batonnet(){
		
	}
	
	public int lancer(){

            double alea = Math.random()*1;
            
            return (alea >= 0.5) ? 1 : 0;
                
	}

}
