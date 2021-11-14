/*
 * DO-WHILE
 * 
 * Este similar cu blocul while, cu deosebirea ca acesta din urma executa cel putin o data secventa de
 * instructiuni.
 */

package isp_l2_sl;

import java.util.*;

// Clasa publica DoWhile, care modeleaza instructiunea ciclica do-while
public class DoWhile {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Introduceti numarul maxim de numaratori de la tastatura
		System.out.print("max = ");
		int max = in.nextInt();
		
		// Variabila count, initializata cu 1
		int count = 1;
		
		// Se executa numaratoarea atat timp cat count este mai mic decat valoarea maxima data
		do {
			System.out.println("Count is: " + count);
			count++;
		}
		while(count<max);
		
	}

}
