public class App {
    public static void main(String[] args) throws Exception {
        int score = 6;

        // ESTRUTURA CONDICIONAL ENCADEADA SE BASEA EM EXECUTAR UM BLOCO DE CODIGO ESPECIFICO
        // PARA CADA CONDICIONAL
        if (score >= 7) {
            System.out.println("Aprovado");
        } else if (score >= 5 && score < 7) {
            System.out.println("Prova Recuperação");
        } else {
            System.out.println("Reprovado");
        }

    }
}
