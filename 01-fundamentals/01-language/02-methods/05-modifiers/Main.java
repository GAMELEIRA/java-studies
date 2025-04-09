public class Main {

  //OS METODOS PODEM SER DEFINIDOS COMO public, protected e private. 
  //DESSA FORMA É DEFINIDO A ACESSIBILIDADE DO METODO FORA DA CLASSE

  //public PODE SER ACESSADO POR QUALQUER CLASSE
  public static void main(String[] args) {
    System.out.println("Qualquer um acessa");
  }

  //protected PODE SER ACESSADO POR QUALQUER CLASSE QUE ESTA NO MESMO PACOTE OU SUBCLASSE
  protected void printMessage() {
    System.out.println("Hello World!");
  }

  //private PODE SER ACESSADO APENAS NA CLASSE EM QUE FOI DEFINIDO
  private void secretMessage() {
    System.out.println("Vou te contar um segredo!");
  }
}
