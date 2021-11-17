/*
 * Exercitiul 3
 * 
 * Sa se creeze o noua versiune a apliatiei din exercitiul anterior (cu aceeasi functionalitate)
 * si sa se inlocuiasca ArrayList-ul cu un TreeSet.
 */

package isp_l6_ex3;

import java.util.*;

// Clasa publica Bank
public class Bank {
	// Atributele / variabilele de instanta pentru clasa Bank
	private TreeSet<BankAccount> accounts = new TreeSet<BankAccount>();
	
	// TreeSet pentru compararea dupa detinator si dupa sold
	TreeSet<BankAccount> sortByOwner = new TreeSet<BankAccount>(new OwnerComparator());
	TreeSet<BankAccount> sortByBalance = new TreeSet<BankAccount>(new BalanceComparator());
	
	// Constructor - fara parametrii
	public Bank() {
		System.out.println("Constructor default Bank.");
	}
	
	// Metoda addAccount() - parametrii: owner (String), balance (double)
	// Adauga un cont bancar in lista de conturi bancare
	public void addAccount(String owner, double balance) {
		System.out.println("Adaugare cont bancar...");
		BankAccount ba = new BankAccount(owner,balance);
		accounts.add(ba);
	}
	
	// Metoda printAccountsByOwner() - fara parametrii
	// Afiseaza toate conturile bancare in functie de nume (alfabetic)
	public void printAccountsByOwner() {
		System.out.println("Sortare conturi bancare dupa detinator: ");
		sortByOwner.addAll(accounts);
		System.out.println(sortByOwner);
	}
	
	// Metoda printAccountsByBalance() - fara parametrii
	// Afiseaza toate conturile bancare in functie de sold (crescator)
	public void printAccountsByBalance() {
		System.out.println("Sortare conturi bancare dupa sold: ");
		sortByBalance.addAll(accounts);
		System.out.println(sortByBalance);
	}
	
	// Metoda printAccounts() - parametrii: minBalance (double), maxBalance (double)
	// Afiseaza toate conturile bancare intr-un anumit interval
	public void printAccounts(double minBalance, double maxBalance) {
		System.out.println("Afisare conturi bancare intre " + minBalance + " si " + maxBalance + ": ");
		BankAccount ba1 = new BankAccount(minBalance);
		BankAccount ba2 = new BankAccount(maxBalance);
		for(BankAccount test : accounts) {
			BankAccount ba = (BankAccount)test;
			if(ba.getBalance() > minBalance && ba.getBalance() < maxBalance) {
				System.out.println(ba);
			}
		}
	}
}
