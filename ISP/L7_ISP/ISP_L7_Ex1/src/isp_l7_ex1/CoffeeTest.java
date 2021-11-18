/*
 * Exercitiul 1
 * 
 * Sa se modifice exemplul CoffeeTest in asa fel incat CoffeeMaker va arunca o exceptie daca
 * un numar predefinit de obiecte de tip Coffee este creat.
 */

package isp_l7_ex1;

import java.util.*;


// Clasa publica CoffeeTest
public class CoffeeTest {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Numarul de cafele create
		System.out.print("Numarul de cafele care se vor crea: ");
		int number = in.nextInt();
		
		// Limita
		System.out.print("Limita: ");
		int limit = in.nextInt();
		
		// Crearea unui obiect de tip CoffeeMaker + CoffeeDrinker
		CoffeeMaker cm = new CoffeeMaker();
		CoffeeDrinker cd = new CoffeeDrinker();
		
		// Crearea unui vector de obiecte de tip Coffee
		Coffee[] coffees = new Coffee[number];
		
		// Aruncare, prindere si tratare exceptii
		for(int i=0 ; i<number ; i++) {
			try {
				cm.makeCoffees(number,limit);
			}
			catch(CoffeeObjectsExceededException e) {
				System.out.println("Exception: " + e.getMessage());
			}
			finally {
				System.out.println("Throw the coffee cups.");
			}
			System.out.println();
		}
		
	}

}
