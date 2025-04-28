package org.gameleira.models;

public final class IdentityCard extends Document {
   
	@Override
    public void validateDocument() {
        System.out.println("Validação do Cartão de Identidade: Verifique o número do documento de identidade e a data de nascimento.");
    }
	
}
