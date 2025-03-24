package com.gameleira.app;

import com.gameleira.controller.HospitalBillController;

public class App {

	public static void main(String[] args) {
		
		HospitalBillController hospitalBillController = new HospitalBillController();
		hospitalBillController.showAndRequestDataOfHospitalBill();

	}

}
