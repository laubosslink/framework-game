package games.huit_dragons.modele;

public enum Couleur {
    rouge(15),
    vert(20),
    or(30),
    multicolore(30),
    argent(40);
    
    private int points;
    
    private Couleur(int valeur)
    {
        this.points = valeur;
    }
    
    public int getPoints()
    {
        return this.points;
    }
    
}
