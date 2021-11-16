/*
 * Clasa Customer
 * 
 * Exemplu de asociere unidirectionala
 */

package isp_l5_carcustomer_unidirectional;

// Clasa publica Customer
public class Customer {
	
	// Atributele / variabilele de instanta pentru clasa Customer
	private String address;
	private String contactNumber;
	private String name;
	
	// Constructor - fara parametrii
	public Customer() {
		System.out.println("Constructor default Customer.");
		this.address = "Strada 1";
		this.contactNumber = "0745287695";
		this.name = "Andre Dragu";
	}
	
	// Constructor - parametrii: address (String), contactNumber (String), name (String)
	public Customer(String address, String contactNumber, String name) {
		System.out.println("Constructor cu argumente Customer.");
		this.address = address;
		this.contactNumber = contactNumber;
		this.name = name;
	}

}
