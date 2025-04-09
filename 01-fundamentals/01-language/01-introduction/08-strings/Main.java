import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    //VARIAVEIS Strings SAO UTILIZADAS PARA ARMAZENAR TEXTO
    //UMA String CONTEM UMA COLECAO DE CARACTERES ENTRE ASPAS DUPLAS
    //UMA String É UM TIPO POR REFERENCIA QUE CONTEM METODOS QUE SAO UTILIZADAS PARA MANIPULACAO
    String name = "Gabriel";
    String middleName = "Gameleira";
    System.out.println(name + " " + middleName);

    //É POSSIVEL ENCONTRAR O TAMANHO DE UMA STRING USANDO O METODO length
    System.out.println("Tamanho da string: " + name.length());
  
    //É POSSIVEL CONCATENAR DUAS STRINGS USANDO O OPERADOR + OU O METODO concat
    String fullName = name + " " + middleName;
    System.out.println("Nome completo: " + fullName);
    System.out.println("Nome completo: " + name.concat(" ").concat(middleName));

    //É POSSIVEL USAR O MÉTODO toUpperCase() PARA CONVERTER TODAS AS LETRAS EM MAISCULAS
    String upperCaseName = name.toUpperCase();
    System.out.println("Nome em maiúsculas: " + upperCaseName);

    //É POSSIVEL USAR O MÉTODO toLowerCase() PARA CONVERTER TODAS AS LETRAS EM MINUSCULAS
    String lowerCaseName = name.toLowerCase();
    System.out.println("Nome em minúsculas: " + lowerCaseName);

    //É POSSIVEL USAR O MÉTODO substring() PARA EXTRAIR UMA SUBSTRING DE UMA STRING
    //O PRIMEIRO ARGUMENTO É O INDICE DA PRIMEIRA LETRA DA SUBSTRING
    //O SEGUNDO ARGUMENTO É O INDICE DA PRIMEIRA LETRA DA SUBSTRING QUE NÃO VAI SER INCLUIDA
    String subString = fullName.substring(0, 7);
    System.out.println("Full name: "+ fullName + ". Substring: " + subString);

    //É POSSIVEL USAR O MÉTODO indexOf() PARA LOCALIZAR O INDICE DA PRIMEIRA OCORRENNCIA DE UM CARACTERE
    //O PRIMEIRO ARGUMENTO É O CARACTERE A SER LOCALIZADO
    //O SEGUNDO ARGUMENTO É O INDICE EM QUE O CARACTERE SERA LOCALIZADO (OPCIONAL, SE NÃO INFORMADO, O MÉTODO IRA LOCALIZAR O PRIMEIRO ENCONTRADO)
    int indexOfName = fullName.indexOf(name);
    System.out.println("Full name: "+ fullName + ". Indice do nome: " + indexOfName);

    //É POSSIVEL USAR O MÉTODO replace() PARA SUBSTITUIR UM CARACTERE POR OUTRO EM UMA STRING
    //O PRIMEIRO ARGUMENTO É O CARACTERE A SER REMOVIDO
    //O SEGUNDO ARGUMENTO É O CARACTERE A SER INSERIDO NA LOCALIZAÇÃO DO CARACTERE REMOVIDO
    String replacedString = fullName.replace("Gabriel", "João");
    System.out.println("Full name: "+ fullName + ". String substituída: " + replacedString);

    //É POSSIVEL USAR O MÉTODO indexOf() PARA RETORNAR O INDICE(POSICAO) DA PRIMEIRA OCORRENCIA ESPECIFICADA NO TEXTO DE UMA STRING
    //O PRIMEIRO ARGUMENTO É A STRING EM QUE SERA LOCALIZADO
    //O SEGUNDO ARGUMENTO É O CARACTERE QUE SERA LOCALIZADO
    //O TERCEIRO ARGUMENTO É O INDICE EM QUE O CARACTERE SERA LOCALIZADO (OPCIONAL, SE NÃO INFORMADO, O MÉTODO IRA LOCALIZAR O PRIMEIRO ENCONTRADO)
    int indexOfCharacter = fullName.indexOf('e', 6);
    System.out.println("Full name: "+ fullName + ". Indice do primeiro 'e' a partir da posição 6: " + indexOfCharacter);

    //É POSSIVEL USAR O MÉTODO split() PARA DIVIDIR UMA STRING EM UM ARRAY DE SUBSTRINGS
    //O ARGUMENTO É O CARACTERE USADO COMO SEPARADOR (OPCIONAL, SE NÃO INFORMADO, O MÉTODO USARA ESPAÇO EM BRANCO COMO SEPARADOR)
    String[] fullNameParts = fullName.split(" ");
    System.out.println("Full name: "+ fullName + ". Array de partes: " + Arrays.toString(fullNameParts));

    //É POSSIVEL USAR O MÉTODO equals() PARA COMPARAR SE UMA STRING É IGUAL A OUTRA
    //O ARGUMENTO É A STRING QUE SERA COMPARADA
    boolean areEqual = fullName.equals("Gabriel Gameleira");
    System.out.println("Full name: "+ fullName + ". Strings iguais: " + areEqual);

    //PARA QUE CARACTERES ESPECIAIS SEJAM TRANSFORMADOS EM CARACTERES DE STRING USE A BARRA INVERTIDA \
    System.out.println("\"\"\"");
    System.out.println("\'\'\'");
    System.out.println("\\");

    //PARA PULAR UMA LINHA USE \n
    System.out.println("Corinthians\n");

    //PARA VOLTAR O CURSOR PARA O COMECO DA LINHA USE \r
    System.out.println("Corinthians\r");

    //PARA DAR UM TAB USER \t
    System.out.println("Corinthians\t");

    //PARA DAR UM BACKSPACE USE \b
    System.out.println("Corinthians\b");

    //PARA DAR UM FORMATAÇÃO DE TEXTO USANDO format()
    String formattedString = String.format("Nome: %s, Idade: %d", name, 25);
    System.out.println("Formatted string: " + formattedString);

    //PARA DAR UM FORMATACAO DE TEXTO USANDO printf()
    System.out.printf("Nome: %s, Idade: %d%n", name, 25);

  }
}
