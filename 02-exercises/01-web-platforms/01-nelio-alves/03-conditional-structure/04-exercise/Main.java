import java.util.Locale;
import java.util.Scanner;

public class Main {
  public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

  public static void main(String[] args) {
    int[] numbers = requestNumbers();
    int durationGame = calculateDurationGame(numbers);
    showResult(durationGame);
    scanner.close();
  }

  public static int[] requestNumbers() {
    int initHour = 0;
    int finalHour = 0;
    int[] hours;

    System.out.println("Informe o horario do inicio do jogo: ");
    initHour = scanner.nextInt();
    System.out.println("Informe o horario do final do jogo: ");
    finalHour = scanner.nextInt();
    hours = new int[] { initHour, finalHour };
    scanner.close();

    return hours;
  }

  public static int calculateDurationGame(int[] hours) {
    if (hours[0] < hours[1]) {
      return Math.abs(hours[0] - hours[1]);
    } else if (hours[0] > hours[1]) {
      return (24 - hours[0]) + hours[1];
    } else {
      return 24;
    }
  }

  public static void showResult(int durationGame) {
    System.out.println("O JOGO DUROU " + durationGame + " HORA(S).");
  }

}
