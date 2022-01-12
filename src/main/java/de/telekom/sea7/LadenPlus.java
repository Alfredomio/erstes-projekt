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
		altbier.setName("Alt");
		altbier.getName();

		altbier.preisanpassen(2); // Preisverdopplung
		
		bockbier.setPreis(400);
		bockbier.setName("Bock");
		
		BierVorlage[] unsereBiere = new BierVorlage[2];
		unsereBiere[0] = altbier;
		unsereBiere[1] = bockbier;
		
		for(int i = 0; i < unsereBiere.length ;i++){
			float preis = (float) unsereBiere[i].getPreis() / 100;
			//String name = unsereBiere[i].getName();
			String ausgabeForm = "Wir haben die Sorte %s, mit einem Preis von %.2f €";
			System.out.println(String.format(ausgabeForm, unsereBiere[i].getName(), preis));
		}

// Bier.getPreis() = 75;

		System.out.println("Verkauf in " + ort);
		System.out.println("Verkaufspreis  in Cent ist " + altbier.getPreis());
		System.out.println("Steuer  in Cent bei " + altbier.getSteuer());
		

	}

}
