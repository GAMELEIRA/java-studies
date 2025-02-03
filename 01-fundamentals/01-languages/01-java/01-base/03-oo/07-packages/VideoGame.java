//PARA CIRAR SEU PROPRIO PACOTE O JAVA USA O DIRETORIO DE SISTEMA DE ARQUIVOS PARA ARMAZENA-LOS
//PARA CRIAR UM PACOTE USE A PALAVRA RESERVADA package
//QUANDO COMPILAR DEVE SER EXECUTADO javac -d . VideoGame.java
//PARA EXECUTAR EXECUTE: java gameleira.VideoGame

package gameleira;  // AQUI COLOCA O NOME DO SEU PACOTE

public class VideoGame {
  public String name = "PlayStation";

  public static void main(String[] args) {
    VideoGame videoGame = new VideoGame(); 
    System.out.println(videoGame.name); 
  }
}
