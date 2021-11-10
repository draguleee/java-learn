/*
 * Exercitiul 2
 * 
 * Pentru diagrama de clase din laborator:
 * - Sa se implementeze programul tinand cont de diagrama claselor
 * - Sa se foloseasca un ArrayList pentru a stoca obiectele de tip BankAccount
 * - Sa se implementeze metoda printAccounts care va afisa o lista sortata (in functie de
 * sold / balance) a tuturor conturilor
 * - Sa se implementeze metoda printAccounts care va afisa toate conturile de la minim
 * la maxim
 */

package isp_l6_ex2;

import java.util.*;

// Clasa publica BankAccount
public class Bank {
	
	// Variabila de instanta - obiect din clasa BankAccount
	// Obiectul de tip BankAccount va fi un ArrayList
	ArrayList <BankAccount> accounts = new ArrayList();
	int x = 1;
	
	// Metoda addAccount() - adaugare cont bancar in obiectul accounts care este un ArrayList
	public void addAccount(String owner, int balance) {
		BankAccount ba = new BankAccount(owner,balance);
		accounts.add(ba);
	}
	
	// Metoda printAccountsByBalance() - afisarea unei liste sortate a tuturor conturilor dupa sold
	public void printAccountsByBalance() {
		do {
			x = 1;
			for(int i=0 ; i<accounts.size()-1 ; i++) {					// Parcurgere lista conturi bancare
				BankAccount ba1 = (BankAccount) accounts.get(i);		// Crearea unui cont bancar
				BankAccount ba2 = (BankAccount) accounts.get(i+1);		// Crearea unui cont bancar
			
				if(ba1.getBalance() > ba2.getBalance()) {	// Daca soldul primului cont este mai mare decat cel de-al doilea sold
					
					// Sortarea in functie de balance (sortare prin interschimbare)
					double money = ba1.getBalance();		// aux ia valoarea primului sold		
					ba1.setBalance(ba2.getBalance());		// primul sold ia valoarea celui de-al doilea sold
					ba2.setBalance(money);					// al doilea sold ia valoarea aux-ului
					
					// Sortarea in functie de nume (sortare prin interschimbare)
					String name = ba1.getOwner();			// name ia numele primului detinator
					ba1.setOwner(ba2.getOwner());			// primul owner ia numele celui de-al doilea owner
					ba2.setOwner(name); 					// al doilea owner ia numele name-ului
					
					x = 0;
				}
			}
		}
		while(x == 0);
		
		// Afisarea conturilor sortate
		for(int i=0 ; i<accounts.size(); i++) {
			System.out.println(accounts.get(i).toString());
		}
	}
	
	// Metoda printAccounts(parametrii) - afiseaza conturile intre soldul minim si maxim
	public void printAccounts(double minBalance, double maxBalance) {
		for(int i=0 ; i<accounts.size() ; i++) {
			BankAccount ba = (BankAccount) accounts.get(i);
			if(ba.getBalance() > minBalance && ba.getBalance() < maxBalance) {
				System.out.println(ba.toString());
			}
		}
	}
	
	// Metoda getAllAccounts() - ArrayList
	public ArrayList getAllAccounts() {
		return this.accounts;
	}

}
