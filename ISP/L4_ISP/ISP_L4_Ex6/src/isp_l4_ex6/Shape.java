/* 
 * Exercitiul 6
 * 
 * Superclasa Shape, modelata in diagrama de clase din indrumatorul de laborator. Contine:
 * - Doua variabile private de instanta: color (String) si filled (boolean)
 * - Doi constructori: unul fara argumente (default) care initializeaza color cu "green" si
 * filled cu true, si un constructor care initializeaza color si filled cu valori date
 * - Getteri si setteri pentru toate variabilele de instanta. Prin conventie, getterul pentru
 * o variabila booleana xxx este numit isXXX() (in loc de getXxx() pentru toate celelalte 
 * tipuri)
 * - O metoda toString() care returneaza "A shape with color of xxx and filled / not filled"
 */

package isp_l4_ex6;

// Clasa publica Shape
public class Shape {
	
	// Variabile de instanta private
	private String color;			// Culoarea formei
	private boolean filled;			// Statusul formei (umplut / gol)
	
	// Constructor 1 - default
	public Shape() {
		this.color = "red";
		this.filled = true;
	}
	
	// Constructor 2 - valori date
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	// Metoda getColor() - returneaza culoarea formei
	public String getColor() {
		return this.color;
	}
	
	// Metoda setColor() - seteaza culoarea formei
	public void setColor(String color) {
		this.color = color;
	}
	
	// Metoda isFilled() - determina daca forma este umpluta sau nu este umpluta cu culoare
	public boolean isFilled() {
		return filled;
	}
	
	// Metoda setFilled() - seteaza parametrul filled din cadrul clasei Shape
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	// Metoda toString()
	public String toString() {
		String f = "";
		if(this.filled == true) {
			f = "filled";
		}
		else if(this.filled == false) { 
			f = "not filled";
		}
		return "A Shape with color of " + this.color + " and " + f;
	}

}
