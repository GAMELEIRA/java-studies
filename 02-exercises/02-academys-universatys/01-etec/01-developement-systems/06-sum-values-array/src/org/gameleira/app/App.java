package org.gameleira.app;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class App {
	public static Scanner scanner = new Scanner(System.in);
	public static ArrayList<ArrayList<ArrayList<Integer>>> numbers = new ArrayList<>();

	public static void main(String[] args) {
		requestNumbersAndPersistsData();
		int totalSum = sumNumbersOfArray();
		
		System.out.printf("Valor da soma total dos números informados: %d", totalSum);
	}
	
	public static void requestNumbersAndPersistsData() {
		for (int p = 1; p <= 3; p++) {
		    ArrayList<ArrayList<Integer>> plane = new ArrayList<>();
			for (int l = 1; l <= 3; l++) {
		        ArrayList<Integer> line = new ArrayList<>();
				for (int c = 1; c <= 3; c++) {
					System.out.printf("Informe o valor do plano %d, linha %d, coluna %d:%n", p, l, c);
					int number = scanner.nextInt();
					line.add(number);
				}
				plane.add(line);
			}
			numbers.add(plane);
		}
	}
	
	public static int sumNumbersOfArray() {
		//NAO CONHECIA O AtomicInteger, CONHECIA O Consumer E O Predicate QUE SAO FUNCTIONS INTERFACES QUE SAO PASSADAS EM PARAMETROS QUE ESPERAM 
		//FUNCOES LAMBDAS. ENTAO EU PESQUISEI NO CHAT GPT SE EXISTIA ALGO QUE SE ASSEMELHASSE AOS DOIS PARA CONCATENAR OS VALORES E RETORNAR O VALOR.
		//PELO QUE EU ENTENDI O Atomic Integer E UM OBJETO MUTAVEL QUE POSSUI A FUNCAO addAndGet QUE SOMA O VALOR ATUAL COM O VALOR CORRENTE
	    AtomicInteger sum = new AtomicInteger(0);

	    numbers.forEach(plane ->
	        plane.forEach(line ->
	            line.forEach(value ->
	                sum.addAndGet(value)
	            )
	        )
	    );
	    //RETORNA O VALOR ATUAL
	    return sum.get();
	}

}
