package Modele;


import java.util.*;

public class Plateau extends PlateauModele {
Jeton[] jetons;
boolean version_longue;

	public Plateau(boolean longue) {
		super();
		jetons = new Jeton[4];
		Cartes cartes=new Cartes(longue);
		CarteModele tmp;
		List<CarteModele> liste;
		if(longue)//Version longue
		{
			for(int i=0;i<(7*6);i++){
				tmp=cartes.tirer_carte();
				liste.add(tmp);
			}
		}
		else//Version courtes
		{
			for(int i=0;i<(6*6);i++){
				tmp=cartes.tirer_carte();
				liste.add(tmp);
			}
		}
	}
	
}
