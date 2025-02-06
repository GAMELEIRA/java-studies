import java.util.ArrayList; //PARA IMPORTAR ARRAYS DINAMICOS
import java.util.LinkedList; //PARA IMPORTAR ARRAYS DINAMICOS

public class Main {
  public static void main(String[] args) {
    //MATRIZES SAO USADAS PARA ARMAZENAR VARIOS VALORES EM UMA UNICA VARIAVEL
    //EXISTEM AS MATRIZES UNIDIMENSIONAIS, BIDIMENSIONAIS E AS MULTIDIMENSIONAIS

    //1. MATRIZ UNIDIMENSIONAIS/VETORES
    //FORMAS DE DECLARACAO 
    int[] array1 = { 1, 2, 3, 4, 5 };
    String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
    int[] numbers = { 10, 20, 30, 40 };

    //ALTERANDO VALORES
    cars[0] = "Toyota";
    numbers[1] = 50;

    //ACESSANDO VALORES
    System.out.println("First car: " + cars[0]);
    System.out.println("Second car: " + cars[1]);
    System.out.println("First number: " + numbers[0]);
    System.out.println("Second number: " + numbers[1]);

    //ATRIBUTOS E FUNCOES
    //length - RETORNA O NUMERO DE ELEMENTOS DA ARRAY
    System.out.println("Number of cars: " + cars.length);
    System.out.println("Number of numbers: " + numbers.length);

    //2. MATRIZ BIDIMENSIONAL
    //UMA MATRIX BIDIMENSIONAL É UMA MATRIZ COM LINHAS E COLUNAS
    //UTEIS PARA QUANDO É NECESSARIO ARMAZENAR DADOS EM FORMATO TABULAR. OU SEJA, UMA TABELA DE LINHAS E COLUNAS
    
    //FORMAS DE DECLARACAO
    int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    //ALTERANDO VALORES
    matrix[1][2] = 100;

    //ACESSANDO VALORES
    System.out.println("Element at (1, 2): " + matrix[1][2]);

    //3. MATRIZ MULTIDIMENSIONAL
    //MATRIZES MULTIDIMENSIONAIS SAO MATRIZES QUE POSSUEM VARIOS NIVELS DE INDICES
    //E UTILIZADAS EM PROJETOS MAIS COMPLEXOS, COMO ARMAZENAR DADOS EM FORMATOS 3D OU EM MODELOS 3D.
    
    //FORMAS DE DECLARACAO
    int[][][] cube = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, { { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } } };

    //ALTERANDO VALORES
    cube[1][2][2] = 1000; //BLOCO 2, LINHA 3, COLUNA 1 = 17

    //ACESSANDO VALORES
    System.out.println("Element at (1, 2, 1): " + cube[1][2][1]);

    //O ArrayList É UMA CLASSE QUE PODE SER ENCONTRADO NO PACOTE java.util
   
    //+++++++++++++++++++++++++++++++++++++++++++ ARRAYLIST +++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    
    //UM ArrayList É DINAMICO, OU SEJA, OS ITENS PODEM SER ADICIONADOS E REMOVIDOS A QUALQUER MOMENTO 
    //TODA TIPAGEM DO ArrayList É UMA CLASSE. ISSO PORQUE OS ITENS DO ARRAY SAO NA VERDADE OBJETOS. OU SEJA, UTILIZAR String, Integer (int), Double (double), Boolean (boolean), Character (char) etc. 
    ArrayList<String> listOneCars = new ArrayList<String>();

    //ADICIONANDO ELEMENTOS
    listOneCars.add("Volvo");
    listOneCars.add("BMW");
    listOneCars.add("Ford");
    listOneCars.add(0, "Ferrari"); //ADICIONANDO COM UM INDICE

    System.out.println("Lista de carros: " + listOneCars);

    //BUSCANDO UM ITEM 
    System.out.println("Primeiro carro: " + listOneCars.get(0)); //INDICE DA POSICAO DO ARRAY

