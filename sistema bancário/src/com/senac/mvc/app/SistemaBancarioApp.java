package com.senac.mvc.app;

import com.senac.mvc.controller.Controller;
import com.senac.mvc.model.Cliente;
import com.senac.mvc.model.Conta;
import com.senac.mvc.view.ExtendedView;


public class SistemaBancarioApp {

	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setNome("Vanessa");
		
		Conta conta = new Conta();
		conta.setConta(1);
		conta.setSaldo(1000);
		conta.setCliente(cliente);
		
		Controller controller = new Controller(cliente, conta);
		
		ExtendedView view = new ExtendedView(controller);
		view.iniciar();
		
	}
	

}
