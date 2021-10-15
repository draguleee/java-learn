/*
 * Exercitiul 4.a
 * 
 * Sa se scrie un program care afiseaza numerele prime de la A la B, unde A si B sunt 
 * introduse de la tastatura. Sa se afiseze si cate numere prime s-au gasit.
 * Se va folosi doar functia main.
 * 
 */

package isp_l2_ex4;

import java.util.*;

// Clasa publica PrimeNumbers
public class PrimeNumbers {

	// Metoda main
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Citirea limitelor A si B de la tastatura
		System.out.print("A = ");		
		int A = in.nextInt();			// Limita inferioara de interval
		System.out.print("B = ");		
		int B = in.nextInt();			// Limita superioara de interval
		
		// Numerele prime din interval
		System.out.println("Numerele prime din interval sunt: ");
		int flag = 0;						// Semnaleaza gasirea unui numar prin din interval
		int count = 0;						// Variabila in care se retine numarul valorilor prime
		for(int i=A ; i<=B ; i++) {			// Parcurgerea intervalului
			for(int j=2 ; j<i ; j++) {		// Omiterea numerelor 0 si 1
				if(i%j == 0) {
					flag = 0;				// Numar neprim
					break;
				}
				else {
					flag = 1;				// Numar prim
				}
			}
			if(flag == 1) {
				System.out.print(i + " ");	// Afisarea tuturor numerelor prime din interval
				count++;
			}
		}
		System.out.println(" ");
		System.out.println("Numarul valorilor prime: " + count);
	}
}
