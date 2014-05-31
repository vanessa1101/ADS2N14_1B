package com.senac;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import com.senac.commands.Commands;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TravessiaDesertoTeste {

	private TravessiaDeserto travessia = null;

	@Before
	public void setUp() {
		travessia = new TravessiaDeserto();
		travessia.initGame();
	}

	@After
	public void tearDown() {
		travessia = null;
	}

	@Test
	public void initGameTest() {
		assertEquals(0, travessia.getPos());
		assertEquals(travessia.MAX_FUEL, travessia.getFuel());
		assertEquals(travessia.MAP_SIZE, travessia.getMap().length);
	}

	@Test
	public void avancarTest() {

		int posicao = travessia.getPos();

		
		assertNotEquals("O caminhão já se encontra no fim do deserto", 10, posicao);
		
		assertNotEquals("O caminhão está sem gasolina", 0, travessia.getFuel());

		travessia.avancar();
		
		assertEquals("Deveria ter avançado uma unidade", posicao+1, travessia.getPos());
		
	}
	
	@Test
	public void voltarTest() {
		
		int posicao = travessia.getPos();
		
		assertNotEquals("O caminhão já se encontra no inicio do deserto", 0, travessia.getPos());
		assertNotEquals("O caminhão está sem gasolina", 0, travessia.getFuel());
		
		travessia.voltar();
		
		assertEquals("Era para ter voltado 1 unidade", posicao - 1, travessia.getPos());
			
	}

	@Test
	public void descarregarTest() {

		int combustivel = travessia.getFuel();
		int posicao = travessia.getPos();
		int[] mapa = travessia.getMap();
		
		assertNotEquals("O caminhão está sem gasolina", 0, travessia.getFuel());
		
		travessia.descarregar();

		assertEquals(combustivel - 1, travessia.getFuel());
//		assertEquals(1, mapa[posicao]);
	}

	@Test
	public void carregarTest() {

		int combustivel = travessia.getFuel();
		int posicao = travessia.getPos();
		int[] mapa = travessia.getMap();
		
		travessia.carregar();
		
		assertEquals(combustivel + 1, travessia.getFuel());
		assertEquals(0, mapa[posicao]);
	}

	@Test
	public void translateCommandTest() {

		assertEquals(travessia.translateCommand("avancar"), Commands.AVANCAR);
		assertEquals(travessia.translateCommand("voltar"), Commands.VOLTAR);
		assertEquals(travessia.translateCommand("carregar"), Commands.CARREGAR);
		assertEquals(travessia.translateCommand("descarregar"),	Commands.DESCARREGAR);
		assertEquals(travessia.translateCommand("ajuda"), Commands.AJUDA);
		assertEquals(Commands.INVALID_COMMAND, travessia.translateCommand("acelerar"), Commands.ERROR);
	}

	@Test
	public void processCommandTest() {
		// Testa avançar 2 posições
		this.processCommandTest(0);
		this.processCommandTest(0);
		
		// Testa descarregar 2
		this.processCommandTest(2);
		this.processCommandTest(2);
		
		// Testa voltar 2
		this.processCommandTest(1);
		this.processCommandTest(1);
		
		// Testa carregar na posição zero
		for (int i = 0; i <= 6; i++) {
			this.processCommandTest(3);
		}
		
		// Testa avançar 2 posições
		this.processCommandTest(0);
		this.processCommandTest(0);
		
		// Testa carregar no deserto
		this.processCommandTest(3);
		this.processCommandTest(3);
		this.processCommandTest(3);
		this.processCommandTest(3);
		this.processCommandTest(3);
	}
	

	public void processCommandTest(int command) {
			switch (command) {
			case Commands.AVANCAR:
				this.avancarTest();
				break;
			case Commands.VOLTAR:
				this.voltarTest();
				break;
			case Commands.CARREGAR:
				this.carregarTest();
				break;
			case Commands.DESCARREGAR:
				this.descarregarTest();
				break;
			case Commands.AJUDA:
				this.ajudaTest();
				break;
			default:
				System.err.println(Commands.INVALID_COMMAND);
			}
		}

	private void ajudaTest() {
		System.out.println("Comandos: avancar voltar carregar descarregar ajuda");
	}
	
}
