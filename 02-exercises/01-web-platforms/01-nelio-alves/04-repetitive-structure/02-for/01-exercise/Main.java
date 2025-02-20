import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
  public static void main(String[] args) {
    int number = requestValue();
    ArrayList<Integer> odd = getOdd(number);
    showResult(odd);
  }

  public static int requestValue() {
    int number;

    System.out.println("Informe um numero inteiro: ");
    number = scanner.nextInt();
  
    return number;
  }

  public static ArrayList<Integer> getOdd(int number) {
    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 1; i < number; i+=2) { 
      list.add(i);
    }

    return list;
  }

  public static void showResult(ArrayList<Integer> list) {
    for (Integer number: list) {
      System.out.println(number);
    }
  }

}