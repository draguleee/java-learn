/*
 * Clasa Customer
 * 
 * Exemplu de asociere cu grad de multiplicitate
 */

package isp_l5_carcustomer_gradmultiplicitate;

// Clasa publica Customer
public class Customer {
	
	// Atributele / variabilele de instanta pentru clasa Customer
	private Car vehicles[];
	
	// Constructor - fara parametrii
	public Customer() {
		vehicles = new Car[3];
		vehicles[0] = new Car("Audi");
		vehicles[1] = new Car("BMW");
		vehicles[2] = new Car();
	}

}
