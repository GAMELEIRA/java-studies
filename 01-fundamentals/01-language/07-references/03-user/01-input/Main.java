import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    //PARA ADICIONAR UMA ENTRADA DO USUARIO DEVE SER UTILIZADO A CLASSE Scanner
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o seu nome: ");
    String name = scanner.nextLine(); //PARA STRINGS 
    //PARA CASOS EM QUE O nextLine VEM DEPOIS DOS OUTROS next USAR UM nextLine EXTRA

    System.out.print("Informe sua idade: ");
    byte age = scanner.nextByte(); //PARA BYTES

    System.out.print("Você trabalha? ");
    boolean isWork = scanner.nextBoolean(); //PARA BOOLEANOS

    System.out.print("Qual seu salario dos sonhos? ");
    double dreamSalary = scanner.nextDouble(); //PARA FLUANTES

    System.out.println("Qual seu salário atual? ");
    float actuallySalary = scanner.nextFloat(); //PARA FLUANTES

    System.out.println("Quantas vezes você acha que já cortou o cabelo na vida? ");
    int haircuts = scanner.nextInt(); //PARA INTEIROS

    System.out.println("Quantas horas vividas você têm? ");
    long hoursLived = scanner.nextLong(); //PARA INTEIROS
    
    System.out.println("Quantos dias vividos você têm? ");
    short daysLived = scanner.nextShort(); //PARA INTEIROS LONGOS
    
    scanner.close(); //FECHA O SCANNER PARA LIBERAR RECURSOS

    System.out.println("Nome: " + name + ", Idade: " + age + ", Trabalhando: " + isWork + ", Salario dos Sonhos: " + dreamSalary + ", Salario atual: " + actuallySalary + ", Quantidade de Cortes de Cabelo: " + haircuts + ", Quantidade de Horas Vividas: " + hoursLived + ", Dias vividos: " + daysLived );

  }
}
