package org.gameleira.models;

import org.gameleira.interfaces.Attack;

public class Wizard extends Person {
	
	public void toExecute(String enemy) {
		System.out.println("Lança Feitiço em " + enemy);
	}
}
