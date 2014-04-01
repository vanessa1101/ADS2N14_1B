import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MathRondom {

	final
	static String[] nomes = {"Vanessa","Ale gato","Jaqueline"};
	static String[] sobrenomes = {"Silva","Moraes","Paes"};
	static String[] telefones = {"4446","8765","4567","5679"};
	public static void main(String[] args) {
		telefone();
	}
	private static void testaNome() {  
		
		Random random = new Random();
		
		List<String> nomesUsados = new ArrayList<String>();
		int i = 0;
		while (i  <= nomes.length ) {
			String nome = nomes[random.nextInt(3)];
			String sobrenome = sobrenomes[random.nextInt(3)];
			if (nomesUsados.contains(nome)) {
				continue;
			} else {
				nomesUsados.add(nome);
			}
			System.out.println(nome + " "+ sobrenome);
			i++;
		}
	}
	public static void telefone(){
		List<String> telefonesUsados = new ArrayList<String>();
		int i = 1;
		Random random = new Random();
		String telefone = "";
		String numero = "";
		
		while (i  <= telefones.length ) {
			numero = telefones[random.nextInt(4)];
			if (telefonesUsados.contains (numero)) {
				continue;
			} else {
				telefonesUsados.add(numero);
				if (i==1)
					telefone = numero;
				else
					telefone = telefone + "-" + numero;
			}
			i++;
		}
		System.out.print("telefone " + telefone);
	}
}
 

