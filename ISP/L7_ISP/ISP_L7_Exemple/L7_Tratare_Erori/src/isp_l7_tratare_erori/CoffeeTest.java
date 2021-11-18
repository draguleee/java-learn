/*
 * Crearea propriilor exceptii
 * 
 * Programatorul are posibilitatea de a defini propriile sale exceptii prin extinderea clasei
 * Exception
 */

package isp_l7_tratare_erori;

import java.util.*;
import java.io.*;
import java.lang.*;


// Clasa Coffee
class Coffee {
	
	// Atributele / variabilele de instanta pentru clasa Coffee
	private int temperature;
	private int concentration;
	
	// Constructor - parametrii: temperature (int), concentration (int)
	public Coffee(int temperature, int concentration) {
		System.out.println("Constructor cu parametrii Coffee.");
		this.temperature = temperature;
		this.concentration = concentration;
	}
	
	// Getter pentru temperatura cafelei
	public int getTemperature() {
		return this.temperature;
	}
	
	// Getter pentru concentratia cafelei
	public int getConcentration() {
		return this.concentration;
	}
	
	// Metoda toString()
	public String toString() {
		return "[Temperature: " + this.temperature + "; Concentration: " + this.concentration + "]";
	}
}


// Clasa CoffeeMaker
class CoffeeMaker {
	
	// Metoda makeCoffee() - fara parametrii
	// Returneaza un obiect de tip Coffee, cu parametrii: temperatura, concentratie
	public Coffee makeCoffee() {
		System.out.println("Make a Coffee...");
		int temperature = (int)(Math.random()*100);
		int concentration = (int)(Math.random()*100);
		Coffee coffee = new Coffee(temperature,concentration);
		return coffee;
	}
}


// Clasa CoffeeDrinker
class CoffeeDrinker {
	
	// Metoda drinkCoffee() - parametrii: coffee (Coffee)
	// Bea cafeaua
	public void drinkCoffee(Coffee coffee) throws TemperatureException, ConcentrationException {
		if(coffee.getTemperature() > 60) {
			throw new TemperatureException(coffee.getTemperature(),"Coffee is too hot!");
		}
		if(coffee.getConcentration() > 50) {
			throw new ConcentrationException(coffee.getConcentration(),"Coffee is too concentrated!");
		}
		System.out.println("Drink coffee: " + coffee);
	}
}


// Clasa TemperatureException, care extinde / mosteneste clasa Exception
class TemperatureException extends Exception {
	
	// Atributele / variabilele de instanta pentru clasa TemperatureException
	int temperature;
	
	// Constructor default - fara parametrii
	public TemperatureException() {
		System.out.println("Constructor default TemperatureException.");
	}
	
	// Constructor - parametrii: temperature (int), message (String)
	public TemperatureException(int temperature, String message) {
		super(message);
		this.temperature = temperature;
		System.out.println("Constructor cu argumente TemperatureException.");
	}
	
	// Getter pentru temperatura cafelei
	public int getTemperature() {
		return this.temperature;
	}
}


// Clasa ConcentrationException, care extinde / mosteneste clasa Exception
class ConcentrationException extends Exception {
	
	// Atributele / variabilele de instanta pentru clasa ConcentrationException
	int concentration;
	
	// Constructor - fara parametrii
	public ConcentrationException() {
		System.out.println("Constructor default ConcentrationException.");
	}
	
	// Constructor - parametrii: concentration (int), message (String)
	public ConcentrationException(int concentration, String message) {
		super(message);
		this.concentration = concentration;
		System.out.println("Constructor cu argumente ConcentrationException.");
	}
	
	// Getter pentru concentratia cafelei
	public int getConcentration() {
		return this.concentration;
	}
}


// Clasa publica CoffeeTest
public class CoffeeTest {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Crearea unui CoffeeMaker + CoffeeDrinker
		CoffeeMaker cm = new CoffeeMaker();
		CoffeeDrinker cd = new CoffeeDrinker();
		
		// Limita de creere a cafelelor
		int limit = in.nextInt();
		
		// Aruncare, prindere si tratare exceptii
		for(int i=0 ; i<limit ; i++) {
			Coffee coffee = cm.makeCoffee();
			System.out.println();
			try {
				cd.drinkCoffee(coffee);
			}
			catch(TemperatureException e) {
				System.out.println("Exception: " + e.getMessage());
			}
			catch(ConcentrationException e) {
				System.out.println("Exception: " + e.getMessage());
			}
			finally {
				System.out.println("Throw the coffee cup.");
			}
			
			/*
			try {
				cd.drinkCoffee(coffee);
			}
			catch(Exception e) {
				System.out.println("Exceptions: " + e.getMessage());
			}
			*/
		}
	}
}


