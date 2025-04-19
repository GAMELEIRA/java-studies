package org.gameleira.models;

import org.gameleira.interfaces.Attack;

public class Archer extends Person {
	
	public void toExecute(String enemy) {
		System.out.println("Ataca com flecha em " + enemy);
	}

}
