package Modele;

import java.util.ArrayList;
import java.util.List;

public abstract class JoueurModele extends ModeleObservable {
    protected String nom;
    protected List<MaterielModele> m;
    
    public JoueurModele(String nom)
    {
        this.nom = nom;
        this.m = new ArrayList<>();
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
}
