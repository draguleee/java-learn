/* 
 * Exercitiul 2
 * 
 * O clasa numita Circle contine:
 * - Doua variabile private de instanta: radius (de tip double), si color (de tip String), cu 
 * valoarea default de 1.0 si respectiv "red"
 * - Doi constructori supraincarcati
 * - Doua metode publice: getRadius() si getArea()
 * 
 * Sa se scrie o clasa care modeleaza clasa Circle. Sa se scrie o clasa TestCircle care testeaza
 * clasa Circle.
 */

package isp_l3_ex2;

// Clasa publica Circle
public class Circle {
	
	// Variabile de instanta private
	private double radius = 1.0;		// Raza cercului
	private String color = "red";		// Culoarea cercului
	
	// Constructor default - schimbarea valorilor razei si a culorii cercului
	public Circle() {
		this.radius = 5.0;
		this.color = "blue";
	}
	
	// Constructor 1 - parametrii: raza cercului
	public Circle(double r) {
		this.radius = r;
	}
	
	// Constructor 2 - parametrii: culoarea cercului
	public Circle(String c) {
		this.color = c;
	}
	
	// Constructor 3 - valorile razei si a culorii cercului vor fi valorile curente
	public Circle(double r, String c) {
		this.radius = r;
		this.color = c;
	}
	
	// Metoda getRadius() - returneaza raza cercului
	public double getRadius() {
		return this.radius;
	}
	
	// Metoda getColor() - returneaza culoarea cercului
	public String getColor() {
		return this.color;
	}
	
	// Metoda getPerimeter() - returneaza perimetrul / lungimea cercului
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	
	// Metoda getArea() - returneaza aria cercului
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	
}
