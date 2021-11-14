/*
 * ENHANCED-FOR
 * 
 * Nu este specificata conditia de terminare, ci este specificata o colectie (vector) ce trebuie parcursa
 * (iterata) si elmentul care o va parcurge (iteratorul).
 */

package isp_l2_sl;

// Clasa EnhancedFor, care modeleaza instructiunea iterativa for
public class EnhancedFor {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Vectorul de numere
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		// Enhanced-For
		for(int i : numbers) {
			System.out.println("Count is: " + i);
		}
	}
}
