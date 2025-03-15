public class App {
    public static void main(String[] args) throws Exception {

        // ESTRUTURA DE REPETICAO FOR EXECUTA BLOCO DE CODIGO
        // BASEANDO-SE EM UM CONDICAO ONDE UM CONTADOR É AUMENTADO OU DECREMENTADO
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break; // break É UTULIZADO PARA INTERROMPER UM LACO DE REPETICAO
            }
            System.out.println(i);
        }

        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                break; // continue É UTULIZADO PARA INTERROMPER A EXECUCAO ATUAL E SEGUIR PARA O PROXIMO LACO DE REPETICAO
            }
            System.out.println(i);
        }

    }
}
