package Controleur;

import Modele.ModeleObservable;
import Vue.VueType;

/**
 * Classe à utiliser lors du développement d'un controleur pour le jeu
 */
public abstract class ControleurTemplate {
    protected Modele.ModeleObservable m;
    protected Vue.VueType v;
    
    /**
     * Le controleur connait le modèle, et optionnellement la vue
     * @param m Un modele étendue du template modele du framework
     */
    public ControleurTemplate(ModeleObservable m)
    {
        this.m = m;
        this.v = null;
    }
    
    /**
     * Le controleur connait le modèle, et une vue
     * @param m Un modele étendue du template modele du framework
     * @param v Une vue étendue du template vue du framework
     */
    public ControleurTemplate(ModeleObservable m, VueType v)
    {
        this.m = m;
        this.v = v;
    }
}
