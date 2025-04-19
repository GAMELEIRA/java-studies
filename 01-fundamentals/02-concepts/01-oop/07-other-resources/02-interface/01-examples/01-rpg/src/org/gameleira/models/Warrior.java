package org.gameleira.models;

import org.gameleira.interfaces.Attack;

public class Warrior extends Person {

    public void toExecute(String enemy) {
        System.out.println("Ataque com espada em " + enemy);
    }
    
}
