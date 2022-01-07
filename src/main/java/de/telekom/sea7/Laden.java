package de.telekom.sea7;

public class Laden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i; // Zahl
		Bier bier; // Bier ( Preis)

		String ort = "Hamburg"; // Laden liegt in

		Bier.setPreis(75);

		Bier.preisanpassen(2);

		// Bier.getPreis() = 75;

		System.out.println("Verkauf in " + ort);
		System.out.println("Verkaufspreis ist " + Bier.getPreis());
		System.out.println("Steuer bei " + Bier.getSteuer());


		}

}
