/*
 * Clasa TreeMapExample
 */

package isp_l6_colectii;

import java.util.*;
import java.io.*;


// Clasa publica TreeMapExample, care modeleaza o aplicatie de tip dictionar 
public class TreeMapExample {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws Exception {
		
		// Crearea unui nou dictionar (obiect de tip Dictionar)
		Dictionar dictionary = new Dictionar();
		
		// Variabila pentru stocarea optiunilor din meniul dictionarului
		char optiune;
		
		// Variabile pentru linie si definitie
		String linie, definitie;
		
		// Crearea unui BufferedReader pentru citirea textului
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		// Se executa instructiunile cat timp optiunea este diferita de e/E (Exit)
		do {
			
			// Crearea meniului dictionarului
			System.out.println("Meniu: ");
			System.out.println("A - Adauga cuvant.");
			System.out.println("C - Cauta cuvant.");
			System.out.println("L - Listeaza dictionar.");
			System.out.println("E - Iesire.");
			
			// Citire linie si raspuns
			linie = br.readLine();
			optiune = linie.charAt(0);
			
			
			// Switch-case creat in functie de optiunea aleasa de utilizator
			switch(optiune) {
			
				// Adauga cuvant
				case 'a' : case 'A':	
					System.out.println("Introduceti cuvantul: ");
					linie = br.readLine();
					if(linie.length() > 1) {
						System.out.println("Introduceti definitia: ");
						definitie = br.readLine();
						dictionary.adaugaCuvant(linie, definitie);
					}
					break;
					
				// Cauta cuvant
				case 'c' : case 'C':
					System.out.println("Cuvantul cautat: ");
					linie = br.readLine();
					if(linie.length() > 1) {
						definitie = dictionary.cautaCuvant(linie);
						if(definitie == null) {
							System.out.println("nu exista!");
						}
						else {
							System.out.println("Definitie: " + definitie);
						}
					}
					break;
					
				// Listeaza dictionarul
				case 'l' : case 'L':
					System.out.println("Dictionarul listat: ");
					dictionary.afiseazaDictionar();
			}
		}
		while(optiune != 'e' && optiune != 'E');
		System.out.println("Program terminat.");
	}
}



// Clasa Dictionar
class Dictionar {
	
	// Crearea unei colectii de tip TreeMap
	// TreeMap - afisare obiecte in ordine alfabetica
	Map dictionary = new TreeMap();
	TreeMap dictionary0 = new TreeMap();
	
	// Constructor - fara argumente
	public Dictionar() {
		System.out.println("Constructor default Dictionar.");
	}
	
	// Metoda adaugaCuvant - parametrii: cuvant (String), definitie (String)
	// Adauga un cuvant in dictionar
	public void adaugaCuvant(String cuvant, String definitie) {
		if(dictionary.containsKey(cuvant)) {
			System.out.println("Modifica cuvantul existent.");
		}
		else {
			System.out.println("Adauga un cuvant existent.");
		}
		dictionary.put(cuvant, definitie);
	}
	
	// Metoda cautaCuvant - parametrii: cuvant (String)
	// Cauta un cuvant din dictionar
	public String cautaCuvant(String cuvant) {
		return (String)dictionary.get(cuvant);
	}
	
	// Metoda afiseazaDictionar() - fara parametrii
	// Afiseaza dictionarul
	public void afiseazaDictionar() {
		System.out.println(this);
	}

}