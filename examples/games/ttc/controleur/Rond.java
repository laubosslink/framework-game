package games.ttc.controleur;

import Controleur.Action;
import Modele.JoueurModele;
import Vue.EntreeTexte;
import games.ttc.modele.Plateau;

public class Rond extends Controleur.ControleurTemplate implements Action {

    private EntreeTexte s;
    private Plateau plateau;
    private JoueurModele joueur_modele;
    
    private int ligne, colonne;
            
    public Rond(JoueurModele m, EntreeTexte s) {
        super(m);
        this.s = s;
        
        this.joueur_modele = m;
        this.plateau = (Plateau) this.joueur_modele.getPlateau();
    }

    @Override
    public void execute() 
    {
        games.ttc.modele.Rond rond = new games.ttc.modele.Rond();
        this.plateau.poserSymbole(rond, ligne, colonne);
    }

    @Override
    public boolean estValide() {
        ligne = Integer.valueOf(this.s.input("ligne"));
        colonne = Integer.valueOf(this.s.input("colonne"));
                
        if(ligne < 0 || ligne >= this.plateau.getPlateau().length)
        {
            return false;
        }
        
        if(colonne < 0 || colonne >= this.plateau.getPlateau()[0].length)
        {
            return false;
        }
        
        return true;
    }

    @Override
    public boolean estPossible() {
        return true;
    }
}
