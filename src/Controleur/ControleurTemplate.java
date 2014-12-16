package Controleur;

public abstract class ControleurTemplate {
    protected Modele.ModeleObservable m;
    protected Vue.VueType v;
    
    public ControleurTemplate(Modele.ModeleObservable m)
    {
        this.m = m;
        this.v = null;
    }
    
    public ControleurTemplate(Modele.ModeleObservable m, Vue.VueType v)
    {
        this.m = m;
        this.v = v;
    }
}
