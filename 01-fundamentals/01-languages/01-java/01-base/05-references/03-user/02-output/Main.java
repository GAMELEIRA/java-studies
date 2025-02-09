public class Main {
  public static void main(String[] args) {
    // EXIBINDO UMA MENSAGEM SEM PULAR LINHA
    System.out.print("Olá, meu nome é Gabriel e tenho 25 anos");

    // EXIBINDO UMA MENSAGEM PULANDO UMA LINHA
    System.out.println("Olá, meu nome é Gabriel e tenho 25 anos");

    // O printf É UM METODO ESPECIAL UTILIZADO PARA FORMATAR UMA SAIDA
    // COM ELE É POSSIVEL REALIZAR VARIOS TIPOS DE MANIPULACOES PARA A SUA SAIDA

    // FORMATADORES PERMITIDOS
    // - %d: inteiro
    // - %f: número real (float ou double)
    // - %c: caractere
    // - %s: string
    // - %tc: data e hora (formato padrao do sistema operacional)
    // - %,d: número inteiro com separador de milhar
    // - %.2f: número real com duas casas decimais
    // - %,.2f: número real com duas casas decimais e separador de milhar
    // - %x: para numeros em hexadecimal
    // - %n: pular linha

    // EXIBINDO UMA MENSAGEM USANDO FORMATACAO DE INTEIRO
    System.out.printf("O número é: %d%n", 25);

    // EXIBINDO UMA MENSAGEM USANDO FORMATACAO DE NUMERO REAL/FLUTUANTES
    System.out.printf("Valor formatado: %.2f\n", 1234.56789);

    // EXIBINDO UMA MENSAGEM USANDO FORMATACAO DE NUMERO EM HEXADECIMAL
    System.out.printf("Hexadecimal: %x%n", 255);

    // EXIBINDO UMA MENSAGEM USANDO FORMATACAO DE STRING
    System.out.printf("String: %s%n", "Olá, mundo!");

    // EXIBINDO UMA MENSAGEM USANDO FORMATACAO DE CARACTERE
    System.out.printf("Caractere: %c%n", 'A');

    // EXIBINDO UMA MENSAGEM USANDO FORMATACAO DE CASAS DECIMAIS
    System.out.printf("%.2f%n", 3.14159265358979323846);

    // EXIBINDO UMA MENSAGEM USANDO FORMATACAO DE DATA E HORA
    System.out.printf("%tc%n", System.currentTimeMillis());

    // EXIBINDO UMA MENSAGEM USANDO FORMATACAO DE NUMERO COM MILHAR E DECIMAL
    System.out.printf("%,d%n", 1234567890);

    // EXIBINDO UMA MENSAGEM USANDO FORMATACAO DE NUMERO COM MILHAR E DECIMAL EM
    // PT-BR
    System.out.printf("%,.2f%n", 1234567890.123456789);

    //É POSSIVEL COMBINAR VARIAS SAIDAS AO MESMO TEMPO
    String nome = "Gabriel";
    int idade = 25;
    double salario = 70000.52501498;
    System.out.printf("%s tem %d anos e ganha R$ %.2f.%n", nome, idade, salario);
  }
}
