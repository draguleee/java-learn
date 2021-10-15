/*
 * Exercitiul 1.d
 * 
 * Scrieti un program care citeste de la tastatura n numere dintr-un vector si afiseaza 
 * maximul dintre ele.
 * Programul se va scrie cu ajutorul a trei metode:
 * - Metoda citireVector(int v[]), care citeste vectorul
 * - Metoda max(int v[]), care va afisa maximul din vector
 * - Metoda main, care va apela metodele citireVector(int v[]) si max(int v[]).
 */

package isp_l2_ex1;

import java.util.Scanner;

//Clasa publica MaxNumbersNMethod
public class MaxNumbersNMethod {
	
	// Metoda citireVector, care citeste elementele vectorului
	public static void citireVector(int v[]) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		for(i=0 ; i<v.length ; i++) {
			System.out.print("v[" + i + "] = ");
			v[i] = s.nextInt();
		}
	}
	
	// Metoda maxN, care determina maximul dintre n numere naturale
	public static int max(int v[]) {
		int max = 0;
		for(int i=0 ; i<v.length-1 ; i++) {
			if(v[i] > v[i+1]) {
				max = v[i];
			}
			else if(v[i] < v[i+1]) {
				max = v[i+1];
			}
		}
		return max;
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
		int maximum = max(v);
		System.out.println("Maximul: " + maximum);
	}
}