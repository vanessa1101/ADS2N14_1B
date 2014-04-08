package com.senac.mvc.view;

import static java.lang.System.out;

import java.util.Scanner;

import com.senac.mvc.controller.Controller;

public class ExtendedView extends ContaSimplesView {

	Scanner entrada = new Scanner(System.in);
	Controller controller;

	public ExtendedView(Controller controller) {
		this.controller = controller;
	}

	public void exibeExtrato() {
		String extrato = controller.exibeExtrato();
		System.out.println(extrato);
	}

	public void iniciar() {
		int opcao;

		do {
			exibeMenu();
			opcao = entrada.nextInt();
			escolheOpcao(opcao);
		} while (opcao != 4);
	}

	public void exibeMenu() {
		System.out.println("\t Escolha a opção desejada");
		System.out.println("1 - Consultar Extrato");
		System.out.println("2 - Sacar");
		System.out.println("3 - Depositar");
		System.out.println("4 - Sair\n");
		System.out.print("Opção: ");
	}

	public void escolheOpcao(int opcao) {
		double valor;
		switch (opcao) {
		case 1:
			exibeResultado(controller.exibeExtrato());
			break;
		case 2:
			System.out.print("Quanto deseja sacar: ");
			valor = entrada.nextDouble();
			controller.sacar(valor);
			break;
		case 3:
			System.out.print("Quanto deseja depositar: ");
			valor = entrada.nextDouble();
			controller.depositar(valor);
			break;
		case 4:
			System.out.println("Sistema encerrado.");
			break;

		default:
			System.out.println("Opção inválida");
		}
	}

	private void exibeResultado(String resultado) {
		System.out.println(resultado);
	}
}