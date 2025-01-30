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

  }
}
