/*
 * Clasa HashMapExample
 */

package isp_l6_colectii;

import java.util.*;
import java.io.*;
import java.lang.*;


// Clasa publica HashMapExample, care modeleaza o aplicatie de tip dictionar
public class HashMapExample {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws Exception {
		
		// Crearea unui nou dictionar (obiect de tip Dictionary)
		Dictionary dictionary = new Dictionary();
		
		// Variabila pentru stocarea optiunii din meniu alese de catre utilizator 
		char option;
		
		// Variabile pentru linie si pentru definitie
		String line, definition;
		
		// Crearea unui BufferedReader pentru citirea textului
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		// Se executa instructiunile cat timp optiunea este diferita de e/E (Exit)
		do {
			
			// Crearea meniului
			System.out.println("Menu: ");
			System.out.println("A - Add new Word.");
			System.out.println("S - Search a Word.");
			System.out.println("P - Print the whole Dictionary.");
			System.out.println("E - Exit Dictionary.");
			
			// Citire linie si raspuns
			line = br.readLine();
			option = line.charAt(0);
			
			
			// Switch-case creat in functie de optiunea aleasa de utilizator
			switch(option) {
			
				// Adaugare cuvant
				case 'a' : case 'A':
					System.out.println("Input Word: ");
					line = br.readLine();
					if(line.length() > 1) {
						System.out.println("Input Definition: ");
						definition = br.readLine();
						dictionary.addWord(new Word(line), definition);
					}
					break;
					
				// Cautare cuvant
				case 's' : case 'S':
					System.out.println("Searched Word: ");
					line = br.readLine();
					if(line.length() > 1) {
						Word def = new Word(line);
						definition = dictionary.searchWord(def);
						if(definition == null) {
							System.out.println("does not exist!");
						}
						else {
							System.out.println(definition);
						}
					}
					break;
					
				// Afisare dictionar
				case 'p' : case 'P':
					System.out.println("Printing the Dictionary...");
					dictionary.printDictionary();
			}
		}
		while (option != 'e' && option != 'E');
		System.out.println("Program finished.");
	}

}


// Clasa Dictionary
class Dictionary {
	
	// Crearea unei colectii de tip HashMap
	// HashMap - (cheie,valoare)
	Map dictionary = new HashMap();
	HashMap dictionary0 = new HashMap();
	
	// Constructor - fara argumente
	public Dictionary() {
		System.out.println("Constructor default Dictionar.");
	}
	
	// Metoda adaugaCuvant() - parametrii: word (String), definition (String)
	// Adauga un cuvant in dictionar
	public void addWord(Word word, String definition) {
		if(dictionary.containsKey(word)) {
			System.out.println("Modify existing word.");
		}
		else {
			System.out.println("Add new word.");
		}
		dictionary.put(word, definition);
	}
	
	// Metoda cautaCuvant() - parametrii: word (String)
	// Cauta un cuvant din dictionar
	public String searchWord(Word word) {
		return (String)dictionary.get(word);
	}
	
	// Metoda printDictionary() - fara parametrii
	// Listeaza intregul dictionar
	public void printDictionary() {
		System.out.println(this);
	}
	
}


// Clasa Word
class Word {
	
	// Atributele / variabilele de instanta ale clasei Word
	String word;
	
	// Constructor - parametrii: word (String)
	public Word(String word) {
		this.word = word;
	}
	
	// Metoda equals() - parametrii: o (Object)
	// Compara referintele a doua obiecte
	@Override
	public boolean equals(Object o) {
		if(o instanceof Word) {
			Word w = (Word)o;
			return word.equals(w.word);
		}
		return false;
	}
	
	// Metoda hashCode() - fara parametrii
	// Returneaza un numar intreg in concordanta cu valoarea de adevar returnata de metoda equals()
	@Override
	public int hashCode() {
		return (int)word.hashCode();
	}
	
}
