package Vue;

import Modele.ModeleObservable;
import java.util.Observable;

public class TexteVue extends VueType {

    public TexteVue(String nom, ModeleObservable obj) {
        super(nom, obj);
    }

    @Override
    public void update(Observable o, Object o1) {
        System.out.println("----{" + super.nom + "}------");
        System.out.println(this.obj);
        System.out.println("--------------------");
    }
    
}
