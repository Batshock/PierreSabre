package personnages;

public class Commercant extends Humain {
	private static String boissonPref = "th�";
	
	public Commercant(String nom, int argent) {
		super(nom,boissonPref,argent);
	}
	public void recevoirArgent(int gain) {
		super.gagnerArgent(gain);
		parler(gain+" sous ! Je te remercie g�n�reux donateur !");
	}
	public void seFaireExtorquer() {
		super.perdreArgent(getArgent());
		parler("J'ai tout perdu ! Le monde est trop injuste...");
	}
}
