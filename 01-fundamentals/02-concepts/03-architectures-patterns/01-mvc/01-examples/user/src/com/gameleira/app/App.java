package com.gameleira.app;

import com.gameleira.controller.UserController;
import com.gameleira.model.User;
import com.gameleira.view.UserView;

public class App {

	public static void main(String[] args) {
	
		UserController userController = new UserController();
		
		userController.showView();
	}

}
