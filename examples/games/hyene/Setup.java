package games.hyene;

import games.hyene.controleur.Partie;
import games.hyene.modele.Plateau;
import games.hyene.vue.PlateauVue;


public class Setup {

    public static void main(String[] args) {
   
        Plateau plateau = new Plateau();		
        PlateauVue pv = new PlateauVue("Plateau", plateau);
        games.hyene.modele.Partie pm = new games.hyene.modele.Partie(plateau);	
        Partie p = new Partie(pm,pv);
	p.lancer();

    }

}
