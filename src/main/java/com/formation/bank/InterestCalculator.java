package com.formation.bank;

public interface InterestCalculator {
	
	/**
	 * 
	 * @param rate
	 * Il est inutile de pr�ciser public pour une methode dnas une interface
	 * car elle l'est d�j� par nature. C'est ce que PMD remonte
	 */
	 void setRate(double rate);
	public double calculate(double amount, double year);
 
}

