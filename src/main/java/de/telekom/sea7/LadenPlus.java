package de.telekom.sea7;

public class LadenPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Beispiele int i = 5; // Zahl
		// Beispiele int j = 6;

		// Beispiel String text = new String("Hallo"); // <- das macht Java für dich, wenn du String tet = "Hallo" schreibst

		BierVorlage altbier = new BierVorlage(); // Bier ( Preis) Instanz von BierVorlage, da muss Static von Bier überall raus
		BierVorlage bockbier = new BierVorlage();

		String ort = "Hamburg"; // Laden liegt in

		altbier.setPreis(75);

		altbier.preisanpassen(2); // Preisverdopplung

// Bier.getPreis() = 75;

		System.out.println("Verkauf in " + ort);
		System.out.println("Verkaufspreis  in Cent ist " + altbier.getPreis());
		System.out.println("Steuer  in Cent bei " + altbier.getSteuer());

	}

}
