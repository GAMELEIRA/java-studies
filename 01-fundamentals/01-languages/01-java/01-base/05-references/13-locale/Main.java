import java.util.Locale;

public class Main {
  public static void main(String[] args) {
    //FORCA O PROGRAMA A USAR OS PADROES DE UM PAIS EM ESPECIFICO PARA NUMEROS E AFINS
    Locale.setDefault(Locale.US);

    float num = 123456789.12345678f;
    System.out.printf("Em Americano: %.2f%n", num);
    
    Locale.setDefault(new Locale("pt", "BR"));
    System.out.printf("Em Brasileiro: %.2f%n", num);
  }  
}
