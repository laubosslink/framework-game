package games.ttc.modele;

import Modele.MaterielModele;
import Modele.PlateauModele;
import java.util.ArrayList;
import java.util.List;

public class Plateau extends PlateauModele {
    protected MaterielModele[][] plateau;
    
    public Plateau() {
        this.plateau = new MaterielModele[3][3];
        
        for(int i=0; i<this.plateau.length; i++)
        {
            for(int j=0; j<this.plateau[i].length; j++)
            {
                this.plateau[i][j] = null;
            }
        }
        
        setChanged();
        notifyObservers();
    }
    
    public List<MaterielModele> voisinsVerticale(int i, int j)
    {
        List<MaterielModele> l = new ArrayList<>();
        
        MaterielModele[][] m = plateau;
        
        l.add(m[i][(j+1)%3]);
        l.add(m[i][(j-1)%3]);
        
        return l;
    }
    
    public List<MaterielModele> voisinsHorizontal(int i, int j)
    {
        List<MaterielModele> l = new ArrayList<>();
        
        MaterielModele[][] m = plateau;
        
        l.add(m[(i+1)%3][j]);
        l.add(m[(i-1)%3][j]);
        
        return l;
    }
    
    /**
     * @todo les diagonales
     */
    
    public MaterielModele[][] getPlateau()
    {
        return this.plateau;
    }
    
    public void poserSymbole(MaterielModele m, int i, int j)
    {
        this.plateau[i][j] = m;
        setChanged();
        notifyObservers();
    }
    
}
