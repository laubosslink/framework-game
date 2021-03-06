package games.huit_dragons.modele;

import Modele.MaterielModele;
import java.util.*;

public class Cartes extends MaterielModele {

    ArrayList<CarteModele> tas;
    boolean version_longue;

    public Cartes(boolean longue) {
        tas = new ArrayList<>();
        
        //Création des cartes
        if (longue) {
            ajoutdragons();
            ajouteffets();
        } else {
            ajoutdragons_court();
            ajouteffets_court();

        }
    }

    private void ajoutdragons_court() {
        CarteModele tmp;
        for (int i = 0; i < 3; i++)//rouge
        {
            tmp = new CarteDragonModele(Membre.griffe, Couleur.rouge);
            tas.add(tmp);
            tmp = new CarteDragonModele(Membre.patte_arriere, Couleur.rouge);
            tas.add(tmp);
            tmp = new CarteDragonModele(Membre.queue, Couleur.rouge);
            tas.add(tmp);
            tmp = new CarteDragonModele(Membre.tete, Couleur.rouge);
            tas.add(tmp);
        }
        
        for (int i = 0; i < 2; i++)//vert
        {
            tmp = new CarteDragonModele(Membre.griffe, Couleur.vert);
            tas.add(tmp);
            tmp = new CarteDragonModele(Membre.patte_arriere, Couleur.vert);
            tas.add(tmp);
            tmp = new CarteDragonModele(Membre.queue, Couleur.vert);
            tas.add(tmp);
            tmp = new CarteDragonModele(Membre.tete, Couleur.vert);
            tas.add(tmp);
        }

        //multicolore
        tmp = new CarteDragonModele(Membre.griffe, Couleur.multicolore);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.patte_arriere, Couleur.multicolore);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.queue, Couleur.multicolore);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.tete, Couleur.multicolore);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.tete, Couleur.multicolore);//Pour la carte bonus
        tas.add(tmp);

        //argent
        tmp = new CarteDragonModele(Membre.griffe, Couleur.argent);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.patte_arriere, Couleur.argent);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.queue, Couleur.argent);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.tete, Couleur.argent);
        tas.add(tmp);

    }

    private void ajouteffets_court() {
        CarteModele tmp;

        for (int i = 0; i < 3; i++) {
            tmp = new CarteEffetModele(false, Effet.diamant);
            tas.add(tmp);
        }

        tmp = new CarteEffetModele(true, Effet.boule_de_feu);
        tas.add(tmp);

        tmp = new CarteEffetModele(true, Effet.deux_boules_de_feu);
        tas.add(tmp);

        tmp = new CarteEffetModele(true, Effet.identique);
        tas.add(tmp);

        tmp = new CarteEffetModele(false, Effet.deux_diamant);
        tas.add(tmp);

    }

    private void ajouteffets() {
        CarteModele tmp;

        for (int i = 0; i < 4; i++) {
            tmp = new CarteEffetModele(false, Effet.diamant);
            tas.add(tmp);
        }
        for (int i = 0; i < 2; i++) {
            tmp = new CarteEffetModele(true, Effet.boule_de_feu);
            tas.add(tmp);
        }

        tmp = new CarteEffetModele(true, Effet.deux_boules_de_feu);
        tas.add(tmp);

        tmp = new CarteEffetModele(true, Effet.identique);
        tas.add(tmp);

        tmp = new CarteEffetModele(false, Effet.deux_diamant);
        tas.add(tmp);

    }

    public void ajoutdragons() {
        CarteModele tmp;
        for (int i = 0; i < 3; i++)//rouge
        {
            tmp = new CarteDragonModele(Membre.griffe, Couleur.rouge);
            tas.add(tmp);
            tmp = new CarteDragonModele(Membre.patte_arriere, Couleur.rouge);
            tas.add(tmp);
            tmp = new CarteDragonModele(Membre.queue, Couleur.rouge);
            tas.add(tmp);
            tmp = new CarteDragonModele(Membre.tete, Couleur.rouge);
            tas.add(tmp);
        }
        for (int i = 0; i < 2; i++)//vert
        {
            tmp = new CarteDragonModele(Membre.griffe, Couleur.vert);
            tas.add(tmp);
            tmp = new CarteDragonModele(Membre.patte_arriere, Couleur.vert);
            tas.add(tmp);
            tmp = new CarteDragonModele(Membre.queue, Couleur.vert);
            tas.add(tmp);
            tmp = new CarteDragonModele(Membre.tete, Couleur.vert);
            tas.add(tmp);
        }
        //or
        tmp = new CarteDragonModele(Membre.griffe, Couleur.or);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.patte_arriere, Couleur.or);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.queue, Couleur.or);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.tete, Couleur.or);
        tas.add(tmp);

        //multicolore
        tmp = new CarteDragonModele(Membre.griffe, Couleur.multicolore);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.patte_arriere, Couleur.multicolore);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.queue, Couleur.multicolore);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.tete, Couleur.multicolore);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.tete, Couleur.multicolore);//Pour la carte bonus
        tas.add(tmp);

        //argent
        tmp = new CarteDragonModele(Membre.griffe, Couleur.argent);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.patte_arriere, Couleur.argent);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.queue, Couleur.argent);
        tas.add(tmp);
        tmp = new CarteDragonModele(Membre.tete, Couleur.argent);
        tas.add(tmp);
    }

    CarteModele tirer_carte() {
        int i = (int) (Math.random() * (tas.size() - 1));
        CarteModele tmp = tas.get(i);
        tas.remove(i);
        return tmp;
    }
}
