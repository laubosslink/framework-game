package vue;
import java.util.Observable;

import modele.PlateauModele;
import modele.Plateau;

public class PlateauVue extends TexteVue{
	
	public PlateauVue(String nom, PlateauModele pm) {
		super(nom, pm);		
		
	}
	
	public String toString(){
		
		Plateau plateau = (Plateau)this.getObj();
		String aff = "";
		for(int i=0 ; i<57 ; i++)
			aff += "|_|";
		return aff;
	}

	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		
	}
	
}
