package modele;

import java.util.*;

public abstract class JoueurModele extends ModeleObservable{
	
	private List<MaterielModele> materielModele;
	
	private String _nom;
	
	private PlateauModele plateauModele;
	
	public JoueurModele(String n, PlateauModele pm){
		_nom = n;
		plateauModele = pm;
	}
	
	public JoueurModele(String n, List<MaterielModele> mm){
		_nom = n;
		materielModele = mm;
	}
	
	public PlateauModele getPlateau(){
		return plateauModele;
	}
	
	public String getNom(){
		return _nom;
	}
	
	public List<MaterielModele> getMaterielModele(){
		return materielModele;
	}

}
