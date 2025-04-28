package org.gameleira.models;

public class SpecialIdentityCard extends IdentityCard {
 
  @Override
  public void validateDocument() {
      System.out.println("Validação do cartão de identidade especial");
  }
  
}
