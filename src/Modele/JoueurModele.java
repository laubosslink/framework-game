package Modele;

import java.util.ArrayList;
import java.util.List;

public abstract class JoueurModele extends ModeleObservable {
    protected String nom;
    protected PlateauModele p;
    protected List<MaterielModele> m;
    
    public JoueurModele(String nom, PlateauModele p)
    {
        this.nom = nom;
        this.m = new ArrayList<>();
        this.p = p;
    }
    
    public JoueurModele(String nom, List<MaterielModele> m)
    {
        this.nom = nom;
        this.m = m;
    }
    
    public void ajouterMateriel(MaterielModele m)
    {
        this.m.add(m);
    }
    
    public PlateauModele getPlateau()
    {
        return this.p;
    }
    
    public String getNom()
    {
        return this.nom;
    }
}
