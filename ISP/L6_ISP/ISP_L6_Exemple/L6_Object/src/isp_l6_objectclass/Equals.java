/*
 * Clasa Equals
 */

package isp_l6_objectclass;


// Clasa publica Equals, care modeleaza utilizarea metodei equals()
public class Equals {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea obiectelor de tip Persoana
		Person p1 = new Person("Andre",12345);
		Person p2 = new Person("Oana",12345);
		
		// Testare metoda equals() pentru cnp
		if(p1.equals(p2)) {
			System.out.println(p1 + " and " + p2 + " are equal.");
		}
		else {
			System.out.println(p1 + " and " + p2 + " are not equal.");
		}
		
		// Testare metoda equals() pentru nume
		if(p1.name.equals(p2)) {
			System.out.println(p1 + " and " + p2 + " have the same name.");
		}
		else {
			System.out.println(p1 + " and " + p2 + " do not have the same name.");
		}
		
		// Testare hashCode
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		
	}

}


// Clasa Person
class Person {
	
	// Atributele / variabilele de instanta ale clasei Person
	public long cnp;
	public String name;
	
	// Constructor - parametrii: name (String), cnp (long)
	public Person(String name, long cnp) {
		this.name = name;
		this.cnp = cnp;
	}
	
	// Metoda equals() - fara parametrii
	// Compara referintele a doua obiecte
	@Override
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person p = (Person)o;
			return cnp == p.cnp;
		}
		return false;
	}
	
	// Metoda hashCode() - fara parametrii
	// Returneaza un numar pozitiv care sa fie consistent cu valoarea de adevar returnata de metoda equals()
	public int hashCode() {
		return (int)cnp + name.hashCode();
	}
}
