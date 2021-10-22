/* 
 * Exercitiul 1
 * 
 * Clasa Robot contine:
 * - O variabila de instanta 'x' (de tip int) care reprezinta pozitia robotului
 * - Un constructor default care initializeaza valoarea lui x la 1
 * - O metoda change(int k) care adauga valorii curente x valoarea lui k (atat timp cat k>=1)
 * - O metoda toString() care returneaza pozitia robotului.
 * 
 * Sa se scrie o clasa care modeleaza clasa Robot. Sa se scrie o clasa TestRobot pentru testarea
 * clasei Robot
 */

package isp_l3_ex1;

// Clasa publica TestRobot
public class TestRobot {
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea a doua obiecte de tip Robot
		Robot r1 = new Robot();
		Robot r2 = new Robot(10);
		
		// Afisarea pozitiei primului robot
		String s1 = r1.toString();
		System.out.println(s1);
		r1.change(5);
		String s2 = r1.toString();
		System.out.println(s2);
		
		// Afisarea pozitiei celui de-al doilea robot
		System.out.println(" ");
		String s3 = r2.toString();
		System.out.println(s3);
		r2.change(4);
		String s4 = r2.toString();
		System.out.println(s4);
	}
}
