package Controlleur;

import Modele.JoueurModele;
import Modele.ModeleObservable;
import Vue.VueType;

public abstract class JoueurControlleur extends ControlleurTemplate {

    public JoueurControlleur(JoueurModele m, VueType v) {
        super(m, v);
    }
    
}
