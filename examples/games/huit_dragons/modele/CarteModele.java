package games.huit_dragons.modele;

import Modele.MaterielModele;

public abstract class CarteModele extends MaterielModele {

    private boolean visible;
    private boolean jeton;

    public CarteModele() {
        super();
        this.visible = false;
        this.jeton = false;
    }
    
    public void devientVisible(){
        this.visible = true;
        this.setChanged();
        this.notifyObservers();
    }
    
    public void devientNonVisible(){
        this.visible = false;
        this.setChanged();
        this.notifyObservers();
    }
    
    public boolean estVisible(){
        return this.visible;
    }
    
    public void metJeton(){
        this.jeton = true;
    }
    
    public void enleverJeton(){
        this.jeton = false;
    }
    
    public boolean jetonPresent(){
        return this.jeton;
    }
            
}
