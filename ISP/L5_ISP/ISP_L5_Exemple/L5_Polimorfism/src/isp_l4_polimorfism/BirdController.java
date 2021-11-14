/*
 * Clasa BirdController
 */

package isp_l4_polimorfism;


// Clasa Bird
class Bird {
	
	// Metoda move() - fara parametrii
	// Monitorizeaza miscarea pasarilor
	public void move() {
		System.out.println("The bird is moving.");
	}
}


// Clasa Penguin, care extinde / mosteneste clasa Bird
class Penguin extends Bird {
	
	// Metoda move() - fara parametrii
	// Monitorizeaza inotul pinguinilor
	public void move() {
		System.out.println("The penguin is swimming.");
	}
}

// Clasa Goose, care extinde / mosteneste clasa Bird
class Goose extends Bird {
	
	// Metoda move() - fara parametrii
	// Monitorizeaza zborul gastelor
	public void move() {
		System.out.println("The goose is flying.");
	}
	
}


// Clasa BirdController, care modeleaza conceptul de polimorfism
// Polimorfismul: 
// - Concept fundamental in cadrul POO
// - Comportamentul prin care descoperim in mod dinamic, in timpul rularii, tipul concret al unui obiect
// din cadrul unei ierarhii de tipuri
// - Ne permite sa manipulam in mod unitar colectii de obiecte ce impart caracteristici comune, definite
// prin intermediul unui tip de baza (clasa de baza)
public class BirdController {
		
	// Crearea unui vector birds de tip Bird[]
	Bird[] birds = new Bird[3];
		
	// Constructor - fara parametrii
	public BirdController() {
		birds[0] = createBird();
		birds[1] = createBird();
		birds[2] = createBird();
	}
		
	// Metoda relocateBirds() - fara parametrii
	// Executa miscarea pasarilor
	public void relocateBirds() {
		for(int i=0 ; i<birds.length ; i++) {
			birds[i].move();
		}
	}
		
	// Metoda createBird() - fara parametrii
	// Creeaza obiectele de tip Bird
	private Bird createBird() {
		int i = (int)(Math.random()*10);
		if(i<5) 
			return new Penguin();
		else 
			return new Goose();
	}
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		BirdController bc = new BirdController();
		bc.relocateBirds();
	}

}
