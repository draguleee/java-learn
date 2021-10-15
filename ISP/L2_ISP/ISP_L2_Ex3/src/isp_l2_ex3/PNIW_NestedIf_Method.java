/*
 * Exercitiul 3.b
 * 
 * Sa se scrie un program numit PrintNumberInWord care afiseaza "ONE", "TWO", ... , "NINE", 
 * "OTHER", daca variabila "number" este 1, 2, ..., 9 sau alta.
 * Se va folosi statement-ul "nested-if".
 * Se vor folosi doua metode:
 * - Metoda nestedIf(int number), care va printa textul corespunzator numarului introdus
 * - Metoda main(), care va apela functia nestedIf(int number)
 */

package isp_l2_ex3;

import java.util.*;

// Clasa publica PNIW_NestedIf_Method
public class PNIW_NestedIf_Method {
	
	// Metoda nestedIf, care printeaza textul corespunzator numarului introdus
	public static void nestedIf(int number) {
		if(number == 1)
			System.out.println("ONE");
		else
			if(number == 2)
				System.out.println("TWO");
			else
				if(number == 3)
					System.out.println("THREE");
				else
					if(number == 4)
						System.out.println("FOUR");
					else
						if(number == 5)
							System.out.println("FIVE");
						else
							if(number == 6)
								System.out.println("SIX");
							else
								if(number == 7)
									System.out.println("SEVEN");
								else
									if(number == 8)
										System.out.println("EIGHT");
									else
										if(number == 9)
											System.out.println("NINE");
										else
											System.out.println("OTHER");
	}
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea datelor de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Citirea variabilei number de la tastatura
		System.out.print("Introduceti numarul: ");
		int number = in.nextInt();
		
		// Nested-If
		nestedIf(number);
	}
}
