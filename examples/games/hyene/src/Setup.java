import modele.Plateau;
import vue.PlateauVue;
import controleur.Partie;


public class Setup {

	public static void main(String[] args) {
		
		modele.Plateau plateau = new modele.Plateau();
		
        PlateauVue pv = new PlateauVue("Plateau", plateau);
		
		Partie p = new Partie(new modele.Partie(plateau) , null);
		
		p.lancer();

	}

}
