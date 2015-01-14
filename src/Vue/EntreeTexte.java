package Vue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EntreeTexte {
    
    private String label;
    
    public EntreeTexte(String label) 
    {
        this.label = label;
    }
    
    public String input(String label_suffixe)
    {
        
        System.out.println(label + " (" + label_suffixe + "): ");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = "";

        try {
            input = in.readLine();
        } catch (IOException ex) {
            Logger.getLogger(EntreeTexte.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return input;
    }
    
    public String input()
    {
        return this.input("");
    }
    
}
