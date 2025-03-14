import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number;

        // try catch PERMITE QUE VOCE CONTROLE UM BLOCO DE CODIGO PARA QUE ELE CONSIGA
        // SER RESILIENTE A ERROS
        // try PERMITE QUE VOCE DEFINA UM BLOCO DE CODIGO A SER TESTADO
        try {
            System.out.println("Informe um valor numerico: ");
            number = scanner.nextInt();

            System.out.println("Numero lido: " + number);
            // catch PERMITE DEFINIR UM BLOCO DE CODIGO A SER EXECUTADO CASO OCORRA UM ERRO
            // NO try
        } catch (Exception e) {
            System.out.println("Nao foi possivel ler o numero informado");
            // finally EXECUTA UM BLOCO DE CODIGO APOS A CONCLUSAO DO BLOCO try ou catch
        } finally {
            System.err.println("FINALIZANDO O PROGRAMA");
        }

        scanner.close();
    }
}
