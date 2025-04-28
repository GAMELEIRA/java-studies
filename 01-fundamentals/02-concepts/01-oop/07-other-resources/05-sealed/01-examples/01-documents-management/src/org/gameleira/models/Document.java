package org.gameleira.models;

//selead E UM RECURSO PARA QUE SEJA DEFINADO QUE APENAS CLASSES DEFINIDAS APOS O permits PODEM EXTENDELA
//permits E UM RECURSO PARA QUE SEJA DEFINIDO QUE APENAS CLASSES DEFINIDAS APOS O permits PODEM EXTENDELA
public sealed class Document permits DriverLicense, IdentityCard, Passport  {
	
    public void validateDocument() {
        System.out.println("Validando documento...");
    }
    
}
