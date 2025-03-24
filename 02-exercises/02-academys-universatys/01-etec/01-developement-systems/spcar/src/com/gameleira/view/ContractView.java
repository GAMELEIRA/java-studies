package com.gameleira.view;

import javax.swing.JOptionPane;

import com.gameleira.model.Car;
import com.gameleira.model.ContractCar;

/**
 * <h1>Visão do Contrato</h1>
 * Classe responsável por interagir com o usuário e coletar dados sobre o contrato do carro.
 * Utiliza JOptionPane para entrada e saída de dados.
 * 
 * @author GABRIEL GAMELEIRA DOS SANTOS
 * @version 1.0
 * @since 24/03/2025
 */
public class ContractView {

  public ContractView() {
  }

  public ContractCar showViewRequestDataOfContract() {

    String model = JOptionPane.showInputDialog("Informe o modelo de carro: ");
    double kilometersTraveled = Double
        .parseDouble(JOptionPane.showInputDialog("Informe a quantidade de km's percorridos pelo carro: "));
    double valueDiary = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor da diaria do carro: "));
    int quantityDaysOfContract = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dias que o carro foi alugado: "));

    Car car = new Car(model, kilometersTraveled);
    ContractCar contractCar = new ContractCar(car, valueDiary, quantityDaysOfContract);

    return contractCar;
  }

  public void showViewContract(ContractCar contractCar) {
    JOptionPane.showMessageDialog(null, "O modelo: " + contractCar.getCar().getModel() + " custara " + contractCar.getValueTotalOfContract());   
  }

}
