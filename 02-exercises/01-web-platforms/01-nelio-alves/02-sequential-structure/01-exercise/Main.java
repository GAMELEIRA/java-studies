import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> list = requestNumbers();
    Integer result = sumAllValues(list);

    showResult(result);

  }

  public static ArrayList<Integer> requestNumbers() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 1; i < 3; i++) {
      try {
        System.out.printf("%d) Informe um numero inteiro: ", i);
        list.add(scanner.nextInt());
      } catch (Exception e) {
        System.out.println("Valor invalido. Por favor, informe um numero inteiro.");
        i--;
        scanner.next();
       }
    }

    scanner.close();
    return list;
  }

  public static Integer sumAllValues(ArrayList<Integer> list) {
    Integer result = 0;

    for (Integer i : list) {
      result += i;
    }

    return result;
  }

  public static void showResult(Integer result) {
    System.out.printf("SOMA = %d", result);
  }
}
