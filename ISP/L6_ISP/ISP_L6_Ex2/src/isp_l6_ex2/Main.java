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

// Clasa publica main
public class Main {
	
	// Metoda printAccountsByOwner() - afisarea unei liste sortate a tuturor conturilor dupa numele detinatorului
	public static void printAccountsByOwner(ArrayList <BankAccount> accounts) {
		for(int i=0 ; i<accounts.size()-1 ; i++) {		// Parcugerea ArrayList-ului accounts
			for(int j=i+1 ; j<accounts.size(); j++) {	// Parcurgerea ArrayList-ului accounts
				if((accounts.get(i).getOwner().compareTo(accounts.get(j).getOwner()))>0) {		// Comparare nume detinatori
					
					// Preluarea detinatorului si a soldului 
					String o1 = (String) accounts.get(i).getOwner();
					double b1 = (double) accounts.get(i).getBalance();
						
					// Sortare dupa numele detinatorului
					accounts.get(i).setOwner(accounts.get(j).getOwner());
					accounts.get(i).setBalance(accounts.get(j).getBalance());
					accounts.get(j).setOwner(o1);
					accounts.get(j).setBalance(b1);
				}
			}
		}
		for(int i=0 ; i<accounts.size() ; i++) {
			System.out.println(accounts.get(i).toString());
		}		
	}	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Crearea obiectului de tip Bank
		Bank bank = new Bank();
		
		// Crearea conturilor bancare
		bank.addAccount("Andre",5000);
		bank.addAccount("Oana",7000);
		bank.addAccount("Alexandra",4500);
		bank.addAccount("Mihai",3500);
		bank.addAccount("Cosmin",15000);
		bank.addAccount("Mihaela",9900);
		bank.addAccount("Berthold",12000);
		bank.addAccount("Georgeta",8000);
		bank.addAccount("Rodica",6000);
		bank.addAccount("Calin",2000);
		bank.addAccount("Ioan",13000);
		bank.addAccount("Aurelia",10000);
		bank.addAccount("Filippo",5000);
		bank.addAccount("Bianca",6500);
		bank.addAccount("Fabian",7500);
		bank.addAccount("Noemi",7000);
		bank.addAccount("Ioana",3000);
		bank.addAccount("Adelin",4500);
		bank.addAccount("Georgiana",5500);
		
		// Detinatorii de cont bancar cu soldul intr-un interval ales
		double minBalance = in.nextDouble();
		double maxBalance = in.nextDouble();
		System.out.print("Detinatorii de cont bancar cu sold intre " + minBalance + " si " + maxBalance + " sunt: ");
		bank.printAccounts(minBalance,maxBalance);
		
		// Detinatorii de cont bancar ordonati dupa nume
		System.out.println();
		System.out.println("Detinatorii de cont bancar ordonati alfabetic: ");
		printAccountsByOwner(bank.getAllAccounts());
		
		// Detinatorii de cont bancar ordinati dupa sold
		System.out.println();
		System.out.println("Detinatorii de cont bancar ordonati dupa sold: ");
		bank.printAccountsByBalance();
		
	}

}
