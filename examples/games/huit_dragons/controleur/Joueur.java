package games.huit_dragons.controleur;

import Controleur.Action;
import games.huit_dragons.vue.SaisieJoueur;
import games.huit_dragons.modele.CarteModele;
import games.huit_dragons.modele.Plateau;

public class Joueur extends Controleur.ControleurTemplate implements Action{

    private SaisieJoueur s;
    
    public Joueur(games.huit_dragons.modele.Joueur m, SaisieJoueur s) {
        super(m);
        this.s = s;
    }

    @Override
    public void execute() {
        CarteModele carte1, carte2;

        int l = Integer.parseInt(this.s.input("retourner 1ere carte - ligne"));
        int c = Integer.parseInt(this.s.input("retourner 1ere carte - colonne"));

        carte1 = this.retournerCarte(l, c);

        l = Integer.parseInt(this.s.input("retourner 2eme carte - ligne"));
        c = Integer.parseInt(this.s.input("retourner 2eme carte - colonne"));

        carte2 = this.retournerCarte(l, c);
    }
    
    private void prendreCartes(int l1, int c1, int l2, int c2) {
        if(this.s.input("Voulez-vous prendre les cartes ? ").startsWith("o")){
            
        }
    }
    
    private CarteModele retournerCarte(int l, int c)
    {    
        CarteModele[][] cm = ((Plateau) ((games.huit_dragons.modele.Joueur) this.m).getPlateau()).getCartes();
        
        // TODO verifier les limites...
        CarteModele carte = cm[l][c];
        
        carte.devientVisible();
        
        return carte;
    }

    @Override
    public boolean estValide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
