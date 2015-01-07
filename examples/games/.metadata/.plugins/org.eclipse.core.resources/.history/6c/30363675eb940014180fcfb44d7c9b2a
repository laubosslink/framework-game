package Modele;

import java.util.*;
import java.util.Observable.java_util_Observable;


/**
 * Class JoueurModele
 */
abstract public class JoueurModele extends java_util_Observable, ModeleObservable {

  //
  // Fields
  //

  private List<Modele::MaterielModele> m;
  private String nom;
  private Modele.PlateauModele p;
  
  //
  // Constructors
  //
  public JoueurModele () { };
  
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
  private void setM (List<Modele::MaterielModele> newVar) {
    m = newVar;
  }

  /**
   * Get the value of m
   * @return the value of m
   */
  private List<Modele::MaterielModele> getM () {
    return m;
  }

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
   * Set the value of p
   * @param newVar the new value of p
   */
  private void setP (Modele.PlateauModele newVar) {
    p = newVar;
  }

  /**
   * Get the value of p
   * @return the value of p
   */
  private Modele.PlateauModele getP () {
    return p;
  }

  //
  // Other methods
  //

  /**
   * @param        nom
   * @param        p
   */
  public void JoueurModele(String nom, Modele.PlateauModele p)
  {
    this.nom = nom;
     this.m = new ArrayList<>();
     this.p = p;
  }


  /**
   * @param        nom
   * @param        m
   */
  public void JoueurModele(String nom, List<Modele::MaterielModele> m)
  {
    this.nom=nom;
    this.m=m;
  }


  /**
   * @param        m
   */
  public void ajouterMateriel(Modele.MaterielModele m)
  {
    this.add(m);
  }


  /**
   * @return       Modele.PlateauModele
   */
  public Modele.PlateauModele getPlateau()
  {
    return this.p;
  }


  /**
   * @return       String
   */
  public String getNom()
  {
    return this.nom;
  }


  /**
   * @return       List<Modele::MaterielModele>
   */
  public List<Modele::MaterielModele> getModel()
  {
  }


}
