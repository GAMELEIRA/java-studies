import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        boolean toMeet = false;

        //do while É UMA ESTRUTURA DE REPETICAO QUE EXECUTA UM BLOCO DE CODIGO PELO MENOS UMA VEZ ANTES DE VALIDAR UMA CONDICAO
        do {
            System.out.println("Tocando!");
            System.out.println("Atender?");
            toMeet = scanner.nextBoolean();
        } while(!toMeet);

        scanner.close();
    }
}
