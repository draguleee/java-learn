/*
 * Exercitiul 1
 * 
 * O clasa numita Circle este proiectata in diagrama de clasa din laborator. Aceasta clasa contine:
 * - DOua variabile de instanta private: radius (double) si culoare (String), cu valorile default de
 * 1.0 si "red"
 * - Patru constructori supraincarcati
 * - Patru metode publice: getRadius(), getColor(), getPerimeter() si getArea()
 */

package isp_l4_ex1;

// Clasa publica Circle
public class Circle {
	
	// Variabile de instanta private
	private double radius;		// Raza cercului
	private String color;		// Culoarea cercului
	
	// Constructor default - schimbarea valorilor razei si a culorii cercului
	public Circle() {
		this.radius = 1.0;
		this.color = "red";
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