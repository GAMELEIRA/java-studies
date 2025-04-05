package org.gameleira.models;

public class BankSlip extends Payment {

	@Override
	public void processPayment(double value) {
		System.out.printf("Boleto gerado no valor de %.2f\n", value);
	}
	
}
