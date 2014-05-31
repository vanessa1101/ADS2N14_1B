package tarefa2;

import java.util.Iterator;

import tarefa1.Pilha;

public class Palindrome {
	
	public static void main(String[] args) {
		new Palindrome("renner");
		new Palindrome("ovo");
		new Palindrome("teste");
	}
	
	public Palindrome(String str) {
		try {
			if(isPalindromeUsandoPilha(str)) {
				System.out.println(str + " é palindrome");
			} else {
				System.out.println(str + " não é palindrome");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static boolean isPalindromeUsandoPilha(String str) throws Exception {
		int size = str.length(); // renners = 7  
		Pilha stringInvertida = new Pilha(size);
		Pilha stringNormal = new Pilha(size);
		
		for (int i = size-1; i >= 0; i--) {
			stringInvertida.push(String.valueOf(str.charAt(i)));
		}
		// [0] = s 
		// [1] = r
		// [2] = e
		// [3] = n
		// [4] = n
		// [5] = e
		// [6] = r
		

		
		
		for (int i = 0; i <= size-1; i++) {
			stringNormal.push(String.valueOf(str.charAt(i)));
		}
		
		// [0] = r 
		// [1] = e
		// [2] = n
		// [3] = n
		// [4] = e
		// [5] = r
		// [6] = s
		
		
		boolean palindrome = true;
		String a = "";
		String b = "";
		
		for (int i = 0; i <= size-1; i++) {
			a = stringNormal.pop();
			b = stringInvertida.pop();
			
//			System.out.println(a + " ==  " + b);
			
			if (!a.equals(b)) {
				palindrome = false;
				break;
			}
		}
		
		return palindrome;
		
	}

}
