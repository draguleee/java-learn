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

//Clasa publica Author
public class Author {
	
	// Variabile de instanta private
	private String name;		// Numele autorului
	private String email;		// E-mail-ul autorului
	private char gender;		// Genul autorului
	
	// Constructor pentru initializarea variabilelor de instanta private
	public Author(String n, String e, char g) {
		this.name = n;
		this.email = e;
		this.gender = g;
	}
	
	// Getter pentru nume: getName()
	public String getName() {
		return this.name;
	}
	
	// Getter pentru e-mail: getEmail()
	public String getEmail() {
		return this.email;
	}
	
	// Setter pentru e-mail: setEmail()
	public void setEmail(String e) {
		this.email = e;
	}
	
	// Getter pentru gender: getGender()
	public char getGender() {
		return this.gender;
	}
	
	// Metoda toString()
	public String toString() {
		return "Autorul " + this.name + " (" + this.gender + "), at " + this.email;
	}

}