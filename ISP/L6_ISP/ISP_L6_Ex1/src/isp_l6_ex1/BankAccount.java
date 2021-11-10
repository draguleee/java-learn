/*
 * Exercitiul 1
 * 
 * Pentru diagrama de clase din laborator:
 * - Sa se implementeze clasa BankAccount
 * - Sa se suprascrie metodele equals() si hashCode() pentru clasa BankAccount pentru a realiza
 * compararea corecta a obiectelor
 * - Sa se creeze cateva obiecte de tip BankAccount si sa se demonstreze ca metoda equals() 
 * functioneaza corect.
 */

package isp_l6_ex1;

// Clasa publica BankAccount
public class BankAccount {
	
	// Variabilele de instanta
	private String owner;			// Detinatorul contului bancar
	private double balance;			// Soldul din contul bancar al detinatorului
	
	// Constructor
	public BankAccount(String owner, double balance) {
		this.owner = owner;
		this.balance = balance;
	}
	
	// Metoda withdraw() - retragerea unei sume (amount) din cont
	public void withdraw(double amount) {
		double new_balance = balance - amount;
		System.out.println("Sold dupa retragere: " + new_balance);
		if(new_balance < 0) {
			System.out.println("Nu mai ai ce sa retragi! Esti o saracie ordinara!");
		}
	}
	
	// Metoda deposit()  sume (amount) in cont
	public void deposit(double amount) {
		double new_balance = balance + amount;
		System.out.println("Sold dupa depunere: " + new_balance);
	}
	
	// Metoda equals() - suprascriere (override)
	@Override
	public boolean equals(Object o) {
		if(o instanceof BankAccount) {
			BankAccount ba = (BankAccount)o;
			return owner.equals(ba.owner);
		}
		return false;
	}
	
	// Metoda hashCode() - suprascriere (override)
	@Override
	public int hashCode() {
		return owner.hashCode() + (int)balance;
	}
	
	// Getter pentru detinatorul contului
	public String getOwner() {
		return this.owner;
	}
	
	// Getter pentru soldul din cont
	public double getBalance() {
		return this.balance;
	}
	
	// Setter pentru detinatorul contului
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	// Setter pentru soldul din cont
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	// Metoda toString()
	public String toString() {
		return "NewBankAccount: {" + this.owner + "," + this.balance + "}";
	}

}
