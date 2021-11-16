/*
 * Clasa TreeSetExample
 * 
 * Pentru ca obiectele adaugare intr-o colectie de tip TreeSet sa fie sortate corect, va trebui ca
 * acestea sa implementeze interfata Comparable.
 */

package isp_l6_colectii;

import java.util.*;


// Clasa publica TreeSetExample
public class TreeSetExample {
	
	// Metoda displayAll1() - parametrii: s (Set)
	public static void displayAll1(Set s) {
		System.out.println("Display TreeSet with ENHANCED FOR: ");
		for(Object o : s) {
			System.out.println(o + " ");
		}
	}
	
	// Metoda displayAll2() - parametrii: s (Set)
	public static void displayAll2(Set s) {
		System.out.println("Display TreeSet with iterator V1: ");
		Iterator it1 = s.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next() + " ");
		}
	}
	
	// Metoda displayAll3() - parametrii: s (Set)
	public static void displayAll3(Set s) {
		System.out.println("Display TreeSet with iterator V2: ");
		for(Iterator it2 = s.iterator() ; it2.hasNext();) {
			System.out.println(it2.next() + " ");
		}
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui TreeSet
		TreeSet ts = new TreeSet();
		
		// Crearea obiectelor de tip Person
		Persons p1 = new Persons("Jon",4);
		Persons p2 = new Persons("Alin",10);
		Persons p3 = new Persons("Dan",8);
		Persons p4 = new Persons("Florin",7);
		System.out.println();
		
		// Comparare obiecte
		System.out.println(p1.compareTo(p2));
		System.out.println(p1.compareTo(p3));
		System.out.println(p1.compareTo(p4));
		System.out.println(p2.compareTo(p3));
		System.out.println(p2.compareTo(p4));
		System.out.println(p3.compareTo(p4));
		System.out.println();
		
		// Comparare obiecte cu equals
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		System.out.println(p2.equals(p3));
		System.out.println(p2.equals(p4));
		System.out.println(p3.equals(p4));
		System.out.println();
		
		// Adaugarea obiectelor in TreeSet
		ts.add(p1);
		ts.add(p2);
		ts.add(p3);
		ts.add(p4);
		
		// Afisare TreeSet
		displayAll1(ts);
		System.out.println();
		System.out.println();
		displayAll2(ts);
		System.out.println();
		System.out.println();
		displayAll3(ts);
		System.out.println();
		System.out.println();
		
		// Afisarea primului si a ultimului element din TreeSet
		System.out.println("First element: " + ts.first());
		System.out.println("Last element: " + ts.last());
		
		// Crearea unui subset
		System.out.println("Subset: " + ts.subSet(new Persons("Marius",5), new Persons("Andrei",12)));
		System.out.println();
		System.out.println("Headset: " + ts.headSet(p1));
		System.out.println("Headset: " + ts.headSet(p2));
		System.out.println("Headset: " + ts.headSet(p3));
		System.out.println("Headset: " + ts.headSet(p4));
	}

}


// Clasa Person, care implementeaza interfata Comparable
class Persons implements Comparable {
	
	// Atributele / variabilele de instanta pentru clasa Person
	int age;
	String name;
	
	// Constructor - parametrii: name (String), age (int)
	public Persons(String name, int age) {
		System.out.println("Constructor cu argumente Person.");
		this.name = name;
		this.age = age;
	}
	
	// Metoda compareTo() - parametrii: o (Object)
	public int compareTo(Object o) {
		Persons p = (Persons)o;
		if(age > p.age) {
			return 1;
		}
		if(age == p.age) {
			return 0;
		}
		return -1;
	}
	
	// Metoda equals() - parametrii: o (Object)
	// Compara referintele a doua obiecte
	public boolean equals(Object o) {
		if(o instanceof Persons) {
			Persons p = (Persons)o;
			return age == p.age && name.equals(name);
		}
		return false;
	}
	
	// Metoda hashCode() - fara parametrii
	// Returneaza un numar pozitiv care sa fie consistent cu valoarea de adevar returnata de metoda equals()
	public int hashCode() {
		return age + name.hashCode();
	}
	
	// Metoda toString()
	public String toString() {
		return "Persoana: " + this.name + ", cu varsta: " + this.age;
	}
	
}