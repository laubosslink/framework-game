package Modele;

import java.util.*;


/**
 * Class PartieModele
 */
public class PartieModele {

  //
  // Fields
  //

  private boolean estFinit;
  private Modele.PlateauModele p;
  private Modele.JoueurModele joueurCourrant = null;
  private list<Modele:JoueurModele> l;
  
  //
  // Constructors
  //
  public PartieModele () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of estFinit
   * @param newVar the new value of estFinit
   */
  private void setEstFinit (boolean newVar) {
    estFinit = newVar;
  }

  /**
   * Get the value of estFinit
   * @return the value of estFinit
   */
  private boolean getEstFinit () {
    return estFinit;
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

  /**
   * Set the value of joueurCourrant
   * @param newVar the new value of joueurCourrant
   */
  private void setJoueurCourrant (Modele.JoueurModele newVar) {
    joueurCourrant = newVar;
  }

  /**
   * Get the value of joueurCourrant
   * @return the value of joueurCourrant
   */
  private Modele.JoueurModele getJoueurCourrant () {
    return joueurCourrant;
  }

  /**
   * Set the value of l
   * @param newVar the new value of l
   */
  private void setL (list<Modele:JoueurModele> newVar) {
    l = newVar;
  }

  /**
   * Get the value of l
   * @return the value of l
   */
  private list<Modele:JoueurModele> getL () {
    return l;
  }

  //
  // Other methods
  //

  /**
   * @param        p
   */
  public void PartieModele(Modele.PlateauModele p)
  {
    this.l = new ArrayList<>();
    this.p = p;
    this.joueurCourrant = null;
  }


  /**
   * @param        jm
   */
  public void ajouterJoueur(Modele.JoueurModele jm)
  {
    this.l.add(jm);
  }


  /**
   * @return       list<Modele:JoueurModele>
   */
  public list<Modele:JoueurModele> getJoueurs()
  {
    return this.l;
  }


  /**
   * @return       Modele.PlateauModele
   */
  public Modele.PlateauModele getPlateau()
  {
    return this.p;
    
  }


  /**
   * @return       Modele.JoueurModele
   */
  public Modele.JoueurModele getJoueurCourrant()
  {
    return joueurCourrant;
  }


  /**
   */
  public void prochainJoueur()
  {
     if(this.l.size() == 0)
                return;
            
            if(this.joueurCourrant == null)
                this.joueurCourrant = this.l.get(0);
            
            int i=0;
            
            for(JoueurModele jm : this.l)
            {
                if(joueurCourrant == jm)
                    if(i == this.l.size()-1)
                        joueurCourrant = this.l.get(0);
                    else
                        joueurCourrant = this.l.get(i+1);
                
                i++;
            }
        }
  }


  /**
   * @return       boolean
   */
  public boolean getEstFini()
  {
  }


  /**
   * @return       list<Modele:JoueurModele>
   */
  public list<Modele:JoueurModele> getModeleJoueur()
  {
  }


}
