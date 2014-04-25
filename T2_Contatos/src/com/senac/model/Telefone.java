package com.senac.model;

public class Telefone {
	private String numero;
	private int codArea;
	private String tipo;
	
	public Telefone(int codArea, String numero, String tipo)
	{
		this.numero = numero;
		this.tipo = tipo;
		this.codArea = codArea;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public int getCodArea() {
		return codArea;
	}
	public void setCodArea(int codArea) {
		this.codArea = codArea;
	}
	public String getTipo() {
		return tipo;
	}
	public Telefone(String numero, String tipo)
	{
		this.numero = numero;
		this.tipo = tipo;
		this.codArea = -1;
	}
}
