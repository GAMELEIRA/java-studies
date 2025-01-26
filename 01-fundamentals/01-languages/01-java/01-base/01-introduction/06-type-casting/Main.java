public class Main {

  public static void main(String[] args) {
    //A CONVERSAO OCORRE QUANDO VOCE ATRIBUI UM VALOR MENOR PARA UM MAIOR OU DE UM MAIOR PARA UM MENOR
    //byte -> short -> char -> int -> long -> float -> double
    int myInt = 9; 
    double myDouble = myInt;

    System.out.println("Valor inteiro: " + myInt);
    System.out.println("Valor double: " + myDouble);

    //PARA FAZER DE UM VALOR MAIOR PARA MENOR DEVE SER UTILIZADO O () COM O TIPO ENTRE PARENTESES
    double myDouble2 = 9.0;
    int myInt2 = (int) myDouble2;
    
    System.out.println("Valor double convertido para inteiro: " + myInt2);
    System.out.println("Valor double: " +  myDouble2);
  }
  
}
