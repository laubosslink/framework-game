package Vue;

import java.util.*;


/**
 * Class Affichage
 */
abstract public class Affichage {

  //
  // Fields
  //

  private List<Vue::VueType> l;
  
  //
  // Constructors
  //
  public Affichage () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of l
   * @param newVar the new value of l
   */
  private void setL (List<Vue::VueType> newVar) {
    l = newVar;
  }

  /**
   * Get the value of l
   * @return the value of l
   */
  private List<Vue::VueType> getL () {
    return l;
  }

  //
  // Other methods
  //

  /**
   * @param        v
   */
  public void ajouterVue(Vue.VueType v)
  {
    this.l.add(v);
  }


  /**
   */
  public void Affichage()
  {
    this.l = new ArrayList<>();
  }


}
