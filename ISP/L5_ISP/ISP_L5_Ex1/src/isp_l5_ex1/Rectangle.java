/*
 * Exercitiul 1
 * 
 * Sa se urmareasca instructiunile si sa se implementeze programul conform specificatiilor. Sa se creeze
 * o clasa de testare adecvata pentru a testa programul. In scopul testarii, se va crea un vector de 
 * obiecte din clasa Shape si apoi se vor apela getArea() si getPerimeter() pentru fiecare obiect in 
 * vector.
 * 
 * In acest exercitiu, clasa Shape se va defini ca fiind o clasa abstracta, care contine:
 * - Doua variabila de instanta protected: color (String) si filled (boolean). Variabilele protected
 * pot fi accesate de subclasele si clasele din acelasi pachet. Sunt denotate cu semnul '#' in 
 * diagrama de clase.
 * - Getteri si setteri pentru toate variabilele de instanta
 * - O metoda toString() care sa afiseze detaliile formei
 * - Subclasele Circle si Rectangle vor suprascri metodele abstracte getArea() si getPerimeter() si vor
 * oferi o implementare adecvata. De asemenea, se va suprascrie si metoda toString().
 */

package isp_l5_ex1;

//Clasa publica Rectangle
public class Rectangle extends Shape {
	
	// Variabilele de instanta
	protected double width;				// Latimea dreptunghiului
	protected double length;			// Lungimea dreptunghiului
	
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