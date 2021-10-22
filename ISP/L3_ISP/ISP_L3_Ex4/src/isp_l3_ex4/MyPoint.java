/*
 * Exercitiul 4
 * 
 * Sa se scrie clasa MyPoint, care modeleaza un punct in 2D cu coordonatele x si y, care 
 * contine:
 * - Doua variabile de instanta x (int) si y (int)
 * - Un constructor fara argumente care creaza un punct cu coordonatele (0,0)
 * - Un constructor care creaza un punct cu valorile x si y create
 * - Gettere si settere pentru variabilele de instanta x si y
 * - O metoda setXY() care seteaza x si y
 * - O metod toString() care returneaza o descriere de tip String a instantei in formatul
 * "(x,y)"
 * - O metoda distance(int x, int y) care returneaza distanta de la acest punct la altul cu
 * coordonatele date (x,y)
 * - O metoda supraincarcata distance(MyPoint another) care returneaza distanta de la acest
 * punct la punctul another, instanta a clasei MyPoint
 * 
 * Scrieti codul pentru clasa MyPoint. De asemenea, sa se scrie clasa TestMyPoint pentru a
 * testa toate metodele definite in clasa MyPoint.
 */

package isp_l3_ex4;

// Clasa publica MyPoint
public class MyPoint {
	
	// Variabilele de instanta
	public int x;			// Coordonata X a punctului
	public int y;			// Coordonata Y a punctului
	
	// Constructor default - initializarea coordonatelor X si Y cu 0
	public MyPoint() {
		this.x = 0;
		this.y = 0;
	}
	
	// Constructor - initializarea coordonatelor X si Y cu valori date
	public MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Getter pentru coordonata X
	public int getX() {
		return this.x;
	}
	
	// Setter pentru coordonata X
	public void setX(int x) {
		this.x = x;
	}
	
	// Getter pentru coordonata Y
	public int getY() {
		return this.y;
	}
	
	// Setter pentru coordonata Y
	public void setY(int y) {
		this.y = y;
	}
	
	// Setter pentru coordonatele x si y
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// Metoda distance
	public double distance(int a, int b) {
		return Math.sqrt((a-this.x)^2+(b-this.y)^2);
	}
	
	// Metoda distance - suprascrisa
	public double distance(MyPoint another) {
		return Math.sqrt((this.x-another.x)^2+(this.y-another.y)^2);
	}
	
	// Metoda toString - descrierea punctului
	public String toString() {
		return "Punctul (" + this.x + "," + this.y + ")";
	}
}
