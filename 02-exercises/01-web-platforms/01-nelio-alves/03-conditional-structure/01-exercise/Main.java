import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());
  public static void main(String[] args) {
    int number = requestNumber();
    boolean isNegative = isNegative(number);
    showResult(isNegative);
  }

  public static int requestNumber() {
    int number = 0; 

    System.out.println("Informe um numero inteiro: ");
    number = scanner.nextInt();

    return number;
  }

  public static boolean isNegative(int number) {
    return number < 0;
  }

  public static void showResult(boolean isNegative) {
    if (isNegative) {
      System.out.println("NEGATIVO");
    } else {
      System.out.println("POSITIVO.");
    }
  }
} 