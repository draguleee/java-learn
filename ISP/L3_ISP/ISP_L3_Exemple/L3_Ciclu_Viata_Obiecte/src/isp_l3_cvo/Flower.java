/*
 * Clasa Flower
 */

package isp_l3_cvo;

import java.util.*;

// Clasa publica Flower, care modeleaza ciclul de viata al obiectelor
public class Flower {
	
	// Atributele / variabilele de stare a clasei Flower
	int petal;
	
	// Constructorul clasei Flower - scris de programator
	// Daca un constructor este definit in program, atunci constructorul default nu mai este adaugat automat
	public Flower() {
		System.out.println("Flower has been created!");
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Numarul de flori create din vectorul garden
		System.out.print("Introduceti numarul de obiecte de tip Flower: ");
		int number = in.nextInt();
		
		// Crearea unui anumit numar de obiecte de tip Flower si stocarea lor in vectorul garden
		Flower[] garden = new Flower[number];
		for(int i=0 ; i<garden.length ; i++) {
			Flower f = new Flower();
			garden[i] = f;
		}
	}

}
