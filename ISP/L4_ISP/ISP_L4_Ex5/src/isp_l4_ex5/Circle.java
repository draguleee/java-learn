/*
 * Exercitiul 5
 * 
 * In acest exercitiu, o subclasa numita Cylinder este derivata din superclasa Circle precum in diagrama
 * claselor de mai jos.
 * 
 * Remarci:
 * - Se refoloseste clasa Circle din exercitiul anterior
 * - Se foloseste cuvantul cheie "suoper" pentru a apela constructorii din clasa de baza (clasa parinte)
 * - Se observa ca metoda getArea() din clasa derivata returneaza o valoare gresita, deoarece foloseste
 * formula cercului => se va suprascrie metoda getArea() pentru a afisa rezultatul corect in urma
 * calculului ariei pentru clasa derivata.
 */

package isp_l4_ex5;

//Clasa publica Circle
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