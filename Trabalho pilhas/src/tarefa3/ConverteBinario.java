package tarefa3;

import tarefa1.Pilha;

public class ConverteBinario {

	public static void main(String[] args) {
		try {
			System.out.println(base10(10));
		} catch (Exception e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}
	
	public static String base10(int valor) throws Exception {
		String binario = "";
		Pilha pilha = new Pilha(50);

		while (valor != 0) {
			int temp = (int) (valor % 2);
			binario = temp + binario;
			valor /= 2;
			pilha.push(String.valueOf(temp));
		}

		return parse(pilha);

	}

	private static String parse(Pilha pilha) throws Exception {
		String str = "";
		String temp = "";
		for (int i = pilha.length() - 1; !pilha.isEmpty(); i--) {
			temp = pilha.pop();
			if (temp != null) {
				str += temp;
			}
		}
		return str;
	}

}
