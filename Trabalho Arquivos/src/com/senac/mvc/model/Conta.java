package com.senac.mvc.model;

import java.util.Scanner;

public class Conta {

	private int conta, saques, nunVerificacao;
	private double saldo;
	private Cliente cliente;

	public Conta() {
		cliente = new Cliente();
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public int getSaques() {
		return saques;
	}

	public void setSaques(int saques) {
		this.saques = saques;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void somaSaque() {
		setSaques(getSaques() + 1);
	}

	public void sacar(double valor) throws Exception {
		if (saldo >= valor) {
			saldo -= valor;
			saques++;
		} else {
			throw new Exception("Saldo Insuficiente");
		}

	}

	public String getExtrato() {
		String extrato = "---------------- EXTRATO -------------" 
				+ "\n Nome: " + this.cliente.getNome()
				+ "\n Número da conta: " + getConta()
				+ "\n Saldo atual: " + getSaldo()
				+ "\n Saques realizados hoje: " + getSaques()
				+ "\n---------------------------------------------\n";
		return extrato;
	}
}
