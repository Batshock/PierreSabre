package histoire;

import personnages.Humain;

public class HistoireTP4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Humain prof = new Humain("Prof","kombucha",54);
		prof.direBonjour();
		prof.parler("J'ai "+prof.getArgent()+" sous en poche. "
				+ "Je vais pouvoir m'offrir une boisson � 12 sous");
		prof.acheter(12);
		prof.boire();
		prof.parler("J'ai "+prof.getArgent()+" sous en poche. "
				+ "Je vais pouvoir m'offrir un jeu � 2 sous");
		prof.acheter(2);
		prof.parler("Je n'ai plus que "+prof.getArgent()+" sous en poche. "
				+ "Je ne peux m�me pas m'offrir un kimono � 50 sous.");
	}

}
