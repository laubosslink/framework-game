package Controleur;

import Modele.ModeleObservable;
import Vue.VueType;

public abstract class PartieControleur extends ControleurTemplate {

    public PartieControleur(ModeleObservable m, VueType v) {
        super(m, v);
    }
    
    public abstract void init();
    
    public abstract boolean estFinit();
}
