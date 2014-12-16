package Vue;

import Modele.ModeleObservable;
import java.util.Observable;

public abstract class TexteVue extends VueType {

    public TexteVue(String nom, ModeleObservable obj) {
        super(nom, obj);
    }
    
    public abstract String toString();

    @Override
    public void update(Observable o, Object o1) {
        System.out.println("----{" + super.nom + "}------");
        System.out.println(this.obj.toString());
        System.out.println("--------------------");
    }
    
}
