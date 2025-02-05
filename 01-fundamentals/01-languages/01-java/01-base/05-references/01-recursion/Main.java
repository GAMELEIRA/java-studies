public class Main {
  public static void main(String[] args) {
    //RECURSAO É A TECNICA DE FAZER UMA FUNCAO CHAMAR A SI MESMA
    //COM O OBJETIVO DE RESOLVER UM PROBLEMA QUEBRANDO EM SUBPROBLEMAS MENORES
    int result = sum(40);
    System.out.println("Resultado: " + result);
  }

  public static int sum(int num) {
    if (num > 0) {
      System.out.println("Pilha:" + num);
      return num + sum(num - 10);
    } else {
      //TODA FUNCAO RECURSIVA DEVE CONTER UMA CONDICAO DE PARADA
      return 0;
    }
  }
}
