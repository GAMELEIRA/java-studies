import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    for (int i = 0; i < 3; i++) {
      numbers.add(requestNumber(i));
    }

    boolean areMultiple = areMultiple(numbers);
    showResult(areMultiple);

  }

  public static int requestNumber(int sequence) {
    int number;

    System.out.printf("Informe o %d numero: %n", sequence);
    number = scanner.nextInt();
    scanner.close();

    return number;
  }

  public static boolean areMultiple(ArrayList<Integer> numbers) {
    boolean areMultiple = false;

    Collections.sort(numbers);
    for (Integer number : numbers) {
      for (Integer nextNumber : numbers) {
        areMultiple = (number % nextNumber == 0);
        if (areMultiple == false) {
          break;
        }
      }
    }

    return areMultiple;
  }

  public static void showResult(boolean areMultiple) {
    System.out.println(areMultiple ? "Sao Multiplos" : "Nao sao Multiplos");
  }

}
