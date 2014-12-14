package entree.classe.derive;

public class Joueur{

	private int _nbPlayers;
	private String action;
	
	public Joueur(int n){
		_nbPlayers = n;
	}
	
	public String play(int n){
		return "Player n° "+n+" plays "+action;
	}
	
    public String getEtat(){
	return _etat;
    }
    public int getScore(){
	return _score;
    }
    public setEtat(int[] positions){
	
    }

}
