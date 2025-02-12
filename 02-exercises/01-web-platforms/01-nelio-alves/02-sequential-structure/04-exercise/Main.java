import java.util.Locale;
import java.util.Scanner;

public class Main {

  public static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);

    int id = requestId();
    double hoursWorked = requestHoursWorked();
    double salaryHoursWorked = requestSalaryHoursWorked();
    double grossSalary = calculateGrossSalary(hoursWorked, salaryHoursWorked);

    showResult(id, grossSalary);
    scanner.close();
  }

  public static int requestId() {
    System.out.print("Informe o seu ID: ");
    int id = scanner.nextInt();

    return id;
  }

  public static double requestHoursWorked() {
    System.out.print("Informe as horas trabalhadas: ");
    double hoursWorked = scanner.nextDouble();

    return hoursWorked;
  }

  public static double requestSalaryHoursWorked() {
    System.out.print("Informe o salario por hora trabalhada: ");
    double salaryHoursWorked = scanner.nextDouble();

    return salaryHoursWorked;
  }

  public static double calculateGrossSalary(double hoursWorked, double salaryHoursWorked) {
    return hoursWorked * salaryHoursWorked;
  }

  public static void showResult(int id, double pay) {
    System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", id, pay);
  }
}
