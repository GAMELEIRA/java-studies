import java.util.ArrayList;
import java.util.function.BiFunction;

public class Main {
  public static void main(String[] args) {
    //EXPRESSOES LAMBDAS SAO PEQUENOS BLOCOS DE CODIGO QUE RECEBEM PARAMETROS E RETORNAM UM VALOR
    //EXPRESSOES LAMBDAS SAO MAIS CONVENIENTES PARA PROCESSOS DE FILTRAGEM, REDUCAO, E ORDENACAO
    //EXPRESSOES LAMBDAS SAO MAIS CONVENIENTES QUANDO SE TRATA DE PROCESSOS QUE NAO DEpendem de VARIAVEIS DEVEM SER CURTAS
    //EXPRESSOES LAMBDAS SAO MAIS CONVENIENTES QUANDO SE TRATA DE PROCESSOS QUE NAO DEpendem de VARIAVEIS DEVEM SER CURTAS
    //PODEM SER USADAS COMO DADOS, OU SEJA, PODEM SER ARMAZENADAS EM VARIAVEIS
    Integer x = 10, y = 5;
    
    //A EXPRESSAO LAMBDAS PODEM SER UTILIZADAS EM METODOS QUE RECEBEM COMO PARAMETROS DE OUTRAS FUNCOES
    //EXPRESSOES LAMBDAS NAO PODEM TER VARIAVEIS DEVEM SER CURTAS E RETORNAM UM VALOR     Consumer<Integer> method = (n) -> { System.out.println(n); };
    BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

    System.out.println("Soma de " + x + " e " + y + ": " + sum.apply(x, y));

    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(1);
    numbers.add(2);
    //FUNCOES LAMBDAS PODEM SER UTILIZADAS COMO ARGUMENTOS PARA METODOS
    numbers.forEach(number -> System.out.println("Numero: " + number));

    
  }
}
