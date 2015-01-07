package vue;
import modele.ModeleObservable;

public abstract class TexteVue extends VueType {

  public TexteVue () { };

  abstract public String toString();

  public TexteVue(String nom, modele.ModeleObservable obj){
    super(nom, obj);
  }


  /**
   */
  public void update(){
    System.out.println("----{" + getNom()/*super.nom*/ + "}------");
    System.out.println(this.toString());
    System.out.println("--------------------");
  }


}
