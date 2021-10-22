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

// Clasa TestAuthor
public class TestAuthor {

	// Metoda main
	public static void main(String[] args) {
		
		// Crearea obiectelor de tip Author
		Author a1 = new Author("Andre","aandreid14@gmail.com",'f');
		Author a2 = new Author("Oana","draguoana2000@gmail.com",'f');
		Author a3 = new Author("Ale","alelefter10@gmail.com",'f');
		
		// Autor a1
		String n1 = a1.getName();
		System.out.println("Nume autor a1: " + n1);
		String e1 = a1.getEmail();
		System.out.println("Adresa de e-mail a1: " + e1);
		a1.setEmail("d_andreeaioana@yahoo.com");
		char g1 = a1.getGender();
		System.out.println("Gen autor a1: " + g1);
		String out1 = a1.toString();
		System.out.println(out1);
		
		// Autor a2
		System.out.println(" ");
		String n2 = a2.getName();
		System.out.println("Nume autor a2: " + n2);
		String e2 = a2.getEmail();
		System.out.println("Adresa de e-mail a2: " + e2);
		a2.setEmail("d_oanaanam9@yahoo.com");
		char g2 = a2.getGender();
		System.out.println("Gen autor a2: " + g2);
		String out2 = a2.toString();
		System.out.println(out2);
		
		// Autor a3
		System.out.println(" ");
		String n3 = a3.getName();
		System.out.println("Nume autor a3: " + n3);
		String e3 = a3.getEmail();
		System.out.println("Adresa de e-mail a3: " + e3);
		a3.setEmail("lefterale10@yahoo.com");
		char g3 = a3.getGender();
		System.out.println("Gen autor a3: " + g3);
		String out3 = a3.toString();
		System.out.println(out3);
		
	}
}
