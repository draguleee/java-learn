/*
 * Exemplu matrice cu String-uri
 */

package isp_l2_se;

// Clasa publica MultiDimArrayDemo
public class MultiDimArrayDemo {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Matricea de String-uri
		String[][] names = {
			{"Mr. ","Mrs. ","Ms. "},
			{"Smith","Jones"}
		};
		
		// Mr. Smith
		System.out.println(names[0][0]+names[1][0]);
		
		// Mrs. Smith
		System.out.println(names[0][1]+names[1][0]);
		
		// Ms. Smith
		System.out.println(names[0][2]+names[1][0]);
		
		// Mr. Jones
		System.out.println(names[0][0]+names[1][1]);
		
		// Mrs. Jones
		System.out.println(names[0][1]+names[1][1]);
		
		// Ms. Jones
		System.out.println(names[0][2]+names[1][1]);
	}

}
