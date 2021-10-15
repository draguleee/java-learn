/*
 * Exercitiul 2.d
 * 
 * Scrieti un program care citeste 2 numere de la tastatura si afiseaza maximul dintre
 * cele doua.
 * Programul se va scrie cu ajutorul a trei metode:
 * - Metoda citireVector(int v[]), care va citi vectorul
 * - Metoda min(int v[], care va afisa minimul din vector
 * - Metoda main, care va apela metoda citireVector(int v[]) si min(int a, int b).
 */

package isp_l2_ex2;

import java.util.Scanner;

//Clasa publica MinNumbersNMethod
public class MinNumbersNMethod {
	
	// Metoda citireVector, care citeste elementele vectorului
	public static void citireVector(int v[]) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		for(i=0 ; i<v.length ; i++) {
			System.out.print("v[" + i + "] = ");
			v[i] = s.nextInt();
		}
	}
	
	// Metoda minN, care determina maximul dintre n numere naturale
	public static int min(int v[]) {
		int min = 0;
		for(int i=0 ; i<v.length-1 ; i++) {
			if(v[i] > v[i+1]) {
				min = v[i+1];
			}
			else if(v[i] < v[i+1]) {
				min = v[i];
			}
		}
		return min;
	}
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Citirea lui n de la tastatura
		System.out.print("Introduceti numarul de elemente din vector: ");
		int n = in.nextInt();
		
		// Crearea unui vector v si citirea lui
		int v[] = new int[n];
		citireVector(v);
		
		// Determinarea maximului din vectorul v
		int minimum = min(v);
		System.out.println("Minimul: " + minimum);
	}
}