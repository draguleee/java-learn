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

//Clasa publica Circle
public class Circle extends Shape{
	
	// Variabila de stare
	protected double radius;			// Raza cercului
	
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