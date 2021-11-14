/*
 * Exercitiul 1
 * 
 * Sa se modifice exemplul Coffee Maker astfel incat clasa CoffeeMaker sa arunce o exceptie daca un
 * numar de obiecte de tip Coffee sunt create
 */

package isp_lab7_ex1;

// Clasa publica CoffeeDrinker
public class CoffeeDrinker{
	
	// Metoda drinkCoffee(), nu returneaza nimic
	public void drinkCoffee(Coffee c) throws TemperatureException, ConcentrationException {
		
		// Daca temperatura este mai mare ca 60, se arunca exceptia TemperatureException
		if(c.getTemp() > 60) {
			throw new TemperatureException(c.getTemp(),"Coffee is too hot!");
		}
		
		// Daca concentratia este mai mare ca 50, se arunca exceptia ConcentrationException
		if(c.getConc() > 50) {
			throw new ConcentrationException(c.getConc(),"Coffee concentration too high!");         
        }
		
		System.out.println("Drink coffee: " + c);
	}

}
