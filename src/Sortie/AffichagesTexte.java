/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sortie;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author laubosslink
 */
public class AffichagesTexte {
    private List<AffichageTexte> ar;
    
    public AffichagesTexte()
    {
        ar = new ArrayList<>();
    }
    
    public void ajouter(String nom, Observable o)
    {
        AffichageTexte at = new AffichageTexte(nom, o);
        ar.add(at);
    }
}
