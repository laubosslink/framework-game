package modele;

import java.util.*;
import java.util.List;
import java.awt.*;

import modele.MaterielModele;
import modele.PlateauModele;

public class Plateau extends PlateauModele implements Observer{
	
	protected Case[] plateau;
	protected Pion[] pions;
	protected List<Taba> tabas;
	
	public Plateau(){
		this.plateau = new Case[30];
		
		for(int i=0; i<this.plateau.length; i++)
			this.plateau[i] = null;
		
		pions = new Pion[4];
		tabas = new ArrayList<Taba>();
		
		notifyObservers();		
	}

	public void update(Observable o, Object arg) {		
		this.setChanged();
		this.notifyObservers();
	}

}
