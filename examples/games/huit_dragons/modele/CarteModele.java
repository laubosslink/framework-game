package games.huit_dragons.modele;

import Modele.MaterielModele;

public abstract class CarteModele extends MaterielModele {

    String type;

    public String getType() {
        return type;
    }

    public CarteModele(String type) {
        super();
        this.type = type;
    }
}
