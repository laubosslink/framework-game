package modele;

public abstract class Pion  extends MaterielModele{
	
	private int _indice;
	private String state = "mother";
	
	public void deplacer(int f) {
		_indice += f;
	}
	
	public void setState(String s){
		state = s;
	}
	
	public String getState(){
		return state;
	}

}
