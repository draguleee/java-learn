/*
 * Exercitiul 1
 * 
 * Sa se creeze diagrama UML pentru aplicatia Bank.
 */

package isp_l8_ex1;

import java.util.*;


// Clasa publica Bank
public class Bank {
	
	// Atributele / variabilele de instanta pentru clasa Bank
	List<BankAccount> accounts = new ArrayList<BankAccount>();
	ArrayList<BankAccount> accounts0 = new ArrayList<BankAccount>();
	
	// Constructor - fara parametrii
	public Bank() {
		System.out.println("Constructor default Bank.");
	}
	
	// Metoda addAccounts() - parametrii: ba (BankAccount)
	// Adauga un cont bancar in lista de conturi
	public void addAccount(BankAccount ba) {
		System.out.println("Adaugare cont bancar...");
		accounts.add(ba);
	}
	
	// Metoda printAccounts() - fara parametrii
	// Returneaza toate conturile din ArrayList
	public void printAccounts(List l) {
		Iterator i = l.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
	}

}
