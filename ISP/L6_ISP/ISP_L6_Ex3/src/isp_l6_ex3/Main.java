/*
 * Exercitiul 3
 * 
 * Sa se creeze o noua versiune a apliatiei din exercitiul anterior (cu aceeasi functionalitate)
 * si sa se inlocuiasca ArrayList-ul cu un TreeSet.
 */

package isp_l6_ex3;

import java.util.*;

// Clasa publica Main
public class Main {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui obiect de tip Bank
		Bank bank = new Bank();
		System.out.println();
		
		// Crearea unor obiecte de tip BankAccount
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount("B",2000);
		BankAccount ba3 = new BankAccount("C",3500);
		BankAccount ba4 = new BankAccount("A",1000);
		BankAccount ba5 = new BankAccount("A",1000);
		System.out.println();
		
		// Adaugarea de conturi bancare
		bank.addAccount(ba1.owner,ba1.balance);
		System.out.println();
		bank.addAccount(ba2.owner,ba2.balance);
		System.out.println();
		bank.addAccount(ba3.owner,ba3.balance);
		System.out.println();
		bank.addAccount(ba4.owner,ba4.balance);
		System.out.println();
		bank.addAccount(ba5.owner,ba5.balance);
		System.out.println();
		
		// Afisare conturi bancare: dupa nume si dupa sold
		bank.printAccountsByOwner();
		System.out.println();
		bank.printAccountsByBalance();
		System.out.println();
		
		// Afisare conturi bancare, dupa sold, intr-un anumit interval
		bank.printAccounts(2000,4000);
		System.out.println();
		
	}
}
