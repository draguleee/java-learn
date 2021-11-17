/*
 * Exercitiul 4
 * 
 * Sa se implementeze un dictionar de cuvinte dupa diagrama de clase din laborator.
 */

package isp_l6_ex4;

import java.util.*;

// Clasa publica Definition
public class Definition {
	
	// Atributele / variabilele de instanta pentru clasa Definition
	private String description;

	// Constructor - fara parametrii
	public Definition() {
		System.out.println("Constructor default Definition.");
		this.description = "default definition.";
	}
	
	// Constructor - parametrii: description (String)
	public Definition(String description) {
		this.description = description;
	}
	
	// Getter pentru definitie
	public String getDescription() {
		return this.description;
	}
	
	// Metoda equals() - parametrii: o (Object)
	// Compara referintele a doua obiecte
	@Override
	public boolean equals(Object o) {
		if(o instanceof Definition) {
			Definition d = (Definition)o;
			return description.equals(d.description);
		}
		return false;
	}
	
	// Metoda hashCode() - fara parametrii
	// Returneaza un intreg in concordanta cu valoarea de adevar returnata de metoda equals()
	@Override
	public int hashCode() {
		return description.hashCode();
	}
	
	// Metoda toString()
	public String toString() {
		return "Definition: " + this.description;
	}
}
