package Modele;


import java.util.*;

public class Plateau extends PlateauModele {


	public Plateau() {
		super();
		Cartes cartes=new Cartes();
		CarteModele tmp;
		List<CarteModele> liste;
		for(int i=0;i<(7*6);i++){
			tmp=cartes.tirer_carte();
			liste.add(tmp);
			
		}
		
		
		// TODO Auto-generated constructor stub
	}
	
}
