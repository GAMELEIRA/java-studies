import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  public static void main(String[] args) {
    HashMap<String, String> products = buildProductsTable();
    HashMap<String, Integer> purchasingTable = getPurchasingTable(products);
    showResult(purchasingTable);
    scanner.close();
  }

  public static HashMap<String, String> buildProductsTable() {
    HashMap<String, String> products = new HashMap<>();

    products.put("1", "Alcool");
    products.put("2", "Gasolina");
    products.put("3", "Diesel");

    return products;
  }

  private static int requestIdProduct() {
    int id;

    System.out.println("Informe um codigo valido de um produto: ");
    id = scanner.nextInt();

    return id;
  }

  public static HashMap<String, Integer> getPurchasingTable(HashMap<String, String> products) {
    int id = 0;
    int alcohol = 0;
    int gasoline = 0;
    int diesel = 0;
    HashMap<String, Integer> purchasingTable = new HashMap<String, Integer>();

    do {
      id = requestIdProduct();
      if (products.containsKey(String.valueOf(id))) {
        String product = products.get(String.valueOf(id));
        if (product == "Alcool") {
          alcohol++;
        } else if (product == "Gasolina") {
          gasoline++;
        } else {
          diesel++;
        }
      } else {
        System.out.println("Codigo invalido.");
      }
    } while (id != 4);

    purchasingTable.put("Alcool", alcohol);
    purchasingTable.put("Gasolina", gasoline);
    purchasingTable.put("Diesel", diesel);

    return purchasingTable;
  }

  public static void showResult(HashMap<String, Integer> purchasingTable) {
    System.out.println("MUITO OBRIGADO");
    for (String product : purchasingTable.keySet()) {
      System.out.printf("%s: %d%n", product, purchasingTable.get(product));
    }
  }
}
