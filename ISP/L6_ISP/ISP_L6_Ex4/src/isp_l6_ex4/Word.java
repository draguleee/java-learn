/*
 * Exercitiul 4
 * 
 * Sa se implementeze un dictionar de cuvinte dupa diagrama de clase din laborator.
 */

package isp_l6_ex4;

import java.util.*;

// Clasa publica Word
public class Word {
	
	// Atributele / variabilele de instanta ale clasei Word
	private String name;
	
	// Constructor - fara parametrii
	public Word() {
		System.out.println("Constructor default Word.");
		this.name = "default";
	}
	
	// Constructor - parametrii: name (String)
	public Word(String name) {
		System.out.println("Constructor cu argumente Word.");
		this.name = name;
	}
	
	// Getter pentru nume
	public String getName() {
		return this.name;
	}
	
	// Metoda equals() - parametrii: o (Object)
	// Compara referintele a doua obiecte
	@Override
	public boolean equals(Object o) {
		if(o instanceof Word) {
			Word w = (Word)o;
			return name.equals(w.name);
		}
		return false;
	}
	
	// Metoda hashCode() - fara parametrii
	// Returneaza un intreg in concordanta cu valoarea de adevar returnata de metoda equals()
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	// Metoda toString() 
	public String toString() {
		return "Word: " + this.name;
	}

}
