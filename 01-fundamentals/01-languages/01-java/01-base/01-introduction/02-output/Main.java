public class Main {
  public static void main(String[] args) {
    //SAIDA COM UMA QUEBRA DE LINHA
    System.out.println("Gabriel Gameleira");

    //SAIDA SEM QUEBRA DE LINHA
    System.out.print("Gabriel Gameleira");

    //É POSSIVEL ADICIONAR NUMEROS
    System.out.println(10);

    //É POSSIVEL CONCATENAR STRINGS
    System.out.println("Hello " + "World!");

    //É POSSIVEL USAR VARIAVEIS
    String name = "Gabriel";
    System.out.println("Olá, " + name);

    //SAIDA COM FORMATACAO
    //É POSSIVEL USAR FORMATAÇÃO DE SAIDA
    System.out.printf("Olá, %s! O seu nome tem %d caracteres.%n", name, name.length());

    //É POSSIVEL USAR CONSTANTES
    final double PI = 3.14159;
    System.out.println("O valor de PI é " + PI);

    //É POSSIVEL USAR NUMEROS
    int sum = 10 + 20;
    int subtraction = 30 - 10;
    int multiplication = 10 * 20;
    int division = 30 / 10;
    int rest = 10 % 3;
    System.out.println("Soma: " + sum);
    System.out.println("Subtração: " + subtraction);
    System.out.println("Multiplicação: " + multiplication);
    System.out.println("Divisão: " + division);
    System.out.println("Módulo: " + rest);

    int increment = ++sum;
    int decrement = --sum;
    System.out.println("Incremento: " + increment);
    System.out.println("Decremento: " + decrement);

    //É POSSIVEL USAR VALORES BOOLEANOS
    boolean isEqual = 10 == 10;
    boolean isNotEqual = 10 != 10;
    boolean isGreaterThan = 10 > 5;
    boolean isLessThan = 10 < 5;
    boolean isGreaterThanOrEqual = 10 >= 10;
    boolean isLessThanOrEqual = 10 <= 5;
    boolean and = true && true;
    boolean or = true || false;
    boolean not = !true;
    System.out.println("Igual: " + isEqual);
    System.out.println("Diferente: " + isNotEqual);
    System.out.println("Maior: " + isGreaterThan);
    System.out.println("Menor: " + isLessThan);
    System.out.println("Maior ou igual: " + isGreaterThanOrEqual);
    System.out.println("Menor ou igual: " + isLessThanOrEqual);
    System.out.println("AND: " + and);
    System.out.println("OR: " + or);
    System.out.println("NOT: " + not);

  }
}