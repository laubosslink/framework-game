package Controleur;

import Modele.PartieModele;
import Vue.VueType;
import java.util.ArrayList;
import java.util.List;

/**
 * Controleur utilisé pour la gestion d'une partie
 */
public abstract class PartieControleur extends ControleurTemplate {

    protected List<Action> l;

    public PartieControleur(PartieModele m, VueType v) {
        super(m, v);
        this.l = new ArrayList<>();
    }
    
    /**
     * Permet d'ajouter une action
     * @param a l'action à ajouter dans la liste
     */
    public void ajouterAction(Action a)
    {
        this.l.add(a);
    }
    
    /**
     * Permet de lancer une partie.
     * Equivalent a faire défiler la liste d'action ajouté, et cette liste
     * tourne en boucle tant que la partie n'est pas finit.
     */
    public void lancer()
    {
        while(!estFinit())
        {
            for(Action a : this.l)
            {
                if(a.estValide())
                    a.execute();
            }
        }
    }
    
    /**
     * Permet de savoir si une partie est finit
     * @return true si la partie est finit
     */
    public abstract boolean estFinit();
}
