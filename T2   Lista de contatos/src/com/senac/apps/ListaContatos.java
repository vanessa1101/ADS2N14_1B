package com.senac.apps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

import com.senac.model.Pessoa;
import com.senac.model.Telefone;
import com.senac.view.ConsoleView;

public class ListaContatos {

	private static ConsoleView view = new ConsoleView();
	private static Random randomNumberGenerator = new Random();

	private static int getRandomNumber(int min, int max) {
		int rand = randomNumberGenerator.nextInt(max - min);
		return min + rand;
	}

	private static int getRandomNumber(int max) {
		return getRandomNumber(0, max);
	}

	public static void main(String[] args) {

		for (int i = 0; i < 50; ++i) {
			// Cria e configura objeto pessoa
			Pessoa pessoa = criarPessoa();
			// Cria e configura objeto telefone
			Telefone telefone = criarTelefone();
			// Associar telefone a pessoa.
			pessoa.setTelefone(telefone);
			// Envia objeto "contato" para a "view"
			imprimirContato(pessoa);
		}

	}

	/**
	 * 
	 */
	private static String createNome() {
		String[] nomes = { "Andre", "Abel", "Rodrigo", "Rafael", "Tiago",
				"Thiago", "Marcel", "Marcelo", "Tais", "Patricia", "Ana",
				"Maria" };

		return nomes[getRandomNumber(nomes.length)];
	}

	/**
	 * 
	 */
	private static String createSobrenome() {
		String[] nomes = { "Silva", "da Silva", "Santos", "dos Santos",
				"Bruno", "Schneider", "Cristiano", "Metz", "Sonnen" };

		return nomes[getRandomNumber(nomes.length)];
	}

	/**
	 * 
	 */
	private static String createEndereco() {
		String[] tipo = { "Rua", "Av.", "Trav.", "Al." };
		String endereco = String.format("%s %s %s, %d",
				tipo[getRandomNumber(tipo.length)], createNome(),
				createSobrenome(), getRandomNumber(10000) + 1);
		return endereco;
	}

	/**
	 * Cria um objeto Pessoa com nome e endereco. Nao preenche o atributo
	 * "telefone".
	 * 
	 * @return o objeto Pessoa criado.
	 */
	private static Pessoa criarPessoa() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(createNome());
		pessoa.setSobrenome(createSobrenome());
		pessoa.setEndereco(createEndereco());
		return pessoa;
	}

	/**
	 * 
	 * @return
	 */
	private static String createNumeroTelefone() {
		int prefixo = getRandomNumber(100, 1000);
		int sufixo = getRandomNumber(10000);

		return String.format("%d-%04d", prefixo, sufixo);
	}

	/**
	 * 
	 */
	private static String createTipoTelefone() {
		String[] tipos = { "casa", "trabalho", "celular" };
		int indice = getRandomNumber(tipos.length);
		return tipos[indice];
	}

	/**
	 * Cria um objeto Telefone com numero, codigo de area e tipo.
	 * 
	 * @return objeto da classe Telefone.
	 */
	private static Telefone criarTelefone() {

		Telefone telefone = new Telefone(createNumeroTelefone(),
				createTipoTelefone());
		telefone.setCodArea(getRandomNumber(10, 100));
		return telefone;
	}

	private static void imprimirContato(Pessoa contato) {
		view.showMessage(contato.getNomeCompleto() + "\n"
				+ contato.getEndereco());

		Telefone telefone = contato.getTelefone();

		view.showMessage(String.format("(%d) %s [%s]", telefone.getCodArea(),
				telefone.getNumero(), telefone.getTipo()));
	}
	
	private static void carregarContatos() {
		System.out.println("Carregando contatos...");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("contatos.txt");
			
		} catch (FileNotFoundException e) {
			System.err.println("Arquivo 'contatos.txt' não existe!");
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.err.println("Falha ao fechar stream do arquivo 'contatos.txt'");
			}
		}
	}
	
	public static void salvarContatos() {
		System.err.println("Salvando contatos...");
		FileOutputStream fos = null;
		
		try {
			
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				System.err.println("Falha ao fechar stream do arquivo 'contatos.txt' ");
			}
		}
	}
}
