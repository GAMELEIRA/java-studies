public class Main {
  public static void main(String[] args) {
    // CONDICIONAIS PERMITEM COM QUE VOCE POSSA CRIAR VALIDACOES PARA DESVIO DE

    String nameOne = "Gabriel";
    String nameTwo = "Cibele";
    int fansClubOne = 100;
    int fansClubTwo = 200;
    String phraseOne = "O clube um tem mais torcedores!";
    String phraseTwo = "O clube dois tem mais torcedores!";
    int weekDay = 4;

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

    //USAR OPERADOR TERNARIO PARA SIMPLIFICAR O USO DE CONDICIONAIS if e else
    //EXISTEM 3 OPERANDOS PARA COMPOR UM OPERADOR TERNARIO
    //A CONDICAO É VERIFICADA, SE VERDADEIRA, O PRIMEIRO OPERANDO É RETORNADO, SE FALSA, O SEGUNDO OPERANDO É RETORNADO
    String result = (fansClubOne > fansClubTwo)? phraseOne: phraseTwo;
    System.out.println(result);

    // USAR switch PARA ESPECIFICAR UM BLOCO DE CODIGO A SER EXECUTADO, DE ACORDO COM UM VALOR
    switch (weekDay) {
      case 0:
        System.out.println("Domingo");
        break;
      case 1:
        System.out.println("Segunda");
        break;
      case 2:
        System.out.println("Terça");
        break;
      case 3:
        System.out.println("Quarta");
        break;
      case 4:
        System.out.println("Quinta");
        break;
      case 5:
        System.out.println("Sexta");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      default:
        System.out.println("Dia inválido!");
        break;
    }
  }
}