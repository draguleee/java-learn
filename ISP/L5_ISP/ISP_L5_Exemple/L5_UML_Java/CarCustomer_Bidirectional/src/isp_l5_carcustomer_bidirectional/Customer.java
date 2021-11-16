/*
 * Clasa Customer
 * 
 * Exemplu de asociere bidirectionala
 */

package isp_l5_carcustomer_bidirectional;

// Clasa publica Customer
public class Customer {
	
	// Atributele / variabilele de instanta pentru clas Customer
	private String address;
	private String contactNumber;
	private String name;
	private Car car;
	
	// Constructor - fara parametrii
	public Customer() {
		System.out.println("Constructor default Customer.");
		this.address = "Strada Mica";
		this.contactNumber = "0742564738";
		this.name = "Andre Dragu";
		this.car = new Car();
	}
	
	// Constructor - parametrii: address (String), contactNumber (String), name (String), car (Car)
	public Customer(String address, String contactNumber, String name, Car car) {
		System.out.println("Constructor cu argumente Customer");
		this.address = address;
		this.contactNumber = contactNumber;
		this.name = name;
		this.car = new Car("15",new Customer());
	}

}
