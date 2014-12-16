package games.ttc.vue;

import Modele.ModeleObservable;
import Vue.TexteVue;

public class Plateau extends TexteVue{

    public Plateau(String nom, ModeleObservable obj) {
        super(nom, obj);
    }

    @Override
    public String toString() {
        String output = "";
        
        games.ttc.modele.Plateau p = (games.ttc.modele.Plateau) this.obj;
        
        for(int i=0; i<p.getPlateau().length; i++)
        {
            for(int j=0; j<p.getPlateau()[i].length; j++)
            {
                /** @todo eviter instanceof... */
                if(p.getPlateau()[i][j] == null)
                    output += " ";
                else if(p.getPlateau()[i][j] instanceof games.ttc.modele.Rond)
                    output += "O ";
                else
                    output += "X ";
            }
            output += "\n";
        }
        
        return output;
    }
}
