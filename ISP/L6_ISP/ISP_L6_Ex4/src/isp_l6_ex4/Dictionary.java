/*
 * Exercitiul 4
 * 
 * Sa se implementeze un dictionar de cuvinte dupa diagrama de clase din laborator.
 */

package isp_l6_ex4;

import java.util.*;

// Clas publica Dictionary
public class Dictionary {
	
	// Atributele / variabilele de instanta ale clasei Dictionary
	HashMap dictionary = new HashMap();
	
	// Metoda addWord() - parametrii: word (Word), definition (Definition)
	// Adauga un cuvant in dictionar, impreuna cu definitia sa
	public void addWord(Word word, Definition definition) {
		if(dictionary.containsKey(word)) {
			System.out.println("Modify existing Word.");
		}
		else {
			System.out.println("Add new Word: ");
		}
		dictionary.put(word, definition);
	}
	
	// Metoda searchWord() - parametrii: word (Word)
	// Returneaza un cuvant cautat
	public String searchWord(Word word) {
		System.out.println("Search Word: ");
		return (String)dictionary.get(word);
	}
	
	// Metoda getDefinition - parametrii: word (Word)
	// Returneaza definitia unui cuvant cautat
	public Definition getDefinition(Word word) {
		System.out.println("Search Definition by Word: ");
		return (Definition)dictionary.get(word);
	}
	
	// Metoda getAllWords() - parametrii: m (Map)
	// Afiseaza toate cuvintele din dictionar - iterator V1
	public void getAllWords() {
		Set words = dictionary.keySet();
		for(Object word : words) {
			System.out.println(word);
		}
	}
	
	// Metoda getAllDefinitions() - parametrii: m (Map)
	// Afiseaza toate definitiile din dictionar - iterator V1
	public void getAllDefinitions() {
		Set definitions = dictionary.entrySet();
		for(Object definition : definitions) {
			System.out.println(definition);
		}
	}
	
	// Metoda printDictionary() - fara parametrii
	// Returneaza intregul dictionar
	public void printDictionary() {
		System.out.println(dictionary);
	}

}
