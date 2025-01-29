public class Main {
  public static void main(String[] args) {
    // CONDICIONAIS PERMITEM COM QUE VOCE POSSA CRIAR VALIDACOES PARA DESVIO DE
    // FLUXO

    String nameOne = "Gabriel";
    String nameTwo = "Cibele";
    int fansClubOne = 100;
    int fansClubTwo = 200;

    // USAR if PARA ESPECIFICAR UM BLOCO DE CODIGO A SER EXECUTADO, SE UMA CONDICAO
    if (nameOne.equals(nameTwo)) {
      System.out.println("Os nomes são iguais!");
    }

    // USAR else PARA ESPECIFICAR UM BLOCO DE CODIGO A SER EXECUTADO, SE A PRIMEIRA CONDICAO NAO FOR VERDADEIRA
    if (nameOne.equals(nameTwo)) {
      System.out.println("Os nomes são iguais!");
    } else {
      System.out.println("Os nomes são diferentes!");
    }

    //USAR else if PARA ESPECIFICAR UM BLOCO DE CODIGO A SER EXECUTADO, SE UMA CONDICAO ESPECIFICADA FOR VERDADEIRA
    if (fansClubOne > fansClubTwo) {
      System.out.println("O clube um tem mais torcedores!");
    } else if(fansClubTwo > fansClubOne) {
      System.out.println("O clube dois tem mais torcedores!");
    } else {
      System.out.println("Os clubes possuem o mesmo número de torcedores!");
    }
  }
}