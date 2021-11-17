/*
 * Exercitiul 3
 * 
 * Sa se creeze o noua versiune a apliatiei din exercitiul anterior (cu aceeasi functionalitate)
 * si sa se inlocuiasca ArrayList-ul cu un TreeSet.
 */

package isp_l6_ex3;

import java.util.*;

// Clasa publica BalanceComparator, care implementeaza interfata Comparator
public class BalanceComparator implements Comparator<BankAccount> {
	
	@Override
	public int compare(BankAccount ba1, BankAccount ba2) {
		if(ba1.getBalance() > ba2.getBalance()) {
			return 1;
		}
		else if(ba1.getBalance() == ba2.getBalance()) {
			return 0;
		}
		return -1;
	}

}
