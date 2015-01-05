package Controleur;

import java.util.*;
import Modele.ModeleObservable;
import Vue.VueType;


/**
 * Class ControleurTemplate
 */
abstract public class ControleurTemplate implements Action {

  //
  // Fields
  //

  private Modele.ModeleObservable m;
  private Vue.VueType v;
  
  //
  // Constructors
  //
  public ControleurTemplate () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of m
   * @param newVar the new value of m
   */
  private void setM (Modele.ModeleObservable newVar) {
    m = newVar;
  }

  /**
   * Get the value of m
   * @return the value of m
   */
  private Modele.ModeleObservable getM () {
    return m;
  }

  /**
   * Set the value of v
   * @param newVar the new value of v
   */
  private void setV (Vue.VueType newVar) {
    v = newVar;
  }

  /**
   * Get the value of v
   * @return the value of v
   */
  private Vue.VueType getV () {
    return v;
  }

  //
  // Other methods
  //

  /**
   * @param        m
   */
  public void ControleurTemplate(Modele.ModeleObservable m)
  {
    this.m = m;
    this.v = null;
  }


  /**
   * @return       Modele.ModeleObservable
   */
  public Modele.ModeleObservable getModeleObservable()
  {
	return m;
  }


  /**
   * @return       Vue.VueType
   */
  public Vue.VueType getVueType()
  {
	return v;
  }


  /**
   */
  public void execute()
  {
  }


  /**
   * @return       boolean
   */
  public boolean estValide()
  {
	return false;
  }


}
