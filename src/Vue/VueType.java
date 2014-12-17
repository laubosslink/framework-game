package Vue;

import Modele.ModeleObservable;
import java.util.Observer;

public abstract class VueType  implements Observer {
    protected String nom;
    protected Modele.ModeleObservable obj;

    public VueType(String nom, ModeleObservable obj) {
        this.nom = nom;
        this.obj = obj;
        this.obj.addObserver(this);
    }
}
