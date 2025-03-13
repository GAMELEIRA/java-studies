import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean toMeet = false;

        do {
            System.out.println("Tocando!");
            System.out.println("Atender?");
            toMeet = scanner.nextBoolean();
        } while(!toMeet);

        scanner.close();
    }
}
