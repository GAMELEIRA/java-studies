package com.gameleira.controller;

import com.gameleira.model.HospitalBill;
import com.gameleira.view.HospitalBillView;

/**
 * <h1>Controlador do Contrato</h1>
 * Classe responsável por gerenciar a interação entre a visão e o modelo da despesa do hospital.
 * 
 * @author GABRIEL GAMELEIRA DOS SANTOS
 * @version 1.0
 * @since 24/03/2025
 */
public class HospitalBillController {
	
	private HospitalBill hospitalBill;
	private HospitalBillView hospitalBillView;
	
	public HospitalBillController() {
		this.hospitalBillView = new HospitalBillView();
	}
	
	private void requestShowViewRequestDataHospitalBill() {
		this.hospitalBill = this.hospitalBillView.showViewRequestHospitalBill();
	}

    private void requestShowViewDataHospitalBill() {
    	this.hospitalBillView.showViewHospitalBill(this.hospitalBill);
    }
    
    public void showAndRequestDataOfHospitalBill() {
		this.requestShowViewRequestDataHospitalBill();
		this.requestShowViewDataHospitalBill();
    }
}
