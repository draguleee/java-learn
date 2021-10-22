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

// Clasa publica Book
public class Book {
	
	// Variabilele de stare
	private String name;
	private Author author;
	private double price;
	private int qtyInStock = 0;
	
	// Constructor 1
	public Book(String name, Author author, double price) {
		this.name = name;
		this.author = author;
		this.price = price;
	}
	
	// Constructor 2
	public Book(String name, Author author, double price, int qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	// Getter pentru numele cartii
	public String getName() {
		return this.name;
	}
	
	// Getter pentru autorul cartii
	public Author getAuthor() {
		return this.author;
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
	
	// Metoda toString()
	public String toString() {
		return "Cartea " + this.name + " de " + this.author;
	}

}
