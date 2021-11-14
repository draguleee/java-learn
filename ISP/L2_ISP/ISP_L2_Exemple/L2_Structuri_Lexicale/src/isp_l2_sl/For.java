/*
 * FOR
 * 
 * Ofera o metoda alternativa de executare iterativa a unei secvente de instructiuni.
 */

package isp_l2_sl;

import java.util.*;

// Clasa publica For, care modeleaza instructiunea iterativa for.
public class For {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Introduceti numarul maxim de numaratori de la tastatura
		System.out.print("max = ");
		int max = in.nextInt();
		
		// Pentru un i de la 1 la un numar definit, se incrementeaza numaratoarea
		for(int i=1 ; i<max ; i++) {
			System.out.println("Count is: " + i);
		}
	}

}
