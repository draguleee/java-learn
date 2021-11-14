/*
 * Program care demonstreaza faptul ca la eliberarea fiecarui obiect din memorie este apelata metoda
 * finalize() a acestuia
 */
	
package isp_l1_gc;

// Clasa GarbageCollectorTest
public class GarbageCollectorTest {
	
	// Variabila de instanta a clasei GarbageCollectorTest
	static int removedObjects;			// Numarul de obiecte eliberate din memorie
	
	
	// Clasa cuibarita (nested) Flower
	public static class Flower {
		
		// Variabila de stare a clasei Flower
		String name;
		
		// Constructor pentru clasa Flower - parametrii: name (String)
		public Flower(String name) {
			this.name = name;
		}
		
		// Metoda finalize();
		public void finalize() {
			removedObjects++;
			System.err.println("The flower " + this.name + " is removed. Number of removed flowers is " + removedObjects);
		}
		
		
		// Metoda main() - programul principal
		public static void main(String[] args) {
			Flower myF = null;
			int i = 0;
			while(true) {
				i++;
				myF = new Flower("Flower " + i);
			}
			
		}
		
	}
	
}
