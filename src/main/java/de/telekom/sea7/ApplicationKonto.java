package de.telekom.sea7;

public class ApplicationKonto {
	public ApplicationKonto() { //Construktor
	}

	public void run(String[] args) {

	ViewKonto viewkonto = new ViewKonto();
	ModelKonto modelkonto = new ModelKonto();
	ModelKonto modelkonto1 = new ModelKonto();
	modelkonto.setEmpfaenger("Harry");
	modelkonto.setIban("DE123456789");
	modelkonto1.setEmpfaenger("Eva");
	modelkonto1.setIban("SE3456789");
	viewkonto.setModelkonto(modelkonto);
	viewkonto.Kontoanzeigen();
	viewkonto.setModelkonto(modelkonto1);
	viewkonto.Kontoanzeigen();


	//System.out.println(auto.toString());
	//System.out.println(auto.getParent());
	}
}
