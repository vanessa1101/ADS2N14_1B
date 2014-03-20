import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MathRondom {

	final
	static String[] nomes = {"Vanessa","Moraes","Paes"};
	
	public static void main(String[] args) {
		Random random = new Random();
		
		List<String> nomesUsados = new ArrayList<String>();
		int i = 0;
		while (i  <= nomes.length ) {
			String nome = nomes[random.nextInt(3)];
			if (nomesUsados.contains(nome)) {
				continue;
			} else {
				nomesUsados.add(nome);
			}
			System.out.print(nome + " ");
			i++;
		}
		
	}
}
