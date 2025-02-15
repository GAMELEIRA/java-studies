import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
  public static void main(String[] args) {
    HashMap<String, Double> tablePrice = buildTablePrice();
    int[] request = requesData();
    double totalPrice = calculateTotalPrice(request, tablePrice);

    showResult(totalPrice);
  }

  public static HashMap<String, Double> buildTablePrice() {
    HashMap<String, Double> tablePrice = new HashMap<String, Double>();

    tablePrice.put("1", 4.00);
    tablePrice.put("2", 4.50);
    tablePrice.put("3", 5.00);
    tablePrice.put("4", 2.00);
    tablePrice.put("5", 1.50);

    return tablePrice;
  }

  public static int[] requesData() {
    int [] price;
    int id;
    int quantity;

    System.out.println("Informe o codigo de um item: ");
    id = scanner.nextInt();
    System.out.println("Informe a quantidade: ");
    quantity = scanner.nextInt();
    price = new int[]{id, quantity};

    return price;
  } 

  public static double calculateTotalPrice(int[] price, HashMap<String, Double> tablePrice) {
    double totalPrice = 0;
    int id = price[0];
    int quantity = price[1];

    System.out.println(tablePrice.get(String.valueOf(id)));

    if (tablePrice.containsKey(String.valueOf(id))) {
      totalPrice = tablePrice.get(String.valueOf(id)) * quantity;
    } else {
      System.out.println("Item não encontrado na tabela de preços.");
    }
  
    return totalPrice;
  }

  public static void showResult(double totalPrice) {
    System.out.printf("Total: R$ %.2f%n", totalPrice);
  }
}
