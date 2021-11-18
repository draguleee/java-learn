/*
 * Exercitiul 1
 * 
 * Sa se modifice exemplul CoffeeTest in asa fel incat CoffeeMaker va arunca o exceptie daca
 * un numar predefinit de obiecte de tip Coffee este creat.
 */

package isp_l7_ex1;

// Clasa publica TemperatureException, care extinde / mosteneste clasa Exception
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