public class Main {
  public static void main(String[] args) {
    //TODA VARIAVEL PRECISA SER TIPADA, ASSIM COMO RETORNO DE FUNCOES.
    //EM JAVA EXISTEM OS TIPOS PRIMITIVOS E OS TIPOS POR REFERENCIA
    //TIPOS PRIMITIVOS: byte, short, int, long, float, double
    //TIPOS POR REFERENCIA: String
    //OS TIPOS DEFINEM O TIPO DA VARIAVEL E QUAIS VALORES ELA PODE CONTER


    //=======================================================================
    //DATA TYPE | DESCRIPTION 
    //byte     | 8 bits, NUMEROS DE -128 ATE 127
    //short    | 16 bits, NUMEROS DE -32.768 ATE 32.767
    //int      | 32 bits, NUMEROS DE -2.147.483.648 ATE 2.147.483.647
    //long     | 64 bits, NUMEROS DE -9.223.372.036.854.775.808 ATE 9.223.372.036.854.775.807
    //float    | 32 bits, NUMEROS DE 3.4 x 10^-38 ATE 3.4 x 10^38, PODE CONTER ATE 7 DIGITOS DECIMAIS
    //double   | 64 bits, NUMEROS DE 1.7 x 10^-308 ATE 1.7 x 10^308, PODE CONTER ATE 16 DIGITOS DECIMAIS
    //char     | 16 bits, CADEIA DE CARACTERES 0 ATE 65.535, Unicode 16-bit code unit
    //boolean  | VALORES BOOLEANOS true or false
    //String   | SEQUENCIA DE CARACTERES
    //=======================================================================

    //OS NUMEROS PRIMITIVOS SAO DIVIDIDOS EM DOIS GRUPOS
    //NUMEROS INTEIROS: byte, short, int e long
    //NUMEROS FLUTUANTES: float e double
    
    byte myByte = 127;
    short myShort = 32767;
    int myInt = 2147483647;
    long myLong = 9223372036854775807L;
    float myFloat = 3.4E38f;
    double myDouble = 1.7d;
    
    System.out.println("byte: " + myByte);
    System.out.println("short: " + myShort);
    System.out.println("int: " + myInt);
    System.out.println("long: " + myLong);
    System.out.println("float: " + myFloat);
    System.out.println("double: " + myDouble);

    //CARACTERES PODEM SER DEFINIDOS POR char e String
    //CHAR: UM CARACTERE DE 16 BITS E CODIGOS DA TABELA ASCII
    //STRING: UMA SEQUENCIA DE CARACTERES, QUE Pode CONTENER ESPACOS EM BRANCO, NUMEROS, CARACTERES ESPECIAIS
    //EXEMPLOS: 'a', "Gabriel Gameleira dos Santos", 10, 'A', '1', '!', 'é', '\t', '\n'...
    //OBS: CHAR PODE REPRESENTAR CARACTERES UNICODE
    //      STRING PODE REPRESENTAR TEXTOS COM ESPACOS EM BRANCO, NUMEROS, CARACTERES ESPECIAIS
    //      OBS: STRING É UM TIPO DE VARIAVEIS POR REFERENCIA, OU seja, ELE É UM CONTEINER DE CARACTERES

    char myChar = 'a'; //PARA O TIPO char ASPAS SIMPLES
    char myChar1 = 33;
    String myString = "Gabriel Gameleira dos Santos"; //PARA O TIPO String ASPAS DUPLAS

    System.out.println("char: " + myChar);
    System.out.println("char1 "+  myChar1);
    System.out.println("String: " + myString);

    //VALORES BOOLEANOS REPRESENTAM SIM OU NAO / VERDADEIRO OU FALSO / 0 OU 1
    //ESSE TIPO DE VALOR TAMBEM PODE SER OBTIDO POR MEIO DE CONDICIONAIS. EXEMPLO 10 == 10 (IGUAL A TRUE)
    boolean myBoolean = true;
    System.out.println("boolean: " + myBoolean);

  }  
}
