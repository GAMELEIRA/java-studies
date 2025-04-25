import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    //HashSet É UMA COLECAO DE ITENS ONDE CADA ITEM É UNICO
    //OS VALORES ARMAZENADOS SAO OBJETOS, OU SEJA, UTILIZAR String, Integer (int), Double (double), Boolean (boolean), Character (char) etc. 
    HashSet<String> cars = new HashSet<String>();

    //ADICIONANDO
    cars.add("Gol");
    cars.add("Fiat");
    cars.add("Ford");
    cars.add("Fiat");
    cars.add("Fiat"); //ESSE ITEM POR SER IGUAL A UM ITEM JA PRESENTE NA LISTA SERA DESCONSIDERADO

    System.out.println("Lista completa de carros: " + cars);

    //REMOVENDO
    cars.remove("Fiat");

    System.out.println("Lista após a exclusão de itens" + cars);

    //VERIFICANDO SE UM CARRO EXISTE
    System.out.println("O carro 'Fiat' está na lista? " + cars.contains("Fiat"));

    //VERIFICANDO O TAMANHO DA LISTA
    System.out.println("Tamanho da lista: " + cars.size());

    //VERIFICANDO SE A LISTA ESTA VAZIA
    System.out.println("A lista está vazia? " + cars.isEmpty());

    //ITERANDO EM UMA LISTA
    System.out.println("Iterando sobre a lista:");
    for (String car : cars) {
      System.out.println(car);
    }

    //EXCLUINDO TODOS OS ITENS
    cars.clear();
    System.out.println("A lista está vazia? " + cars.isEmpty());

  }
}
