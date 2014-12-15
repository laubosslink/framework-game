package entree.classe.derive;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Hashtable;
import java.util.StringTokenizer;

public class Souris implements Entree, MouseListener{
	
	MouseEvent mouseEvent;
	private int _nbButtons = 3;
	Hashtable<Integer, String> buttonActionTab = new Hashtable<Integer, String>();
	private String action = "";
	
	public Souris(int n){
		_nbButtons = n;
	}
	
	public void assignCharacterToButton(String characters){   //les characters séparés par des espaces au sein d'une chaine
		int i = 0;
		StringTokenizer st = new StringTokenizer(characters);
		while (st.hasMoreTokens()) {
			this.buttonActionTab.put(i, st.nextToken());
			i++;
		}
	}
	
	public String recoitDonnees(String donnees) {
		StringTokenizer st = new StringTokenizer(donnees);
		this._nbButtons = st.nextToken().indexOf(0);
		this.action = st.nextToken();
		return "Mouse with "+3+" buttons"+" where actions are { "+action+"}";
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("The mouse "+e+" clicked "+e.getClickCount()+" time(s)");
	}

	public void mouseEntered(MouseEvent e) {		
		System.out.println("The mouse "+e+" entered");
	}

	public void mouseExited(MouseEvent e) {
		System.out.println("The mouse "+e+" exited");
	}

	public void mousePressed(MouseEvent e) {
		System.out.println("The button "+e.getButton()+" was pressed");
	}

	public void mouseReleased(MouseEvent e) {
		System.out.println("The button "+e.getButton()+" was released");
	}

	public String executeAction(char c) {
		
		return buttonActionTab.get(c);
	}

}
