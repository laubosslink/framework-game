package games.huit_dragons.vue;

import Modele.ModeleObservable;
import Modele.PlateauModele;
import Vue.TexteVue;
import Vue.VueType;
import games.huit_dragons.modele.CarteDragonModele;
import games.huit_dragons.modele.CarteModele;

public class PlateauVue extends TexteVue {

    public PlateauVue(String nom, PlateauModele obj) {
        super(nom, obj);
    }

    @Override
    public String toString() {
        PlateauModele pm = (PlateauModele) this.obj;

        String output = "";
        CarteModele[][] cm = pm.getCartes();
        CarteModele cm_courrante;
        
        for (int i = 0; i < cm.length; i++) 
        {
            for (int j = 0; i < cm[i].length; j++) 
            {
                cm_courrante = cm[i][j];
                
                if(!cm_courrante.estVisible())
                {
                    output += "X";
                    break;
                }
                
                if(cm_courrante instanceof CarteDragonModele)
                {
                    switch(((CarteDragonModele) cm_courrante).getCouleur()){
                        case argent:
                            output += "\\033[30m";
                            break;
                        case multicolore:
                            output += "";
                            break;
                        case or:
                            output += "\\033[33m";
                            break;
                        case rouge:
                            output += "\\033[31m";
                            break;
                        case vert:
                            output += "";
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
                } else //TODO les CarteEffet
                {
                    output += "\\033[0mX";
                }
            }
            
            output += "\n";
        }

        return output;
    }
}
