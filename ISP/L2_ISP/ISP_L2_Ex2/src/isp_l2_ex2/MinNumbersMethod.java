/*
 * Exercitiul 2.b
 * 
 * Scrieti un program care citeste 2 numere de la tastatura si afiseaza minimul dintre
 * cele doua.
 * Programul se va scrie cu ajutorul a doua metode:
 * - Metoda min(int a, int b), care va afisa minimul dintre cele doua numere
 * - Metoda main, care va apela metoda min(int a, int b).
 */

package isp_l2_ex2;

import java.util.Scanner;

//Clasa publica MinNumbersMethod
public class MinNumbersMethod {
	
	// Metoda min, care determina maximul dintre cele doua numere
	public static int min(int a, int b) {
		int min = 0;
		if(a>b) 
			System.out.println("Minimul este " + b);
		else if(a<b) {
			System.out.println("Minimul este " + a);
		}
		else {
			System.out.println("Numerele sunt egale!");
		}
		return min;
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
		min(a,b);
	}
}