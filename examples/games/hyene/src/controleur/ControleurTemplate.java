package controleur;
import modele.*;
import vue.*;

public abstract class ControleurTemplate {
	
	private modele.ModeleObservable m;
	private vue.VueType vType;
	
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
	
}
