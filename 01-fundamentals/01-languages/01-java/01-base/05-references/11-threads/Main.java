public class Main extends Thread {
  public static void main(String[] args) {
    //Threads PERMITEM QUE UM PROGRAMA OPERE DE FORMA MAIS EFICIENTE AO FAZER VARIAS COISAS AO MESMO TEMPO
    //COM ISSO PODEM SER USADOS PARA EXECUTAR TAREFAS COMPLICADAS EM SEGUNDO PLANO SEM INTERROMPER O PROGRAMA PRINCIPAL
    Main thread = new Main();
    thread.start();
    System.out.println("Codigo rodando fora da thread");

  }

  public static void run() {
    System.out.println("Codigo rodando em outra thread!");
  }
}

//OU IMPLEMENTANDO A INTERFACE Runnable
/**
 * public class Main implements Runnable {
  public static void main(String[] args) {
    Main obj = new Main();
    Thread thread = new Thread(obj);
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}
 */