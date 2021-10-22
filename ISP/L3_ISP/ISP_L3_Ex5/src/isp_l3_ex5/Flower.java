/*
 * Exercitiul 5
 * 
 * Modificati clasa Flower din "Ciclul de viata al obiectelor" astfel incat sa contorizeze numarul de
 * obiecte construite. Sa se adauge o metoda care returneaza numarul de obiecte construite. Sa se 
 * foloseasca variabile si metode statice pentru implementarea acestui exercitiu.
 */

package isp_l3_ex5;

// Clasa publica Flower
public class Flower {
	
	// Variabilele de instanta
	static int petal;						// Petala unui obiect de tip Flower
	static int count = 0;					// Variabila care retine numarul de obiecte de tip Flower create
	
	// Constructor default
	public Flower() {
		System.out.println("Flower has been created!");
	}
	
	// Constructor supraincarcat
	public Flower(int petal) {
		this.petal = petal;
		System.out.println("New Flower has been created!");
	}
	
	// Metoda countFlowers, pentru contorizarea numarului de obiecte de tip Flower create
	public static int countFlowers() {
		count++;
		return count;
	}
	
	
	// Metoda main
	public static void main(String[] args) {
		
		// Creare obiecte de tip Flower cu ajutorul primului constructor (default)
		Flower[] garden = new Flower[5];
		for(int i=0; i<5; i++) {
			Flower f = new Flower();
			garden[i] = f;
			f.countFlowers();
		}
		
		// Creare obiecte de tip Flower cu ajutorul celui de-al doilea constructor (supraincarcat)
		Flower f1 = new Flower(4);
		Flower f2 = new Flower(10);
		Flower f3 = new Flower(7);
		for(int i=0 ; i<3 ; i++) {
			count++;
		}
		System.out.println("Numarul total de obiecte create: " + count);
	}

}
