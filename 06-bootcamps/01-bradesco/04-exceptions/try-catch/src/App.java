import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number;

        //try catch PERMITE QUE VOCE CONTROLE UM BLOCO DE CODIGO PARA QUE ELE CONSIGA SER RESILIENTE A ERROS
        try {
            System.out.println("Informe um valor numerico: ");
            number = scanner.nextInt();
    
            System.out.println("Numero lido: " + number);
        } catch (Exception e) {
            System.out.println("Nao foi possivel ler o numero informado");
        }


        scanner.close();
    }
}
