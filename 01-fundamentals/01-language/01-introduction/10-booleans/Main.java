public class Main {
  public static void main(String[] args) {
    //O TIPO PRIMITIVO QUE PODE REPRESENTAR UM VALOR VERDADEIRO E FALSO É O boolean
    boolean isTrue = true;
    boolean isFalse = false;
    
    System.out.println("Verdadeiro: " + isTrue);
    System.out.println("Falso: " + isFalse);

    //É MAIS COMUM QUE UMA CONDICIONAL RETORNE UM VALOR BOOLEANO
    //CONDICIONAIS RESULTAM EM VALORES BOOLEANOS POR MEIO DE LOGICAS APLICADAS EM VALORES UTILIZANDO OPERADORES LOGICOS E RELACIONAIS
    int number = 10;
    boolean isNumberEven = number % 2 == 0;
    System.out.println("O número é par: " + isNumberEven);
  }
}
