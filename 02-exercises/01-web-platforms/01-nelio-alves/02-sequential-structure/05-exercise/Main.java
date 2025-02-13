import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main { 
  public static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    int quatityRepetitions = quatityRepetitions();
    int count = 0;
    ArrayList<Double> valuesShopping = new ArrayList<Double>();

    while (count < quatityRepetitions) {
      requestIdPart(count);
      int quantityParts = requestQuantityParts();
      double valueUnityPart = requestValueUnityPart();
      double valueShoppingByItem = calculateShoopingByItem(quantityParts, valueUnityPart);
      valuesShopping.add(valueShoppingByItem);
      count++;
    }

    double totalValueShopping = calculateTotalValueShopping(valuesShopping);
    showResult(totalValueShopping);

    scanner.close();
  }  

  public static int quatityRepetitions() {
    System.out.println("Informe a quantidade de repeticoes: ");
    int quatityRepetitions = scanner.nextInt();
    return quatityRepetitions;
  }

  public static int requestIdPart(int id) {
    System.out.printf("Informe o id da peca: ", id);
    int idPart = scanner.nextInt();

    return idPart;
  }

  public static int requestQuantityParts() {
    System.out.println("Informe a quantidade de pecas: ");
    int quantityParts = scanner.nextInt();
   
    return quantityParts;
  }

  public static double requestValueUnityPart() {
    System.out.println("Informe o valor unitario da peca: ");
    double valueUnityPart = scanner.nextDouble();

    return valueUnityPart;
  }

  public static double calculateShoopingByItem (int quantityParts, double valueUnityPart) {
    return valueUnityPart * quantityParts;
  }
  
  public static double calculateTotalValueShopping(ArrayList<Double> valuesShopping) {
    double sum = 0;
    for (double value : valuesShopping) {
      sum += value;
    }
    return sum;
  }

  public static void showResult(double totalValueShopping) {
    System.out.printf("VALOR A PAGAR: $ %.2f", totalValueShopping);
  }

}
