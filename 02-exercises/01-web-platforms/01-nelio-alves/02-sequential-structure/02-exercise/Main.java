import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static final float PI = 3.14159f;
  public static void main(String[] args) {

    Locale.setDefault(Locale.US);
    
    double radius = requestRadius();
    double result = calculateArea(radius);
    showResult(result);

  }  

  public static double requestRadius() {
    double radius = 0.0f;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o raio do circulo: ");
    radius = scanner.nextDouble();
    scanner.close();
    
    return radius;
  }

  public static double calculateArea(double radius) {
    return (double) (PI * Math.pow(radius, 2));
  }

  public static void showResult(double result) {
    System.out.printf("A area do circulo e %.4f%n", result);
  }

}
