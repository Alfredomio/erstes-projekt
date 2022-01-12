package de.telekom.sea7;

public class BierVorlage {
	// aus Bier.java wurde BierVorlage.java (Modus static überall entfernt, um
	// Instanzen zu bilden)
	// die BierVorlage kann man auch als Vorlage oder Protoyp für Inststanzen
	// Objekte verstehen
	// hier den cast-Operator verwendet - siehe
	// https://www.java-tutorial.org/typecasting.html - , um int in float und zurück
	// zu wandeln.
	// Berechnung leicht optimiert
	// Ist mit Verlust der Nachkommastellen verbunden

	private int preis = 200; // 400
	private int netto = 186; // ?
	private int steuer = 14; // ?
	private int steuersatz = 7; // Steuersatz in % /100
	private String name = "Bock";

	public void preisanpassen(int preisanpassung) {
		preis = preis * preisanpassung;
		preisrechnen();
	}

	private void preisrechnen() {
		// System.out.println("preis+ " + (1 - ((float) steuersatz / 100)));
		netto = (int) (preis * (1 - ((float) steuersatz / 100))); // 7 / 100 = 0 .07
		// System.out.println("netto: " + netto);
		steuer = preis - netto;
	}

	public int getPreis() {
		return preis;
	}

	public int getSteuer() {
		return steuer;
	}

	public void setPreis(int i) {
		preis = i;
		preisrechnen();
	}

	public void setName(String nameArg) {
		// TODO Auto-generated method stub
		name = nameArg;
		
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
