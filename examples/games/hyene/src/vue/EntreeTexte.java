package vue;

import java.util.*;
import controleur.Action;

abstract public class EntreeTexte {

  private String label;
  
  public EntreeTexte () { };

  public void setLabel (String newVar) {
    label = newVar;
  }

  public String getLabel () {
    return label;
  }

  public EntreeTexte(String label){
    this.label=label;
  }

  public String input(String label_suffixe){
    System.out.println(label + " (" + label_suffixe + "): ");
    Scanner sc = new Scanner(System.in);
    String input = sc.nextLine();
    return input;
  }

  public String input(){
    return this.input("");
  }


}
