public class Projeto {

	String nome;
	String desc;
	Usuario dono;
	Usuario[] desenvolvedores = new Usuario[10];
	int contDesenvolvedor = 0;

	public Projeto(String nome, String desc, Usuario dono) {
		super();
		this.nome = nome;
		this.desc = desc;
		this.dono = dono;

	}
	public String getNome() {
		return nome;
	}
	public String getDesc() {
		return desc;
	}
	public Usuario getDono() {
		return dono;
	}
	public Usuario[] getDesenvolvedores() {
		return desenvolvedores;
	}
	public Projeto() {
		

	}

	public void adicionaDesenvolvedor(Usuario desenvolvedor) {
		desenvolvedores[contDesenvolvedor] = desenvolvedor;
		contDesenvolvedor++;
	}

	public void alterarProjeto(String nome, String desc, Usuario dono) {

		this.nome = nome;
		this.desc = desc;
		this.dono = dono;

	}

	public void alteraDesenvolvedor(int posicao, Usuario nome) {

		desenvolvedores[posicao] = nome;

	}

	public void excluiDesenvolv(int posicao) {
		Usuario[] novo = new Usuario[10];
		int cont = 0;

		for (int i = 0; i <= desenvolvedores.length; i++) {

			if (posicao == i) {

				i++;
			}
			novo[cont] = desenvolvedores[i];
			 cont ++; 
		}
		desenvolvedores = novo;
       
	}

}
