package Modele;

import java.util.ArrayList;
import java.util.List;

public abstract class PartieModele extends  ModeleObservable{
    protected PlateauModele p;
  
    protected JoueurModele joueurCourrant;  
    protected List<JoueurModele> l;
    
    public PartieModele(PlateauModele p)
    {
        this.l = new ArrayList<>();
        this.p = p;
        this.joueurCourrant = null;
    }
    
    public void ajouterJoueur(JoueurModele jm)
    {
        this.l.add(jm);
    }
    
    public List<JoueurModele> getJoueurs()
    {
        return this.l;
    }
    
    public PlateauModele getPlateau()
    {
        return this.p;
    }
    
    public JoueurModele getJoueurCourrant()
    {
        return joueurCourrant;
    }
    
    public void prochainJoueur()
    {
        if(this.l.size() == 0)
            return;
        
        if(this.joueurCourrant == null)
            this.joueurCourrant = this.l.get(0);
        
        int i=0;
        
        for(JoueurModele jm : this.l)
        {
            if(joueurCourrant == jm)
                if(i == this.l.size()-1)
                    joueurCourrant = this.l.get(0);
                else
                    joueurCourrant = this.l.get(i+1);
            
            i++;
        }
    }
}
