/*
 * Exercitiul 2.a
 * 
 * Scrieti un program care citeste 2 numere de la tastatura si afiseaza minimul dintre
 * cele doua.
 * Programul se va scrie doar in metoda main.
 */

package isp_l2_ex2;

import java.util.Scanner;

//Clasa publica MinNumbers
public class MinNumbers {
	
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
		int min;
		if(a>b) {
			min = b;
			System.out.println("Minimul este " + b);
		}
		else if(a<b) {
			min = a;
			System.out.println("Minimul este " + a);
		}
		else {
			System.out.println("Cele doua numere sunt egale!");
		}
	}
}