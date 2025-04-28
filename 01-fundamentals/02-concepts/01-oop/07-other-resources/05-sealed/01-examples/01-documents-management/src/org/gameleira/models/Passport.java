package org.gameleira.models;

public final class Passport extends Document {
	
    @Override
    public void validateDocument() {
        System.out.println("Validando passaporte: verifique o país e a data de validade.");
    }
    
}
