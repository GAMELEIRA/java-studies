import java.io.BufferedWriter; //UTILIZADO PARA MELHORAR A PERFORMANCE DA ESCRITA
import java.io.File; //CLASSE PARA TRABALHAR COM ARQUIVOS
import java.io.FileNotFoundException;
import java.io.FileWriter; //CLASSE PARA ABRIR O ARQUIVO E ESCREVER NELE
import java.io.IOException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    try {
      // PARA CRIAR UM ARQUIVO EM JAVA
      // PARA CRIAR UM ARQUIVO EM UM CAMINHO ESPECIFICO USAR O \\new
      // File("C:\\Users\\MyName\\filename.txt");
      File myObj = new File("gabriel.txt");

      // VALIDA DE O ARQUIVO FOI CRIADO
      System.out.println("Foi possivel criar o arquivo? " + myObj.createNewFile());

      if (myObj.createNewFile()) {
        System.out.println("Arquivo criado: " + myObj.getName());
      } else {
        System.out.println("Arquivo já existe.");
      }

      // ALTERA A PERMISSÃO DE LEITURA E ESCRITA
      myObj.setReadable(true);
      myObj.setWritable(true);

      FileWriter writer = new FileWriter(myObj, true); // true PARA ADICIONAR UM NOVO CONTEUDO SEM SOBREESCREVER 
      BufferedWriter bufferedWriter = new BufferedWriter(writer);
      bufferedWriter.write("Teste de escrita em arquivos");
      bufferedWriter.newLine(); // ADICIONA UMA NOVA LINHA
      bufferedWriter.close(); // ENCERRA A ESCRITA

      getData(myObj);
      readData(myObj);

      // CRIA UM DIRETORIO EM JAVA
      File dir = new File("gameleira");
      dir.mkdir(); // CRIA UM DIRETORIO

      // APAGA O ARQUIVO
      // delete PODE SER USADO PARA DELETAR UM ARQUIVO OU UMA PASTA
      myObj.delete();

    } catch (IOException e) {
      System.out.println("Erro ao manipular arquivo: " + e.getMessage());
    }
  }

  public static void getData(File myObj) {
    // RETORNA O NOME DO ARQUIVO
    System.out.println("Nome do arquivo: " + myObj.getName());

    // RETORNA A LOCALIZACAO DO ARQUIVO
    System.out.println("Localizacao do arquivo: " + myObj.getAbsolutePath());

    // RETORNA O TAMANHO DO ARQUIVO EM BYTES
    System.out.println("Tamanho do arquivo: " + myObj.length() + " bytes");

    // LISTA TODOS OS ARQUIVOS DE UM DIRETORIO
    System.out.println("Todos os arquivos desse diretorio: " + myObj.list());

    // VALIDA SE O ARQUIVO ESTA DISPONIVEL PARA LEITURA
    System.out.println("Possivel ler? " + myObj.canRead());

    // VALIDA SE O ARQUIVO ESTA DISPONIVEL PARA ESCRITA
    System.out.println("Pode escrever? " + myObj.canWrite());

    // VALIDA SE O ARQUIVO EXISTE
    System.out.println("O arquivo existe? " + myObj.exists());

    // VALIDA SE O ARQUIVO É UM ARQUIVO PADRÃO
    System.out.println("É um arquivo padrao? " + myObj.isFile());

    // VALIDA SE O ARQUIVO É UM DIRETORIO
    System.out.println("É um diretorio padrao? " + myObj.isDirectory());

    // VALIDA SE O ARQUIVO É U ENDEREÇO DE REDE
    System.out.println("É um endereço de rede? " + myObj.isAbsolute());

    // MODIFICA O NOME DO ARQUIVO
    myObj.renameTo(new File("gameleira.txt"));
  }

  public static void readData(File myObj) {
    try {
      // PARA LER OS ARQUIVOS PODEMOS USAR A CLASSE Scanner
      // DEVE SER PASSADO COMO ARGUMENTO O ARQUIVO INSTANCIADO
      Scanner myReader = new Scanner(myObj);

      int count = 1;
      //hasNextLine VALIDA DE HA NOVAS LINHAS PARA SEREM LIDAS
      while (myReader.hasNextLine()) {
        // nextLine LE UMA LINHA DO ARQUIVO E RETORNA-A COMO UMA STRING
        String data = myReader.nextLine();
        System.out.println("Lendo a linha: " + count + ", Conteudo: " + data);
      }
      
      // FECHA O LEITOR DE ARQUIVOS
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
