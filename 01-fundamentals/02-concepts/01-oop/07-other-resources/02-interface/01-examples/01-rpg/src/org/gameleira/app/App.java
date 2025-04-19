package org.gameleira.app;

import java.util.Scanner;

import org.gameleira.models.Archer;
import org.gameleira.models.Person;
import org.gameleira.models.Warrior;
import org.gameleira.models.Wizard;
import org.gameleira.enums.PLAYER;

public class App {

	public static Scanner scanner = new Scanner(System.in); 
	
	public static void main(String[] args) {
		PLAYER player;
		String choice; 
		String enemy;
		Person person = null;
		
		System.out.println("Escolha um personagem:\n1 para Arqueiro,\n2 para Guerreiro,\n3 para Mago");
		choice = scanner.nextLine();
		
	    switch(choice) {
	        case "1":
	            person = new Archer();
	            break;
	        case "2":
	            person = new Warrior();
	            break;
	        case "3":
	            person = new Wizard();
	            break;
	        default:
	            System.out.println("Escolha inválida. Usando Guerreiro por padrão.");
	            main(null);
	            break;
	    }
	    
		player = PLAYER.fromCode(choice);
		
		System.out.println("Informe o nome do inimigo:");
		enemy = scanner.nextLine();
		
        person.toExecute(enemy);
        scanner.close();

	}

}
