package Vue;

import java.util.*;
import java.util.Observer.java_util_Observer;
import Modele.ModeleObservable;


/**
 * Class VueType
 */
abstract public class VueType implements java_util_Observer {

  //
  // Fields
  //

  private String nom;
  private Modele.ModeleObservable obj;
  
  //
  // Constructors
  //
  public VueType () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nom
   * @param newVar the new value of nom
   */
  private void setNom (String newVar) {
    nom = newVar;
  }

  /**
   * Get the value of nom
   * @return the value of nom
   */
  private String getNom () {
    return nom;
  }

  /**
   * Set the value of obj
   * @param newVar the new value of obj
   */
  private void setObj (Modele.ModeleObservable newVar) {
    obj = newVar;
  }

  /**
   * Get the value of obj
   * @return the value of obj
   */
  private Modele.ModeleObservable getObj () {
    return obj;
  }

  //
  // Other methods
  //

  /**
   * @param        nom
   * @param        obj
   */
  public void VueType(String nom, Modele.ModeleObservable obj)
  {
      this.nom = nom;
     this.obj = obj;
    this.obj.addObserver(this);
  }


  /**
   * @return       String
   */
  public String getNom()
  {
  }


  /**
   * @return       Modele.ModeleObservable
   */
  public Modele.ModeleObservable getObj()
  {
  }


}
