package Modele;

import java.util.*;
import java.util.Observable;


/**
 * Class PlateauModele
 */
abstract public class PlateauModele extends ModeleObservable {



  private List<MaterielModele> l;
  

  


  /**
   * Set the value of l
   * @param newVar the new value of l
   */
  private void setL (List<MaterielModele> newVar) {
    l = newVar;
  }



  /**
   */
  public PlateauModele()
  {
    this.l = new ArrayList<>();
  }


  /**
   * @return       List<Modele::MaterielModele>
   */
  public List<MaterielModele> getMateriel()
  {
    return this.l;
  }


}
