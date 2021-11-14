/*
 * Lungimea unui vector / a unei matrice
 *
 * Se face cu ajutorul cuvantului cheie length
 */

package isp_l2_se;

// Clasa publica VectorMatrixLength, care modeleaza determinarea lungimii unui vector / matrice
public class VectorMatrixLength {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Determinare lungime primul vector
		int[] a = new int[5];
		int length_a = a.length;
		System.out.println("Lungime vector a: " + length_a);
		
		// Determinare lungime al doilea vector
		int[] b = {1,5,3,6,2,8,7,9,10,4};
		int length_b = b.length;
		System.out.println("Lungime vector b: " + length_b);
		
		// Determinare lungime matrice
		int[][] m = new int[3][6];
		int length_m = m[0].length;
		System.out.println("Lungime matrice m: " + length_m);
	}

}
