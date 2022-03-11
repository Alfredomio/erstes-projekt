package de.telekom.sea7;

public class IntegerListe {
	// private int liste[] = new int[5];
	private int[] liste = new int[5];

	public IntegerListe() {
		for (int i = 0; i < liste.length; i++) {
			liste[i] = i;
		}
		// System.out.println("Listenanzeige: " + liste);
	}

	// liste[5] = 7;

	public void setliste(int position, int value) {
		position--;
		liste[position] = value;
	}

	// ... = liste[5];

	public int getliste(int position) {
		if ((position <= 0) && (liste.length >= position)) {
			System.out.println("Ungültige Eingabe von " + position);
			return 0;
		} else {
			position--;
			return liste[position];
		}
	}

	public int getListenLaenge() {

		return liste.length;
		// return this.liste.length;
	}

	public int getSumliste() {
		int sum = 0;
		for (int i = 0; i < liste.length; i++) {
			sum = sum + liste[i];
		}
		return sum;
	}

	public String toString() {
		String ausgabe = "";
		for (int i = 0; i < liste.length; i++) {
			ausgabe += liste[i] + ", ";
		}
		return ausgabe;
	}

	public void setListenLaenge(int laenge) {
		int[] neueListe = new int[laenge];
		if (liste.length < neueListe.length) { // alte Liste ist kürzer als neue -> alte Liste passt in neue

			for (int i = 0; i < liste.length; i++) {
				neueListe[i] = liste[i];
			}
		} else { // alte Liste ist länger als neue -> Anzahl Elemente wie neue Liste
			for (int i = 0; i < neueListe.length; i++) {
				neueListe[i] = liste[i];
			}
		}
		liste = neueListe;

	}

	public void setListeClear() {
		for (int i = 0; i < liste.length; i++) {
			liste[i] = 0;
		}
	}

	public void setListeRandom() {
		for (int i = 0; i < liste.length; i++) {
			liste[i] = (int) (Math.random() * 10);
		}

	}
}
