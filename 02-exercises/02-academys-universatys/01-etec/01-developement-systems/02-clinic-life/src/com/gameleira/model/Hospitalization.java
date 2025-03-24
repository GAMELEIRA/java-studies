package com.gameleira.model;

public class Hospitalization {
	
	private double valueDiaryOfHospitalization;
	private int quantityDaysOfHospitalization;
	private double valueTotalExpensesMedicines;

	public Hospitalization(double valueDiaryOfHospitalization, int quantityDaysOfHospitalization,
			double valueTotalExpensesMedicines) {
		this.valueDiaryOfHospitalization = valueDiaryOfHospitalization;
		this.quantityDaysOfHospitalization = quantityDaysOfHospitalization;
		this.valueTotalExpensesMedicines = valueTotalExpensesMedicines;
	}

	public double getValueDiaryOfHospitalization() {
		return valueDiaryOfHospitalization;
	}

	public void setValueDiaryOfHospitalization(double valueDiaryOfHospitalization) {
		this.valueDiaryOfHospitalization = valueDiaryOfHospitalization;
	}

	public int getQuantityDaysOfHospitalization() {
		return quantityDaysOfHospitalization;
	}

	public void setQuantityDaysOfHospitalization(int quantityDaysOfHospitalization) {
		this.quantityDaysOfHospitalization = quantityDaysOfHospitalization;
	}

	public double getValueTotalExpensesMedicines() {
		return valueTotalExpensesMedicines;
	}

	public void setValueTotalExpensesMedicines(double valueTotalExpensesMedicines) {
		this.valueTotalExpensesMedicines = valueTotalExpensesMedicines;
	}
	
}
