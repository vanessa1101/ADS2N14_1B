import java.util.Scanner;

public class principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lista listaUser = new Lista();
		arquivoUsuario arqUser = new arquivoUsuario();
		Scanner teclado = new Scanner(System.in);
		
		boolean validar=true;
		while (validar) {
			System.out.println("opção 1 -Fazer login\nopção 2 - cadastrar usuario");
			int op = teclado.nextInt();
		
		if (op == 1) {

		} else if (op == 2) {
			System.out.println("digite seu nome:");
			String nome = teclado.next();
			System.out.println("digite seu usuario");
			String user = teclado.next();
			System.out.println("digite senha:");
			String senha = teclado.next();
			System.out.println("Usuario cadastrado");
			Usuario u = new Usuario(user,nome,senha);
			No usuario = new No(u);
			listaUser.addInicio(usuario);
			
		} else {
			System.out.println("opcao invalida");
			   No atual = listaUser.topo; 
			   while (atual != null) { 
				    Usuario user = (Usuario)atual.getElement();  
				   arqUser.escreverArquivo(user.getUsername()+"|"+user.getNome()+"|"+user.getSenha());
				   atual = atual.getProx();
				    }
				  
				  
			validar = false;
		}
		}
		
		
		 

	}

}
