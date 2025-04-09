public class Main {
  
  public static void main(String[] args) {
    //OPERADORES SAO USADOS PARA EXECUTAR OPERACOES VARIAVEIS E MATEMATICAS
    int x = 10 + 100;
    int sum1 = 100 + 50;
    int sum2 = sum1 + 250;
    int sum3 = sum2 + sum2;
    System.out.println("Soma: " + sum3);

    //JAVA DIVIDE OS OPERADORES NOS SEGUINTES GRUPOS
    //OPERADORES ARITMETICOS
    //OPERADORES DE ATRIBUICAO
    //OPERADORES DE INCREMENTO E DECREMENTO
    //OPERADORES RELACIONAIS
    //OPERADORES LÓGICOS
    //OPERADORES DE CONJUNCAO E DISJUNCAO
    //OPERADORES BIT A BIT
    //OPERADORES DE PRECEDENCIA
    //OPERADORES TERNARIOS

    //OPERADORES ARITMETICOS
    int sum = 100 + 50;
    int subtraction = 100 - 50;
    int multiplication = 10 * 5;
    int division = 100 / 10;
    int modulo = 10 % 3;
    System.out.println("Soma: " + sum);
    System.out.println("Subtracao: " + subtraction);
    System.out.println("Multiplicacao: " + multiplication);
    System.out.println("Divisao: " + division);
    System.out.println("Modulo: " + modulo);

    //OPERADORES DE ATRIBUICAO
    int a = 10;
    System.out.println("Valor de a: " + a);
    a += 5; // a = a + 5
    System.out.println("Valor de a na soma: " + a);
    a -= 3; // a = a - 3
    System.out.println("Valor de a na subtracao: " + a);
    a *= 2; // a = a * 2
    System.out.println("Valor de a na multiplicacao: " + a);
    a /= 4; // a = a / 4
    System.out.println("Valor de a na divisao: " + a);
    a %= 3; // a = a % 3
    System.out.println("Valor de a resto: " + a);

    //OPERADORES DE INCREMENTO E DECREMENTO
    int b = 10;
    b++; // b = b + 1
    System.out.println("Valor de b incrementado: " + b);
    b--; // b = b - 1
    System.out.println("Valor de b decrementado: " + b);

    //OPERADORES RELACIONAIS
    int num1 = 10;
    int num2 = 5;
    System.out.println("Igualdade: " + (num1 == num2));
    System.out.println("Diferente: " + (num1!= num2));
    System.out.println("Maior: " + (num1 > num2));
    System.out.println("Menor: " + (num1 < num2));
    System.out.println("Maior ou Igual: " + (num1 >= num2));
    System.out.println("Menor ou Igual: " + (num1 <= num2));

    //OPERADORES LOGICOS
    boolean var1 = true;
    boolean var2 = false;
    System.out.println("AND: " + (var1 && var2));
    System.out.println("OR: " + (var1 || var2));
    System.out.println("NOT: " + (!var1));

    //OPERADORES DE CONJUNCAO E DISJUNCAO
    int c = 5;
    System.out.println("Conjuncao: " + (c > 3 && c < 10));
    System.out.println("Disjuncao: " + (c > 3 || c < 10));

    //OPERADORES BIT A BIT
    int e = 5;
    int f = 7;
    System.out.println("AND bit a bit: " + (e & f));
    System.out.println("OR bit a bit: " + (e | f));
    System.out.println("XOR bit a bit: " + (e ^ f));
    System.out.println("NOT bit a bit: " + (~e));
    System.out.println("Shift a esquerda: " + (e << 1));
    System.out.println("Shift a direita: " + (e >> 1));

    //OPERADORES DE PRECEDENCIA
    int g = 10;
    int h = 5;
    int i = 2;
    System.out.println("Operacao: " + (g + h) * i);
    System.out.println("Operacao: " + ((g + h) * i));

    //OPERADORES TERNARIOS
    int j = 10;
    int k = 5;
    System.out.println("Condicao: " + (j > k? "j é maior" : "k é maior"));

  }
}
