/*
 * Clasa Car
 * 
 * Exemplu de asociere cu grad de multiplicitate
 */

package isp_l5_carcustomer_gradmultiplicitate;

// Clasa publica Car
public class Car {
	
	// Atributele / variabilele de instanta pentru clasa Car
	private String brand;
	
	// Constructor - fara parametrii
	public Car() {
		System.out.println("Constructor default Car.");
		this.brand = "default";
	}
	
	// Constructor - parametrii: brand (String)
	public Car(String brand) {
		System.out.println("Constructor cu argumente Car.");
		this.brand = brand;
	}
	
	// Metoda getBrand() - fara parametrii
	// Returneaza brand-ul masinii
	public String getBrand() {
		return "Brand: " + this.brand;
	}

}
