package com.gameleira.app;

import com.gameleira.controller.ContractController;

/**
 * <h1>Aplicação Principal</h1>
 * Classe responsável por iniciar a aplicação e criar a instância do controlador.
 * 
 * @author GABRIEL GAMELEIRA DOS SANTOS
 * @version 1.0
 * @since 24/03/2025
 */
public class App {
    public static void main(String[] args) throws Exception {

        ContractController contractController = new ContractController();

        contractController.requestShowViewValueOfContract();

    }
}
