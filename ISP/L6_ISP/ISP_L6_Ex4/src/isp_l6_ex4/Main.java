/*
 * Exercitiul 4
 * 
 * Sa se implementeze un dictionar de cuvinte dupa diagrama de clase din laborator.
 */

package isp_l6_ex4;

import java.util.*;
import java.io.*;

// Clasa publica Main
public class Main {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws Exception {
		
		// Crearea unui obiect de tip Dictionary
		Dictionary dictionary = new Dictionary();
		
		// Variabila pentru stocarea optiunii alese
		char option;
		
		// Variabile pentru line si def;
		String line;
		String def ="";
		
		// Crearea unui BufferedReader pentru citirea de la tastatura
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		// Se executa instructiunile cat timp optiunea este diferita de e/E (Exit)
		do {
			
			// Crearea meniului
			System.out.println();
			System.out.println("Welcome to our E-Dictionary!!");
			System.out.println("Menu: ");
			System.out.println("A - Add Word.");
			System.out.println("S - Search Word.");
			System.out.println("D - Search Definition By Word.");
			System.out.println("F - Get all Words.");
			System.out.println("G - Get all Definitions.");
			System.out.println("H - Print the whole Dictionary.");
			System.out.println("E - Exit E-Dictionary.");
			
			// Citire de la tastatura
			line = br.readLine();
			option = line.charAt(0);
			
			
			// Switch-case pentru selectia optiunii
			switch(option) {
			
				// Adaugare cuvant
				case 'a' : case 'A':
					System.out.println("Add a new Word: ");
					line = br.readLine();
					if(line.length() > 1) {
						System.out.println("Add a new Definition: ");
						def = br.readLine();
						dictionary.addWord(new Word(line), new Definition(def));
					}
					break;
					
				// Cautare cuvant
				case 's' : case 'S':
					System.out.println("Searched Word: ");
					line = br.readLine();
					if(line.length() > 1) {
						Word w = new Word(line);
						Definition d = new Definition(def);
						if(def == null) {
							System.out.println(" does not exist!");
						}
						else {
							System.out.println("Definition: " + def);
						}
					}
					break;
					
				// Cautare definitie dupa cuvant
				case 'd' : case 'D':
					System.out.println("Searched Definition: ");
					line = br.readLine();
					if(line.length() > 1) {
						Definition d = new Definition(def);
						if(def == null) {
							System.out.println(" does not exist!");
						}
						else {
						System.out.println("Definition " + def);
						}
					}
				break;
					
				// Afisarea tuturor cuvintelor
				case 'f' : case 'F':
					System.out.println("Showing all the Words...");
					dictionary.getAllWords();
				break;
					
				// Afisarea tuturor defintiilor
				case 'g' : case 'G':
					System.out.println("Showing all the Definitions...");
					dictionary.getAllDefinitions();
					break;
				
				// Afisarea intregului dictionar
				case 'h' : case 'H':
					System.out.println("Printing the whole Dictionary...");
					dictionary.printDictionary();
					break;
			}
		}
		while(option != 'e' && option != 'E');
		System.out.println("Program terminated.");
		System.out.println();
	}
}
