package games.ttc.controleur;

import Controleur.PartieControleur;
import Modele.ModeleObservable;
import Vue.VueType;
import games.ttc.modele.Joueur;
import games.ttc.modele.Plateau;


public class Partie extends PartieControleur {
    Plateau p;
    Joueur j1, j2;

    public Partie(ModeleObservable m, VueType v) {
        super(m, v);
    }

    @Override
    public void init() {
        p = new Plateau();
        
        j1 = new Joueur("Laurent");
        j2 = new Joueur("JB");
    }

    @Override
    public boolean estFinit() {
        ModeleObservable m;
        
        
    }
    
    public static void main(String[] args)
    {
    }

}
