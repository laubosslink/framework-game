package controleur;

import vue.*;
import modele.*;

public class Partie extends PartieControleur{

    public Partie(PartieModele m, VueType v) {
        super(m, v);
    }

    public void lancer() {
    	
       SaisieJoueur s1 = new SaisieJoueur("Joueur 1");
       SaisieJoueur s2 = new SaisieJoueur("Joueur 2");
       
       modele.PionJoueur jm1 = new modele.PionJoueur(); //("Joueur 1", ((PartieModele)this.m).getPlateau());
       modele.PionJoueur jm2 = new modele.PionJoueur(); //("Joueur 2", ((PartieModele)this.m).getPlateau());
       
       /*Joueur j1 = new Joueur(jm1, s1);
       Joueur j2 = new Joueur(jm2, s2);
       
       this.ajouterAction(j1);
       this.ajouterAction(j2);
       */
       while(!estFinit()){
           for(Action a : this.getActionsList())
               a.execute();
       }
    }

    public boolean estFinit() {
        return false;
    }
    
}
