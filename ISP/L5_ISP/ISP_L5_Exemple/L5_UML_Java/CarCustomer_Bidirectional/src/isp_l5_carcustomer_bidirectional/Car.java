/*
 * Clasa Car
 * 
 * Exemplu de asociere bidirectionala
 */

package isp_l5_carcustomer_bidirectional;

// Clasa publica Car
public class Car {
	
	// Atributele / variabilele de instanta ale clasei Car
	private String modelNumber;
	private Customer owner;
	
	// Constructor - fara parametrii
	public Car() {
		System.out.println("Constructor default Car.");
		this.modelNumber = "1";
		this.owner = new Customer();
	}
	
	// Constructor - parametrii: modelNumber (String), owner (Customer)
	public Car(String modelNumber, Customer owner) {
		System.out.println("Constructor cu argumente Car.");
		this.modelNumber = modelNumber;
		this.owner = new Customer("Strada 5","0789657432","Mihai", new Car());
	}

}
