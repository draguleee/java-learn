/*
 * SWITCH-CASE
 * 
 * Executa unul sau mai multe blocuri de instructiuni in functie de valoarea expresiei evaluare. In
 * cazul in care instructiunea break lipseste, atunci se va executa si urmatorul bloc case. 
 * 
 * Blocul special default este executat in cazul in care nici unul dintre blocurile case nu este
 * executat.
 */

package isp_l2_sl;

import java.util.*;

// Clasa publica SwitchCase, care modeleaza instructiunea decizionala switch-case
public class SwitchCase {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Creare Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Numarul lunii + numele lunii
		int month = in.nextInt();
		String monthString = "";
		
		// Switch-Case
		switch(month) {
			
			// Caz 1 - Ianuarie
			case 1:
				monthString = "January";
				break;
				
			// Caz 2 - Februarie
			case 2:
				monthString = "February";
				break;
				
			// Caz 3 - Martie
			case 3: 
				monthString = "March";
				break;
				
			// Caz 4 - Aprilie
			case 4:
				monthString = "April";
				break;
				
			// Caz 5 - Mai
			case 5:
				monthString = "May";
				break;
				
			// Caz 6 - Iunie
			case 6: 
				monthString = "June";
				break;
				
			// Caz 7 - Iulie
			case 7:
				monthString = "July";
				break;
				
			// Caz 8 - August
			case 8:
				monthString = "August";
				break;
				
			// Caz 9 - Septembrie
			case 9:
				monthString = "September";
				break;
				
			// Caz 10 - Octombrie
			case 10:
				monthString = "October";
				break;
				
			// Caz 11 - Noiembrie
			case 11:
				monthString = "November";
				break;
			
			// Caz 12 - Decembrie
			case 12:
				monthString = "December";
				break;
				
			// Cazul in care este introdus un numar in afara intervalului [1,12]
			default:
				System.out.println("Nu exista o luna pentru numarul introdus!");
				break;
		}
		System.out.println(monthString);
	}

}
