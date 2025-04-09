public class Main {
  public static void main(String[] args) {
    // AS EXCECOES SAO ERROS OCORRIDOS QUE PODEM ACONTECER DURANTE A EXECUCAO DO
    // CODIGO
    // OS ERROS PODEM SER CAUSADOS POR n MOTIVOS. ERRO DE LOGICA, ENTRADAS
    // INCORRETAS DO USUARIO ETC.
    // OS ERROS/EXCECOES ENCERRAM O PROGRAMA
    // COM try catch EM CASO DE ERRO, O PROGRAMA CONTINUA A EXECUTAR E GERA UMA
    // EXCECAO

    int[] myNumbers = { 1, 2, 3 };

    try {
      // try INSTRUCAO QUE PERMITE QUE VOCE DEFINA UM BLOCO DE CODIGO A SER TESTADO
      // QUANTO A ERROS EQNUANTO ELE ESTA SENDO EXECUTADO
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      // catch INSTRUCAO QUE PERMITE QUE VOCE DEFINA UM BLOCO DE CODIGO A SER
      // EXECUTADO CASO OCORRA UM ERRO
      // IMPRIME O MENSAGEM DE ERRO
      System.out.println("Ocorreu um erro: " + e.getMessage());
      System.out.println("Nao foi possivel acessar o indice informado");
      //throw PERMITE QUE VOCE CRIE UM ERRO PERSONALIZADO 
      //EXISTEM MUITOS TIPOS E EXCESSAO DISPONIVEIS EM JAVA ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException
      throw new ArrayIndexOutOfBoundsException("Nao foi possivel retorna o valor do indice informado");
    } finally {
      // BLOCO QUE SERA EXECUTADO SEMPRE, SE O TRY OU O CATCH FOREM EXECUTADOS
      // COM SUCESSO OU COM ERRO
      System.out.println("Este bloco sempre sera executado");
    }
  }
}
