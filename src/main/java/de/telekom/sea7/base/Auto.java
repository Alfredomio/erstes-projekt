package de.telekom.sea7.base;

public class Auto extends BaseObject {
	private int id;
	private Object parent;

	public Auto(int id) {
		super(id); // Aufruf des Constructors von BaseObject
	}

	public Auto(Object parent, int id) {
		//super(this, id); // Aufruf des Constructors von BaseObject
		super(id); // Aufruf des Constructors von BaseObject
		this.id = id;
		this.parent = parent;
	}

	
	public String toString() {
		// System.out.println(super.toString());
		return "\nHier die Uperclass Auto ->>" + super.toString();
	}

	public Object getParent() {
		return parent;
	}

	public void setParent(Object parent) {
		this.parent = parent;
	}
}