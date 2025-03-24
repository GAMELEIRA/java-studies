package com.gameleira.controller;

import com.gameleira.model.ContractCar;
import com.gameleira.view.ContractView;

/**
 * <h1>Controlador do Contrato</h1>
 * Classe responsável por gerenciar a interação entre a visão e o modelo do contrato.
 * 
 * @author GABRIEL GAMELEIRA DOS SANTOS
 * @version 1.0
 * @since 24/03/2025
 */
public class ContractController {
  
  private ContractCar contractCar;
  private ContractView contractView;

  public ContractController() {
    this.contractView = new ContractView();  
		this.contractCar = this.contractView.showViewRequestDataOfContract();
	}

  public void requestShowViewValueOfContract() {
    this.contractView.showViewContract(this.contractCar);
  }

}
