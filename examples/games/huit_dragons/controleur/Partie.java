package games.huit_dragons.controleur;

import Controleur.Action;
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
       SaisieJoueur s1 = new SaisieJoueur("Joueur 1");
       SaisieJoueur s2 = new SaisieJoueur("Joueur 2");
       
       games.huit_dragons.modele.Joueur jm1 = new games.huit_dragons.modele.Joueur("Joueur 1", ((PartieModele)this.m).getPlateau());
       games.huit_dragons.modele.Joueur jm2 = new games.huit_dragons.modele.Joueur("Joueur 2", ((PartieModele)this.m).getPlateau());
       
       Joueur j1 = new Joueur(jm1, s1);
       Joueur j2 = new Joueur(jm2, s2);
       
       this.ajouterAction(j1);
       this.ajouterAction(j2);
       
       while(!estFinit())
       {
           for(Action a : this.l)
           {
               a.execute();
           }
       }
    }

    @Override
    public boolean estFinit() {
        return false;
    }
    
}
