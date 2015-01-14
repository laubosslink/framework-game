package games.hyene.modele;

import Modele.MaterielModele;
import Modele.PlateauModele;
import java.util.*;

public class Plateau extends PlateauModele implements Observer {

    protected Case[] plateau;
    protected Pion[] pions;
    protected List<Taba> tabas;

    public Plateau() {
        super();
        this.plateau = new Case[30];

        for (int i = 0; i < this.plateau.length; i++) {
            this.plateau[i] = null;
        }

        pions = new Pion[4];
        tabas = new ArrayList<Taba>();
        
        setChanged();
        notifyObservers();
    }

    public int getLength(){
        return plateau.length;
    }
    
    public MaterielModele[] getPlateau(){
        return this.plateau;
    }
    
    public Pion[] getPions(){
        return this.pions;
    }
    
    @Override
    public void update(Observable arg0, Object arg1) {
        this.setChanged();
        this.notifyObservers();
    }

}
