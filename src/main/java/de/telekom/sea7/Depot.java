package de.telekom.sea7;

import java.util.Iterator;

public class Depot implements Konto {
	private Object[] liste = new Object[9];

	public Depot() {
	for (int i = 0; i < liste.length; i++) {
	liste[i] = i;
	}
	}

	@Override
	public Object getContent(int index) {
	if ((index < 0) && (liste.length > index)) {
	System.out.println("Ungültige Eingabe von " + index);
	return 0;
	} else {
	return liste[index];
	}
	}

	@Override
	public Object[] getListe() {
	return liste;
	}

	@Override
	public void setClear() {
	for (int i = 0; i < liste.length; i++) {
	liste[i] = null;
	}
	}

	@Override
	public boolean isEmpty() {
	for (int i = 0; i < liste.length; i++) {
	var element = liste[i];
	if (element != null)
	return false;
	}
	return true;
	}

	@Override
	public boolean isFull() {
	for (int i = 0; i < liste.length; i++) {
	var element = liste[i];
	if (element == null)
	return false;
	}
	return true;
	}

	@Override
	public int size() {
	int counter = 0;
	for (int i = 0; i < liste.length; i++) {
	var element = liste[i];
	if (element != null)
	counter++;
	}
	return counter;
	}
	@Override
	public boolean contains(Object object) {
		for (int i = 0; i < liste.length; i++) {
		var element = liste[i];
		if ((element != null) && (element.equals(object)))
		return true;
		}
		return false;
		}

		@Override
		public void setListe(Object element, int index) {
		this.liste[index] = element;
		}

		@Override
		public String toString() {
		String ausgabe = "";
		for (int i = 0; i < liste.length; i++) {
		var element = liste[i];
		if (element == null)
		ausgabe = ausgabe + "null, ";
		else
		ausgabe += element.toString() + ", ";
		}
		return ausgabe;
		}

		@Override
		public int indexOf(Object object) {
		for (int i = 0; i < liste.length; i++) {
		var element = liste[i];
		if ((element != null) && (element.equals(object)))
		return i;
		}
		return -1;
		}

		@Override
		public Iterator iterator() {
			// TODO Auto-generated method stub
			return null;
		}
}
