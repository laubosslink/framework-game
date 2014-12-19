package modele;

import java.util.*;

import modele.MaterielModele;

public abstract class PlateauModele extends ModeleObservable{
	
	private List<MaterielModele> listeMateriels;
	
	
	public PlateauModele() {
		
		listeMateriels = new ArrayList<MaterielModele>(); 
		
	} 
	
	public List<MaterielModele> getMateriel(){
		return listeMateriels;
	}

}
