/*
 * Clasa Set
 */

package isp_l6_colectii;

import java.util.*;


// Clasa publica SetExample
public class SetExample {

	// Metoda displayAll1() - parametrii: s (Set)
	public static void displayAll1(Set s) {
		System.out.println("Display with ENHANCED FOR: ");
		for(Object o : s) {
			System.out.print(o+ " ");
		}
	}
	
	// Metoda displayAll2() - parametrii: s (Set)
	public static void displayAll2(Set s) {
		System.out.println("Display with iterator V1: ");
		Iterator i1 = s.iterator();
		while(i1.hasNext()) {
			System.out.print(i1.next() + " ");
		}
	}
	
	// Metoda displayAll3() - parametrii: s (Set)
	public static void displayAll3(Set s) {
		System.out.println("Display with iterator V2: ");
		for(Iterator i2 = s.iterator() ; i2.hasNext();) {
			System.out.print(i2.next() + " ");
		}
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// HashSet - numar aparitii
		HashSet hs = new HashSet();
		hs.add("One");
		hs.add("Two");
		hs.add("Six");
		hs.add("Six");
		hs.add("One");
		hs.add("Four");
		hs.add("Five");
		displayAll1(hs);
		System.out.println();
		System.out.println();
		
		// TreeSet - ordine alfabetica
		TreeSet ts = new TreeSet();
		ts.add("One");
		ts.add("Two");
		ts.add("Six");
		ts.add("Six");
		ts.add("One");
		ts.add("Four");
		ts.add("Five");
		displayAll2(ts);
		System.out.println();
		System.out.println();
		
		// LinkedHashSet - in ordinea in care au fost adaugate, doar un singur element de un tip
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("One");
		lhs.add("Two");
		lhs.add("Six");
		lhs.add("Six");
		lhs.add("One");
		lhs.add("Four");
		lhs.add("Five");
		displayAll3(lhs);
		System.out.println();
		System.out.println();
	}
}



