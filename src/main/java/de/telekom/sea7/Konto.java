package de.telekom.sea7;

import java.util.Iterator;

//Muss extends Iterable !!! weil wir den Iterator in der Implementierung benutzen
public interface Konto extends Iterable {
	//Interface wurde von Klasse Depot abgeleitet, die schon überwiegend Funktionen von ArrayList nachbildet

	Object getContent(int index);

	Object[] getListe();

	void setClear();

	boolean isEmpty();

	boolean isFull();

	int size();

	boolean contains(Object object);

	void setListe(Object element, int index);
	//Vorschlag void add(Object element, int index);
	String toString();

	int indexOf(Object object);
	
	Iterator iterator();
}