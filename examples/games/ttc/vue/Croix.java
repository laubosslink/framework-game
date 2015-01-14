package games.ttc.vue;

import Modele.ModeleObservable;
import Vue.TexteVue;

public class Croix extends TexteVue {

    public Croix(String nom, ModeleObservable obj) {
        super(nom, obj);
    }

    @Override
    public String toString() {
        return "X";
    }
    
}
