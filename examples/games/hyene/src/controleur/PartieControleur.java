package controleur;
import modele.*;
import vue.*;
import java.util.*;


public abstract class PartieControleur extends ControleurTemplate{
	
	private List<Action> actionsList;
	
	public PartieControleur(PartieModele m , VueType vType){
		super(m , vType);
		actionsList = new ArrayList<Action>();
		
	}

	public void ajouterAction(Action a){		
		actionsList.add(a);		
	}
	
}
