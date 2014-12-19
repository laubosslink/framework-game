package modele;

import java.util.List;

public abstract class PartieModele extends ModeleObservable{
	
	private boolean estFinie = false;
	private PlateauModele plateauModele;
	private JoueurModele joueurCourant;
	private List<JoueurModele> listeJoueurs;
	
	public PartieModele(PlateauModele pm){
		this.plateauModele = pm;
	}
	
	public boolean ajouterJoueur(JoueurModele jm){
		boolean ajout = false;	
		if(!listeJoueurs.contains(jm))
			if(listeJoueurs.add(jm))
				ajout = true;		
		return ajout;
	}
	
	public List<JoueurModele> getJoueurs(){
		return listeJoueurs;
	}
	
	public PlateauModele getPlateau(){
		return plateauModele;
	}
	
	public JoueurModele getJoueurCourant(){
		return joueurCourant;
	}

	public void prochainJoueur(){
		int indexCourant = listeJoueurs.indexOf(joueurCourant);		
		int indexProchain = indexCourant + 1;		
		joueurCourant = listeJoueurs.get(indexProchain);
	}
	
	public boolean getEstfinie(){
		return this.estFinie;
	}			
}
