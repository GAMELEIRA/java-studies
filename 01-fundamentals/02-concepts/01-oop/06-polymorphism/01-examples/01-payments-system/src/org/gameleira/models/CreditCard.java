package org.gameleira.models;

public class CreditCard extends Payment {

	@Override
	public void processPayment(double value) {
		System.out.printf("Processando pagamento de R$%.2f via Cartão de Crédito...\n", value);
	}
	
}
