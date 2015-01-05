package Vue;

import java.util.*;
import Controleur.Action;


/**
 * Class EntreeTexte
 */
abstract public class EntreeTexte {

  //
  // Fields
  //

  private String label;
  
  //
  // Constructors
  //
  public EntreeTexte () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of label
   * @param newVar the new value of label
   */
  private void setLabel (String newVar) {
    label = newVar;
  }

  /**
   * Get the value of label
   * @return the value of label
   */
  private String getLabel () {
    return label;
  }

  //
  // Other methods
  //

  /**
   * @param        label
   */
  public void EntreeTexte(String label)
  {
    this.label=label;
  }


  /**
   * @return       String
   * @param        label_suffixe
   */
  public String input(String label_suffixe)
  {
    System.out.println(label + " (" + label_suffixe + "): ");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    String input = "";
    try{
    input = in.readLine();
    } catch (IOException ex) {
    Logger.getLogger(EntreeTexte.class.getName()).log(Level.SEVERE, null, ex);
    }
    /*
            try {
                in.close();
            } catch (IOException ex) {
                Logger.getLogger(EntreeTexte.class.getName()).log(Level.SEVERE, null, ex);
            }*/
    
    return input
    
  }


  /**
   * @return       String
   */
  public String input()
  {
    return this.input("");
  }


}
