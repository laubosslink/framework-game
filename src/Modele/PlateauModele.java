package Modele;

import java.util.ArrayList;
import java.util.List;

public abstract class PlateauModele extends ModeleObservable {
    private List<MaterielModele> l;

    public PlateauModele() {
        this.l = new ArrayList<>();
    }
    
    public List<MaterielModele> getMateriel()
    {
        return this.l;
    }
    
}
