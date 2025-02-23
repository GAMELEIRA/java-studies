import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  public static void main(String[] args) {
    ArrayList<Double> data = getData();
    String coordinates = getCoordinates(data);
    printResult(coordinates);
    scanner.close();
  }

  public static ArrayList<Double> getData() {
    ArrayList<Double> data = new ArrayList<Double>();

    for (int i = 0; i < 2; i++) {
      System.out.printf("Informe o %d valor: ", i);
      Double value = scanner.nextDouble();
      data.add(value);
    }

    return data;
  }

  public static String getCoordinates(ArrayList<Double> data) {
    if (data.get(0) == 0 && data.get(1) == 0) {
      return "Origem";
    } else if (data.get(0) > 0 && data.get(1) > 0) {
      return "Q1";
    } else if (data.get(0) > 0 && data.get(1) < 0) {
      return "Q4";
    } else if (data.get(0) < 0 && data.get(1) < 0) {
      return "Q3";
    } else {
      return "Q2";
    }
  }

  public static void printResult(String coordinates) {
    System.out.println(coordinates);
  }

}