package histoire;

import personnages.Commercant;
import personnages.Humain;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain prof = new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.parler("J'ai "+prof.getArgent()+" sous en poche. "
				+ "Je vais pouvoir m'offrir une boisson à 12 sous");
		prof.acheter(12);
		prof.boire();
		prof.parler("J'ai "+prof.getArgent()+" sous en poche. "
				+ "Je vais pouvoir m'offrir un jeu à 2 sous");
		prof.acheter(2);
		prof.parler("Je n'ai plus que "+prof.getArgent()+" sous en poche. "
				+ "Je ne peux même pas m'offrir un kimono à 50 sous.");
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoirArgent(15);
		marco.boire();
		Yakuza yaku = new Yakuza("Yaku Le Noir", "Warsong", "sake", 30);
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, ne serait-ce pas "
				+ "un faible marchand qui passe par-là ?");
		yaku.parler(marco.getNom()+", si tu tiens à la vie, "
				+ "donne moi ta bourse !");
		yaku.extorquer(marco);
	}

}
