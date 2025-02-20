import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  public static void main(String[] args) {
    int quantityRepetitions = requestQuantityRepetitions();
    ArrayList<Integer> numbers = requestNumbers(quantityRepetitions);
    HashMap<String, Integer> result = validateInterval(numbers);

    showResult(result);
  }

  public static int requestQuantityRepetitions() {
    int number;

    System.out.println("Informe a quantidade numeros a serem lidos: ");
    number = scanner.nextInt();

    return number;
  }

  public static ArrayList<Integer> requestNumbers(int quantityRepetitions) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();

    for (int i = 0; i < quantityRepetitions; i++) {
      System.out.println("Informe um numero: ");
      int number = scanner.nextInt();
      numbers.add(number);
    }

    return numbers;
  }

  public static HashMap<String, Integer> validateInterval(ArrayList<Integer> numbers) {
    HashMap<String, Integer> intervals = new HashMap<String, Integer>();
    int in = 0;
    int out = 0;

    for (Integer number : numbers) {
      if (number >= 10 && number <= 20) {
        in++;
      } else {
        out++;
      }
    }

    intervals.put("in", in);
    intervals.put("out", out);

    return intervals;
  }

  public static void showResult(HashMap<String, Integer> intervals) {
    System.out.println("Entrou: " + intervals.get("in"));
    System.out.println("Fora: " + intervals.get("out"));
  }
}
