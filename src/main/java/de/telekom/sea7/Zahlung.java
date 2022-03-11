package de.telekom.sea7;

public interface Zahlung {

	String getEmpfaenger();

	void setEmpfaenger(String empfaenger);

	String getIban();

	float getBetrag();

	void setBetrag(float betrag);

	String getVerwendungszweck();

	void setVerwendungszweck(String verwendungszweck);

	boolean isEchtzeitueberweisung();

	void setEchtzeitueberweisung(boolean echtzeitueberweisung);

	void setIban(String iban);

}