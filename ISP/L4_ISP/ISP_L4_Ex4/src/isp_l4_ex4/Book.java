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

import java.util.*;

//Clasa publica Book
public class Book {
	
	// Variabilele de stare
	private String name;
	private Author[] authors;
	private double price;
	private int qtyInStock = 0;
	
	// Constructor 1
	public Book(String name, Author[] authors, double price) {
		this.name = name;
		this.authors = authors;
		this.price = price;
	}
	
	// Constructor 2
	public Book(String name, Author[] authors, double price, int qtyInStock) {
		this.name = name;
		this.authors = authors;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	// Getter pentru numele cartii
	public String getName() {
		return this.name;
	}
	
	// Getter pentru autorul cartii
	public Author[] getAuthors() {
		return this.authors;
	}
	
	// Getter pentru pretul cartii
	public double getPrice() {
		return this.price;
	}
	
	// Setter pentru pretul cartii
	public void setPrice(double price) {
		this.price = price;
	}
	
	// Getter pentru cantitatea in stoc a cartii
	public int getQtyInStock() {
		return this.qtyInStock;
	}
	
	// Setter pentru cantitatea in stoc a cartii
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	// Metoda pentru afisarea tuturor autorilor unei carti
	public String printAuthors() {
		return Arrays.toString(authors);
	}
	
	// Metoda toString()
	public String toString() {
		return "Cartea " + this.name + " de " + authors.length + " autori: " + Arrays.toString(authors);
	}

}