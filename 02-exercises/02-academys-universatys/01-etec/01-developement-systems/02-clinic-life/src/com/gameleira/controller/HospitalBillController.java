package com.gameleira.controller;

import com.gameleira.model.HospitalBill;
import com.gameleira.view.HospitalBillView;

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
