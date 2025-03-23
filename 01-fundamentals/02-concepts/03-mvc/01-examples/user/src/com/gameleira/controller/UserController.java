package com.gameleira.controller;

import com.gameleira.model.User;
import com.gameleira.view.UserView;
/**
 * ATUA COMO INTERMEDIARIO ENTRE MODEL E VIEW
 * PROCESSA REQUISICOES DO USUARIO
 * ATUALIZA A VIEW COM BASE NOS DADOS DO MODEL
 * PODE CONTER REGRAS DE NEGOCIO
 * */
public class UserController {
	
	private User userModel;
	private UserView userView;
	
	public UserController() {
		this.userView = new UserView();
		this.userModel = this.userView.getUserInput();
	}

    public void showView() {
    	this.userView.showUser(this.userModel);
    }
}
