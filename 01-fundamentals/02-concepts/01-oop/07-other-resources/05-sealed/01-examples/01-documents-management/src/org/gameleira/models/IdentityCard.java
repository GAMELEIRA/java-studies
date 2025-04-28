package org.gameleira.models;

// non-sealed PERMITE QUE A CLASSE SEJA EXTENSÍVEL POR OUTRAS. 
// ISSO PORQUE A CLASSE `non-sealed` É UTILIZADA EM SUBCLASSES DE CLASSES `sealed` 
// PARA ROMPER A RESTRIÇÃO E PERMITIR QUE ELA SEJA EXTENDIDA MAIS ADIANTE.
// CLASSES DEFINIDAS NO `permits` PRECISAM SER `final`, 
// SENDO ASSIM ELAS NÃO PODERÃO SER EXTENDIDAS
// O `final` TORNA A CLASSE CONCRETA E IMPOSSÍVEL DE SER EXTENDIDA.
public non-sealed class IdentityCard extends Document {
   
	@Override
    public void validateDocument() {
        System.out.println("Validação do Cartão de Identidade: Verifique o número do documento de identidade e a data de nascimento.");
    }
	
}
