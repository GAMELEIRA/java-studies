import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  public static void main(String[] args) {
    int correctPassword = 2002;
    int password;

    do {
      System.out.print("Informe uma senha: ");
      password = scanner.nextInt();
      if (password != correctPassword) {
        System.out.println("Senha Invalida");
      } else {
        System.out.println("Acesso permitido!");
      }
    } while (password != correctPassword);
  }
}