import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    //AS CLASSES WRAPPER FORNCEM UMA MANEIRA DE USAR TIPOS DE DADOS PRIMITIVOS COMO OBJETOS
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //TIPOS PRIMITIVOS | WRAPPER CLASS
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
    //byte         | Byte
    //short        | Short
    //int          | Integer
    //long         | Long
    //float        | Float
    //double       | Double
    //char         | Character
    //boolean      | Boolean
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

    Integer num = 10;
    System.out.println("Original number: " + num);

    //CLASSES WRAPPERS SERAO UTILIZADAS NA DECLARACAO DE ArrayList, ONDE TIPOS PRIMITIVOS NAO PODEM SER USADOS (A LISTA SO PODE ARMAZENAR OBJETOS)
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(num);

    System.out.println(myNumbers);

    //COMOS ESTAMOS USANDO OBJETOS EXISTEM METODOS QUE PODEMOS USAR SOBRE O OBJETO ESPECIFICO
    Integer myInt = 5;
    System.out.println("valor do inteiro: " + myInt.intValue());

    //CONVERTER OBJETOS EM STRINGS
    System.out.println("valor convertido para String: " + myInt.toString());
  }
}
