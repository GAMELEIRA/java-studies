package org.gameleira.models;

public class Pix extends Payment {
	
	@Override
	public void processPayment(double value) {
		System.out.printf("Transferência PIX realizada no valor de %.2f\n", value);
	}

}
