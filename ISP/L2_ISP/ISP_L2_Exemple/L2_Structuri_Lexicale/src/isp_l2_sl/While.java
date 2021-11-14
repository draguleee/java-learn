/*
 * WHILE
 * 
 * Executa ciclic o secventa de instructiuni atat timp cat valoarea expresiei logice din paranteza este
 * adevarata.
 */

package isp_l2_sl;

import java.util.*;

// Clasa While, care modeleaza instructiunea ciclica while
public class While {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Variabila count, initializata cu 1
		int count = 1;
		
		// Variabila max, citita de la tastatura
		// Aceasta variabila desemneaza finalul numaratorului
		int max = in.nextInt();
		
		// Atat timp cat count este mai mic decat numarul maxim dat, se executa numaratoarea
		while(count<max) {
			System.out.println("Count: " + count);
			count++;
		}
	}

}
