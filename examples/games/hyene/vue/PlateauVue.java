package games.hyene.vue;

import Modele.PlateauModele;
import Vue.TexteVue;
import games.hyene.modele.Plateau;
import games.hyene.modele.Pion;
import games.hyene.modele.PionJoueur;



public class PlateauVue extends TexteVue{
	
	public PlateauVue(String nom, PlateauModele pm) {
		super(nom, pm);		
		
	}
	
	public String toString(){
            
		String output = "";
		Plateau plateau = (Plateau)this.obj;
            
		for(int i=0 ; i<plateau.getLength() ; i++){
                    
                    if(plateau.getPlateau()[i] == null)
                        output += "|_|";
                    
                    else if(plateau.getPlateau()[i] instanceof games.hyene.modele.PionJoueur)
                        if(plateau.getPions()[i].getPosition() == i)                         
                            output += "|P" + i + "|";
                }             
                output += "\n";
		return output;
	}
	
}
