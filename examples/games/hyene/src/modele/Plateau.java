package modele;

import java.util.*;
import java.awt.*;

import modele.MaterielModele;
import modele.PlateauModele;

public class Plateau extends PlateauModele implements Observer{
	
	protected MaterielModele[] plateau;
	protected Pion[] pions;
	
	public Plateau(){
		this.plateau = new MaterielModele[57];
		
		for(int i=0; i<this.plateau.length; i++)
			this.plateau[i] = null;
		
		notifyObservers();		
	}

	public void update(Observable o, Object arg) {		
		this.setChanged();
		this.notifyObservers();
	}

}
