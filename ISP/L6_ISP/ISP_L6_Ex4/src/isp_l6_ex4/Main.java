/*
 * Exercitiul 4
 * 
 * Sa se implementeze un dictionar avand diagrama de clase din laborator.
 * Sa se creeze o clasa COnsoleMenu pentru a furniza interactiune cu dictionarul. Clasa
 * va furniza acces la functionalitatea Dictionary printr-o interfata meniu bazata pe text.
 */

package isp_l6_ex4;

import java.util.*;
import java.lang.*;
import java.io.*;

// Clasa publica Main
public class Main {
	
	// Metoda main() - programul principal
	public static void main(String args[]) throws Exception {
		
		// Crearea obiectului de tip Dictionar
        Dictionary dictionary = new Dictionary();
        
        // Variabile pentru interfata cu utilizatorul
        char answer;
        String line, definition;
        
        // Crearea unui flux de intrare (BufferedReader)
        BufferedReader fluxIn = new BufferedReader(new InputStreamReader(System.in));

        // Crearea meniului pentru dictionar (operare cu utilizatorul)
        do {
        	System.out.println("Meniu");
        	System.out.println("a - Adauga cuvant");
        	System.out.println("c - Cauta cuvant");
        	System.out.println("l - Listeaza dictionar");
        	System.out.println("e - Iesi");

        	line = fluxIn.readLine();
        	answer = line.charAt(0);

        	switch(answer) {
           
           		// Adaugarea unui cuvant
            	case 'a': case 'A':
            		System.out.println("Introduceti cuvantul:");
            		line = fluxIn.readLine();
            		if(line.length() > 1) {
            			System.out.println("Introduceti definitia:");
            			definition = fluxIn.readLine();
            			dictionary.addWord(new Word(line), definition);
            		}
            	break;
            	
            	// Cautarea unui cuvant
            	case 'c': case 'C':
            		System.out.println("Cuvant cautat:");
            		line = fluxIn.readLine();
            		if(line.length() > 1) {
            			Word x = new Word(line);
            			definition = dictionary.getWord(x);
                    if (definition == null)
                       System.out.println("Cuvantul nu a fost gasit!");
                    else
                       System.out.println("Definitie: " + definition);
                 }
            	break;
            	
            	// Afisarea intregului dictionar
            	case 'l': case 'L':
            		System.out.println("Afiseaza: ");
            		dictionary.getDictionary();
            	break;
            }
        } 
        while(answer!='e' && answer!='E');
        System.out.println("Program terminat.");
     }

}
