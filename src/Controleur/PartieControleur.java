package Controleur;

import Modele.PartieModele;
import Vue.VueType;
import java.util.ArrayList;
import java.util.List;

public abstract class PartieControleur extends ControleurTemplate {
    
    protected List<Action> l;

    public PartieControleur(PartieModele m, VueType v) {
        super(m, v);
        this.l = new ArrayList<>();
    }
    
    public void ajouterAction(Action a)
    {
        this.l.add(a);
    }
    
    public void lancer()
    {
        while(!estFinit())
        {
            for(Action a : this.l)
            {
                if(a.estValide())
                    a.execute();
            }
        }
    }
    
    public abstract boolean estFinit();
}
