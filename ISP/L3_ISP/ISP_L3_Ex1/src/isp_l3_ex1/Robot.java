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

import java.util.*;

// Clasa publica Robot
public class Robot {
	
	// Variabila de instanta - pozitia robotului
	public int x;
	
	// Constructor default - initializarea pozitiei robotului la 1
	public Robot() {
		this.x = 1;
	}
	
	// Constructor - initializarea pozitiei robotului cu o valoare data de la tastatura
	public Robot(int x) {
		this.x = x;
	}
	
	// Metoda change(int k) - adaugarea valorii k la valoarea lui x
	public int change(int k) {
		if(k>=1) {
			this.x = k;
		}
		return x;
	}
	
	// Metoda toString - afiseaza pozitia robotului
	public String toString() {
		return "Pozitia robotului este: " + this.x;
	}

}
