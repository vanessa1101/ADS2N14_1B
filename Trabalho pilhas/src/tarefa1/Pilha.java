package tarefa1;

public class Pilha {

	private String[] dados;
	private int topo;
	private int index;
	
	public Pilha(int tam) {
		dados = new String[tam];
		topo = 0;
		index = 0;
	}

	public String peek() throws Exception {
		if (isEmpty())
			throw new Exception("A pilha está vazia!");

		
		
		return dados[topo - 1];
	}

	public void push(String valor) throws Exception {
		if (isFull())
			throw new Exception("A pilha está cheia!");

		dados[topo] = valor;
		topo++;
	}

	public String pop() throws Exception {
		if (isEmpty())
			throw new Exception("A pilha está vazia!");

		topo--;
		return dados[topo];
	}

	private boolean isFull() {
		return topo == dados.length;
	}

	public boolean isEmpty() {
		return topo == 0;
	}
	
	public int length() {
		return this.dados.length;
	}

}
