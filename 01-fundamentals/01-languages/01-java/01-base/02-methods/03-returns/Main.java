public class Main {
  public static void main(String[] args) {
    //AS FUNCOES PODEM RETORNAR VALORES DO TIPO PRIMITIVO OU TIPO POR REFERENCIA
    int result = sum(5, 3);
    System.out.println("Soma: " + result);
  }  

  //ESSA ASSINATURA DEFINE QUE SER RETORNADO UM VALOR NUMERICO INTEIRO AO FINALIZAR O BLOCO DE CODIGO
  public static int sum(int a, int b) {
    //return É UMA PALAVRA RESERVADA UTILIZADA PARA DEFINIR O RETORNO QUE IRA RETORNAR PELA FUNCAO
    return a + b;
  }
}
