package entree.classe.derive;

import java.util.Hashtable;
import java.util.StringTokenizer;
import java.awt.event.*;

public class Clavier implements Entree{
	
	private char _type = 'a';      //azerty ou qwerty
	private int _keyNumber;
	private char _pressedKey;
	Hashtable<Character, String> keyActionTab = new Hashtable<Character, String>();
	
	public Clavier(char t, int kN){
		_type = t;
		_keyNumber = kN;
	}
	
	public String executeAction(char c){
		return keyActionTab.get(c);		
	}
	
	public String keyPressed(char k){
		if(this.keyActionTab.get(k) != null)
			System.out.println(keyActionTab.get(k));
		
		return "The key "+k+" has been pressed";
	}
	
	public void fillKeyTab(String actions){ 	//toutes les actions permises sparées par des virgules(ou des espaces)
		int i = 0;
		StringTokenizer st = new StringTokenizer(actions);
		while (st.hasMoreTokens()) {
			this.keyActionTab.put('i', st.nextToken());
			i++;
		}
	}
	
	public String recoitDonnees(String donnees) {
		StringTokenizer st = new StringTokenizer(donnees);
		this._type = st.nextToken().charAt(0);
		this._keyNumber = st.nextToken().indexOf(0);
		
		return "keyboard type : "+_type+" with "+_keyNumber+" keys";
	}

}
