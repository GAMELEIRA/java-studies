import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
  public static void main(String[] args) {
    int number = requestNumber();
    ArrayList<ArrayList<Double>> numbersTable = requestNumbersTable(number);
    printNumbersTable(numbersTable);
  }  

  public static int requestNumber() {
    int number;

    System.out.println("Informe um valor: ");
    number = scanner.nextInt();

    return number;
  }

  public static ArrayList<ArrayList<Double>> requestNumbersTable(int number) {
    ArrayList<ArrayList<Double>> numbers = new ArrayList<ArrayList<Double>>();

    for (int i = 1; i <= number; i++) {
      ArrayList<Double> row = new ArrayList<Double>();
      for (int j = 1; j <= 3; j++) {
        row.add(Math.pow(i, j));
      }
      numbers.add(row);
    }

    return numbers;
  }

  public static void printNumbersTable(ArrayList<ArrayList<Double>> numbers) {
    for (ArrayList<Double> row : numbers) {
      for (Double number : row) {
        System.out.printf("%.0f ", number);
      }
      System.out.println();
    }
  }
}
