public class Main {
    //OS MODIFICADORES DEFINEM COMO FUNCOES E ATRIBUTOS FICARAM DISPONIVEIS PARA OUTRAS CLASSES
    //public FICA ACESSIVEL PARA QUALQUER OUTRA CLASSE
    public static void main(String[] args) {
        
    }
    //default É QUANDO NAO FICA DECLARADO E ELE ASSUME UM COMPORTAMENTO PADRAO
    //A CLASSE É ACESSIVEL POR CLASSES DO MESMO PACOTE
    static void sayHello() {
        System.out.println("Oi!");
    }

    //private É ACESSIVEL APENAS NA CLASSE
    private void privateSayHello() {
        System.out.println("Olá!");
    }

    //protected É ACESSIVEL NA CLASSE E EM CLASSES FILHAS DO MESMO PACOTE
    protected void protectedSayHello() {
        System.out.println("Alo!");
    }

    //EXISTEM TAMBEM OS MODIFICADORES DE NAO ACESSO final, abstract
    //final FICA IMPOSSIVEL EXTENDER A CLASSE
    //abstract FICA IMPOSSIVEL INSTANCIAR OBJETOS
    //static INDEPENDE DE INSTANCIA PARA SER CHAMADO
    //static final É UMA CONSTANTE
    
}