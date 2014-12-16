package Vue;

import java.util.ArrayList;
import java.util.List;

public class Affichage {
    private List<VueType> l;
    
    public Affichage()
    {
        this.l = new ArrayList<>();
    }
    
    public void ajouterVue(VueType v)
    {
        this.l.add(v);
    }
    
}
