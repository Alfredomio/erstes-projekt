package de.telekom.sea7.base;

public class BaseObject /* extends Object */ {
	private static int counter = 0;
	private int myCounter = 0;
	private Object parent;
	
	private int id;
	//private Object parent;
	
	public final int x; 
	public final int y;
	
	BaseObject(int id) {
		this.id = id;
		this.x = 1;
		this.y = 2;
		counter++;
		this.myCounter = counter;
	}

	public BaseObject(Object parent, int id) {
		//super(this, id); // Aufruf des Constructors von BaseObject
		this.parent = parent;
		this.id = id;
		this.x = 1;
		this.y = 2;
		counter++;
		this.myCounter = counter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString() {
		// return String.format("Hier die Superclass BaseObject");
		return "\nHier die Superclass BaseObject, Adresse im Speicher #\n" + super.toString();
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	//public static int getMyCounter() {
	public int getMyCounter() {
		return myCounter;
	}

	/*public static void setCounter(int counter) { verboten, den von außen zu setzen
		Counter = counter;
	}*/

	public Object getParent() {
		return parent;
	}

	public void setParent(Object parent) {
		this.parent = parent;
	}

}
