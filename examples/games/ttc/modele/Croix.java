package games.ttc.modele;

import Modele.MaterielModele;
import Vue.AffichageTexte;

public class Croix extends MaterielModele implements AffichageTexte {
    public String toString()
    {
        return "X";
    }
}
