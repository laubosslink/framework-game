package games.hyene.modele;

import Modele.PlateauModele;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Plateau extends PlateauModele implements Observer {

    protected Case[] plateau;
    protected Pion[] pions;
    protected List<Taba> tabas;

    public Plateau() {
        this.plateau = new Case[30];

        for (int i = 0; i < this.plateau.length; i++) {
            this.plateau[i] = null;
        }

        pions = new Pion[4];
        tabas = new ArrayList<Taba>();

        notifyObservers();
    }

    @Override
    public void update(Observable arg0, Object arg1) {
        this.setChanged();
        this.notifyObservers();
    }

}
