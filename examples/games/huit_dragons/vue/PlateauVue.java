package games.huit_dragons.vue;

import Modele.PlateauModele;
import Vue.TexteVue;
import games.huit_dragons.modele.CarteDragonModele;
import games.huit_dragons.modele.CarteModele;
import games.huit_dragons.modele.Plateau;

public class PlateauVue extends TexteVue {

    public PlateauVue(String nom, PlateauModele obj) {
        super(nom, obj);
    }

    @Override
    public String toString() {
        Plateau pm = (Plateau) this.obj;

        String output = "";
        CarteModele[][] cm = pm.getCartes();
        CarteModele cm_courrante;
        
        for (int i = 0; i < cm.length; i++) 
        {
            for (int j = 0; j < cm[i].length; j++) 
            {
                cm_courrante = cm[i][j];
                
                if(!cm_courrante.estVisible())
                {
                    output += "X";
                } else 
                {
                    if(cm_courrante instanceof CarteDragonModele)
                    {
                        switch(((CarteDragonModele) cm_courrante).getCouleur()){
                            case argent:
                                output += "\u001B[30m";
                                break;
                            case multicolore:
                                output += "\u001B[37m";
                                break;
                            case or:
                                output += "\u001B[33m";
                                break;
                            case rouge:
                                output += "\u001B[31m";
                                break;
                            case vert:
                                output += "\u001B[32m";
                                break;

                        }
                        
                        switch(((CarteDragonModele) cm_courrante).getM()){
                            case griffe:
                                output += "G";
                                break;
                            case patte_arriere:
                                output += "P";
                                break;
                            case queue:
                                output += "Q";
                                break;
                            case tete:
                                output += "T";
                                break;
                        }
                        
                        output += "\u001B[30m";
                        
                    } else //TODO les CarteEffet
                    {
                        output += "X";
                    }
                }
            }
            
            output += "\n";
        }

        return output;
    }
}
