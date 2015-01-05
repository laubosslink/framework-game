import modele.*;
import vue.*;
import controleur.*;

public class Setup {

	public static void main(String[] args) {
		
		modele.Plateau plateauModele = new modele.Plateau();
		PartieModele partieModele = new Partie(plateauModele);
		
		Partie p = new Partie(plateauModele);

	}

}
