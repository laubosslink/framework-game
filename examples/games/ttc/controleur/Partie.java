package games.ttc.controleur;

import Controleur.Action;
import Controleur.PartieControleur;
import Modele.JoueurModele;
import Modele.PartieModele;
import Vue.EntreeTexte;
import Vue.VueType;
import games.ttc.modele.Joueur;
import games.ttc.modele.Plateau;


public class Partie extends PartieControleur {

    public Partie(PartieModele m, VueType v) 
    {
        super(m, v);
        
        EntreeTexte p1 = new EntreeTexte("Poser pion J1");
        EntreeTexte p2 = new EntreeTexte("Poser pion J2");
        
        PartieModele pm = (PartieModele) super.m;

        JoueurModele j1 = new Joueur("X", (Plateau) pm.getPlateau());
        JoueurModele j2 = new Joueur("O", (Plateau) pm.getPlateau());
        
        pm.ajouterJoueur(j1);
        pm.ajouterJoueur(j2);
        
        // controleur de chaque joueur
        games.ttc.controleur.Croix jc1 = new games.ttc.controleur.Croix(j1, p1);
        games.ttc.controleur.Rond jc2 = new games.ttc.controleur.Rond(j2, p2);
        
        this.ajouterAction(jc1);
        this.ajouterAction(jc2);
    }
    
    @Override
    public boolean estFinit() {
        /*
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
               MaterielModele symboleCourrant = ((Plateau)((PartieModele)super.m))
                
               List<MaterielModele> lh = ((Plateau)((PartieModele)super.m).getPlateau()).voisinsHorizontal(i, j);
               List<MaterielModele> lv = ((Plateau)((PartieModele)super.m).getPlateau()).voisinsVerticale(i, j);
               
               
            }
        }
        */
        
        return false;
    }
}
