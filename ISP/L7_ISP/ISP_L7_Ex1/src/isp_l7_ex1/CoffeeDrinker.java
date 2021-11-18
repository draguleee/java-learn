/*
 * Exercitiul 1
 * 
 * Sa se modifice exemplul CoffeeTest in asa fel incat CoffeeMaker va arunca o exceptie daca
 * un numar predefinit de obiecte de tip Coffee este creat.
 */

package isp_l7_ex1;

// Clasa publica CoffeeDrinker
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