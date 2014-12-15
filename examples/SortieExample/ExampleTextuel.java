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

import java.util.Observable;

import Sortie.*;

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

public class Partie {
    private Joueur j1, j2;

    private AffichageTexte at1, at2;

    public Partie()
    {
        System.out.println("Creation d'une partie.");
        System.out.println("Creation des joueurs.");

        at1 = new AffichageTexte("Objet J1", j1);
        at2 = new AffichageTexte("Objet J2", j2);

        j1.init("JB");
        j2.init("Quentin");

        j1.setNomJoueur("Laurent");
    }
}

public static void main(String[] args)
{
    new Partie();
}
