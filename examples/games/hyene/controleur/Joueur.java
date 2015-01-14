package games.hyene.controleur;

import Controleur.Action;
import Modele.JoueurModele;
import games.hyene.modele.Pion;
import games.hyene.modele.PionJoueur;
import games.hyene.modele.Batonnet;
import games.hyene.modele.Taba;
import games.hyene.vue.SaisieJoueur;
import games.hyene.modele.Case;
import games.hyene.modele.PionHyene;
import games.hyene.modele.Plateau;
import java.util.Scanner;

public class Joueur extends Controleur.ControleurTemplate implements Action{
    
    private SaisieJoueur s;
    private Plateau plateau;

    public Joueur(games.hyene.modele.Joueur m, SaisieJoueur s) {
        super(m);
        this.s = s;
        this.plateau = ((Plateau) ((games.hyene.modele.Joueur) this.m).getPlateau());
    }

    @Override
    public boolean estPossible() {
        return true;
    }

    @Override
    public void execute() {
        int etat = 0;                   
        Pion pion = new PionJoueur();
        Batonnet batonnet1 = new Batonnet();
        Batonnet batonnet2 = new Batonnet();
        Batonnet batonnet3 = new Batonnet();
            
        Taba taba = new Taba();
        int oui;
        int resultatLancer = 0;                      
        
        oui = Integer.parseInt(this.s.input("Lancer les 3 batonnets?"));
        if(oui == 1){
            resultatLancer = batonnet1.lancer() + batonnet2.lancer() + batonnet3.lancer();     
            int l=Integer.parseInt(this.s.input("Résultat des 3 lancers : "+resultatLancer));
            
            switch(resultatLancer){
                case 1:
                    taba.incNbTabas(1);
                    break;
                case 2:
                    taba.incNbTabas(2);
                    break;
                case 3:
                    taba.incNbTabas(3);
                    break;
                case 0:
                    taba.incNbTabas(0);
                    break;
            }
        }
        oui = Integer.parseInt(this.s.input("Voulez-vous vous deplacer?"));
        if(oui == 1){
            
            if(pion.getPosition() == 0 && pion.getNbTabas() > 0){
                pion.accNbTabas(-1);
                if(etat == 1){
                    etat ++;
                    pion = new PionHyene();
                }
            }
            if(pion.getPosition() == plateau.getLength()-1){
                etat ++;
                pion.accNbTabas(-4);
            }
            if(pion.getPosition() + resultatLancer > plateau.getLength()-1){
                pion.deplacerPion( -(pion.getPosition() + resultatLancer - (plateau.getLength()-1)));
                pion.accNbTabas( -(pion.getPosition() + resultatLancer - (plateau.getLength()-1)) );
            }
            
            pion.deplacerPion(resultatLancer);
            pion.accNbTabas(-resultatLancer);                        
            
        }
        else{
            pion.accNbTabas(resultatLancer);
            this.s.input("rentre passssssssssssssssssssss");
        }        
        
    }

    @Override
    public boolean estValide() {
        return true;
    }
    
}
