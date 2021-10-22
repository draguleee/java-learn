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

// Clasa publica Cylinder
public class Cylinder extends Circle {
	
	// Variabilele de instanta
	private double height;			// Inaltimea cilindrului
	
	// Constructor 1 - default
	public Cylinder() {
		super();
		this.height = 1.0;
	}
	
	// Constructor 2 - parametrii: radius, de tip double
	public Cylinder(double radius) {
		super(radius);
	}
	
	// Constructor 3 - parametrii: color, de tip String
	public Cylinder(String color) {
		super(color);
	}
	
	// Constructor 4 - parametrii: radius, de tip double si color, de tip String
	public Cylinder(double radius, String color) {
		super(radius,color);
	}
	
	// Constructor 5 - parametrii: radius, de tip double si height, de tip double
	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}
	
	// Constructor 6 - parametrii: color, de tip String si height, de tip double
	public Cylinder(String color, double height) {
		super(color);
		this.height = height;
	}
	
	// Constructor 7 - parametrii: radius, de tip double; color, de tip String; height, de tip double
	public Cylinder(double radius, String color, double height) {
		super(radius, color);
		this.height = height;
	}
	
	// Metoda getHeight() - returneaza inaltimea cilindrului
	public double getHeight() {
		return this.height;
	}
	
	// Metoda getRadius() - returneaza raza cercului
	public double getRadius() {
		return this.getRadius();
	}
		
	// Metoda getColor() - returneaza culoarea cercului
	public String getColor() {
		return this.getColor();
	}
		
	// Metoda getArea() - returneaza aria cercului
	public double getArea() {
		return 2*Math.PI*this.getRadius()*(this.getRadius()+this.height);
	}
	
	// Metoda getVolume() - returneaza volumul cercului
	public double getVolume() {
		return Math.PI*this.getRadius()*this.getRadius()*this.height;
	}

}
