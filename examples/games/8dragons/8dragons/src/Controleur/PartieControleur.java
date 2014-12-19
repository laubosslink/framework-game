package Controleur;

import java.util.*;
import Modele.PartieModele;
import Vue.VueType;


/**
 * Class PartieControleur
 */
abstract public class PartieControleur extends ControleurTemplate {

  //
  // Fields
  //

  private List<Controleur::Action> l;


//
  // Constructors
  //
  public PartieControleur () { };
  
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
  private void setL (List<Controleur::Action> newVar) {
    l = newVar;
  }

  /**
   * Get the value of l
   * @return the value of l
   */
  private list<Controleur::Action> getL () {
    return l;
  }

  //
  // Other methods
  //

  /**
   * @param        m
   * @param        v
   */
  public PartieControleur(Modele.PartieModele m, Vue.VueType v)
  {
    super(m, v);
    this.l = new ArrayList<>();
  }


  /**
   * @param        a
   */
  public void ajouterAction(Controleur.Action a)
  {
    this.l.add(a);
  }


  /**
   */
  abstract public void lancer();


  /**
   */
  abstract public void estFinit();


  /**
   * @return       list<Controleur::Action>
   */
  public list<Controleur::Action> getControleurAction()
  {
  }


}
