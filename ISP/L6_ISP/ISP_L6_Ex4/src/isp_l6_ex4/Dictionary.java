/*
 * Exercitiul 4
 * 
 * Sa se implementeze un dictionar avand diagrama de clase din laborator.
 * Sa se creeze o clasa COnsoleMenu pentru a furniza interactiune cu dictionarul. Clasa
 * va furniza acces la functionalitatea Dictionary printr-o interfata meniu bazata pe text.
 */

package isp_l6_ex4;

import java.util.*;

// Clasa publica Dictionary
public class Dictionary {
	
	// Variabila de instanta
	private HashMap dictionary = new HashMap();
	
	// Metod addWord() - parametrii: w (Word), d (Definition)
	// Adauga un cuvant in dictionar
	public void addWord(Word w, Definition d) {
		if(dictionary.containsKey(w)) {
			System.out.println("Modificare cuvant exisent.");
		}
		else {
			System.out.println("Adaugati un cuvant nou.");
			dictionary.put(w,d);
		}
	}
	
	// Metoda getWord() - parametrii: w (Word)
	// Gaseste un cuvant
	public String getWord(Word w) {
		System.out.println("Cauta " + w);
		System.out.println(dictionary.containsKey(w));
		return dictionary.get(w);
	}
	
	// Metoda getDefinition() - parametrii: d (Definition)
	// Gaseste definitia unui cuvant
	public String getDefinition(Definition d) {
		System.out.println("Definitia: " + d);
		System.out.println(dictionary.containsKey(d));
		return dictionary.get(d);
	}
	
	// Metoda getDictionary() - fara parametrii
	// Afiseaza intregul dictionar
	public void getDictionary() {
		System.out.println(dictionary);
	}
	// Metoda getAllWords() - fara parametrii
	// Returneaza toate cuvintele existente in dictionar
	public void getAllWords() {
		System.out.println(dictionary.keySet().toArray()[0]);	
	}
	
	//Metoda getAllDefinitions() - fara parametrii
	public void getAllDefinitions() {
		System.out.println(dictionary.values().toArray()[0]);
	}

}
