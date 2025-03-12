//PARA VER UM BYTECODE EM LINGUAGEM INTERMEDIRIA EXECUTE java -c App.class
//.class E O BYTECODE GERADO PELO javac

import java.util.Scanner;

public class App {
    //É POSSIVEL PASSAR ARGUMENTOS PARA O args NO MOMENTO DA EXECUCAO DO PROJETO java <nome do arquivo> <argumentos>
    public static void main(String[] args) throws Exception {
        String name; 
        String surname; 

        try {
            name = args[0];
            surname = args[1];
        } catch (Exception e) {
            name = "Nome nao informado";
            surname = "Sobrenome nao informado";
        }

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe sua idade");
        int age = sc.nextInt();

        System.out.println("Meu nome: " + name + " " + surname);
        System.out.println("Sua idade: " + age);

        sc.close();
    }
}
