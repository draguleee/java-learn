/* 
 * Exercitiul 3
 * 
 * O clasa numita Author contine:
 * - Trei variabile de instanta private: name (String), email (String) si gender (char cu valorile 'm' sau 'f')
 * - Un constructor care initializeaza variabilele name, email si gender cu valori date: public Author
 * (String name, String email, char gender) {...} (Nu exista un constructor default pentru clasa Author, 
 * cum nu exista nici valori default pentru name, email si gender)
 * - Gettere / settere publice: getName(), getEmail(), setEmail() and getGenders() (Nu exista setteri pentru
 * name si gender, deoarece aceste atribute nu pot fi schimbate)
 * - O metoda toString() care returneaza "author-name (gender) at email" (Exemplu: "Mu Name (m) at myemail@
 * somewhere.com".
 * 
 * Sa se scrie clasa Author. De asemenea, sa se scrie clasa testAuthor pentru a testa constructorul si metodele
 * publice.
 */

package isp_l3_ex3;

// Clasa publica Author
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
