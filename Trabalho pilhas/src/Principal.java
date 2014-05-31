import tarefa4.CalculaInfixa;


public class Principal {

	public static void main(String[] args) throws Exception {
		String expressao = " ( 2 * ( 3 + 6 ) )";
		System.out.println(CalculaInfixa.PosFixo(expressao));
	}
}
