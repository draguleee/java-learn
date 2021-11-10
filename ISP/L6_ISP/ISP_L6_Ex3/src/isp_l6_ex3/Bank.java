/*
 * Exercitiul 3
 * 
 * Sa se creze o noua versiune a aplicatiei din exercitiuk anterior (cu aceeasi functionalitate),
 * si sa se inlocuiasca ArrayList cu un TreeSet.
 */

package isp_l6_ex3;

import java.util.*;

//Clasa publica BankAccount
public class Bank {
	
	// Variabila de instanta - obiect din clasa BankAccount
	// Obiectul de tip BankAccount va fi un TreeSet
	TreeSet <BankAccount> accounts = new TreeSet();
	TreeSet <BankAccount> sorted1 = new TreeSet <BankAccount>(new BalanceComparator());
	TreeSet <BankAccount> sorted2 = new TreeSet <BankAccount>(new OwnerComparator());
	
	// Metoda addAccount() - adaugare cont bancar in obiectul accounts care este un ArrayList
	public void addAccount(String owner, int balance) {
		BankAccount ba = new BankAccount(owner,balance);
		accounts.add(ba);
	}
	
	// Metoda printAccountsByBalance
	public void printAccountsByBalance() {
		sorted1.addAll(accounts);
		System.out.println(sorted1);
	}
	
	// Metoda printAccountsByOwner
	public void printAccountsByOwner() {
		sorted2.addAll(accounts);
		System.out.println(sorted2);
	}
	
	// Metoda printAccounts
	public void printAccounts(double minBalance, double maxBalance){
        BankAccount a = new BankAccount(minBalance);
        BankAccount b = new BankAccount(maxBalance);
        for(BankAccount test:accounts){
            BankAccount please=(BankAccount)test;
            if(please.getBalance()>minBalance && please.getBalance()<maxBalance)
                System.out.println(please);
        }
    }
	
	// Metoda getAllAccounts
	public TreeSet getAllAccounts() {
		return accounts;
	}

}