/* 
 * Exercitiul 3
 * 
 * O clasa numita Author este proiectata in diagrama de clase din indrumator. Aceasta contine:
 * - Trei variabile de instanta private: name (String), email (String) si gender (char care poate lua
 * valorile 'm' sau 'f');
 * - Un constructor care sa initializeze name, email si gender cu valorile date
 * (public Author(String name, String email, char gender){...}) (Nu exista constructor default pentru
 * clasa Author, cum nu exista nici valori default pentru name, email si gender)
 * - Getteri / setteri publici: getName(), getEmail(), setEmail() si getGender() (Nu exista setteri 
 * pentru name si gender, deoarece aceste atribute nu pot fi schimbate)
 * - O metoda toString() care returneaza "author-name (gender) at email"
 * 
 * O clasa numita Book este proiectata in diagrama de clase din indrumator. Aceasta contine:
 * - Patru variabile de instanta private: name (String), author (Author, clasa pe care tocmai am creat-o,
 * presupunem ca fiecare carte are un singur autor), price (double) si qtyInStock (int)
 * - Doi constructori supraincarcati:
 *   + Book(String name, Author author, double price) {...}
 *   + Book(String name, Author author, double price, int qtyInStock) {...}
 * - Metode publice: getName(), getAuthor(), getPrice(), setPrice(), getQtyInStock(), setQtyInStock()
 * - Metoda toString(), care returneaza "book-name by author-name (gender) at email" (De retinut ca 
 * metoda toString() a clasei Author returneaza "author-name (gender) at email").
 */

package isp_l4_ex3;

import java.util.*;

// Clasa TestAuthorBook
public class TestAuthorBook {

	// Metoda main
	public static void main(String[] args) {
		
		// Creare Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Creare obiecte de tip Author
		Author a1 = new Author("William Shakespeare","wshakespeare@gmail.com",'m');
		Author a2 = new Author("J.K.Rowling","jkrowling@yahoo.com",'f');
		Author a3 = new Author("Stephen King","stphkng@hotmail.com",'m');
		
		// Creare obiecte de tip Book
		Book b1 = new Book("Hamlet",a1,25.0);
		Book b2 = new Book("Harry Potter",a2,40.0);
		Book b3 = new Book("IT",a3,35.0,50);
		
		// Testare metode pentru obiectul b1 din cadrul clasei Book
		System.out.println("------------------------------------------------");
		System.out.println("TESTAREA METODELOR PE PRIMUL OBIECT");
		System.out.println("------------------------------------------------");
		System.out.println("Numele cartii: " + b1.getName());
		System.out.println("Numele autorului: " + b1.getAuthor());
		System.out.println("Pretul cartii inainte de schimbare: " + b1.getPrice());
		System.out.print("Introduceti noul pret: ");
		double price1 = in.nextDouble();
		b1.setPrice(price1);
		System.out.println("Pretul cartii dupa schimbare: " + b1.getPrice());
		System.out.println(b1.toString());
		
		// Testare metode pentru obiectul b2 din cadrul clasei Book
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("TESTAREA METODELOR PE AL DOILEA OBIECT");
		System.out.println("------------------------------------------------");
		System.out.println("Numele cartii: " + b2.getName());
		System.out.println("Numele autorului: " + b2.getAuthor());
		System.out.println("Pretul cartii inainte de schimbare: " + b2.getPrice());
		System.out.print("Introduceti noul pret: ");
		double price2 = in.nextDouble();
		b2.setPrice(price2);
		System.out.println("Pretul cartii dupa schimbare: " + b2.getPrice());
		System.out.println(b2.toString());
		
		// Testare metode pentru obiectul b3 din cadrul clasei Book
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("TESTAREA METODELOR PE AL TREILEA OBIECT");
		System.out.println("------------------------------------------------");
		System.out.println("Numele cartii: " + b3.getName());
		System.out.println("Numele autorului: " + b3.getAuthor());
		System.out.println("Pretul cartii inainte de schimbare: " + b3.getPrice());
		System.out.print("Introduceti noul pret: ");
		double price3 = in.nextDouble();
		b3.setPrice(price3);
		System.out.println("Pretul cartii dupa schimbare: " + b3.getPrice());
		System.out.println(b3.toString());
		System.out.println("Cantitatea inainte de schimbare: " + b3.getQtyInStock());
		System.out.println("Introduceti noua cantitate: ");
		int qty = in.nextInt();
		b3.setQtyInStock(qty);
		System.out.println("Cantitatea dupa schimbare: " + b3.getQtyInStock());
	}
}
