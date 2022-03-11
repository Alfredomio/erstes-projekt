package de.telekom.sea7;
//JDBC
import java.sql.*;
import java.util.Properties;


public class StarterArray {
	 
	 public static void main(String[] args) {
	 // TODO Auto-generated method stub
	 IntegerListe meineListe = new IntegerListe();
	 
	 /**
	  * JDBC-Test
	  */
/*	 
	 erste klägliche Versuche eine DB-Connection zu bauen, keine Ahnung wo der Bezug zur Internetseite ist von
	 der wir das nachbauen wollten
  	 String connectionString = "jdbc:mariadb://localhost:3306";

	 connection = DriverManager.getConnection(connectionString, "<USER>", "<PASSWORD>");
 */
	 System.out.println("Listenelemente Original: " + meineListe.toString());
	 System.out.println("Listenlänge: " + meineListe.getListenLaenge());
	 System.out.println("Listensumme: " + meineListe.getSumliste());

	 meineListe.setListenLaenge(8);
	 System.out.println("Listenelemente neue Länge + : " + meineListe.toString());

	 meineListe.setListenLaenge(5);
	 System.out.println("Listenelemente neue Länge - : " + meineListe.toString());

	 meineListe.setListeClear();
	 System.out.println("Listenelemente Clear: " + meineListe.toString());

	 meineListe.setListeRandom();

	 System.out.println("Listenelemente Zufall: " + meineListe.toString());
	 System.out.println("Listensumme: " + meineListe.getSumliste());
	 }
	 }
