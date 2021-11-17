/*
 * Exercitiul 1
 * 
 * Pentru diagrama de clase din laborator:
 * - Sa se implementeze clasa BankAccount
 * - Sa se suprascrie metodele equals() si hashCode() corespunzator
 * - Sa se creeze niste obiecte de tip BankAccount si sa se testeze toate metodele
 */

package isp_l6_ex1;

// Clasa publica Main
public class Main {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unor obiecte de tip BankAccount
		BankAccount ba1 = new BankAccount();
		BankAccount ba2 = new BankAccount("B",2000);
		BankAccount ba3 = new BankAccount("C",3500);
		BankAccount ba4 = new BankAccount("A",1000);
		System.out.println();
		
		
		/* TESTARE METODE PENTRU OBIECTUL BA1 */
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Testare metode pentru obiectul: " + ba1);
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		
		// Retragere suma din sold
		ba1.withdraw(500);
		System.out.println();
		
		// Depunere suma in sold
		ba1.deposit(1000);
		System.out.println();
		
		// Comparare obiecte
		System.out.println("Comparare obiecte: ");
		System.out.println(ba1.equals(ba2));
		System.out.println(ba1.equals(ba3));
		System.out.println(ba1.equals(ba4));
		
		// HashCode-ul obiectului ba1
		System.out.println("HashCode: " + ba1.hashCode());
		System.out.println();
		
		
		/* TESTARE METODE PENTRU OBIECTUL BA2 */
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Testare metode pentru obiectul: " + ba2);
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		
		// Retragere suma din sold
		ba2.withdraw(1500);
		System.out.println();
		
		// Depunere suma in sold
		ba2.deposit(3000);
		System.out.println();
		
		// Comparare obiecte
		System.out.println("Comparare obiecte: ");
		System.out.println(ba2.equals(ba1));
		System.out.println(ba2.equals(ba3));
		System.out.println(ba2.equals(ba4));
		
		// HashCode-ul obiectului ba1
		System.out.println("HashCode: " + ba2.hashCode());
		System.out.println();
		
		
		/* TESTARE METODE PENTRU OBIECTUL BA3 */
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Testare metode pentru obiectul: " + ba3);
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		
		// Retragere suma din sold
		ba3.withdraw(2000);
		System.out.println();
		
		// Depunere suma in sold
		ba3.deposit(6000);
		System.out.println();
		
		// Comparare obiecte
		System.out.println("Comparare obiecte: ");
		System.out.println(ba3.equals(ba1));
		System.out.println(ba3.equals(ba2));
		System.out.println(ba3.equals(ba4));
		
		// HashCode-ul obiectului ba1
		System.out.println("HashCode: " + ba3.hashCode());
		System.out.println();
		
		
		/* TESTARE METODE PENTRU OBIECTUL BA4 */
		System.out.println("-------------------------------------------------------------------");
		System.out.println("Testare metode pentru obiectul: " + ba4);
		System.out.println("-------------------------------------------------------------------");
		System.out.println();
		
		// Retragere suma din sold
		ba4.withdraw(450);
		System.out.println();
		
		// Depunere suma in sold
		ba4.deposit(2000);
		System.out.println();
		
		// Comparare obiecte
		System.out.println("Comparare obiecte: ");
		System.out.println(ba4.equals(ba1));
		System.out.println(ba4.equals(ba2));
		System.out.println(ba4.equals(ba3));
		
		// HashCode-ul obiectului ba1
		System.out.println("HashCode: " + ba4.hashCode());
		System.out.println();
		
	}
}
