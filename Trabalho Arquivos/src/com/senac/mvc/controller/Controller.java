package com.senac.mvc.controller;

import com.senac.mvc.model.Cliente;
import com.senac.mvc.model.Conta;
import com.senac.mvc.model.ContaEspecial;

public class Controller {

	private ContaEspecial contaEspecial;
	private Cliente cliente;
	private Conta conta;

	public Controller(Cliente cliente, Conta conta) {
		this.cliente = cliente;
		this.conta = conta;
	}

	public String exibeExtrato() {
		return conta.getExtrato();
	}

	public String sacar(double valor) {
		try {
			conta.sacar(valor);
			return "Saque efetuado!";
		} catch (Exception e) {
			return e.getMessage();
		}

	}

	public void depositar(double valor) {
		conta.depositar(valor);
	}


}
