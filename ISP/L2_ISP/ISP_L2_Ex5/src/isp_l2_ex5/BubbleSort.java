/*
 * Exercitiul 5.a
 * 
 *  Sa se scrie un program care genereaza un vector de 10 elemente de tip int, si sa se sorteze folosind
 *  metoda sortarii bulelor (bubble sort).
 *  Se va folosi doar metoda main.
 */

package isp_l2_ex5;

import java.util.*;

// Clasa publica BubbleSort
public class BubbleSort {
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Citirea de la tastatura a numarului de elemente din vector
		System.out.print("Numarul de elemente: ");
		int n = in.nextInt();
		
		// Crearea vectorului v cu n elemente
		int v[] = new int[n];
		
		// Citirea elementelor vectorului de la tastatura
		for(int i=0 ; i<n ; i++) {
			System.out.print("v[" + i + "] = ");
			v[i] = in.nextInt();
		}
		
		// Afisarea vectorului inainte de sortare
		System.out.print("Vectorul nesortat: ");
		for(int i=0 ; i<n ; i++) 
			System.out.print(v[i] + " ");
		
		
		// Sortarea vectorului
		int temp = 0;
		for(int i=0 ; i<n ; i++) {
			for(int j=1 ; j<n-i ; j++) {
				if(v[j-1] > v[j]) {
					temp = v[j-1];
					v[j-1] = v[j];
					v[j] = temp;
				}
			}
		}
		
		// Afisarea vectorului dupa sortare
		System.out.println(" ");
		System.out.print("Vectorul sortat: ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(v[i] + " ");
		}
	}
}
