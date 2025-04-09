public class Main {

  //METODO QUE REALIZA A SOMA DE DOIS NUMEROS COM PARAMETROS INTEIROS
  public static int sum(int a, int b) { 
    return a + b;
  }

  //METODO QUE REALIZA A SOMA DE DOIS NUMEROS COM PARAMETROS FLUTUANTES
  public static double sum(double a, double b) {
    return a + b;
   }

  public static void main(String[] args) {
    //COM A SOBRECARGA DE METODOS, VARIOS METODOS PODEM TER O MESMO NOME/IDENTIFICADOR COM PARAMETROS DIFERENTES
    System.out.println(sum(5, 3));
    System.out.println(sum(5.5, 3.7));
  }  
}
