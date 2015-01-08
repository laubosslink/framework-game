package games.hyene.controleur;

import Controleur.Action;
import Controleur.PartieControleur;
import Modele.PartieModele;
import Vue.VueType;
import games.hyene.modele.Pion;
import games.hyene.vue.SaisieJoueur;


public class Partie extends PartieControleur{

    public Partie(PartieModele m, VueType v) {
        super(m, v);
    }

    public void lancer() {
    	
       SaisieJoueur s1 = new SaisieJoueur("Joueur 1");
       SaisieJoueur s2 = new SaisieJoueur("Joueur 2");
       
       Pion jm1 = new PionJoueur(); //("Joueur 1", ((PartieModele)this.m).getPlateau());
       PionJoueur jm2 = new PionJoueur(); //("Joueur 2", ((PartieModele)this.m).getPlateau());
       
       /*Joueur j1 = new Joueur(jm1, s1);
       Joueur j2 = new Joueur(jm2, s2);
       
       this.ajouterAction(j1);
       this.ajouterAction(j2);
       */
       while(!estFinit()){
           for(Action a : this.)
               a.execute();
       }
    }

    public boolean estFinit() {
        return false;
    }
    
}
