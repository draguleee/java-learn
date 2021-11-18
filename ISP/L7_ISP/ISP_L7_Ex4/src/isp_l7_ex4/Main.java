/*
 * Exercitiul 4
 * 
 * Se considera o clasa Car cu atributele 'model' si 'price'.
 * Sa se scrie un program care permite utilizatorului sa:
 * - Creeze obiecte de tip Car
 * - Salveze obiecte de tip Car in fisier
 * - Vizualizeze obiecte de tip Car din fisier
 * - Citeasca obiecte de tip Car din fisier
 * - Afiseze detaliile obiectelor de tip Car din fisier
 * 
 * Sa se foloseasca mecanismul de serializare pentru stocarea si preluarea obiectelor.
 */

package isp_l7_ex4;

import java.util.*;
import java.io.*;


// Clasa publica Main
public class Main {
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) throws Exception {
		
		// Creare in, out
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("masini.txt"));
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("masini.txt"));
		
		// Crearea unui ArrayList care va stoca obiectele de tip Car
		ArrayList cars = new ArrayList();
		
		// Crearea unor obiecte de tip Car
		Car c1 = new Car("Audi");
		Car c2 = new Car("BMW");
		Car c3 = new Car("Mercedes");
		Car c4 = new Car("Volkswagen");
		Car c5 = new Car("Lamborghini");
		Car c6 = new Car("Ford");
		System.out.println();
		
		// Adaugarea obiectelor de tip Car in ArrayList
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		cars.add(c5);
		cars.add(c6);
		
		// Afisarea ArrayList-ului
		System.out.println(cars);
		System.out.println();
		
		// Serializarea obiectelor
		c1.save("masini.txt");
		c2.save("masini.txt");
		c3.save("masini.txt");
		c4.save("masini.txt");
		c5.save("masini.txt");
		c6.save("masini.txt");
		
		// Deserializarea obiectelor
		/*try {
			Car c = Car.load("masini1.txt");
			System.out.println(c);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		*/
		
	}
}
