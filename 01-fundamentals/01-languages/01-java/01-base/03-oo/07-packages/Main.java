//UM PACOTE EM JAVA É USADO PARA AGRUPAR CLASSES RELACIONADAS
//PENSAR COMO UMA PASTA DE UM DIRETORIO DE ARQUIVOS
//EXISTEM OS PACOTES DA API JAVA E OS DEFINIDOS PELO USUARIO
//API JAVA É UMA BIBLIOTECA DE CLASSES PRE-ESCRITAS INCLUIDAS NO JDE (JAVA DEVELOPMENT ENVIROMENT).
//https://docs.oracle.com/javase/8/docs/api/
//PODE SER IMPORTADO UMA UNICA CLASSE COM SEUS METODOS E ATRIBUTOS, OU UM PACOTE INTEIRO QUE CONTEM TODAS AS CLASSES QUE PERTENCEM AO PACOTE ESPECIFICADO
//PARA USAR USAR UMA CLASSE OU UM PACOTE É NECESSARIO USAR O import
//Exemplo: import package.name.Class PARA IMPORTAR UMA UNICA CLASSE
//Exemplo: import package.name.*; PARA IMPORTAR TODAS AS CLASSES QUE PERTENCEM AO PACOTE

//NESSE CASO O util É O PACOTE ENQUANTO O Scanner É UMA CLASSE DO PACOTE
import java.util.Scanner;
import gameleira.VideoGame;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe seu nome:");

    String userName = scanner.nextLine();
    System.out.println("Olá, " + userName + "!"); 
    
    VideoGame game = new VideoGame();
    System.out.println(game.name);

  }
}