    //ALTERANDO UM ITEM
    listOneCars.set(0, "Toyota"); //INDICE DA POSICAO DO ARRAY, E O NOVO VALOR
    System.out.println("Primeiro carro após alterar: " + listOneCars.get(0));

    //REMOVENDO UM ITEM
    listOneCars.remove(1); //INDICE DA POSICAO DO ARRAY
    System.out.println("Lista de carros após remover o segundo carro: " + listOneCars);

    //VERIFICANDO SE UM ITEM ESTA NA LISTA
    System.out.println("BMW está na lista? " + listOneCars.contains("BMW"));

    //VERIFICANDO O TAMANHO DA LISTA
    System.out.println("Tamanho da lista: " + listOneCars.size());    
  
    //REMOVENDO TODOS OS ITENS DO ARRAY
    listOneCars.clear();
    System.out.println("Lista de carros após remover todos: " + listOneCars);

    //++++++++++++++++++++++++++++++++++++++++++++++++++ LinkedList ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    //Uma LinkedList é UMA LISTA DINAMICA, OU SEJA, OS ITENS PODEM SER ADICIONADOS E REMOVIDOS A QUALQUER MOMENTO
    //TODA TIPAGEM DO LinkedList É UMA CLASSE. ISSO PORQUE OS ITENS DO ARRAY SAO NA VERDADE OBJETOS. OU SEJA, UTILIZAR String, Integer (int), Double (double), Boolean (boolean), Character (char) etc. 
    //LinkedList IMPLEMENTA A INTERFACE List, OU SEJA, OS METODOS PRESENTES EM  ArrayList
    //O LinkedList FORNECE METODOS PARA REALIZAR OPERACOES DE FORMA MAIS EFICIENTE
    LinkedList<String> listCars = new LinkedList<String>();
    
    //ADICIONANDO ELEMENTOS
    listCars.add("Volvo");
    listCars.add("BMW");
    listCars.add("Ford");
    listCars.addFirst("Ferrari"); //ADICIONANDO NO INICIO

    System.out.println("Lista de carros: " + listCars);

    //BUSCANDO UM ITEM 
    System.out.println("Primeiro carro: " + listCars.get(0)); //INDICE DA POSICAO DO ARRAY

    //ALTERANDO UM ITEM
    listCars.set(0, "Toyota"); //INDICE DA POSICAO DO ARRAY, E O NOVO VALOR
    System.out.println("Primeiro carro após alterar: " + listCars.get(0));

    //REMOVENDO UM ITEM
    listCars.remove(1); //INDICE DA POSICAO DO ARRAY
    System.out.println("Lista de carros após remover o segundo carro: " + listCars);

    //VERIFICANDO SE UM ITEM ESTA NA LISTA
    System.out.println("BMW está na lista? " + listCars.contains("BMW"));

    //VERIFICANDO O TAMANHO DA LISTA
    System.out.println("Tamanho da lista: " + listCars.size());

    //ADICIONA UM ITEM NO COMECO DA LISTA
    listCars.addFirst("Honda");
    System.out.println("Lista de carros após adicionar o primeiro carro: " + listCars);

    //ADICIONA UM ITEM NO FINAL DA LISTA
    listCars.addLast("Nissan");
    System.out.println("Lista de carros após adicionar o ultimo carro: " + listCars);

    //REMOVENDO UM ITEM DO COMECO DA LISTA
    listCars.removeFirst();
    System.out.println("Lista de carros após remover o primeiro carro: " + listCars);

    //REMOVENDO UM ITEM DO FINAL DA LISTA
    listCars.removeLast();
    System.out.println("Lista de carros após remover o primeiro e o ultimo carro: " + listCars);

    //REMOVENDO TODOS OS ITENS DO ARRAY
    listCars.clear();
    System.out.println("Lista de carros após remover todos: " + listCars);
    
  }
}
