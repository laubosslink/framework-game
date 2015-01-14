package games.huit_dragons.modele;

public class CarteDragonModele extends CarteModele {

    private Membre m;
    private Couleur c;

    public Membre getM() 
    {
        return m;
    }

    public Couleur getCouleur() 
    {
        return c;
    }

    public CarteDragonModele(Membre m, Couleur c) {
        this.m = m;
        this.c = c;
    }
}
