package games.ttc.controleur;

import Controleur.PartieControleur;
import Modele.JoueurModele;
import Modele.PartieModele;
import Vue.VueType;
import games.ttc.modele.Joueur;
import games.ttc.vue.SaisieJoueur;


public class Partie extends PartieControleur {

    public Partie(PartieModele m, VueType v) {
        super(m, v);
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

    @Override
    public void lancer() {
        
        /** @todo l'entree doit etre un singleton */
        
        SaisieJoueur s1 = new SaisieJoueur("Nom joueur 1: ");
        SaisieJoueur s2 = new SaisieJoueur("Nom joueur 2: ");
        
        SaisieJoueur p1 = new SaisieJoueur("Poser pion J1: ");
        SaisieJoueur p2 = new SaisieJoueur("Poser pion J2: ");
        
        ((PartieModele) super.m).ajouterJoueur(new Joueur(s1.input()));
        ((PartieModele) super.m).ajouterJoueur(new Joueur(s2.input()));
        
        while(!estFinit()){
            JoueurModele joueur_courrant = ((PartieModele)super.m).getJoueurCourrant();
            
            
            ((PartieModele)super.m).prochainJoueur();
        }
    }

}
