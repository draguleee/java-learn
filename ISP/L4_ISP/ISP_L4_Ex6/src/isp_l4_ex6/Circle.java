/*
 * Exercitiul 6
 * 
 * Clasa Cerc contine:
 * - O variabila de instanta radius (double)
 * - Trei constructori precum in diagrama de clase din indrumator. Constructorul fara argumente
 * initializeaza variabila radius cu valoarea 1.0
 * - Getteri si setteri pentru variabila de instanta radius
 * - Metodele getArea() si getPerimeter()
 * - Sa se suprascrie metoda toString() mostenita, pentru a returna "A Circle with radius xxx, 
 * which is a subclass of yyy", unde yyy este output-ul returnat de metoda toString() din clasa
 * Shape.
 */

package isp_l4_ex6;

// Clasa publica Circle
public class Circle extends Shape{
	
	// Variabila de stare
	private double radius;			// Raza cercului
	
	// Constructor 1 - default
	public Circle() {
		super();
		this.radius = 1.0;
	}
	
	// Constructor 2 - parametrii: radius (double)
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	// Constructor 3 - parametrii: radius (double), color (String) si filled (boolean)
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}
	
	// Metoda getRadius() - returneaza raza cercului
	public double getRadius() {
		return this.radius;
	}
	
	// Metoda setRadius() - seteaza raza cercului
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// Metoda getArea() - returneaza aria cercului
	public double getArea() {
		return Math.PI*this.radius*this.radius;
	}
	
	// Metoda getPerimeter() - returneaza perimetrul cercului
	public double getPerimeter() {
		return 2*Math.PI*this.radius;
	}
	
	// Metoda toString()
	public String toString() {
		return "A Circle with radius " + this.radius + ", which is a subclass of " + super.toString();
	}

}
