public class Main {
  public static void main(String[] args) {
    //A CLASSE JAVA Math TEM METODOS QUE PERMITEM EXECUTAR TAREFAS MATEMATICAS
    

    //PARA ENCONTRAR O MAIOR VALOR ENTRE DOIS NUMEROS USAR max(x, y)
    int num1 = 5;
    int num2 = 8;
    System.out.println("O maior número é: " + Math.max(num1, num2));
    
    //PARA ENCONTRAR O MENOR VALOR ENTRE DOIS NUMEROS USAR min(x, y)
    System.out.println("O menor número é: " + Math.min(num1, num2));
    
    //PARA ENCONTRAR A RAIZ QUADRADA DE UM NUMERO USAR sqrt(x)
    double num3 = 25;
    System.out.println("A raiz quadrada de " + num3 + " é: " + Math.sqrt(num3));
    
    //PARA ENCONTRAR A EXPONENCIA DE UM NUMERO USAR pow(base, exponente)
    double base = 2;
    double exponente = 3;
    System.out.println(base + " elevado a " + exponente + " é: " + Math.pow(base, exponente));
    
    //PARA ENCONTRAR A ARREDONDAMENTO DE UM NUMERO USAR round(x)
    double num4 = 2.7;
    System.out.println("O número arredondado é: " + Math.round(num4));
    
    //PARA ENCONTRAR A PARTE INTEIRA DE UM NUMERO USAR floor(x)
    double num6 = 2.7;
    System.out.println("A parte inteira de " + num6 + " é: " + Math.floor(num6));
    
    //PARA ENCONTRAR A PARTE DECIMAL DE UM NUMERO USAR ceil(x)
    double num7 = 2.7;
    System.out.println("A parte decimal de " + num7 + " é: " + Math.ceil(num7));

    //PARA ENCONTRAR O NUMERO POSITIVO ABSOLUTO DE USAR abs(x)
    double num8 = -2.7;
    System.out.println("O número positivo absoluto de " + num8 + " é: " + Math.abs(num8));

    //PARA GERAR UM NUMERO ALEATORIO ENTRE 0.0 E 0.1
    double num9 = Math.random();
    System.out.println("Um número aleatório entre 0.0 e 0.1 é: " + num9);

    //PARA GERAR UM NUMERO ALEATORIO ENTRE 1 E 100
    int num10 = (int) (Math.random() * 100) + 1;
    System.out.println("Um número aleatório entre 1 e 100 é: " + num10);
  }
}