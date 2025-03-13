public class App {
    public static void main(String[] args) throws Exception {

        String club = "Palmeiras";
        // EXECUTA UM BLOCO DE CODIGO BASEADO EM UM VALOR
        switch (club) {
            case "Corinthians":
                System.out.println("GRANDE");
                break;
            case "Palmeiras": 
                System.out.println("MEDIO");
                break;
            default:
                System.out.println("PEQUENO");
                break;
        }

    }
}
