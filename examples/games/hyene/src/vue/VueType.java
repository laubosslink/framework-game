package vue;
import java.util.*;
import modele.ModeleObservable;



public abstract class VueType implements java.util.Observer {


  private String nom;
  private modele.ModeleObservable obj;

  public VueType () { };

  public void setNom(String newVar) {
    nom = newVar;
  }

  public String getNom() {
    return nom;
  }

  public void setObj(modele.ModeleObservable newVar) {
    obj = newVar;
  }

  public modele.ModeleObservable getObj() {
    return obj;
  }

  public VueType(String nom, modele.ModeleObservable obj){
      this.nom = nom;
      this.obj = obj;
      this.obj.addObserver(this);
  }




}

