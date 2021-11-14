/*
 * Matrici - vectori de vectori
 */

package isp_l2_se;

// Clasa publica Matrici, care modeleaza diferite tipuri de matrici
public class Matrici {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Declararea unei matrici
		int[][] m;			// Prima metoda
		double n[][];		// A doua metoda
		
		// Initializarea unei matrici
		m = new int[5][10];			// Matrice cu 5 linii si 10 coloane
		n = new double[3][3];		// Matrice de 3x3 (3 linii, 3 coloane)
		
		int l[] = m[1];		// Vector cu 10 elemente
	}

}
