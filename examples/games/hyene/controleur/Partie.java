package games.hyene.controleur;

import Controleur.Action;
import Controleur.PartieControleur;
import Modele.PartieModele;
import Vue.VueType;
import games.hyene.modele.PionHyene;
import games.hyene.modele.Plateau;
import games.hyene.vue.SaisieJoueur;

public class Partie extends PartieControleur{

    public Partie(PartieModele m, VueType v) {
        super(m, v);
    }

    @Override
    public void lancer() {
       SaisieJoueur s1 = new SaisieJoueur("Joueur 1");
       SaisieJoueur s2 = new SaisieJoueur("Joueur 2");
       
       PartieModele pm = (PartieModele) super.m;
       
       games.hyene.modele.Joueur jm1 = new games.hyene.modele.Joueur("J1", (Plateau) pm.getPlateau());
       games.hyene.modele.Joueur jm2 = new games.hyene.modele.Joueur("J2", (Plateau) pm.getPlateau());
       
       pm.ajouterJoueur(jm1);
       pm.ajouterJoueur(jm2);
       
       Joueur j1 = new Joueur(jm1, s1);
       Joueur j2 = new Joueur(jm2, s2);
       
       this.ajouterAction(j1);
       this.ajouterAction(j2);
       
       while(!estFinit()){
           for(Action a : this.l)
               a.execute();
       }
    }

    public boolean estFinit() {
        
        Plateau p = (Plateau) ((PartieModele) this.m).getPlateau();
        
        for(int i=0 ; i<p.getPions().length ; i++)
            if(p.getPions()[i] instanceof PionHyene)
                return true;
        return false;
    }
    
}
