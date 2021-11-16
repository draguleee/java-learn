/*
 * Clasa ListExample
 */

package isp_l6_colectii;

import java.util.*;

// Clasa publica ListExample
public class ListExample {
	
	
	// Metoda displayAll1() - parametrii: l (List)
	public static void displayAll1(List l) {
		System.out.println("Display with FOR: ");
		for(int i=0 ; i<l.size() ; i++) {
			System.out.println(l.get(i) + " ");
		}
	}
	
	// Metoda displayAll2() - parametrii: l (List)
	public static void displayAll2(List l) {
		System.out.println("Display woth ENHANCED FOR: ");
		for(Object o : l) {
			System.out.println(o + " ");
		}
	}
	
	// Metoda displayAll3() - parametrii: l (List)
	public static void displayAll3(List l) {
		Iterator i1 = l.iterator();
		System.out.println("Display with iterator V1: ");
		while(i1.hasNext()) {
			System.out.println(i1.next() + " ");
		}
	}
	
	// Metoda displayAll4() - parametrii: l (List)
	public static void displayAll4(List l) {
		System.out.println("Display with iterator V2: ");
		for(Iterator i2 = l.iterator() ; i2.hasNext();) {
			System.out.println(i2.next() + " ");
		}
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui ArrayList
		List l = new ArrayList();
		
		// Crearea unor obiecte de tip Person
		Person p1 = new Person("A","aaa");
		Person p2 = new Person("A","aaa");
		Person p3 = new Person("B","bbb");
		Person p4 = new Person("C","ccc");
		
		// Adaugarea obiectelor de tip Person in ArrayList
		l.add(p1);
		l.add(p2);
		l.add(p3);
		l.add(p4);
		
		// Afisarea obiectelor din ArrayList
		displayAll1(l);
		System.out.println();
		displayAll2(l);
		System.out.println();
		displayAll3(l);
		System.out.println();
		displayAll4(l);
		System.out.println();
		
		// Testare metoda equals()
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		System.out.println(p2.equals(p3));
		System.out.println(p2.equals(p4));
		System.out.println(p3.equals(p4));
		System.out.println();
		
		// Testare metoda hashCode()
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		System.out.println();
		
		// Stergerea obiectelor din ArrayList
		/*
		l.remove(0);
		l.remove(1);
		l.remove(2);
		l.remove(3);
		l.remove(4);
		l.remove(5);
		*/
		l.removeAll(l);
		displayAll1(l);			// Empty
		System.out.println();
		displayAll2(l);			// Empty
		System.out.println();
		displayAll3(l);			// Empty
		System.out.println();
		displayAll4(l);			// Empty
		System.out.println();
		
	}

}


// Clasa Person
class Person {
	
	// Atributele / variabilele de instanta pentru clasa Person
	String firstName;
	String lastName;
	
	// Constructor - parametrii: firstName (String), lastName (String)
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	// Metoda equals() - parametrii: o (Object)
	// Compara referintele a doua obiecte
	@Override
	public boolean equals(Object o) {
		if(o instanceof Person) {
			Person p = (Person)o;
			return p.firstName.equals(firstName) && p.lastName.equals(lastName);
		}
		return false;
	}
	
	// Metoda hashCode() - fara parametrii
	// Returneaza un numar pozitiv care sa fie consistent cu valoarea de adevar returnata de metoda equals()
	public int hashCode() {
		return firstName.hashCode() + lastName.hashCode();
	}
	
	// Metoda toString()
	public String toString() {
		return "Persoana: " + this.firstName + ", " + this.lastName;
	}
	
	
}