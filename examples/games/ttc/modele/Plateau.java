package games.ttc.modele;

import Modele.MaterielModele;

public class Plateau extends MaterielModele {
    protected MaterielModele[][] plateau;

    public Plateau() {
        this.plateau = new MaterielModele[3][3];
        
        for(int i=0; i<this.plateau.length; i++)
        {
            for(int j=0; j<this.plateau[i].length; j++)
            {
                this.plateau[i][j] = null;
            }
        }
    }
    
    public MaterielModele[][] getPlateau()
    {
        return this.plateau;
    }
    
}
