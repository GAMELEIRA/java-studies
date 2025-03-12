import java.util.Locale;
import java.util.Scanner;

import models.Account;
import models.User;

public class ContaTerminalJava {
    public static Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    public static void main(String[] args) throws Exception {
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


        System.out.println("Informe seu nome: ");
        name = scanner.nextLine();

        return name;
    }   

    private static String requestAgencyOfUser() {
        String agency;

        System.out.println("Por favor, digite o número da Agência");
        agency = scanner.nextLine();

        return agency;
    }

    private static int requestNumber() {
        int number;

        System.out.println("Informe o numero da conta");
        number = scanner.nextInt();

        return number; 
    }

    private static double requestBalance() {
        double balance;

        System.out.println("Informe o seu saldo");
        balance = scanner.nextDouble();

        return balance;
    }

    private static void showResult(User user) {
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", user.name, user.account.agency, user.account.number, user.account.balance);
    }

}
