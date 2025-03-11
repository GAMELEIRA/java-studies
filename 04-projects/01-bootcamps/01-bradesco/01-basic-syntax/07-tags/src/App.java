//TAGS SAO INFORMACOES QUE ENRIQUECEM A DOCUMENTACAO DO NOSSO PROJETO
//PODEMOS USAR HTML PARA DOCUMENTAR O CODIGO
//PODEMOS USAR tags PARA REPRESENTAR TOPICOS DA DOCUMENTACAO
//PARA GERAR A DOC EXECUTAR javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d docs src/*.java 
/**
 * <h1>Hello World</h1>
 * @author GABRIEL GAMELEIRA DOS SANTOS
 * @version 1.0
 * @since 01/01/2022
 */
public class App {
    public static void main(String[] args) throws Exception {

    }

    /**
     * @param message parametro que representa a mensagem que sera exibida
     */
    public static void showMessage(String message) {
        System.out.println("Hello, World!");
    }
}
