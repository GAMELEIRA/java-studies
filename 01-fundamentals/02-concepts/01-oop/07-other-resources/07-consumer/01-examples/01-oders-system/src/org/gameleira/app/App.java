package org.gameleira.app;

import java.util.ArrayList;
import java.util.function.Consumer;

import org.gameleira.models.Client;
import org.gameleira.models.Order;

public class App {

	public static void main(String[] args) {
		ArrayList<Order> orders = new ArrayList();
		orders.add(new Order(1, new Client("Gabriel"), 100.00));
		processOrders(orders);

	}
	
	public static void processOrders(ArrayList<Order> orders) {
		// Consumer É UMA FUNCTIONAL INTERFACE QUE REPRESENTA UMA OPERAÇÃO QUE RECEBE UM ÚNICO ARGUMENTO E NÃO RETORNA RESULTADO
		// É UTILIZADA PARA DECLARAR FUNÇÕES EM VARIÁVEIS OU PASSAR COMPORTAMENTOS COMO ARGUMENTO PARA MÉTODOS.
		Consumer<Order> consumerOrders = order -> System.out.println(order.toString());
		orders.forEach(consumerOrders);
	}

}
