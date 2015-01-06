package games.huit_dragons.modele;

import Modele.MaterielModele;

public abstract class CarteModele extends MaterielModele {

    private boolean visible;

    public CarteModele() {
        super();
        this.visible = false;
    }
    
    public void devientVisible(){
        this.visible = true;
    }
    
    public void devientNonVisible(){
        this.visible = false;
    }
    
    public boolean estVisible(){
        return this.visible;
    }
            
}
