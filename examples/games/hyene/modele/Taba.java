package games.hyene.modele;

import Modele.MaterielModele;

public class Taba extends MaterielModele{
	
	public static int conteurDInstances;
        public int nb;
	
	public Taba(){
            this.nb = 0;            
	}
        
        public int getNbTabas(){
            return nb;
        }               
        
        public void incNbTabas(int a){
            this.nb += a;
        }
        
        public void decNbTaba(int d){
            if(nb >= d)
                this.nb -= d;
        }

}
