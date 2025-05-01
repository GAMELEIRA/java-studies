package org.gameleira.app;

import java.util.ArrayList;
import java.util.function.Predicate;

import org.gameleira.models.Product;

public class App {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		Product product1 = new Product("Bola", 100.00, "Esportivos");
		Product product2 = new Product("Bola de Tenis de Mesa", 10.00, "Esportivos");
		Product product3 = new Product("Bola de Basquete", 200.00, "Esportivos");
		Product product4 = new Product("Chuteira", 250.00, "Esportivos");
		Product product5 = new Product("Caneleira", 10.00, "Esportivos");
		Product product6 = new Product("Celular", 10000.00, "Eletronico");
		Product product7 = new Product("Fone", 10.00, "Eletronico");
		
		products.add(product1);
		products.add(product2);
		products.add(product3);
		products.add(product4);
		products.add(product5);
		products.add(product6);
		
		filterCheapsEletronics(products);

	}
	
	public static void filterCheapsEletronics(ArrayList<Product> products) {
		//Predicate E UMA FUNCTIONAL INTERFACE QUE REPRESENTA UMA FUNCAO LOGICA
		//QUE RETORNA VERDADEIRO OU FALSO COM BASE EM UM ARGUMENTO
		Predicate<Product> isCheapPrice = product -> product.getPrice() < 100;
		Predicate<Product> isEletronics = product -> product.getCategory().equals("Eletronico");
		Predicate<Product> cheapAndEletronics = isCheapPrice.and(isEletronics); //and CONCATENA OPERACOES/PREDICADOS

	    products.stream()
	            .filter(cheapAndEletronics)
	            .forEach(product -> System.out.println(product));
	}

}
