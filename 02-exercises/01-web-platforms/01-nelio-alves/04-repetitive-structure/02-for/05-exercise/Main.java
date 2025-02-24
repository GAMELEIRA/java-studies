import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
  public static void main(String[] args) {
    int number = requestNumber();
    int factorial = calculateFactorial(number);
    System.out.printf("O fatorial de %d e: %d%n", number, factorial);
  }  

  public static int requestNumber() {
    int number;

    System.out.println("Informe um valor para calcular o fatorial: ");
    number = scanner.nextInt();

    return number;
  }

  public static int calculateFactorial(int number) { 
    if (number == 0) {
      return 1;
    } else {
      //USO DE FUNCAO RECURSIVA AO INVES DE REALIZAR UMA ESTRUTURA REPETITIVA
      return number * calculateFactorial(number - 1);
    }
  }
}
