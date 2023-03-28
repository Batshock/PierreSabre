package personnages;

public class Humain {
	private String nom;
	private String boissonPref;
	private int argent;
	
	public Humain(String nom, String boissonPref, int argent) {
		this.nom = nom;
		this.boissonPref = boissonPref;
		this.argent = argent;
	}
	public String getNom() {
		return nom;
	}
	public int getArgent() {
		return argent;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + " »");
	}
	private String prendreParole() {
		return nom+" : ";
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boissonPref);
	}
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonPref+" ! GLOUPS !");
	}
	public void gagnerArgent(int gain) {
		argent += gain;
	}
	public void perdreArgent(int perte) {
		argent -= perte;
	}
}
