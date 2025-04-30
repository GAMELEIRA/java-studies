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
		//Consumers E UMA FUNCTION INTERFACE QUE PERMITE DECLARAR FUNCOES EM VARIAVEIS
		//QUE REPRESENTA UMA OPERACAO QUE ACEITA UM UNICO ARGUMENTO E NAO RETORNA RESULTADO
		//SERVE PARA PASSAR COMPORTAMENTOS COMO ARGUMENTO PARA METODOS
		Consumer<Order> consumerOrders = order -> System.out.println(order.toString());
		orders.forEach(consumerOrders);
	}

}
