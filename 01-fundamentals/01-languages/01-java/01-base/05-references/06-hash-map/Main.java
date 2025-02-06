import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    //HASH MAP ARMAZENA OS ITENS EM PARES "CHAVE/VALOR" SEMELHANTE AO JSON
    //É POSSIVEL ACESSALOS POR UM INDICE DIFERENTE QUE NAO SEJA UM NUMERO, PODENDO SER UMA STRING
    //OS VALORES ARMAZENADOS SAO OBJETOS, OU SEJA, UTILIZAR String, Integer (int), Double (double), Boolean (boolean), Character (char) etc. 
    HashMap<String, Integer> ddd = new HashMap<String, Integer>();

    //ADICIONANDO ITENS AO HASH MAP
    ddd.put("SP", 11);
    ddd.put("MG", 31);
    ddd.put("RJ", 22);
    ddd.put("ES", 28);

    //RECUPERANDO UM VALOR PELO NOME DA CHAVE
    System.out.println(ddd.get("SP"));

    //REMOVENDO UM ITEM DO HASH MAP
    ddd.remove("MG");

    //VERIFICANDO SE UM ITEM EXISTE NO HASH MAP
    System.out.println(ddd.containsKey("MG"));

    //IMPRIMINDO TODOS OS ITENS DO HASH MAP
    System.out.println(ddd);

    //ALTERANDO O VALOR DE UM ITEM EXISTENTE
    ddd.put("SP", 12);
    System.out.println(ddd.get("SP"));

    //TAMANHO DO HASH MAP
    System.out.println("Tamanho da chave "+ ddd.size());

    //RECUPERANDO AS CHAVES DO HASH MAP
    System.out.println("Todas as chaves: " + ddd.keySet());

    //RETORNANDO TODOS OS VALORES
    System.out.println("Todos os valores: " + ddd.values());

    //REMOVENDO TODOS OS ITENS DO HASH MAP
    ddd.clear();
    System.out.println(ddd);

    //VERIFICANDO SE O HASH MAP ESTA VAZIO
    System.out.println("Está vazio? " + ddd.isEmpty());

  }
}
