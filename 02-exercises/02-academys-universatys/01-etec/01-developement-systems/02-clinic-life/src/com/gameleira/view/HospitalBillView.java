package com.gameleira.view;

import javax.swing.JOptionPane;

import com.gameleira.model.HospitalBill;
import com.gameleira.model.Hospitalization;
import com.gameleira.model.Patient;

/**
 * <h1>Visão do Contrato</h1>
 * Classe responsável por interagir com o usuário e coletar dados sobre a conta do hospital.
 * Utiliza JOptionPane para entrada e saída de dados.
 * 
 * @author GABRIEL GAMELEIRA DOS SANTOS
 * @version 1.0
 * @since 24/03/2025
 */
public class HospitalBillView {
		
	public HospitalBillView() {}
	
	private Patient showViewRequestDataPerson() {
		String name = JOptionPane.showInputDialog("Digite o nome do paciente:");
		Patient patient = new Patient(name); 
		return patient;
	}
	
	private Hospitalization showViewRequestDataHospitalization() {
		double valueDiaryOfHospitalization = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da diaria:"));
		int quantityDaysOfHospitalization = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dias que foi hopistalizado: "));
		double valueTotalExpensesMedicines = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total de medicamentos: "));
		Hospitalization hospitalization = new Hospitalization(valueDiaryOfHospitalization, quantityDaysOfHospitalization, valueTotalExpensesMedicines);
		 
		return hospitalization;
	}
	
	public HospitalBill showViewRequestHospitalBill() {
		Patient patient = this.showViewRequestDataPerson();
		Hospitalization hospitalization = this.showViewRequestDataHospitalization();
		HospitalBill hospitalBill = new HospitalBill(patient, hospitalization);
		
		return hospitalBill;
	}
	
	public void showViewHospitalBill(HospitalBill hospitalBill) {
        JOptionPane.showMessageDialog(null, hospitalBill.getPatient().getName() + " sua conta ficou no valor de: " + hospitalBill.getValueTotalOfHospitalBill()); 
	}
	
}
