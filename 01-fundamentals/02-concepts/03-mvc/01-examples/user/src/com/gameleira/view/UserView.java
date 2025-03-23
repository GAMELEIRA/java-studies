package com.gameleira.view;
import javax.swing.JOptionPane;

import com.gameleira.model.User;

/**
 * RESPONSAVEL APENAS POR MONTAR A INTERFACE ENTRE USUARIO E MAQUINA
 * EXIBE OU SOLICITA INFORMACOES POR MEIO DE ENTRADA DE DADOS VIA TELA
 * NAO TEM LOGICA DE NEGOCIO 
 * */
public class UserView {
	
	public UserView() {}
	
    public void showUser(User user) {
        JOptionPane.showMessageDialog(null, user.toString());   
    }
    
    public User getUserInput() {
        String firstName = JOptionPane.showInputDialog("Digite o primeiro nome:");
        String middleName = JOptionPane.showInputDialog("Digite o segundo nome:");
        String lastName = JOptionPane.showInputDialog("Digite o ultimo:");

        return new User(firstName, middleName, lastName);
    }

    
}
