package games.huit_dragons.controleur;

import Controleur.Action;
import Modele.JoueurModele;
import games.huit_dragons.modele.CarteDragonModele;
import games.huit_dragons.vue.SaisieJoueur;
import games.huit_dragons.modele.CarteModele;
import games.huit_dragons.modele.Plateau;

public class Joueur extends Controleur.ControleurTemplate implements Action{

    private SaisieJoueur s;
    private Plateau plateau;
    
    public Joueur(games.huit_dragons.modele.Joueur m, SaisieJoueur s) {
        super(m);
        this.s = s;
        this.plateau = ((Plateau) ((games.huit_dragons.modele.Joueur) this.m).getPlateau());
    }

    @Override
    public void execute() {
        boolean peutRejouer;
        
        do {
            peutRejouer = false;
            
            CarteModele carte1, carte2;
            
            int l, c;
            
            do {
                l = Integer.parseInt(this.s.input("retourner 1ere carte - ligne"));
                c = Integer.parseInt(this.s.input("retourner 1ere carte - colonne"));

                carte1 = this.retournerCarte(l, c);
            } while(carte1 == null);
            
            do {
                l = Integer.parseInt(this.s.input("retourner 2eme carte - ligne"));
                c = Integer.parseInt(this.s.input("retourner 2eme carte - colonne"));

                carte2 = this.retournerCarte(l, c);
            } while(carte2 == null);
            
            if((memePartieDuDragon(carte1, carte2) || memeCouleur(carte1, carte2)) && joueurSouhaitePrendreCartes())
            {
                ((JoueurModele) this.m).ajouterMateriel(carte1);
                ((JoueurModele) this.m).ajouterMateriel(carte2);

                this.plateau.retirerCarteDuPlateau(carte1);
                this.plateau.retirerCarteDuPlateau(carte2);
                
                // TODO le joueur souhaite les changer de place 
            }
            
            if(memePartieDuDragon(carte1, carte2))
            {
                peutRejouer = true;
            }
            
            carte1.devientNonVisible();
            carte2.devientNonVisible();
            
        } while(peutRejouer);
    }
    
    private boolean memePartieDuDragon(CarteModele c1, CarteModele c2)
    {
        if(!(c1 instanceof CarteDragonModele) || !(c2 instanceof CarteDragonModele))
            return false;
            
        return ((CarteDragonModele)c1).getM() == ((CarteDragonModele)c2).getM();
    }
    
    private boolean memeCouleur(CarteModele c1, CarteModele c2) 
    {
        if (!(c1 instanceof CarteDragonModele) || !(c2 instanceof CarteDragonModele)) {
            return false;
        }

        return ((CarteDragonModele) c1).getCouleur() == ((CarteDragonModele) c2).getCouleur();
    }
    
    private boolean joueurSouhaitePrendreCartes() {
        return this.s.input("Voulez-vous prendre les cartes ?").toLowerCase().startsWith("o");
    }
    
    private CarteModele retournerCarte(int l, int c)
    {    
        CarteModele[][] cm = this.plateau.getCartes();
        
        // TODO verifier les limites...
        CarteModele carte = cm[l][c];
        
        if(carte == null)
            return null;
        
        carte.devientVisible();
        
        return carte;
    }

    @Override
    public boolean estValide() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean estPossible() {
        return true;
    }
    
}
