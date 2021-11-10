/*
 * Exercitiul 1
 * 
 * Pentru diagrama de clase din laborator:
 * - Sa se implementeze clasa BankAccount
 * - Sa se suprascrie metodele equals() si hashCode() pentru clasa BankAccount pentru a realiza
 * compararea corecta a obiectelor
 * - Sa se creeze cateva obiecte de tip BankAccount si sa se demonstreze ca metoda equals() 
 * functioneaza corect.
 */

package isp_l6_ex1;

// Clasa main
public class Main {

	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea obiectelor de tip BankAccount
		BankAccount ba1 = new BankAccount("Andre",5500);
		BankAccount ba2 = new BankAccount("Ovi",5);
		BankAccount ba3 = new BankAccount("Oana",7000);
		BankAccount ba4 = new BankAccount("Andre",5500);
		BankAccount ba5 = new BankAccount("Oana",7000);
		
		// Compararea obiectelor
		System.out.println(ba1.equals(ba4));
		System.out.println(ba2.equals(ba3));
		System.out.println(ba2.equals(ba4));
		System.out.println(ba3.equals(ba5));
		
		// HashCode
		System.out.println("HashCode ba1: " + ba1.hashCode());
		System.out.println("HashCode ba2: " + ba2.hashCode());
		System.out.println("HashCode ba3: " + ba3.hashCode());
		System.out.println("HashCode ba4: " + ba4.hashCode());
		System.out.println("HashCode ba5: " + ba5.hashCode());
		
		// Testarea primului obiect
		System.out.println("-------------------------------------------");
		System.out.println("PRIMUL CONT BANCAR");
		System.out.println("-------------------------------------------");
		System.out.println("Detinatorul contului bancar: " + ba1.getOwner());
		System.out.println("Soldul contului bancar" + ba1.getBalance());
		System.out.println(ba1.toString());
		ba1.withdraw(2000);
		ba1.deposit(6500);
		
		// Testarea celui de-al doilea cont bancar
		System.out.println("-------------------------------------------");
		System.out.println("AL DOILEA CONT BANCAR");
		System.out.println("-------------------------------------------");
		System.out.println("Detinatorul contului bancar: " + ba2.getOwner());
		System.out.println("Soldul contului bancar" + ba2.getBalance());
		System.out.println(ba2.toString());
		ba2.withdraw(100);
		ba2.deposit(2000);
		
		// Testarea celui de-al treilea cont bancar
		System.out.println("-------------------------------------------");
		System.out.println("AL TREILEA CONT BANCAR");
		System.out.println("-------------------------------------------");
		System.out.println("Detinatorul contului bancar: " + ba3.getOwner());
		System.out.println("Soldul contului bancar" + ba3.getBalance());
		System.out.println(ba3.toString());
		ba3.withdraw(5000);
		ba3.deposit(10000);
		
		// Testarea celui de-al patrulea cont bancar
		System.out.println("-------------------------------------------");
		System.out.println("AL PATRULEA CONT BANCAR");
		System.out.println("-------------------------------------------");
		System.out.println("Detinatorul contului bancar: " + ba4.getOwner());
		System.out.println("Soldul contului bancar" + ba4.getBalance());
		System.out.println(ba4.toString());
		ba4.withdraw(5000);
		ba4.deposit(10000);
		
		// Testarea celui de-al patrulea cont bancar
		System.out.println("-------------------------------------------");
		System.out.println("AL CINCILEA CONT BANCAR");
		System.out.println("-------------------------------------------");
		System.out.println("Detinatorul contului bancar: " + ba5.getOwner());
		System.out.println("Soldul contului bancar" + ba5.getBalance());
		System.out.println(ba5.toString());
		ba5.withdraw(2500);
		ba5.deposit(8000);
		
	}
}
