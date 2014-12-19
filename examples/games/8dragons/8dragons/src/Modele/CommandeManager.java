package Modele;


/**
 * Class CommandeManager
 */
public class CommandeManager {

  //
  // Fields
  //

  private Modele.Commande derniereCommande;
  
  //
  // Constructors
  //
  public CommandeManager () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of derniereCommande
   * @param newVar the new value of derniereCommande
   */
  private void setDerniereCommande (Modele.Commande newVar) {
    derniereCommande = newVar;
  }

  /**
   * Get the value of derniereCommande
   * @return the value of derniereCommande
   */
  private Modele.Commande getDerniereCommande () {
    return derniereCommande;
  }

  //
  // Other methods
  //

  /**
   * @param        c
   */
  public void executerCommande(Modele.Commande c)
  {
  }


  /**
   * @return       boolean
   */
  public boolean peutRecommencer()
  {
	return false;
  }


  /**
   */
  public void undo()
  {
  }


}
