//package E UTILIZADO PARA DECLARAR A LOCALIZACAO DO PACOTE
package com.gameleira.app;
//import E UTILIZADO PARA IMPORTAR UMA CLASSE DE UM PACOTE
import com.gameleira.models.Person;

//PACOTES SAO SUB DIRETORIOS DE UM PROJETO
//CADA PACOTE TERA UM PROPOSITO ESPECIFICO PARA ALOCAR CLASSES COM PROPOSITOS PARECIDOS
//AS PRINCIPAIS CONVENCOES SAO PARA OS SEGMENTOS: COMERCIAL (com), ORGAZACIONAL (org) OPENSOURCE (opensource) ETC.
//POR EXEMPLO UMA EMPRESA CHAMADA Gameleira
//com.gameleira.nomeDoProjeto
public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Person person = new Person("Gabriel");
        System.out.println(person.name);
    }
}
