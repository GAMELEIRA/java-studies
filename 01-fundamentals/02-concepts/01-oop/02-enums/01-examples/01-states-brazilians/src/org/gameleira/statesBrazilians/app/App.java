package org.gameleira.statesBrazilians.app;

import org.gameleira.statesBrazilians.enums.*;

public class App {

	public static void main(String[] args) {
		
		for (StateBrazilian state: StateBrazilian.values()) {
			System.out.println(state.getName());
		}
		
		System.out.println(StateBrazilian.SAO_PAULO);
		
	}

}
