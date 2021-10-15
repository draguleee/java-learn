/*
 * Exercitiul 2.c
 * 
 * Scrieti un program care citeste de la tastatura n numere dintr-un vector si afiseaza 
 * minimul dintre ele.
 * Programul se va scrie doar in metoda main.
 */

package isp_l2_ex2;

import java.util.Scanner;

//Clasa publica MinNumbersN
public class MinNumbersN {
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Numarul de elemente din vector
		System.out.print("Introduceti numarul de elemente din vector: ");
		int n = in.nextInt();
		
		// Crearea vectorului de n elemente
		int v[] = new int[n];
		
		// Citirea elementelor din vectorul v de la tastatura
		int i;
		for(i=0 ; i<n ; i++) {
			System.out.print("v[" + i + "] = ");
			v[i] = in.nextInt();
		}
		
		// Determinarea maximului din vectorul de numere
		int min = 0;
		for(i=0 ; i<n-1 ; i++) {
			if(v[i] > v[i+1]) {
				min = v[i+1];
			}
			else if(v[i] < v[i+1]) {
				min = v[i];
			}
		}
		System.out.println("Maximul este: " + min);
	}
}