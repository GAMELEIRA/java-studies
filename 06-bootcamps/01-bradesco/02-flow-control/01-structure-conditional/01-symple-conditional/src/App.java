public class App {
    public static void main(String[] args) throws Exception {
        double balance = 25.0;
        double valueRequest = 17.0; 

        //ESTRUTURA CONDICIONAL SIMPLES SE BASEA EM EXECUTAR UM BLOCO DE CODIGO BASEANDO-SE EM UMA CONDICAO
        if (valueRequest < balance) {
            balance -= valueRequest;
        }

        System.out.println(balance);
    }
}
