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

import Sortie.AffichageTexte;
import Sortie.AffichagesTexte;

public class Partie {
    private Joueur j1, j2;

    private AffichagesTexte ast;

    public Partie()
    {
        System.out.println("Creation d'une partie.");
        System.out.println("Creation des joueurs.");
        
        ast = new AffichagesTexte();
        
        j1 = new Joueur();
        j2 = new Joueur();

        //at1 = new AffichageTexte("Objet J1", j1);
        //at2 = new AffichageTexte("Objet J2", j2);
        ast.ajouter("Objet J1", j1);
        ast.ajouter("Objet J2", j2);

        j1.init("JB");
        j2.init("Quentin");

        j1.setNomJoueur("Laurent");
    }
}  

