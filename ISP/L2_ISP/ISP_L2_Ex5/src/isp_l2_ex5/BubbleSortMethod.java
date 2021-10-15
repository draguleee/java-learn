/*
 * Exercitiul 5.a
 * 
 *  Sa se scrie un program care genereaza un vector de 10 elemente de tip int, si sa se sorteze folosind
 *  metoda sortarii bulelor (bubble sort).
 *  Se vor folosi metodele:
 *  - scriereVector(int v[]), pentru scrierea valorilor vectorului de la tastatura
 *  - bubbleSort(int v[]) pentru sortarea vectorului v citit de la tastatura
 *  - main pentru apelarea metodei bubbleSort(int v[])
 */

package isp_l2_ex5;

import java.util.*;

// Clasa publica BubbleSortMethod
public class BubbleSortMethod {
	
	// Metoda scriereVector, pentru citirea valorilor vectorului de la tastatura
	public static void scriereVector(int v[]) {
		Scanner s = new Scanner(System.in);
		for(int i=0 ; i<v.length ; i++) {
			System.out.print("v[" + i + "] = ");
			v[i] = s.nextInt();
		}
	}
	
	// Metoda bubbleSort, pentru sortarea vectorului
	public static void bubbleSort(int v[]) {
		int temp = 0, i = 0, j = 0;
		for(i=0 ; i<v.length ; i++) {
			for(j=1 ; j<v.length-i ; j++) {
				if(v[j-1] > v[j]) {
					temp = v[j-1];
					v[j-1] = v[j];
					v[j] = temp;
				}
			}
		}
		System.out.println();
	}
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Numarul de elemente din vector
		System.out.print("Numarul de elemente din vector: ");
		int n = in.nextInt();
		
		// Crearea vectorului cu n elemente
		int v[] = new int[n];
		
		// Scrierea vectorului si citirea acestuia
		scriereVector(v);
		System.out.print("Inainte de sortare: ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(v[i] + " ");
		}
		
		// Sortarea vectorului si afisarea acestuia
		bubbleSort(v);
		System.out.print("Dupa sortare: ");
		for(int i=0 ; i<n ; i++) {
			System.out.print(v[i] + " ");
		}
	}
}
