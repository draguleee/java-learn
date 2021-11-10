/*
 * Exercitiul 3
 * 
 * Sa se creze o noua versiune a aplicatiei din exercitiuk anterior (cu aceeasi functionalitate),
 * si sa se inlocuiasca ArrayList cu un TreeSet.
 */

package isp_l6_ex3;

import java.util.*;

// Clasa BalanceComparator, care implementeaza interfata Comparatpr
public class BalanceComparator implements Comparator<BankAccount> {
	
	@Override
	public int compare(BankAccount ba1, BankAccount ba2) {
		if(ba1.getBalance() > ba2.getBalance()) {
			return 1;
		}
		else {
			return -1;
		}
	}

}
