/*
 * Exercitiul 1.b
 * 
 * Scrieti un program care citeste 2 numere de la tastatura si afiseaza maximul dintre
 * cele doua.
 * Programul se va scrie cu ajutorul a doua metode:
 * - Metoda max(int a, int b), care va afisa maximul dintre cele doua numere
 * - Metoda main, care va apela metoda max(int a, int b).
 */

package isp_l2_ex1;

import java.util.Scanner;

//Clasa publica MaxNumbersMethod
public class MaxNumbersMethod {
	
	// Metoda max, care determina maximul dintre cele doua numere
	public static int max(int a, int b) {
		int max = 0;
		if(a>b) 
			System.out.println("Maximul este " + a);
		else if(a<b) {
			System.out.println("Maximul este " + b);
		}
		else {
			System.out.println("Numerele sunt egale!");
		}
		return max;
	}
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Introducere a de la tastatura
		System.out.print("Introduceti primul numar: ");
		int a = in.nextInt();
		
		// Introducere b de la tastatura
		System.out.print("Introduceti al doilea numar: ");
		int b = in.nextInt();
		
		// Determinarea maximului dintre cele doua numere
		max(a,b);
	}
}
