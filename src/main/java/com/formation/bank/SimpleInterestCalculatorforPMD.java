package com.formation.bank;

public class SimpleInterestCalculatorforPMD implements InterestCalculator {

	private double rate;
	

	private String MyUnUsedVariable;
	
	public void setRate(double rate) {
		this.rate = rate;
	}


	public double calculate(double amount, double year) {
		if (amount <0 || year <0) {
			throw new IllegalArgumentException(
					"Le montant et la duree doivent �tre positifs");
		}
		
		
		return amount * year * rate;
	
		
		}
	
	public double calculateforPMD(double amount, double year) {
		if (amount <0 || year <0) {
			throw new IllegalArgumentException(
					"Le montant et la duree doivent �tre positifs");
		}
		
		try {
		
		return amount * year * rate;
	
		} finally {
			
		}
		
		
		}

}

