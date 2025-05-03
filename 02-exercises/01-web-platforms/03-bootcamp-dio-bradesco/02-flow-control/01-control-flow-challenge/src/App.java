import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import services.InvalidParametersException;

public class App {
    private static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) throws Exception {
        ArrayList<Integer> numbers = requestNumbers();
        
        try {
            InvalidParametersException.validateBiggerNumber(numbers);
            showNumbers(numbers);
        } catch (InvalidParametersException e) {
            System.out.println(e.getMessage());
        }

    }

    public static ArrayList<Integer> requestNumbers() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        for (int i = 1; i <= 2; i++) {
            System.out.println("Informe o valor do " + i + " numero: ");
            numbers.add(scanner.nextInt());
        }

        return numbers;
    } 

    public static void showNumbers(ArrayList<Integer> numbers) {
        Integer totalNumbers = numbers.get(1) - numbers.get(0);
       
        for (int i = 0; i <= totalNumbers; i++) {
            System.out.println("Imprimindo o número " + i);
        }

    }
}
