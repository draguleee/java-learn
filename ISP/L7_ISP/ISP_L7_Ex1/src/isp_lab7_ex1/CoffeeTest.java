/*
 * Exercitiul 1
 * 
 * Sa se modifice exemplul Coffee Maker astfel incat clasa CoffeeMaker sa arunce o exceptie daca un
 * numar de obiecte de tip Coffee sunt create
 */

package isp_lab7_ex1;

import java.util.*;

// Clasa publica CoffeeTest
public class CoffeeTest {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Crearea obiectului de tip CoffeeMaker
		CoffeeMaker mk = new CoffeeMaker();
		
		// Crearea obiectului de tip CoffeeDrinker
        CoffeeDrinker d = new CoffeeDrinker();

        // Crearea a 15 obiecte de tip Coffee cu temperatura si concentratie aleatoare
        for(int i=0 ; i<in.nextInt() ; i++){
        	Coffee c = mk.makeCofee();
        	
        	// Se incearca sa se bea cafeaua
        	try {
        		d.drinkCoffee(c);
        	} 
        	
        	// Daca este prea calda, se prinde exceptia TemperatureException
        	catch (TemperatureException e) {
        		System.out.println("Exception:" + e.getMessage() + " temp = " + e.getTemp());
        	} 
        	
        	// Daca este prea concentrata, se prinde exceptia ConcentrationException 
        	catch (ConcentrationException e) {
        		System.out.println("Exception:"+e.getMessage() + " conc = " + e.getConc());
        	} 
        	
        	// Dupa prinderea exceptiilor, se arunca cafeaua (daca este prea calda / concentrata) 
        	finally {
        		System.out.println("Throw the cofee cup.\n");
        	}
        	
        }    
        
    }
	
}