package de.telekom.sea7.base;

public class AutoTest {
	public static void main(String[] args) {
		Auto auto1 = new Auto(123457);
		Auto auto2 = new Auto(754357);
		Auto auto3 = new Auto(757575);
		
		System.out.println("Hier die Id: #" + auto3.getMyCounter() + "# #"+ auto3.getId());
			
		System.out.println("Hier die Id: #" + auto1.getMyCounter()  + "# #"+  auto1.getId());
		System.out.println("Hier die Id: #" + auto2.getMyCounter()  + "# #"+  auto2.getId());


		/*System.out.println("Hier die Id: #" + auto.getId());
		//auto.toString() kann man in der nachfolgenden Zeile weglassen
		System.out.println(String.format("Hier das Ergebnis: # %s", auto));
*/
		}

}
