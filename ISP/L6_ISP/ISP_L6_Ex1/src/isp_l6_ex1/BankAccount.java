/*
 * Exercitiul 1
 * 
 * Pentru diagrama de clase din laborator:
 * - Sa se implementeze clasa BankAccount
 * - Sa se suprascrie metodele equals() si hashCode() corespunzator
 * - Sa se creeze niste obiecte de tip BankAccount si sa se testeze toate metodele
 */

package isp_l6_ex1;

// Clasa publica BankAccount
public class BankAccount {
	
	// Atributele / variabilele de instanta pentru clasa BankAccount
	private String owner;
	private double balance;
	
	// Constructor - fara parametrii
	public BankAccount() {
		System.out.println("Constructor default BankAccount.");
		this.owner = "A";
		this.balance = 1000;
	}
	
	// Constructor - parametrii: owner (String), balance (double)
	public BankAccount(String owner, double balance) {
		System.out.println("Constructor cu argumente BankAccount.");
		this.owner = owner;
		this.balance = balance;
	}
	
	// Metoda withdraw() - parametrii: amount (double)
	// Retrage banii din contul detinatorului
	public void withdraw(double amount) {
		System.out.println("Se retrage " + amount + " din soldul " + this.balance);
		double withdraw = this.balance - amount;
		System.out.println("Soldul dupa retragere: " + withdraw);
	}
	
	// Metoda deposit() - parametrii: amount (double)
	// Depune banii in contul detinatorului
	public void deposit(double amount) {
		System.out.println("Se depune " + amount + " in soldul " + this.balance);
		double deposit = this.balance + amount;
		System.out.println("Soldul dupa depunere: " + deposit);
	}
	
	// Metoda equals() - parametrii: o (Object)
	// Compara referintele a doua obiecte
	@Override
	public boolean equals(Object o) {
		if(o instanceof BankAccount) {
			BankAccount ba = (BankAccount)o;
			return balance == ba.balance && owner.equals(ba.owner);
		}
		return false;
	}
	
	// Metoda hashCode() - fara parametrii
	// Returneaza un numar intreg in concordanta cu valoarea de adevar returnata de metoda equals()
	@Override
	public int hashCode() {
		return (int)balance + owner.hashCode();
	}
	
	// Metoda toString()
	public String toString() {
		return "Detinatorul: " + this.owner + ", soldul: " + this.balance;
	}

}
