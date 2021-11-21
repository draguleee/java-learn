/*
 * Exercitiul 1
 * 
 * Sa se creeze diagrama UML pentru aplicatia Bank.
 */

package isp_l8_ex1;


// Clasa publica Address
public class Address {
	
	// Atributele / variabilele de instanta pentru clasa Address
	String street;
	int number;
	
	// Constructor - fara parametrii
	public Address() {
		System.out.println("Constructor default Address.");
		this.street = "Default";
		this.number = 1;
	}
	
	// Constructor - parametrii: name (String), number (int)
	public Address(String street, int number) {
		System.out.println("Constructor cu argumente Address.");
		this.street = street;
		this.number = number;
	}
	
	// Metoda getStreet() - fara parametrii
	// Returneaza numele strazii
	public String getStreet() {
		return this.street;
	}
	
	// Metoda getNumber() - fara parametrii
	// Returneaza numarul strazii
	public int getNumber() {
		return this.number;
	}
	
	// Metoda equals() - parametrii: o (Object)
	// Compara referintele a doua obiecte
	@Override
	public boolean equals(Object o) {
		if(o instanceof Address) {
			Address a = (Address)o;
			return this.street.equals(a.street) && this.number == a.number;
		}
		return false;
	}
	
	// Metoda hashCode() - fara parametrii
	// Returneaza o valoarea intreaga in concordanta cu valoarea de adevar returnata de metoda equals()
	@Override
	public int hashCode() {
		return street.hashCode() + this.number;
	}
	
	// Metoda toString
	public String toString() {
		return this.street + ", numarul: " + this.number;
	}

}
