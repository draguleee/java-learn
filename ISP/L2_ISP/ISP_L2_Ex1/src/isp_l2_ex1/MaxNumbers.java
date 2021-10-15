/*
 * Exercitiul 1.a
 * 
 * Scrieti un program care citeste 2 numere de la tastatura si afiseaza maximul dintre
 * cele doua.
 * Programul se va scrie doar in metoda main.
 */

package isp_l2_ex1;

import java.util.*;

// Clasa publica MaxNumbers
public class MaxNumbers {
	
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
		int max;
		if(a>b) {
			max = a;
			System.out.println("Maximul este " + a);
		}
		else if(a<b) {
			max = b;
			System.out.println("Maximul este " + b);
		}
		else {
			System.out.println("Cele doua numere sunt egale!");
		}
	}
}
