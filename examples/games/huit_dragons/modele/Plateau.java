package games.huit_dragons.modele;

import Modele.PlateauModele;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Plateau extends PlateauModele {

    protected CarteModele[][] cm;
    protected Jeton[] jetons;
    protected boolean version_longue;
    
    public CarteModele[][] getCartes(){
        return this.cm;
    }
    
    public Plateau(boolean longue) {
        super();
        jetons = new Jeton[4];
        Cartes cartes = new Cartes(longue);
        CarteModele tmp;
        List<CarteModele> liste = new ArrayList<>();

        if (longue)//Version longue
        {
            this.cm = new CarteModele[7][6];
            
            for (int i = 0; i < 7; i++) {
                for (int j=0; j<6; j++) {
                    try {
                        this.cm[i][j] = cartes.tirer_carte();
                    } catch (Exception ex) {
                        Logger.getLogger(Plateau.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
        } else//Version courtes
        {
            for (int i = 0; i < 6; i++) {
                for (int j=0; j<6; j++) {
                    try {
                        this.cm[i][j] = cartes.tirer_carte();
                    } catch (Exception ex) {
                        Logger.getLogger(Plateau.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

}
