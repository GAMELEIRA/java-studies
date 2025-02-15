import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  public static void main(String[] args) {
    double number = requestNumber();
    showInterval(number);
  }

  public static double requestNumber() {
    double number;

    System.out.println("Informe um numero flutuante: ");
    number = scanner.nextDouble();

    return number;
  }

  public static void showInterval(double number) {
    if (number >= 0 && number <= 25.00) {
      System.out.println("Intervalo [0, 25]");
    } else if (number >= 25.00 && number <= 50.00) {
      System.out.println("Intervalo [25, 50]");
    } else if (number >= 50.00 && number <= 75.00) {
      System.out.println("Intervalo [50, 75]");
    } else if (number >= 75.00 && number <= 100.00) {
      System.out.println("Intervalo [75, 100]");
    } else {
      System.out.println("Fora de intervalo");
    }
  }
}
