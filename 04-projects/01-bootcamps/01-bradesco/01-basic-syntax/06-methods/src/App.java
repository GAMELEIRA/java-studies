public class App {
    //METODOS SAO ACOES QUE UMA CLASSE É CAPAZ DE EXECUTAR
    //REGRAS
    //NOMEADO COMO VERBO
    //CAMELCASE
    //RESPONSABILIDADE UNICA
    //DEVE TER UMA PROPOSTA INICIAL
    //DEVE OU NAO RETORNAR UM VALOR?
    //DEVE TER PARAMETROS?
    //TERA ERROS DE EXCESSAO?
    //DEVE SER VISIVEL PARA TODOS OS PROGRAMAS?
    public static void main(String[] args) throws Exception {
        showMessage("Oi");
    }

    public static void showMessage(String message) {
        System.out.println(message);
    }
}
