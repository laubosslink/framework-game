package games.ttc.controleur;

import Controleur.Action;
import Modele.JoueurModele;
import Vue.EntreeTexte;
import games.ttc.modele.Croix;
import games.ttc.modele.Plateau;
import games.ttc.modele.Rond;
import games.ttc.vue.SaisieJoueur;

public class Joueur extends Controleur.ControleurTemplate implements Action {

    SaisieJoueur s;
    
    public Joueur(JoueurModele m, SaisieJoueur s) {
        super(m);
        this.s = s;
    }

    @Override
    public void execute() {
        int l = Integer.valueOf(((EntreeTexte)this.s).input("ligne"));
        int c = Integer.valueOf(((EntreeTexte)this.s).input("colonne"));
        
        // gros deg
        if(((JoueurModele)this.m).getNom() == "X")
            ((Plateau)((JoueurModele) this.m).getPlateau()).poserSymbole(new Croix(), l, c);
        else
            ((Plateau)((JoueurModele) this.m).getPlateau()).poserSymbole(new Rond(), l, c);
    }

    @Override
    public boolean estValide() {
        /** @todo */
        return true;
    }
    
}
