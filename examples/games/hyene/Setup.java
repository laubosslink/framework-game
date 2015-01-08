package games.hyene;

import games.hyene.modele.Plateau;
import games.hyene.vue.PlateauVue;
import games.hyene.controleur.Partie;


public class Setup {

	public static void main(String[] args) {
        
            Plateau plateau = new Plateau();
		
        PlateauVue pv = new PlateauVue("Plateau", plateau);
		
		Partie p = new Partie(plateau, pv);
		
		p.lancer();

	}

}
