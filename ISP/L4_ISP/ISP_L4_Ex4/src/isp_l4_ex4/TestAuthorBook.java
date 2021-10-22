/* 
 * Exercitiul 4
 * 
 * Sa se modifice clasa Book din exercitiul anterior pentru a putea suporta unul sau mai multi autori
 * prin schimbarea variabilei de instanta "authors" ca fiind un vector / array de tip Author. Sa se 
 * refoloseasca clasa Author scrisa anterior.
 * 
 * Remarci:
 * - Constructorii vor lua ca parametru un vector / array de tip Author (Author[]) in locul unei
 * instante de tip Author
 * - Metoda toString() trebuie sa returneze "book-name by n authors", unde n este numarul de autori
 * - Se va scrie o noua metoda printAuthors() pentru a afisa numele tuturor autorilor
 * - Se va folosi clasa Author scrisa anterior
 */

package isp_l4_ex4;

import java.util.Scanner;

//Clasa TestAuthorBook
public class TestAuthorBook {

	// Metoda main
	public static void main(String[] args) {
		
		// Creare Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Creare obiecte de tip Author
		Author[] a = new Author[3];
		a[0] = new Author("A","a@gmail.com",'f');
		a[1] = new Author("B","b@yahoo.com",'b');
		a[2] = new Author("C","c@hotmail.com",'c');
		
		// Creare obiecte de tip Book
		Book b1 = new Book("Hamlet",a,25.0);
		Book b2 = new Book("Harry Potter",a,40.0);
		Book b3 = new Book("IT",a,35.0,50);
		
		// Testare metode pentru obiectul b1 din cadrul clasei Book
		System.out.println("------------------------------------------------");
		System.out.println("TESTAREA METODELOR PE PRIMUL OBIECT");
		System.out.println("------------------------------------------------");
		System.out.println("Numele cartii: " + b1.getName());
		System.out.println("Numele autorului: " + b1.getAuthors());
		System.out.println("Pretul cartii inainte de schimbare: " + b1.getPrice());
		System.out.print("Introduceti noul pret: ");
		double price1 = in.nextDouble();
		b1.setPrice(price1);
		System.out.println("Pretul cartii dupa schimbare: " + b1.getPrice());
		System.out.println(b1.toString());
		System.out.println(b1.printAuthors());
		
		// Testare metode pentru obiectul b2 din cadrul clasei Book
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("TESTAREA METODELOR PE AL DOILEA OBIECT");
		System.out.println("------------------------------------------------");
		System.out.println("Numele cartii: " + b2.getName());
		System.out.println("Numele autorului: " + b2.getAuthors());
		System.out.println("Pretul cartii inainte de schimbare: " + b2.getPrice());
		System.out.print("Introduceti noul pret: ");
		double price2 = in.nextDouble();
		b2.setPrice(price2);
		System.out.println("Pretul cartii dupa schimbare: " + b2.getPrice());
		System.out.println(b2.toString());
		System.out.println(b2.printAuthors());
		
		// Testare metode pentru obiectul b3 din cadrul clasei Book
		System.out.println();
		System.out.println("------------------------------------------------");
		System.out.println("TESTAREA METODELOR PE AL TREILEA OBIECT");
		System.out.println("------------------------------------------------");
		System.out.println("Numele cartii: " + b3.getName());
		System.out.println("Numele autorului: " + b3.getAuthors());
		System.out.println("Pretul cartii inainte de schimbare: " + b3.getPrice());
		System.out.print("Introduceti noul pret: ");
		double price3 = in.nextDouble();
		b3.setPrice(price3);
		System.out.println("Pretul cartii dupa schimbare: " + b3.getPrice());
		System.out.println(b3.toString());
		System.out.println(b3.printAuthors());
		System.out.println("Cantitatea inainte de schimbare: " + b3.getQtyInStock());
		System.out.println("Introduceti noua cantitate: ");
		int qty = in.nextInt();
		b3.setQtyInStock(qty);
		System.out.println("Cantitatea dupa schimbare: " + b3.getQtyInStock());
	}
}