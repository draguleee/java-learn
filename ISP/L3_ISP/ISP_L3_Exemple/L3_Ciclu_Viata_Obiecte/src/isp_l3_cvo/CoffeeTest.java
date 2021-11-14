/*
 * Clasa CoffeeTest, compusa din mai multe clase
 */

package isp_l3_cvo;

// Clasa publica Coffee
class Coffee {
	
	// Atributele / variabilele de instanta ale clasei Coffee
	int water;
	int caffeine;
	
	// Constructor - parametrii: water (int), caffeine (int)
	public Coffee(int water, int caffeine) {
		this.water = water;
		this.caffeine = caffeine;
	}
	
	// Metoda drinkCoffee() - afiseaza mesajul "Se bea cafeaua + water + caffeine"
	public void drinkCoffee() {
		System.out.println("Drink coffee [water: " + this.water + ", caffeine: " + this.caffeine + "]");
	}

}


// Clasa publica WaterTank
class WaterTank {
	
	// Constructor - fara parametrii
	public WaterTank() {
		System.out.println("New Water Tank created!");
	}
	
	// Metoda getIngredient() - returneaza o valoare generata aleatoriu
	public int getIngredient() {
		return (int)(Math.random()*50);
	}
}


// Clasa CaffeineTank
class CaffeineTank {
	
	// Constructor - fara parametrii
	public CaffeineTank() {
		System.out.println("New Caffeine Tank created!");
	}
	
	// Metoda getIngredient() - returneaza o valoare generata aleatoriu
	public int getIngredient() {
		return (int)(Math.random()*10);
	}
}


// Clasa CoffeeMaker
class CoffeeMaker {
	
	// Atributele / variabilele de instanta pentru clasa CoffeeMaker
	WaterTank wtank = new WaterTank();				// Tanc apa - clasa WaterTank
	CaffeineTank ctank = new CaffeineTank();		// Tanc cafea - clasa CaffeineTank
	
	// Constructor - fara parametrii
	public CoffeeMaker() {
		System.out.println("New Coffee Maker created!");
	}
	
	// Metoda getCoffee() - returneaza cafeaua nou creata
	public Coffee getCoffee() {
		int w = wtank.getIngredient();
		int c = ctank.getIngredient();
		return new Coffee(w,c);
	}
}


// Clasa CoffeeTest - testarea programului
public class CoffeeTest {
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui nou aparat de cafea (obiect de tip CoffeeMaker)
		CoffeeMaker cm = new CoffeeMaker();
		
		// Crearea unui pachet de cafele (un vector de tip Coffee care sa contina 10 elemente)
		Coffee[] pachet = new Coffee[10];
		
		// Pentru toate cafelele din pachet, returneaza cafelele
		for(int i=0 ; i<pachet.length ; i++) {
			pachet[i] = cm.getCoffee();
		}
		
		// Pentru toate cafelele din pachet, bea cafelele
		for(int i=0 ; i<pachet.length ; i++) {
			pachet[i].drinkCoffee();
		}
	}
}