package org.gameleira.app;

import java.util.Scanner;

public class App {
	
	public static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
	    String repeatProgram = "";

		do {
		    boolean repeat;
		    
		    requestAndCalculateBonus();
		    System.out.println("Deseja calcular outra comissão? S (SIM) / N (NÃO)");
		    scanner = new Scanner(System.in);
		    repeatProgram = scanner.nextLine().trim().toUpperCase();
		    } while (repeatProgram.startsWith("S"));
		
		scanner.close();
	}
	
	private static void requestAndCalculateBonus() {
		String name;
		double salesTotal = 0.0;
		int quantitySales = 0;
		double salesTotalWithBonus = 0.0;
		
		System.out.println("Informe seu nome:");
		name = scanner.nextLine();
		System.out.println("Informe o valor total de vendas:");
		salesTotal = scanner.nextDouble();
		System.out.println("Informe a quantidade de vendas realizadas:");
		quantitySales = scanner.nextInt();
		
		salesTotalWithBonus += applyBonusRules(quantitySales, salesTotal);
		System.out.printf("%s, com base no seu valor total de vendas de R$ %.2f, com a quantidade de vendas %d, a bonificacao ficou no valor de R$ %.2f%n", name, salesTotal, quantitySales, salesTotalWithBonus);
	}
	
	private static double applyBonusRules(int quantitySales, double salesTotal) {
		double bonus = 0.0;
		
		bonus += applyCommissionRulesBySales(salesTotal);
		bonus += applyCommissionRulesByQuantitySales(quantitySales, salesTotal);
		
		return bonus;
	}
	
	private static double applyCommissionRulesBySales(double salesTotal) {
		if (salesTotal < 1000) {
			return salesTotal * 0.05;
		} else if (salesTotal < 5000) {
			return salesTotal * 0.07;
		} else {
			return salesTotal * 0.10;
		}
	}
	
	private static double applyCommissionRulesByQuantitySales(int quantitySales, double salesTotal) {
		if (quantitySales > 10) {
			return salesTotal * 0.02;
		} 
		
		return 0.0;
	}

}
