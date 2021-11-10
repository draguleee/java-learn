/*
 * Exercitiul 4
 * 
 * Sa se implementeze un dictionar avand diagrama de clase din laborator.
 * Sa se creeze o clasa COnsoleMenu pentru a furniza interactiune cu dictionarul. Clasa
 * va furniza acces la functionalitatea Dictionary printr-o interfata meniu bazata pe text.
 */

package isp_l6_ex4;

// Clasa publica Definition
public class Definition {
	
	// Variabila de instanta
	private String description;
	
	// Constructor default
	public Definition(String description) {
		this.description = description;
	}
	
	// Suprascriere metoda equals()
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Definition)) {
			return false;
		}
		Definition definition = (Definition) o;
		return description.equals(definition.description);
	}
	
	// Suprascriere metoda hashCode()
	@Override
	public int hashCode() {
		return (int)(description.length()*10);
	}
	
	// Metoda toString()
	public String toString() {
		return this.description;
	}

}
