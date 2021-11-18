/*
 * Exercitiul 1
 * 
 * Sa se modifice exemplul CoffeeTest in asa fel incat CoffeeMaker va arunca o exceptie daca
 * un numar predefinit de obiecte de tip Coffee este creat.
 */

package isp_l7_ex1;

import java.util.*;


// Clasa publica CoffeeMaker
public class CoffeeMaker {
	
	// Metoda makeCoffee() - fara parametrii
	// Returneaza un obiect de tip Coffee, cu parametrii: temperatura, concentratie
	public Coffee[] makeCoffees(int number, int limit) throws CoffeeObjectsExceededException {
		System.out.println("Make a Coffee...");
		Coffee[] coffees;
		if(number>limit) {
			throw new CoffeeObjectsExceededException(number,"Too many Coffee objects created!");
		}
		else if(number<limit) {
			coffees = new Coffee[number];
		}
		else {
			coffees = new Coffee[number];
			System.out.println("Limita atinsa!");
		}
		return coffees;
	}
	
}
