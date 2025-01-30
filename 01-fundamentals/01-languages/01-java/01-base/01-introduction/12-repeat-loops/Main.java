public class Main {
    public static void main(String[] args) {
        //LACOS DE REPETICAO PODEM EXECUTAR UM BLOCO DE CODIGO DESDE QUE UMA CONDICAO ESPECIFICADA SEJA ATINGIDA
        
        int sum = 0;
        //for DEVE SER USADO QUANDO SE SABE A QUANTIDADE DE REPETICOES QUE DEVEM SER REALIZADAS PARA CONCLUIR
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println("Soma dos numeros de 0 a 100: " + sum);

        //while DEVE SER USADO QUANDO SE NÃO SABE A QUANTIDADE DE REPETICOES QUE DEVEM SER REALIZADAS PARA CONCLUIR
        int j = 0;
        int a = 0;
        while (j != 10) {
            j = (int) (Math.random() * 10) + 1;
            System.out.println("Numero aleatorio: " + j + ", a = " + a);
            a++;
        }
        System.out.println("Quantidade de repeticoes ate encontrar o numero 1: " + a);

        //do-while DEVE SER USADO QUANDO SE NÃO SABE A QUANTIDADE DE REPETICOES QUE DEVEM SER REALIZADAS PARA CONCLUIR, POREM O CODIGO DE EXECUCAO SERA EXECUTADO PELO MINIMO UMA VEZ
        int k = 0;
        do {
            k = (int) (Math.random() * 10) + 1;
            System.out.println("Numero aleatorio: " + k);
        } while (k != 5);
        System.out.println("Numero aleatorio encontrado: " + k);

        //for each É UM RECURSO UTILIZADO PARA SIMPLIFICAR O for PARA PERCORRER ARRAYS
        int[] array = {1, 2, 3, 4, 5};
        for (int num : array) {
            System.out.println("Numero: " + num);
        }
    }
}