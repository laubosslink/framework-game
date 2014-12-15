package entree.classe.derive;

public interface Entree {
	
        Joueur[] _joueurs = new Joueur[2];
	public String recoitDonnees(String donnees);
	public String executeAction(char c);

}
