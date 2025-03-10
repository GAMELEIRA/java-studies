public class Main {
    public static void main(String[] args) throws Exception {
        //ATRIBUICAO: UTILIZADO PARA DEFINIR UM VALOR A UMA VARIAVEL
        int age = 95;

        //ARITMETICOS: UTILIZADO PARA REALIZAR OPERACOES MATEMATICAS ENTRE DOIS VALORES NUMERICOS
        double a = 10 + 20; //SOMA
        double b = 20 - 10; //SUBTRACAO
        double c = 1 * 3; //MULTIPLICACAO
        double d = 10 / 2; //DIVISAO
        double e = 9 % 3; //RESTO DA DIVISAO

        //CONCATENACAO: JUNCAO DE DUAS STRINGS
        String firstName = "Gabriel";
        String middleName = "Gameleira";
        String fullName = firstName + " " + middleName;

        //++++++++++++++++++++++++++++++ OPERADORES UNARIOS +++++++++++++++++++++++++++++++++++++
        int numeroA = 5; //POR PADRAO O OPERADOR PADRAO SERA + POIS SE TRATA DE UM NUMERO POSITIVO
        int numeroB = -10; //COM O USO DO - TRANSFORMO O VALOR NUMERICO EM NEGATIVO
        numeroA++; //INCREMENTA VALOR EM MAIS UM 
        numeroB++; //DECREMENTA O VALOR EM MENOS UM

        //++++++++++++++++++++++++++++++ OPERADOR TERNARIO ++++++++++++++++++++++++++++++++++++++
        //OPERADOR TERNARIO E UMA FORMA RESUMIDA DE OBTER UM VALOR BASEADO EM UMA CONDICAO
        //EXPRESSAO CONDICIONAL ? PRIMEIRO RETORNO CASO SEJA VERDADEIRO: RETORNO CASO SEJA FALSO
        int numeroC = (numeroA > numeroB)? 100: 0;

        //+++++++++++++++++++++++++++++ OPERADOR RELACIONAIS ++++++++++++++++++++++++++++++++++++
        //OPERADORES RELACIONAIS COMPARAM RELACOES ENTRE VALORES 
        boolean valueA = 5 > 10; //VALIDA SUPERIORIDADE DE UM VALOR
        boolean valueB = 10 < 100; //VALIDA INFERIORIDADE DE UM VALOR
        boolean valueC = 20 >= 10; //VALIDA SUPERIORIDADE E IGUALDADE ENTRE OS VALORES
        boolean valueD = 10 <= 100; //VALIDA INFERIORIDADE E IGUALDADE ENTRE VALORES
        boolean valueE = 100 != 100; //VALIDA DIFERENCA ENTRE VALORES
        boolean valueF = 100 == 100; //VALIDA IGUALDADE ENTRE VALORES

    }
}
