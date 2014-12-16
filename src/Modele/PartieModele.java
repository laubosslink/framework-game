package Modele;

public abstract class PartieModele extends  ModeleObservable{
    private boolean estFinit;
    
    public PartieModele()
    {
        this.estFinit = false;
    }
    
    public boolean getEstFinit()
    {
        return this.estFinit;
    }
}
