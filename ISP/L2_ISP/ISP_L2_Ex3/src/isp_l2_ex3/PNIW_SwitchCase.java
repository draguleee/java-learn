/*
 * Exercitiul 3.b
 * 
 * Sa se scrie un program numit PrintNumberInWord care afiseaza "ONE", "TWO", ... , "NINE", 
 * "OTHER", daca variabila "number" este 1, 2, ..., 9 sau alta.
 * Se va folosi statement-ul "switch-case".
 * Programul se va scrie doar in functia main.
 */

package isp_l2_ex3;

import java.util.*;

// Clasa publica PNIW_SwitchCase
public class PNIW_SwitchCase {
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Citirea variabilei number de la tastatura
		System.out.print("Introduceti numarul: ");
		int number = in.nextInt();
		
		// Switch-Case
		switch(number) {
			case 1: System.out.println("ONE"); break;
			case 2: System.out.println("TWO"); break;
			case 3: System.out.println("THREE"); break;
			case 4: System.out.println("FOUR"); break;
			case 5: System.out.println("FIVE"); break;
			case 6: System.out.println("SIX"); break;
			case 7: System.out.println("SEVEN"); break;
			case 8: System.out.println("EIGHT"); break;
			case 9: System.out.println("NINE"); break;
			default: System.out.println("OTHER"); break;
		}
	}

}
