package com.gameleira.model;

public class HospitalBill {
	
	private Patient patient;
	private Hospitalization hospitalization;
	private double valueTotalOfHospitalBill;
	
	public HospitalBill(Patient patient, Hospitalization hospitalization) {
		this.patient = patient;
		this.hospitalization = hospitalization;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Hospitalization getHospitalization() {
		return hospitalization;
	}

	public void setHospitalization(Hospitalization hospitalization) {
		this.hospitalization = hospitalization;
	}

	private void setValueTotalOfHospitalBill() {
		double valueTotalDiary = this.hospitalization.getValueDiaryOfHospitalization() * this.hospitalization.getQuantityDaysOfHospitalization();
		double valueTotalExpense = valueTotalDiary + this.hospitalization.getValueTotalExpensesMedicines();
		this.valueTotalOfHospitalBill = valueTotalExpense;
	} 
	
	public double getValueTotalOfHospitalBill() {
		this.setValueTotalOfHospitalBill();
		return valueTotalOfHospitalBill;
	}

	
	
}
