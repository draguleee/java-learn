/*
 * Exercitiul 6.4
 * 
 * Dandu-se un numar intreg n, sa se afiseze n! (factorial) utilizand o metoda nerecursiva
 */

package isp_l2_ex6;

import java.util.*;

// Clasa publica NonRecursiveFactorial
public class NonRecursiveFactorial {
	
	// Metoda nonRecursiveFactorial, care calculeaza factorul nerecursiv a unui numar intreg n
	public static void nonRecursiveFactorial(int n) {
		int fact = 1;
		for(int i=1 ; i<=n ; i++) {
			fact = fact*i;
		}
		System.out.println(n + "! = " + fact);
	}
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Introducerea numarului n de la tastatura
		System.out.print("Introduceti n: ");
		int n = in.nextInt();
		
		// Calcularea factorialului numarului n
		nonRecursiveFactorial(n);
	}
}
