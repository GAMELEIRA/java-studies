import java.util.ArrayList;
import java.util.Collections; //USAR ARA CLASSIFICAR LISTAS EM ORDEM ALFABETICA OU NUMERICA

public class Main {
  public static void main(String[] args) {

    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
    myNumbers.add(33);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(34);
    myNumbers.add(8);
    myNumbers.add(12);

    // USAR sort PARA ORDENAR OS NUMEROS
    Collections.sort(myNumbers);

    for (int i : myNumbers) {
      System.out.println(i);
    }

    // USAR Collections.reverseOrder() PARA ORDENAR EM ORDEM DECRESCENTE
    Collections.sort(myNumbers, Collections.reverseOrder());

    for (int i : myNumbers) {
      System.out.println(i);
    }

  }
}
