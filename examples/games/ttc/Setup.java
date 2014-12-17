package games.ttc;

import Modele.PartieModele;
import games.ttc.controleur.Partie;
import games.ttc.modele.Plateau;

public class Setup {
    
    public static void main(String args[])
    {
        Plateau plateau_modele = new Plateau();
        
        PartieModele partie_modele = new games.ttc.modele.Partie(plateau_modele);
        games.ttc.vue.Plateau plateau_vue = new games.ttc.vue.Plateau("Plateau", plateau_modele);
        
        Partie p = new Partie(partie_modele, plateau_vue);
        
        p.lancer();
    }
    
}
