package org.gameleira.models;

public final class DriverLicense extends Document {

    @Override
    public void validateDocument() {
        System.out.println("Validação da carteira de motorista: verifique as categorias e a data de validade.");
    }
    
}
