/*
 * Exercitiul 3
 * 
 * Sa se creze o noua versiune a aplicatiei din exercitiuk anterior (cu aceeasi functionalitate),
 * si sa se inlocuiasca ArrayList cu un TreeSet.
 */

package isp_l6_ex3;

import java.util.*;

// Clasa publica OwnerComparator, care implementeaza interfata Comparator
public class OwnerComparator implements Comparator<BankAccount> {
	
	@Override
	public int compare(BankAccount ba1, BankAccount ba2) {
		return ba1.getOwner().compareTo(ba2.getOwner());
	}
}
