package de.telekom.sea7;

public class ViewKonto {
	private Zahlung modelkonto;

	public void Kontoanzeigen() {
	System.out.println("Sicht Viewkonto: " +modelkonto);
	System.out.println("Name: "+modelkonto.getEmpfaenger());
	System.out.println("IBAN: "+modelkonto.getIban());
	}

	public Zahlung getModelkonto() {
	return modelkonto;
	}

	public void setModelkonto(Zahlung amodelkonto) {
	this.modelkonto = amodelkonto;
	}
}
