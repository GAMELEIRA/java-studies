import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  public static void main(String[] args) {
    ArrayList<Double> data = getData();
    String coordinates = getCoordinates(data);
    printResult(coordinates);
  }

  public static ArrayList<Double> getData() {
    ArrayList<Double> data = new ArrayList<Double>();
    int i = 0; 
    while (i < 2) {
      System.out.printf("Informe o %d valor: ", i);
      Double value = scanner.nextDouble();
      data.add(value);
      i++;
    }

    return data;
  }

  public static String getCoordinates(ArrayList<Double> data) {
    if (data.get(0) == 0 || data.get(1) == 0) {
      return "";
    } else if (data.get(0) > 0 && data.get(1) > 0) {
      return "primeiro";
    } else if (data.get(0) > 0 && data.get(1) < 0) {
      return "quarto";
    } else if (data.get(0) < 0 && data.get(1) < 0) {
      return "terceiro";
    } else {
      return "segundo";
    }
  }

  public static void printResult(String coordinates) {
    System.out.println(coordinates);
  }

}