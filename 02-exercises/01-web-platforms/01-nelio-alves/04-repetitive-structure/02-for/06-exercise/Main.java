import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  public static void main(String[] args) {
    int number = requestNumber();
    ArrayList<Integer> divisors = calculateDivisors(number);

    showDividers(divisors);
    scanner.close();
  }

  public static int requestNumber() {
    int number;

    System.out.println("Informe o dividendo: ");
    number = scanner.nextInt();

    return number;
  }

  public static ArrayList<Integer> calculateDivisors(int number) { 
    ArrayList<Integer> divisors = new ArrayList<Integer>();

    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        divisors.add(i);
      }
    }

    return divisors;
  }

  public static void showDividers(ArrayList<Integer> divisors) {
    for (Integer divisor: divisors) {
      System.out.println(divisor);
    }
  }
  
}
