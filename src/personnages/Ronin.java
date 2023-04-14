package personnages;

public class Ronin extends Humain {
	public Ronin(String nom, String boissonPref, int argent) {
		super(nom,boissonPref,argent);
	}
	public void donner(Commercant beneficiaire) {
		int gain = getArgent()/10;
		parler(beneficiaire.getNom()+" prend ces "+gain+" sous.");
		beneficiaire.recevoirArgent(gain);
	}
}
