public class Main {

  //METODO COM PARAMETROS name e age
  //PARAMETROS DEFINEM CRITERIOS DE ENTRADA PARA CHAMADA DA FUNCAO
  //OS PARAMETROS DEVEM POSSUIR UM TIPO E IDENTIFICADORES
  public static void sayYourName(String name, int age) {
    System.out.println("Olá, " + name + ". Idade: " + age);
  }
  public static void main(String[] args) {
    //INFORMACOES PODEM SER PASSADAS PARA METODOS COMO UM PARAMETRO
    //PARAMETROS AGEM COMO VARIAVEIS DENTRO DO METODO

    //OS ARGUMENTOS PASSADOS PARA OS PARAMETROS: name, age
    sayYourName("João", 30);
    sayYourName("Maria", 25);
  }
}
