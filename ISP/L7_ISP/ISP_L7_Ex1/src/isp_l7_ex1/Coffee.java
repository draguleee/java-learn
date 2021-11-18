/*
 * Exercitiul 1
 * 
 * Sa se modifice exemplul CoffeeTest in asa fel incat CoffeeMaker va arunca o exceptie daca
 * un numar predefinit de obiecte de tip Coffee este creat.
 */

package isp_l7_ex1;

// Clasa publica Coffee
public class Coffee {
	
	// Atributele / variabilele de instanta pentru clasa Coffee
	private int temperature;
	private int concentration;
	private int number;
	
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
	
	// Getter pentru numarul de cafele create
	
	// Metoda toString()
	public String toString() {
		return "[Temperature: " + this.temperature + "; Concentration: " + this.concentration + "]";
	}
}