package de.telekom.sea7;

public class ModelZahlung implements Zahlung {
	//private Konto einKonto = new Konto();

	//einKonto.setEmpfaenger("Harry");

	private String empfaenger;
	private String iban;
	private float betrag;
	private String verwendungszweck;
	private boolean echtzeitueberweisung;


	@Override
	public String getEmpfaenger() {
	return empfaenger;
	}
	@Override
	public void setEmpfaenger(String empfaenger) {
	// if(empfaenger)
	this.empfaenger = empfaenger;
	}
	@Override
	public String getIban() {
	return iban;
	}
	@Override
	public float getBetrag() {
	return betrag;
	}
	@Override
	public void setBetrag(float betrag) {
	this.betrag = betrag;
	}
	@Override
	public String getVerwendungszweck() {
	return verwendungszweck;
	}
	@Override
	public void setVerwendungszweck(String verwendungszweck) {
	this.verwendungszweck = verwendungszweck;
	}
	@Override
	public boolean isEchtzeitueberweisung() {
	return echtzeitueberweisung;
	}
	@Override
	public void setEchtzeitueberweisung(boolean echtzeitueberweisung) {
	this.echtzeitueberweisung = echtzeitueberweisung;
	}
	@Override
	public void setIban(String iban) {
	this.iban = iban;
	}

	}
