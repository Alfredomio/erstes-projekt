package de.telekom.sea7;

public class StarterDepot {

public static void main(String[] args) {
// TODO Auto-generated method stub
Konto meineListe = new Depot();

System.out.println("Listenelemente Original: " + meineListe.toString());

Zahlung zahlung1 = new ModelZahlung();
zahlung1.setEmpfaenger("Harry Mueller");
zahlung1.setIban("DE12345678123456789012");

Zahlung zahlung2 = new ModelZahlung();
zahlung2.setEmpfaenger("Magda Meier");
zahlung2.setIban("DE12345678123456799999");

Zahlung zahlung3 = new ModelZahlung();
Zahlung zahlung4 = new ModelZahlung();

meineListe.setListe(zahlung1, 2);
meineListe.setListe(zahlung2, 7);
zahlung3 = (Zahlung) meineListe.getContent(2);
zahlung3.setEmpfaenger("Herrmann Gustavson");
zahlung4.setEmpfaenger("Hans Dampf");
zahlung4.setIban("DE123456781234567444444");

System.out.println("Listenelemente Original: " + meineListe.toString());
System.out.println("Ausgabe zahlung3: " + zahlung3);
System.out.println("Ausgabe index4: " + meineListe.getContent(4));
System.out.println("Ausgabe index7: " + meineListe.getContent(7));
System.out.println("meineListe empty?: " + meineListe.isEmpty());
System.out.println("meineListe full?: " + meineListe.isFull());
System.out.println("meineListe size?: " + meineListe.size());
System.out.println("meineListe contains zahlung3?: " + meineListe.contains(zahlung3));
System.out.println("meineListe contains zahlung4?: " + meineListe.contains(zahlung4));
System.out.println("meineListe indexOf zahlung1?: " + meineListe.indexOf(zahlung1));
meineListe.setClear();
System.out.println("Listenelemente Original: " + meineListe.toString());
System.out.println("meineListe empty?: " + meineListe.isEmpty());
System.out.println("meineListe full?: " + meineListe.isFull());
System.out.println("meineListe size?: " + meineListe.size());
System.out.println("meineListe contains zahlung3?: " + meineListe.contains(zahlung3));
System.out.println("meineListe indexOf zahlung1?: " + meineListe.indexOf(zahlung1));

//System.out.println("Listenlänge: " + meineListe.getListenLaenge());
//System.out.println("Listensumme: " + meineListe.getSumliste());

//meineListe.setListenLaenge(8);
//System.out.println("Listenelemente neue Länge + : " + meineListe.toString());

///meineListe.setListenLaenge(5);
}

}
