package Controleur;

public interface Action {
    public boolean estPossible();
    public void execute();
    public boolean estValide();
}
