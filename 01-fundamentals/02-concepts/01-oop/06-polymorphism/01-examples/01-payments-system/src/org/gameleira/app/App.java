package org.gameleira.app;

import java.util.ArrayList;

import org.gameleira.models.*;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Payment> payments = new ArrayList<Payment>();
		BankSlip bankSlip = new BankSlip();
		CreditCard creditCard = new CreditCard();
		Pix pix = new Pix();
		
		payments.add(bankSlip);
		payments.add(creditCard);
		payments.add(pix);
		
		for (Payment payment: payments) {
			payment.processPayment(100.00);
		}
		
	}

}
