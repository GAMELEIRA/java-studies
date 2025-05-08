import java.util.Locale;
import java.util.Scanner;

public class Main {

  //PARA DEFINIR QUE TODA ENTRADA IRA RESPEITAR OS PADROES DETERMINADOS PELO PAIS ESCOLHIDO
  public static final Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 

  public static void main(String[] args) {
    //FORCA O PROGRAMA A USAR OS PADROES DE UM PAIS EM ESPECIFICO PARA NUMEROS E AFINS
    Locale.setDefault(Locale.US);

    float num = 123456789.12345678f;
    System.out.printf("Em Americano: %.2f%n", num);
    
    Locale.setDefault(new Locale("pt", "BR"));
    System.out.printf("Em Brasileiro: %.2f%n", num);
  }  
}
