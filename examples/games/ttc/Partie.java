package games.ttc;

import games.ttc.modele.Croix;
import games.ttc.modele.Rond;
import Modele.JoueurModele;
import Modele.MaterielModele;
import Modele.PartieModele;

public class Partie extends PartieModele {
    public static void main(String[] args)
    {
        MaterielModele j1 = new Croix();
        MaterielModele j2 = new Rond();
        
        Partie p = new Partie();
        
        while(!p.getEstFinit())
        {
            
        }
    }
}
