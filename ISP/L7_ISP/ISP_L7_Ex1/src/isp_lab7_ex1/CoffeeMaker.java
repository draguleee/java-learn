/*
 * Exercitiul 1
 * 
 * Sa se modifice exemplul Coffee Maker astfel incat clasa CoffeeMaker sa arunce o exceptie daca un
 * numar de obiecte de tip Coffee sunt create
 */

package isp_lab7_ex1;

// Clasa publica CoffeeMaker
public class CoffeeMaker {
	
	// Metoda makeCoffee, de tip Coffee
	Coffee makeCofee() {
		
		// Initializarea paramwtrilor
		// - t: temperatura cafelei
		// - c: concentratia cafelei
		System.out.println("Make a coffe");
        int t = (int)(Math.random()*100);
        int c = (int)(Math.random()*100);
        
        // Crearea obiectului de tip Coffee si returnarea acestuia
        Coffee coffee = new Coffee(t,c);
        return coffee;
	}
	
}