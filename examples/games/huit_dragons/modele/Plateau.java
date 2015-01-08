package games.huit_dragons.modele;

import Modele.PlateauModele;
import java.util.*;

public class Plateau extends PlateauModele implements Observer {

    private boolean partie_longue;
    protected CarteModele[][] cm;
    protected Jeton[] jetons; // ??
    
    public Plateau(boolean partie_longue) {
        super();
        this.partie_longue = partie_longue;
        
        jetons = new Jeton[4];
        
        Cartes cartes = new Cartes(partie_longue);

        if (partie_longue)//Version longue
        {
            this.cm = new CarteModele[7][6];
            
            for (int i = 0; i < 7; i++) {
                for (int j=0; j<6; j++) {
                    this.cm[i][j] = cartes.tirer_carte();
                    this.cm[i][j].addObserver(this);
                }
            }
            
        } else//Version courtes
        {
            for (int i = 0; i < 6; i++) 
            {
                for (int j=0; j<6; j++) 
                {
                    this.cm[i][j] = cartes.tirer_carte();
                    this.cm[i][j].addObserver(this);
                }
            }
        }
    }
    
    public CarteModele[][] getCartes()
    {
        return this.cm;
    }
    
    public void retirerCarteDuPlateau(CarteModele cm)
    {
        if(partie_longue)
        {
            for (int i = 0; i < 7; i++) 
            {
                for (int j=0; j<6; j++) 
                {
                    if(this.cm[i][j] == cm)
                        this.cm[i][j] = null;
                }
            }
        } else 
        {
            for (int i = 0; i < 6; i++) 
            {
                for (int j=0; j<6; j++) 
                {
                    if(this.cm[i][j] == cm)
                        this.cm[i][j] = null;
                }
            }
        }
    }

    @Override
    public void update(Observable o, Object o1) 
    {
        this.setChanged();
        this.notifyObservers();
    }

}
