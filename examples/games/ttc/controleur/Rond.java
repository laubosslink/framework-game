package games.ttc.controleur;

import Controleur.Action;
import Modele.JoueurModele;
import Vue.EntreeTexte;
import games.ttc.modele.Plateau;
import games.ttc.vue.SaisieJoueur;

public class Rond extends Controleur.ControleurTemplate implements Action {

    SaisieJoueur s;
    
    public Rond(JoueurModele m, SaisieJoueur s) {
        super(m);
        this.s = s;
    }

    @Override
    public void execute() {
        int l = Integer.valueOf(((EntreeTexte)this.s).input("ligne"));
        int c = Integer.valueOf(((EntreeTexte)this.s).input("colonne"));
        
        ((Plateau)((JoueurModele) this.m).getPlateau()).poserSymbole(new games.ttc.modele.Rond(), l, c);
    }

    @Override
    public boolean estValide() {
        /** @todo */
        return true;
    }
    
}
