/* 
 * Exercitiul 2
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
 */

package isp_l4_ex2;

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