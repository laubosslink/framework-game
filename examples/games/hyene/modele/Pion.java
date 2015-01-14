package games.hyene.modele;

import Modele.MaterielModele;

public abstract class Pion  extends MaterielModele{
	
        protected int indice;
        protected int nbTabas;
        
	public Pion(){
            this.indice = 0;
            this.nbTabas = 0;
        }
        
        public int getPosition(){
            return indice;
        }
        
        public void deplacerPion(int d){
            this.indice += d;
        }
        
        public void accNbTabas(int n){
            if(nbTabas >= 0)
                this.nbTabas += n;
        }
        
        public int getNbTabas(){
            return nbTabas;
        }

}
