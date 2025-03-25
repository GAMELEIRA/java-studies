package com.gameleira.app;

import com.gameleira.controller.HospitalBillController;

/**
 * <h1>Aplicação Principal</h1>
 * Classe responsável por iniciar a aplicação e criar a instância do controlador.
 * 
 * @author GABRIEL GAMELEIRA DOS SANTOS
 * @version 1.0
 * @since 24/03/2025
 */
public class App {

	public static void main(String[] args) {
		
		HospitalBillController hospitalBillController = new HospitalBillController();
		hospitalBillController.showAndRequestDataOfHospitalBill();

	}

}
