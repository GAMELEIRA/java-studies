package org.gameleira.app;

import java.util.HashMap;
import java.util.Scanner;

public class App {

	public static Scanner scanner = new Scanner(System.in);
	public static HashMap<String, String> licensePlateExpiration = new HashMap<String, String>();

	
	public static void main(String[] args) {
		generatedTableLicenseExpiration();
		String finalPlate = requestFinalPlate();
		String licenseExpiration = getLicenseExpiration(finalPlate);
		showResult(licenseExpiration);
	}
	
	public static void generatedTableLicenseExpiration() {
		licensePlateExpiration.put("Placa Final 0", "Pagamento até 31/12");
		licensePlateExpiration.put("Placa Final 1", "Pagamento até 30/04");
		licensePlateExpiration.put("Placa Final 2", "Pagamento até 31/05");
		licensePlateExpiration.put("Placa Final 3", "Pagamento até 30/06");
		licensePlateExpiration.put("Placa Final 4", "Pagamento até 31/07");
		licensePlateExpiration.put("Placa Final 5", "Pagamento até 31/08");
		licensePlateExpiration.put("Placa Final 6", "Pagamento até 30/09");
		licensePlateExpiration.put("Placa Final 7", "Pagamento até 31/10");
		licensePlateExpiration.put("Placa Final 8", "Pagamento até 30/11");
		licensePlateExpiration.put("Placa Final 9", "Pagamento até 31/12");
	}
	
	public static String requestFinalPlate() {
		System.out.println("Informe o final da placa: ");
		String finalPlate = scanner.nextLine();
		return finalPlate; 
	}
	
	public static String getLicenseExpiration(String finalPlate) {
		String dataExpiration = licensePlateExpiration.get("Placa Final " + finalPlate);
		return dataExpiration;
	}
	
	public static void showResult(String licenseExpiration) {
		if (licenseExpiration != null) {
			System.out.println(licenseExpiration);	
		} else {
			System.out.println("Placa informada não existe. Por favor, informe uma placa válida.");
		}
		
	}

}
