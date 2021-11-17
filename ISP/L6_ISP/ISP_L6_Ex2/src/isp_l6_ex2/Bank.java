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

// Clasa publica Bank
public class Bank {
	
	// Atributele / variabilele de instanta pentru clasa Bank
	private ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
	
	// Comparator pentru owner
	Comparator <BankAccount> compareByOwner = new Comparator<BankAccount>() {
		public int compare(BankAccount ba1, BankAccount ba2) {
			return ba1.getOwner().compareTo(ba2.getOwner());
		}
	};
	
	// Comparator pentru balance
	Comparator<BankAccount> compareByBalance = new Comparator<BankAccount>() {
		public int compare(BankAccount ba1, BankAccount ba2) {
			if(ba1.balance > ba2.balance) {
				return 1;
			}
			else if(ba1.balance == ba2.balance) {
				return 0;
			}
			return -1;
		}
	};
	
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
		System.out.println("Sortare dupa nume: ");
		Collections.sort(accounts, compareByOwner);
		System.out.println(accounts);
	}
	
	// Metoda printAccountsByBalance() - fara parametrii
	// Afiseaza toate conturile bancare in functie de sold (crescator)
	public void printAccountsByBalance() {
		System.out.println("Sortare dupa sold: ");
		Collections.sort(accounts, compareByBalance);
		System.out.println(accounts);
	}
	
	// Metoda printAccounts() - parametrii: minBalance (double), maxBalance (double)
	// Afiseaza toate conturile bancare intr-un anumit interval
	public void printAccounts(double minBalance, double maxBalance) {
		System.out.println("Afisare conturi bancare intre " + minBalance + " si " + maxBalance + ": ");
		for(int i=0 ; i<accounts.size() ; i++) {
			BankAccount ba = (BankAccount)accounts.get(i);
			if(ba.getBalance() > minBalance && ba.getBalance() < maxBalance) {
				System.out.println(ba.toString());
			}
		}
	}
}
	
