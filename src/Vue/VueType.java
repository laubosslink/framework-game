package Vue;

import Modele.ModeleObservable;
import java.util.Observer;

/**
 * Permet de créer une vue qui observe obligatoirement un modele
 */
public abstract class VueType  implements Observer 
{
    protected String nom;
    protected Modele.ModeleObservable obj;

    public VueType(String nom, ModeleObservable obj) 
    {
        this.nom = nom;
        this.obj = obj;
        this.obj.addObserver(this);
    }
}
