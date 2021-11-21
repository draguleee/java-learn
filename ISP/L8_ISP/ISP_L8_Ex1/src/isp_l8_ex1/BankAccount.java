/*
 * Exercitiul 1
 * 
 * Sa se creeze diagrama UML pentru aplicatia Bank.
 */


package isp_l8_ex1;

// Clasa publica BankAccount
public class BankAccount {
	
	// Atributele / variabilele de instanta pentru clasa BankAccount
	public Owner owner;
	public int uniqueId;
	
	// Constructor - fara parametrii
	public BankAccount() {
		System.out.println("Constructor default BankAccount.");
		this.owner = new Owner();
		this.uniqueId = 100100;
	}
	
	// Constructor - parametrii: owner (Owner), uniqueId (int)
	public BankAccount(Owner owner, int uniqueId) {
		System.out.println("Constructor cu parametrii BankAccount.");
		this.owner = owner;
		this.uniqueId = uniqueId;
	}
	
	// Metoda withdraw() - parametrii: amount (int)
	// Retrage o anumita suma din cont
	public int withdraw(int amount) {
		System.out.print("Suma dupa retragere: ");
		int wbalance = owner.getBalance() - amount;
		return wbalance;
	}
	
	// Metoda deposit() - parametrii: amount (int)
	// Depune o anumita suma in cont
	public int deposit(int amount) {
		System.out.print("Suma dupa depunere: ");
		int dbalance = owner.getBalance() - amount;
		return dbalance;
	}
	
	// Metoda equals() - parametrii: o (Object)
	// Compara referintele a doua obiecte
	@Override
	public boolean equals(Object o) {
		if(o instanceof BankAccount) {
			BankAccount ba = (BankAccount)o;
			return this.owner.equals(ba.owner) && this.uniqueId == ba.uniqueId;
		}
		return false;
	}
	
	// Metoda hashCode() - fara parametrii
	// Returneaza un intreg in concordanta cu valoarea de adevar returnata de metoda equals()
	@Override
	public int hashCode() {
		return owner.hashCode() + uniqueId;
	}
	
	// Metoda toString
	public String toString() {
		return "Cont bancar: " + this.owner + ", ID unic: " + this.uniqueId;
	}

}
