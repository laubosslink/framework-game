package games.huit_dragons.modele;

import Modele.PlateauModele;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Plateau extends PlateauModele {

    Jeton[] jetons;
    boolean version_longue;

    public Plateau(boolean longue) {
        super();
        jetons = new Jeton[4];
        Cartes cartes = new Cartes(longue);
        CarteModele tmp;
        List<CarteModele> liste = new ArrayList<>();

        if (longue)//Version longue
        {
            for (int i = 0; i < (7 * 6); i++) {
                try {
                    tmp = cartes.tirer_carte();

                    liste.add(tmp);
                } catch (Exception ex) {
                    Logger.getLogger(Plateau.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else//Version courtes
        {
            for (int i = 0; i < (6 * 6); i++) {
                try {
                    tmp = cartes.tirer_carte();

                    liste.add(tmp);
                } catch (Exception ex) {
                    Logger.getLogger(Plateau.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
