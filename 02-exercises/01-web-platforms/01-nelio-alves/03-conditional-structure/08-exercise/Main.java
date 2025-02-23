import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        double salary = getSalary();
        double taxAmount = getTax(salary);
        showResult(taxAmount);
        scanner.close();
    }

    public static double getSalary() {
        System.out.println("Informe o salario: ");
        return scanner.nextDouble();
    }

    public static double getTax(double salary) {
        double tax = 0.0;

        if (salary > 4500.00) {
            tax += (salary - 4500.00) * 0.28;
            salary = 4500.00;
        }
        if (salary > 3000.00) {
            tax += (salary - 3000.00) * 0.18;
            salary = 3000.00;
        }
        if (salary > 2000.00) {
            tax += (salary - 2000.00) * 0.08;
        }

        return tax;
    }

    public static void showResult(double taxAmount) {
        if (taxAmount == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", taxAmount);
        }
    }
}
