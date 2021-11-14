/*
 * Random Number Initialized Vector
 */

package isp_l2_se;

import java.util.*;

// Clasa publica RandNumVector
public class RandNumVector {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Afisare mesaj
		System.out.println("Hi there!");
		
		// Declararea si initializarea unui numar Random
		Random r = new Random();
		
		// Declararea si initializarea unui vector a cu 10 elemente
		int[] a = new int[10];
		
		// Parcurgerea vectorilor si alocarea unei valori aleatoare pentru fiecare element din vector
		for(int i=0 ; i<a.length ; i++) {
			a[i] = r.nextInt(100);
		}
		
		// Afisarea vectorului
		for(int i=0 ; i<a.length ; i++) {
			System.out.println("a[" + i + "] = " + a[i] + " ");
		}
		
	}

}
