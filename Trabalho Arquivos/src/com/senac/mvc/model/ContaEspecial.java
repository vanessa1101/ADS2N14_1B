package com.senac.mvc.model;


	public class ContaEspecial extends Conta {

		private double limite;
		
		public void sacar (double valor) {
			if (  (getSaldo() + limite ) >= valor) {
				setSaldo(getSaldo()-valor);
				somaSaque();
			}
		}


	}

