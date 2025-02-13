import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
  public static ArrayList<Double> listNumbers = new ArrayList<Double>();
  public static HashMap<String, Double> resultCalculates = new HashMap<String, Double>();

  public static void main(String[] args) {
    requestData();
    calculateAreas();
    printResults();
  }

  public static void requestData() {
    for (int i = 0; i < 3; i++) {
      System.out.printf("Informe o %d valor: ", i);
      double value = scanner.nextDouble();
      listNumbers.add(value);
    }
  }

  public static void calculateAreas() {
    resultCalculates.put("areaRightTriangle", areaRightTriangle());
    resultCalculates.put("areaCircle", areaCircle());
    resultCalculates.put("areaTrapeze", areaTrapeze());
    resultCalculates.put("areaSquare", areaSquare());
    resultCalculates.put("areaRectangle", areRectangle());
  }

  public static double areaRightTriangle() {
    return listNumbers.get(0) * listNumbers.get(2) / 2;
  }

  public static double areaCircle() {
    return Math.PI * (Math.pow(listNumbers.get(2), 2));
  }

  public static double areaTrapeze() {
    return (listNumbers.get(0) + listNumbers.get(1)) * listNumbers.get(2) / 2;
  }

  public static double areaSquare() {
    return Math.pow(listNumbers.get(1), 2);
  }

  public static double areRectangle() {
    return listNumbers.get(0) * listNumbers.get(1);
  }

  public static void printResults() {
    for (String key : resultCalculates.keySet()) {
      System.out.printf("%s: %.2f%n", key, resultCalculates.get(key));
    }
  }

}