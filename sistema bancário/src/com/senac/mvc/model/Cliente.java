package com.senac.mvc.model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	private String nome;
	private String endereço;

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
