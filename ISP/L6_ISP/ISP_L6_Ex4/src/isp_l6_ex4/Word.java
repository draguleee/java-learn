/*
 * Exercitiul 4
 * 
 * Sa se implementeze un dictionar avand diagrama de clase din laborator.
 * Sa se creeze o clasa COnsoleMenu pentru a furniza interactiune cu dictionarul. Clasa
 * va furniza acces la functionalitatea Dictionary printr-o interfata meniu bazata pe text.
 */

package isp_l6_ex4;

// Clasa publica Word
public class Word {
	
	// Variabila de instanta
	private String name;
	
	// Constructor default
	public Word(String name) {
		this.name = name;
	}
	
	// Suprascriere metoda equals()
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Word)) {
			return false;
		}
		Word word = (Word)o;
		return name.equals(word.name);
	}
	
	// Suprascriere metoda hashCode()
	@Override
	public int hashCode() {
		return (int)(name.length()*1000);
	}
	
	// Metoda toString()
	public String toString() {
		return this.name;
	}

}
