package tarefa4;

import java.util.Scanner;

import tarefa1.Pilha;

public class CalculaInfixa {
	public static double avalia(String expressao) throws Exception {
		Pilha pilha = new Pilha(50);

		Scanner sc = new Scanner(expressao);

		while (sc.hasNext()) {
			if (sc.hasNextInt()) {
				pilha.push(sc.next());
			} else {
				String op = sc.next();
				double rhs = Double.valueOf(pilha.pop());
				double lhs = Double.valueOf(pilha.pop());
				try {
					pilha.push(executaOperador(op.charAt(0), lhs, rhs));
				} catch (Exception e) {
					System.err.println(e.getMessage());
				}
			}
		}

		sc.close();
		
		return Double.valueOf(pilha.pop());
	}

	public static double PosFixo(String expressao) throws Exception {
		Scanner entrada = new Scanner(expressao);

		Pilha pilha = new Pilha(50);
		String saida = "";

		while (entrada.hasNext()) {

			if (entrada.hasNextInt()) {
				saida += " " + entrada.next();
			}

			else {
				String opLido = entrada.next();

				if (validaParentesesFechamento(opLido)) {
					do {

						saida += " " + pilha.pop();

					} while (!validaParentesesAbertura(pilha.peek()));

					pilha.pop();
				}

				else {
					if (pilha.isEmpty()
							|| validaParentesesAbertura(pilha.peek())) {
						pilha.push(opLido);
					}

					else if (prioridade(opLido) > prioridade(pilha.peek()))
						pilha.push(opLido);

					else {
						while (!pilha.isEmpty()
								&& prioridade(opLido) < prioridade(pilha.peek())
								&& !validaParentesesAbertura(pilha.peek())) {
							saida += " " + pilha.pop();
						}

						pilha.push(opLido);
					}
				}
			}
		}
		
		entrada.close();
		
		while (!pilha.isEmpty()) {
			saida += " " + pilha.pop();
		}

		return avalia(saida);
	}

	public static boolean validaParentesesAbertura(String op) {
		return op.equals("(");
	}

	public static boolean validaParentesesFechamento(String op) {
		return op.equals(")");

	}

	public static int prioridade(String operador) throws Exception {
		int precedencia = 0;
		switch (operador.charAt(0)) {
		case '(':
			precedencia = 3;
			break;

		case '*':
			precedencia = 2;
			break;

		case '/':
			precedencia = 2;
			break;

		case '+':
			precedencia = 1;
			break;

		case '-':
			precedencia = 1;
			break;

		default:
			throw new Exception(String.valueOf(operador.charAt(0)));
		}

		return precedencia;
	}

	private static String executaOperador(char op, double lhs, double rhs)
			throws Exception {

		switch (op) {
		case '+':
			return String.valueOf(lhs + rhs);
		case '-':
			return String.valueOf(lhs - rhs);
		case '*':
			return String.valueOf(lhs * rhs);
		case '/':
			return String.valueOf(lhs / rhs);
		default:
			throw new Exception("Operador inválido: " + op);
		}
	}
}
