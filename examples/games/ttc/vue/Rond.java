package games.ttc.vue;

import Modele.ModeleObservable;
import Vue.TexteVue;

public class Rond extends TexteVue {

    public Rond(String nom, ModeleObservable obj) {
        super(nom, obj);
    }

    @Override
    public String toString() {
        return "O";
    }
    
}
