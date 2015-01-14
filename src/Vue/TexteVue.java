package Vue;

import Modele.ModeleObservable;
import java.util.Observable;

/**
 * Permet de créer une vue textuelle
 */
public abstract class TexteVue extends VueType {

    public TexteVue(String nom, ModeleObservable obj) {
        super(nom, obj);
    }
    
    /**
     * Obliger le développement d'une méthode permettant un affichage textuel
     * @return une chaine de caractère représentant l'affichage textuel voulu
     */
    public abstract String toString();

    @Override
    public void update(Observable o, Object o1) 
    {
        System.out.println("----{" + super.nom + "}------");
        System.out.println(this.toString());
        System.out.println("--------------------");
    }
    
}
