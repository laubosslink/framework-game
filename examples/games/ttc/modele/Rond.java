package games.ttc.modele;

import Modele.MaterielModele;
import Vue.AffichageTexte;

public class Rond extends MaterielModele implements AffichageTexte {
    public String toString()
    {
        return "O";
    }
}
