package modele;

import java.util.*;
import java.awt.*;
import modele.MaterielModele;
import modele.PlateauModele;

public class Plateau extends PlateauModele{
	
	protected MaterielModele[] plateau;
	
	public Plateau(){
		this.plateau = new MaterielModele[57];
		
		for(int i=0; i<this.plateau.length; i++)
			this.plateau[i] = null;
		
		notifyObservers();		
	}
	
	public void displayPlateau(){
		int n = this.plateau.length;
		//for(int i=0 ; i<n; i++)
			
			
	}

}
