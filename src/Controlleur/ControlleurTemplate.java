package Controlleur;

public abstract class ControlleurTemplate {
    protected Modele.ModeleObservable m;
    protected Vue.VueType v;
    
    public ControlleurTemplate(Modele.ModeleObservable m, Vue.VueType v)
    {
        this.m = m;
        this.v = v;
    }
}
