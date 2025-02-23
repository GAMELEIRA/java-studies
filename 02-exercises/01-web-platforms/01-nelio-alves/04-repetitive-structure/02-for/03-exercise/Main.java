import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    int quantityCaseTest = requestQuantityTests();
    ArrayList<ArrayList<Double>> values = requestValuesTestCases(quantityCaseTest);
    ArrayList<Double> average = new ArrayList<Double>();

    values.forEach((row) -> {
      average.add(calculateAverageWeighted(row));
    });

    showAverage(average);
    scanner.close();
  }

  public static int requestQuantityTests() {
    int quantityCaseTest;

    System.out.println("Informe a quantidade de casos de teste: ");
    quantityCaseTest = scanner.nextInt();

    return quantityCaseTest;
  }

  public static ArrayList<ArrayList<Double>> requestValuesTestCases(int quantityCaseTest) {
    int columns = 3;
    ArrayList<Double> values = new ArrayList<Double>();
    ArrayList<ArrayList<Double>> tableValues = new ArrayList<ArrayList<Double>>();

    for (int i = 1; i <= quantityCaseTest; i++) {
      for (int j = 1; j <= columns; j++) {
        System.out.printf("Informe os valores da linha: %d,  coluna: %d: ", i, j);
        values.add(scanner.nextDouble());
      }
      tableValues.add(values);
      values = new ArrayList<Double>();
    }

    return tableValues;
  }

  public static double calculateAverageWeighted(ArrayList<Double> values) {
    int sum = 0;
    int index = 1;

    for (Double value : values) {
      switch (index) {
        case 1:
          sum += value * 2;
          break;
        case 2:
          sum += value * 3;
          break;
        case 3:
          sum += value * 5;
          break;
        default:
          break;
      }
      index++;
    }

    return sum / 10.00;
  }

  public static void showAverage(ArrayList<Double> average) { 
    System.out.println("Medias ponderadas dos casos de teste:");
    for (Double value : average) {
      System.out.println(value);
    }
  }
}