package Vue;
import Modele.ModeleObservable;


/**
 * Class TexteVue
 */
abstract public class TexteVue extends undef, VueType {

  //
  // Fields
  //

  
  //
  // Constructors
  //
  public TexteVue () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  //
  // Other methods
  //

  /**
   * @return       String
   */
  abstract public String toString();


  /**
   * @param        nom
   * @param        obj
   */
  public void TexteVue(String nom, Modele.ModeleObservable obj)
  {
    super(nom, obj);
  }


  /**
   */
  public void update()
  {
    System.out.println("----{" + super.nom + "}------");
    System.out.println(this.toString());
    System.out.println("--------------------");
  }


}
