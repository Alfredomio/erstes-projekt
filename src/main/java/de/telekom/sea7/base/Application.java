package de.telekom.sea7.base;

public class Application extends BaseObject {
	 public Application() { // Construktor
		 super(null, 1);
		 //super(1334477);
	}

	public void run(String[] args) {

		Auto auto = new Auto(this, 2);
		//System.out.println(auto.toString());

		System.out.println("Und der Parent ist: ->#" + auto.getParent() + "#<-");
		//auto.getParent().run();
	}

}
