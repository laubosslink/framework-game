package games.huit_dragons;

import games.huit_dragons.controleur.Partie;
import games.huit_dragons.modele.Plateau;
import games.huit_dragons.vue.PlateauVue;


public class Setup 
{
    public static void main(String args[])
    {
        Plateau plateau = new Plateau(true);
        PlateauVue pv = new PlateauVue("Plateau", plateau);
        games.huit_dragons.modele.Partie pm = new games.huit_dragons.modele.Partie(plateau);
        Partie p = new Partie(pm, null);
        p.lancer();
    }
}
