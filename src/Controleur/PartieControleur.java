package Controleur;

import Modele.PartieModele;
import Vue.VueType;

public abstract class PartieControleur extends ControleurTemplate {

    public PartieControleur(PartieModele m, VueType v) {
        super(m, v);
    }
    
    public abstract void lancer();
    
    public abstract boolean estFinit();
}
