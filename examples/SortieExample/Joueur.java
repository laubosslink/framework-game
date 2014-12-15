/**
 * ENSICAEN 6 Boulevard Marechal Juin F-14050 Caen Cedex
 * 
 * This file is owned by ENSICAEN students. No portion of this document may be
 * reproduced, copied or revised without written premission of the authors
 */

/**
 * @author PARMENTIER Laurent
 * <laurent.parmentier@ecole.ensicaen.fr, laubosslink@society-lbl.com>
 */
package SortieExample;

import Sortie.ObservableTexte;
import java.util.Observable;

public class Joueur extends Observable implements ObservableTexte {
    private String nomJoueur;
    private boolean premiereInstance=true;

    public void init(String nom){
        setNomJoueur(nom);
    }

    public void setNomJoueur(String nom){
        this.nomJoueur = nom;
        setChanged();
        notifyObservers();
    }

    public String toString(){
        if(premiereInstance)
        {
            /**
             * remarque : normalement c'est le constructeur Joueur qui devrait mettre premiereInstance a false, 
             * mais il y a un risque qu'il soit change avant l'appel de cette fonction
             * a l'avenirs resoudre ce probleme par le passage d'un Object en param 
             */
            this.premiereInstance = false;
            return "Creation du joueur : " + this.nomJoueur;
        }

        return "Changement du nom du joueur : " + this.nomJoueur;
    }
}
