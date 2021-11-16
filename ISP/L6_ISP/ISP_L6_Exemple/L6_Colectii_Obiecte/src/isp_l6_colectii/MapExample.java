/*
 * Clasa MapExample
 * 
 * Clase: HashMap, TreeMap, HashTable, LinkedHashMap, WeakHashMap, IdentityHashMap
 * - void put(Object key, Object value): adaugare elemente in Map
 */

package isp_l6_colectii;

import java.util.*;


// Clasa publica MapExample
public class MapExample {

	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui HashMap
		Map m = new HashMap();
		HashMap m0 = new HashMap();
		
		// Adaugarea elementelor in HashMap
		m.put("One", 1);
		m.put("Two", 2);
		m.put("Three", 3);
		
		// Metoda size() - fara parametrii
		// Determina dimensiunea HashMap-ului
		System.out.println("HashMap contine: " + m.size() + " elemente de tip cheie-valoare.");
		System.out.println();
		
		
		/* containsKey() */
		
		// Metoda containsKey() - parametrii: string (String)
		// Determina daca o pereche contine cheia One
		if(m.containsKey("One")) {
			System.out.println("HashMap contains One as a key.");
		}
		else {
			System.out.println("HashMap does not contain One as a key.");
		}
		
		// Metoda containsKey() - parametrii: string (String)
		// Determina daca o pereche contine cheia Two
		if(m.containsKey("Two")) {
			System.out.println("HashMap contains Two as a key.");
		}
		else {
			System.out.println("HashMap does not contain Two as a key.");
		}
		
		// Metoda containsKey() - parametrii: string (String)
		// Determina daca o pereche contine cheia Three
		if(m.containsKey("Three")) {
			System.out.println("HashMap contains Three as a key.");
		}
		else {
			System.out.println("HashMap does not contain Three as a key.");
		}
		
		System.out.println();
		
		
		/* containsValue() */
		
		// Metoda containsValue() - parametrii: integer (int)
		// Determina daca o pereche contine valoarea 1
		if(m.containsValue(1)) {
			System.out.println("HashMap contains 1 as a value.");
		}
		else {
			System.out.println("HashMap does not contain 1 as a value.");
		}
		
		// Metoda containsValue() - parametrii: integer (int)
		// Determina daca o pereche contine valoarea 2
		if(m.containsValue(2)) {
			System.out.println("HashMap contains 2 as a value.");
		}
		else {
			System.out.println("HashMap does not contain 2 as a value.");
		}
		
		// Metoda containsValue() - parametrii: integer (int)
		// Determina daca o pereche contine valoarea 3
		if(m.containsValue(3)) {
			System.out.println("HashMap contains 3 as a value.");
		}
		else {
			System.out.println("HashMap does not contain 3 as a value.");
		}
		
		System.out.println();
		
		// Cheile
		Integer one = (Integer)m.get("One");
		Integer two = (Integer)m.get("Two");
		Integer three = (Integer)m.get("Three");
		
		// Valorile mapate cu cheie
		System.out.println("Value mapped with \"One\" is: " + one);
		System.out.println("Value mapped with \"Two\" is: " + two);
		System.out.println("Value mapped with \"Three\" is: " + three);
		
		// Returnarea tuturor cheilor din HashMap
		System.out.println("Retrieving all the keys from the HashMap: ");
		Iterator i1 = m.keySet().iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next() + " ");
		}
		
		// Returnarea tuturor valorilor din HashMap
		System.out.println("Retrieving all the values from the HashMap: ");
		Iterator i2 = m.entrySet().iterator();
		while(i2.hasNext()) {
			System.out.println(i2.next() + " ");
		}
		
		// Stergerea elementelor din HashMap
		System.out.println(m.remove("One") + " is removed from the HashMap.");
		System.out.println(m.remove("Two") + " is removed from the HashMap.");
		System.out.println(m.remove("Three") + " is removed from the HashMap.");
		System.out.println();
		
		
	}

}
