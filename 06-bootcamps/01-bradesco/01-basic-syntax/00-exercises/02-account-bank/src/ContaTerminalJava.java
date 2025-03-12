import java.util.Locale;
import java.util.Scanner;

import models.Account;
import models.User;

public class ContaTerminalJava {
    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

    public static void main(String[] args) {
        String name = requestNameOfUser();
        String agency = requestAgencyOfUser();
        int number = requestNumber();
        double balance = requestBalance();

        User user = new User(name);
        Account account = new Account(agency, number, balance, user);
        user.account = account;

        showResult(user);

        scanner.close();
    }

    private static String requestNameOfUser() {
        String name;

        do {
            System.out.println("Informe seu nome: ");
            name = scanner.nextLine().trim();
            if (name.isEmpty()) {
                System.out.println("Nome não pode ser vazio. Tente novamente.");
            }
        } while (name.isEmpty());

        return name;
    }

    private static String requestAgencyOfUser() {
        String agency;

        do {
            System.out.println("Por favor, digite o número da Agência: ");
            agency = scanner.nextLine().trim();
            if (agency.isEmpty()) {
                System.out.println("Número da agência não pode ser vazio. Tente novamente.");
            }
        } while (agency.isEmpty());

        return agency;
    }

    private static int requestNumber() {
        int number = 0;
        boolean valid;

        do {
            System.out.println("Informe o número da conta: ");
            try {
                number = scanner.nextInt();
                valid = true;
            } catch (Exception e) {
                System.out.println("Número inválido. Informe um número válido como: 1234, 1021 etc.");
                scanner.nextLine();
                valid = false;
            }
        } while (!valid);

        scanner.nextLine();
        return number;
    }

    private static double requestBalance() {
        double balance = 0;
        boolean valid;

        do {
            System.out.println("Informe o seu saldo: ");
            try {
                balance = scanner.nextDouble();
                valid = true;
            } catch (Exception e) {
                System.out.println("Valor inválido. Informe um valor válido como: 12345.12 ou 123234.900 etc.");
                scanner.nextLine();
                valid = false;
            }
        } while (!valid);

        scanner.nextLine();
        return balance;
    }

    private static void showResult(User user) {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque%n", 
            user.name, user.account.agency, user.account.number, user.account.balance);
    }
}