package games.hyene.vue;

import Modele.PlateauModele;
import Vue.TexteVue;
import games.hyene.modele.Plateau;
import java.util.Observable;


public class PlateauVue extends TexteVue{
	
	public PlateauVue(String nom, PlateauModele pm) {
		super(nom, pm);		
		
	}
	
	public String toString(){
		
		Plateau plateau = (Plateau)this.obj;
		String aff = "";
		for(int i=0 ; i<57 ; i++)
			aff += "|_|";
		return aff;
	}

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
}
