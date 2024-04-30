package de.demmer.dennis;

public class Bankkonto {
	
	int guthaben;
	String kontoinhaber;
	int iban;
	
	
	
	public Bankkonto(int guthaben, String kontoinhaber, int iban) {
		this.guthaben = guthaben;
		this.kontoinhaber = kontoinhaber;
		this.iban = iban;
	}



	@Override
	public String toString() {
		return "Bankkonto [guthaben=" + guthaben + ", kontoinhaber=" + kontoinhaber + ", iban=" + iban + "]";
	}
	

	
	
	

}
