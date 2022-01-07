package de.telekom.sea7;

public class BierVorlage {

	private int preis = 200; // 400
	private int netto = 186; // ?
	private int steuer = 14; // ?
	private int steuersatz = 7; // Steuersatz in % /100

	public void preisanpassen(int preisanpassung) {
	preis = preis * preisanpassung;
	preisrechnen();
	}

	private void preisrechnen() {
	//	System.out.println("preis+ " + (1 - ((float) steuersatz / 100)));
	netto = (int) (preis * (1 - ((float) steuersatz / 100))); // 7 / 100 = 0 .07
	//  System.out.println("netto: " + netto);
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

}
