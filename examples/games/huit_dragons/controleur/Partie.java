package games.huit_dragons.controleur;

import Controleur.PartieControleur;
import Modele.PartieModele;
import Vue.VueType;
import games.huit_dragons.vue.SaisieJoueur;

public class Partie extends PartieControleur{

    public Partie(PartieModele m, VueType v) {
        super(m, v);
    }

    @Override
    public void lancer() {
       SaisieJoueur c1 = new SaisieJoueur("Joueur 1");
       SaisieJoueur c2 = new SaisieJoueur("Joueur 2");
       
       
       while(true){}
       
    }

    @Override
    public boolean estFinit() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
