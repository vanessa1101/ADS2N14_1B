import javax.swing.JOptionPane;
public class Nomes {

	public static void main(String[] args) {
		
		  
  
// inicializa o ARRAY com tamanho informado pelo usuario  
		String nomes[] = new String [5];
		
		for (int i = 0; i < 5; i++) {  
			int nomesAleatorios = Integer.parseInt(JOptionPane.showInputDialog("Digite os nomes que deseja inserir?"));
     
		nomes[nomesAleatorios] = "";
		int valor = (int)Math.random() * 5;
        JOptionPane.showMessageDialog(null, "Nomes aleatórios: \n"+nomes[nomesAleatorios]);  
        
    
      
        
		}  
	}
}