package modele;

import java.util.List;

import modele.MaterielModele;

public abstract class PlateauModele {
	
	private List<MaterielModele> listeMateriels;
	
	public PlateauModele() {
		
		
		
	} 
	
	public List<MaterielModele> getMateriel(){
		return listeMateriels;
		
	}

}
