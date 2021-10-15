/*
 * Exercitiul 6.4
 * 
 * Dandu-se un numar intreg n, sa se afiseze n! (factorial) utilizand o metoda recursiva
 */

package isp_l2_ex6;

import java.util.*;

// Clasa publica RecursiveFactorial
public class RecursiveFactorial {
	
	// Metoda recursiveFactorial, care calculeaza factorialul recursiv a unui numar intreg n
	public static int recursiveFactorial(int n) {
		if(n>=1) {						// Daca numarul este mai mare sau egal cu 1
			return n*recursiveFactorial(n-1);		// Se calculeaza factorialul numarului n cu formula dedicata
		}						
		else {							// Daca numarul este egal cu 0
			return 1;					// Factorialul numarului va fi egal cu 1
		}
	}
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Introducerea numarului n de la tastatura
		System.out.print("Introduceti n: ");
		int n = in.nextInt();
		
		// Determinarea factorialului numarului n
		int fact = recursiveFactorial(n);
		System.out.println(n+ "! = " + fact);
	}
}
