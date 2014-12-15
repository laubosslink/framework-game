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
package Sortie;

import java.util.Observable;
import java.util.Observer;

/**
 * Permet la création d'un affichage textuel Utilisation du pattern Obesrvable,
 * pour observer un model et ainsi afficher sur la sortie standard dès qu'une
 * notification est levée
 *
 * @see https://docs.oracle.com/javase/7/docs/api/java/util/Observer.html
 */
public class AffichageTexte implements Observer {

    private String nom;
    private Observable obj;

    /**
     * Constructeur d'un affichage textuel
     *
     * @param nom Le nom qu'on veut donner pour l'objet observer (ex. "Partie",
     * "Joueur1")
     * @param obj l'objet qui respecte l'inteface pour un affichage textuel
     */
    public AffichageTexte(String nom, Observable obj) {
        this.nom = nom;
        this.obj = obj;
        this.obj.addObserver(this);
    }

    @Override
    public void update(Observable o, Object o1) {
        String output = "";

        output += "\n-----[" + this.nom + "]-----\n";

        output += this.obj.toString();

        output += "\n---------------\n";

        System.out.print(output);
    }
}
