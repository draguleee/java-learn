/*
 * Exercitiul 3
 * 
 * Sa se creze o noua versiune a aplicatiei din exercitiuk anterior (cu aceeasi functionalitate),
 * si sa se inlocuiasca ArrayList cu un TreeSet.
 */

package isp_l6_ex3;

//Clasa publica BankAccount
public class BankAccount {
	
	// Variabilele de instanta
	private String owner;			// Detinatorul contului bancar
	private double balance;			// Soldul din contul bancar al detinatorului
	
	// Constructor 1 - default
	public BankAccount() {
		this.owner = "Andre Dragu";
		this.balance = 50000;
	}
	
	// Constructor 2 - parametrii: owner, de tip String
	public BankAccount(String owner) {
		this.owner = owner;
	}
	
	// Constructor 3 - parametrii: balance, de tip double
	public BankAccount(double balance) {
		this.balance = balance;
	}
	
	// Constructor 4 - parametrii: owner, de tip String ; balance, de tip double
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
			return owner == ba.owner;
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