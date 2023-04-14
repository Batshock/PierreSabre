package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation = 0;
	public Yakuza(String nom, String clan, String boissonPref, int argent) {
		super(nom,boissonPref,argent);
		this.clan = clan;
	}
	public void extorquer(Commercant victime) {
		int gain = victime.getArgent();
		reputation += 1;
		gagnerArgent(gain);
		victime.seFaireExtorquer();
		parler("J'ai piqué les "+gain+" sous de "+victime.getNom()
				+", ce qui me fait "+getArgent()
				+" sous dans ma poche. Hi ! Hi !");
	}
}
