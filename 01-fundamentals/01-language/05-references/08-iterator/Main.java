import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {
    //iterator É UM OBJETO QUE PODE SER USADO PARA FAZER UM LOOP POR COLECOES COMO ArrayList e HashSet

    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    Iterator<String> iterator = cars.iterator();

    //hasNext RETORNA UM VALOR BOOLEANO PARA VALIDAR SE HA UM PROXIMO ITEM PARA PERCORRER
    while(iterator.hasNext()) {
      //next() RETORNA O PRÓXIMO ITEM DA COLEÇÃO
      System.out.println(iterator.next()); 
      //remove() EXCLUI O ITEM ATUAL DO ITERADOR E RETORNA O VALOR DO EXCLUIDO
      //USAR ESSE RECUROS EM whiles PARA PERFEITO FUNCIONAMENTO DO remove()
      iterator.remove();
      System.out.println("Lista apos a exclusao: " + cars);
    }
  }  
}
