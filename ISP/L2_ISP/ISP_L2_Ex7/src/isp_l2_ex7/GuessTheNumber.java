/*
 * Exercitiul 7
 * 
 * Sa se scrie un program care ghiceste numarul impus de la tastatura de catre utilizator. Programul
 * va genera un numar aleatoriu si va intreba utilizatorul sa il ghiceasca. Daca utilizatorul ghiceste
 * numarul, programul se va opri. Daca utilizatorul nu ghiceste numarul, programul va afisa "Prea mare!"
 * sau "Prea mic!". Programul va permite un numar maxim de 3 incercari, dupa care se va opri, afisand
 * mesajul "AI pierdut!".
 */

package isp_l2_ex7;

import java.util.*;

// Clasa publica GuessTheNumber
public class GuessTheNumber {
	
	// Metoda main
	public static void main(String[] args) {
		
		// Crearea unui Scanner pentru citirea de la tastatura
		Scanner in = new Scanner(System.in);
		
		// Variabile necesare pentru program
		int rand = 1+(int)(Math.random()*9);		// Numarul generat aleator
		int correct = 0;							// Numarul corect, care trebuie sa fie egal cu numarul generat aleator
		int count = 0;								// Contorizarea incercarilor efectuate de utilizator
		
		// Ghicirea numarului
		System.out.println("Ghiceste numarul!");
		while(correct != rand) {					// Cat timp raspunsul corect este diferit de numarul aleatoriu generat
			correct = in.nextInt();					// Se mai acorda o sansa pentru a ghici numarul (reintroducerea numarului de la tastatura)
			count++;								// Se incrementeaza numarul de incercari efectuate pentru a ghici numarul
			if(correct>rand) {						// Daca raspunsul corect este mai mare decat numarul generat aleator...
				System.out.println("Mai mic!");		// ... se va afisa "Mai mic!" pe ecran
			}		
			else if(correct<rand) {					// Daca raspunsul corect este mai mic decat numarul generat aleator...
				System.out.println("Mai mare!");	// ... se va afisa "Mai mare!" pe ecran
			}
			if(count == 5) {
				System.out.println("Ai pierdut. Ne pare rau!");
			}
		}
		System.out.println("Ai ghicit numarul din " + count + " incercari!");
		
	}

}
