/*
 * Exercitiul 2
 * 
 * Pentru diagrama de clase din indrumator:
 * - Sa se implementeze programul dupa diagrama de clase
 * - Sa se foloseasca un ArrayList pentru stocarea obiectelor de tip BankAccount;
 * - Sa se implementeze o metoda printAccounts() care va printa o lista sortata (in functie de balance)
 * a tuturor conturilor bancare
 * - Sa se implementeze o metoda printccounts() care va printa toate conturile de la un balance minim
 * la un balance maxim
 * - In metoda main(), sa se afiseze toate conturile bancare (cu metoda getAllAccounts()) si sa se 
 * sorteze alfabetic, dupa field-ul owner.
 */

package isp_l6_ex2;

import java.util.*;

// Clasa publica BankAccount
public class BankAccount {
	
	// Atributele / variabilele de instanta pentru clasa BankAccount
	public String owner;
	public double balance;
	
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
	
	// Getter pentru detinator
	public String getOwner() {
		return this.owner;
	}
	
	// Getter pentru sold
	public double getBalance() {
		return this.balance;
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
	
	// Metoda compare() - parametrii: o (Object)
	// Compara doua obiecte intre ele dupa soldul bancar
	public int compareTo(BankAccount ba) {
		return this.getOwner().compareTo(ba.getOwner());
	}
	
	// Metoda toString()
	public String toString() {
		return "(Detinator: " + this.owner + ",sold: " + this.balance + ")";
	}
}
