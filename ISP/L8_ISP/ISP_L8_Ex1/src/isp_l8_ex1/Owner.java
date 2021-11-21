/*
 * Exercitiul 1
 * 
 * Sa se creeze diagrama UML pentru aplicatia Bank.
 */


package isp_l8_ex1;

// Clasa publica Owner
public class Owner {
	
	// Atributele / variabilele de instanta pentru clasa Owner
	public String name;
	public int age;
	public Address address;
	public Balance balance;
	
	// Constructor - fara parametrii
	public Owner() {
		System.out.println("Constructor default Owner.");
		this.name = "Default";
		this.age = 1;
		this.address = new Address();
		this.balance = new Balance();
	}
	
	// Constructor - parametrii: name (String), age (int), address (Address), balance (Balance)
	public Owner(String name, int age, Address address, Balance balance) {
		System.out.println("Constructor cu argumente Owner.");
		this.name = name;
		this.age = age;
		this.address = address;
		this.balance = balance;
	}
	
	// Metoda  getName()
	// Returneaza numele detinatorului de cont
	public String getName() {
		return this.name;
	}
	
	// Metoda getAge()
	// Returneaza varsta detinatorului de cont
	public int getAge() {
		return this.age;
	}
	
	// Metoda getAddress()
	// Returneaza adresa detinatorului de cont
	public Address getAddress() {
		return this.getAddress();
	}
	
	// Metoda getBalance()
	// Returneaza soldul din contul detinatorului
	public int getBalance() {
		return this.getBalance();
	}
	
	// Metoda equals() - parametrii: o (Object)
	// Compara referintele a doua obiecte
	@Override
	public boolean equals(Object o) {
		if(o instanceof Owner) {
			Owner w = (Owner)o;
			return this.name.equals(w.name) && this.age == w.age && this.address.equals(w.address) && this.balance.equals(w.balance);
		}
		return false;
	}

	// Metoda hashCode() - fara parametrii
	// Returneaza un intreg in concordanta cu valoarea de adevar returnata de metoda equals()
	public int hashCode() {
		return name.hashCode() + age + address.hashCode() + balance.hashCode();
	}
	
	// Metoda toString()
	public String toString() {
		return "Detinatorul: " + this.name + ", varsta: " + this.age + ", adresa: " + this.address.toString() + ", sold bancar: " + this.balance.toString();
	}
}
