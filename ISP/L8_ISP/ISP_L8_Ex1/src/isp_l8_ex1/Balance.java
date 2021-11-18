/*
 * Exercitiul 1
 * 
 * Sa se creeze diagrama UML pentru aplicatia Bank.
 */


package isp_l8_ex1;

// Clasa publica Balance
public class Balance {
	
	// Atributele / variabilele de instanta ale clasei Balance
	public int sum;
	
	// Constructor - default
	public Balance() {
		System.out.println("Constructor default Balance.");
		this.sum = 1;
	}
	
	// Constructor - parametrii: sum (int)
	public Balance(int sum) {
		System.out.println("Constructor cu argumente Balance.");
		this.sum = sum;
	}
	
	// Metoda getSum() - fara parametrii
	// Returneaza suma din cont
	public int getSum() {
		return this.sum;
	}
	
	// Metoda equals() - parametrii: o (Object)
	// Compara referintele a doua obiecte
	public boolean equals(Object o) {
		if(o instanceof Balance) {
			Balance b = (Balance)o;
			return this.sum == b.sum;
		}
		return false;
	}

}
