/*
 * IF-ELSE
 * 
 * I se spune programului sa execute o anumita secventa de cod doar daca expresia logica evaluata are
 * valoarea de adevar true. In caz contrar, se executa ramura else.
 */

package isp_l2_sl;

import java.util.*;

// Clasa IfElse, care modeleaza instructiunea decizionala if-else
public class IfElse {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {

		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Punctajul de la test si nota acordata
		int testScore = in.nextInt();
		char grade;
		
		// If-Else
		if(testScore >= 90) {		
			grade = 'A';			// Daca punctajul e mai mare de 90, nota va fi A
		}
		else if(testScore >= 80) {
			grade = 'B';			// Daca punctajul e mai mare de 80, nota va fi B
		}
		else if(testScore >= 70) {
			grade = 'C';			// Daca punctajul e mai mare de 70, nota va fi C
		}
		else if(testScore >= 60) {
			grade = 'D';			// Daca punctajul e mai mare de 60, nota va fi D
		}
		else {
			grade = 'F';
		}
		
		// Afisarea notei
		System.out.println("Grade = " + grade);
		
	}

}
