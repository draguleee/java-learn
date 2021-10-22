/* 
 * Exercitiul 6
 * 
 * Clasa Rectangle contine:
 * - Doua variabile de instanta width (double) si length (double)
 * - Trei constructori precum in diagrama de clase din indrumator. Constructorul fara argumente
 * initializeaza width si length cu 1.0
 * - Getteri si setteri pentru toate variabilele de instanta
 * - Metodele getArea() si getPerimeter()
 * - Sa se suprascrie metoda toString() mostenita, ca sa returneze "A Rectangle with width xxx 
 * and length zzz, which is a subclass of yyy", unde yyy este output-ul returnat de metoda 
 * toString() din clasa Shape
 */

package isp_l4_ex6;

// Clasa publica Rectangle
public class Rectangle extends Shape {
	
	// Variabilele de instanta
	private double width;			// Latimea dreptunghiului
	private double length;			// Lungimea dreptunghiului
	
	// Constructor 1 - default
	public Rectangle() {
		super();
		this.width = 1.0;
		this.length = 1.0;
	}
	
	// Constructor 2 - parametrii: width (double), length (double)
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	// Constructor 3 - parametrii: width (double), length (double), color (String), filled (boolean)
	public Rectangle(double width, double length, String color, boolean filled) {
		super(color, filled);
		this.width = width;
		this.length = length;
	}
	
	// Metoda getWidth() - returneaza latimea dreptunghiului
	public double getWidth() {
		return this.width;
	}
	
	// Metoda setWidth() - seteaza latimea dreptunghiului
	public void setWidth(double width) {
		this.width = width;
	}
	
	// Metoda getLength() - returneaza lungimea dreptunghiului
	public double getLength() {
		return this.length;
	}
	
	// Metoda setLength() - seteaza lungimea dreptunghiului
	public void setLength(double length) {
		this.length = length;
	}
	
	// Metoda getArea() - returneaza aria dreptunghiului
	public double getArea() {
		return this.width*this.length;
	}
	
	// Metoda getPerimeter() - returneaza perimetrul cercului
	public double getPerimeter() {
		return 2*this.width+2*this.length;
	}
	
	// Metoda toString()
	public String toString() {
		return "A Rectangle with width " + this.width + " and length " + this.length + ", which is a subclass of " + super.toString();
	}

}
