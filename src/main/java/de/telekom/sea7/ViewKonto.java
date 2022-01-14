package de.telekom.sea7;

public class ViewKonto {
	private ModelKonto modelkonto;

	public void Kontoanzeigen() {
	System.out.println("Sicht Viewkonto: " +modelkonto);
	System.out.println("Name: "+modelkonto.getEmpfaenger());
	System.out.println("IBAN: "+modelkonto.getIban());
	}

	public ModelKonto getModelkonto() {
	return modelkonto;
	}

	public void setModelkonto(ModelKonto amodelkonto) {
	this.modelkonto = amodelkonto;
	}
}
