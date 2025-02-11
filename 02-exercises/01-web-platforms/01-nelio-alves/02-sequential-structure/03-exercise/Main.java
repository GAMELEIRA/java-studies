import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = requestNumbers();
    ArrayList<Integer> products = getProducts(numbers);
    int result = calculateProducts(products);
    showResult(result);
  }

  public static ArrayList<Integer> requestNumbers() {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    Scanner scanner = new Scanner(System.in);

    for (int i = 1; i < 5; i++) {
      System.out.println("Informe um numero " + i + ":");
      int number = scanner.nextInt();
      numbers.add(number);
    }

    scanner.close();

    return numbers;
  }

  public static ArrayList<Integer> getProducts(ArrayList<Integer> numbers) {
    ArrayList<Integer> products = new ArrayList<Integer>();

    for (int i = 0; i < numbers.size(); i++) {
      products.add(numbers.get(i) * numbers.get(++i));
    }

    return products;
  }

  public static int calculateProducts(ArrayList<Integer> products) {
    int result = 0;
    for (int i = 0; i < products.size(); i++) {
      result += products.get(i) - products.get(++i);
    }
    return result;
  }

  public static void showResult(int result) {
    System.out.println("Diferenca: " + result);
  }

}
