package de.telekom.sea7;

import java.util.ArrayList;
import java.util.Iterator;

//Thorsten schrieb hier in der Definition ..., Iterator hin, weil der in der Methode nachher aufgerufen werden soll
public class KontoImpl implements Konto, Iterator {

	private ArrayList arrayList = new ArrayList();

	@Override
	public Iterator iterator() { //ready
		// TODO Auto-generated method stub
		return arrayList.iterator();
	}

	@Override
	public Object getContent(int index) {
		// TODO Auto-generated method stub
		return arrayList.get(index);
	}

	@Override
	public Object[] getListe() {
		// TODO Auto-generated method stub
		return arrayList.toArray();
	}

	@Override
	public void setClear() {
		// TODO Auto-generated method stub
		arrayList.clear();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return arrayList.isEmpty();
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		return false; //kann niemals voll werden
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return arrayList.size();
	}

	@Override
	public boolean contains(Object object) {
		// TODO Auto-generated method stub
		return arrayList.contains(object);
	}

	@Override
	public void setListe(Object element, int index) {
		// TODO Auto-generated method stub
		arrayList.add(element); // index); index egal wird hinten eingefügt, weil add index würde alles verschiebenes
	}

	@Override
	public int indexOf(Object object) {
		// TODO Auto-generated method stub
		return arrayList.indexOf(object);
	}

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

}
