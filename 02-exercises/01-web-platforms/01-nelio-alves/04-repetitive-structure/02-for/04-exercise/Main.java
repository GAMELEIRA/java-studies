import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  public static void main(String[] args) {
    int quantityDivisions = requestNumber();
    ArrayList<ArrayList<Double>> listNumbers = getNumbers(quantityDivisions);
    ArrayList<Double> resultDivisions = calculateDivisions(listNumbers);
    showResultDivisions(resultDivisions);

    scanner.close();
  }

  public static int requestNumber() {
    int number; 

    System.out.println("Informe a quantidade de divisoes que serao calculadas: ");
    number = scanner.nextInt();

    return number;
  }

  public static ArrayList<ArrayList<Double>> getNumbers(int quantityDivisions) { 
    ArrayList<ArrayList<Double>> listNumbers = new ArrayList<ArrayList<Double>>();
    
    for (int i = 0; i < quantityDivisions; i++) {
      ArrayList<Double> numbers = new ArrayList<Double>();
      for (int j = 0; j < 2; j++) {
        numbers.add(scanner.nextDouble());
      }
      listNumbers.add(numbers);
    }

    return listNumbers;
  }

  public static ArrayList<Double> calculateDivisions(ArrayList<ArrayList<Double>> listNumbers) {
    ArrayList<Double> divisionsList = new ArrayList<Double>();
    
    for (ArrayList<Double> numbers : listNumbers) {
      try {
        double resultDivision = numbers.get(0) / numbers.get(1);
        divisionsList.add(resultDivision);
      } catch (ArithmeticException e) {
        System.out.printf("Erro ao realizar a divisao: %d / %d", numbers.get(0), numbers.get(1));
      }
    }

    return divisionsList;
  }

  public static void showResultDivisions(ArrayList<Double> resultDivisions) {
    System.out.println("Resultados: ");
    for (Double resultDivision: resultDivisions) {
      System.out.println(resultDivision);
    }
  }
}
