package controleur;
import modele.*;
import vue.*;

public abstract class ControleurTemplate implements Action{
	
	private modele.ModeleObservable m;
	private vue.VueType vType;
	
	public ControleurTemplate(){
		
	}
	
	public ControleurTemplate(ModeleObservable mmo , VueType vt){
		this.m = mmo;
		this.vType = vt;
	}
	
	public ModeleObservable getModeleObservable(){
		return m;
	}
	
	public VueType getVueType(){
		return vType;
	}
	
	
	public void execute(){
	}

	public boolean estValide(){
		boolean r = false;
		
		return r;
	}
	
}
