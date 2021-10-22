/*
 * Exercitiul 6
 * 
 * Sa se scrie clasa Square, ca fiind o subclasa a clasei Rectangle. Clasa Square nu are nicio
 * variabila de instanta, insa mosteneste variabilele width si length din superclasa Rectangle.
 * - Sa se scrie constructorii adecvati
 * - Sa se suprascrie metoda toString() pentru a returna "A Square with side xxx, which is a 
 * subclass of yyy", unde yyy este output-ul returnat de metoda toString() a superclasei
 * Rectangle
 * - Sa se suprascrie metoda setLength() si setWidth() pentru a schimba atat width, cat si
 * length, pentru a mentine geometria patratului.
 */

package isp_l4_ex6;

// Clasa publica Square
public class Square extends Rectangle {
	
	// Constructor 1 - default
	public Square() {
		super();
	}
	
	// Constructor 2 - parametrii: side (double)
	public Square(double side) {
		super();
		super.setWidth(side);
		super.setLength(side);
	}
	
	// Constructor 3 - parametrii: side (double), color (String), filled (boolean)
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	// Metoda getSide() - returneaza latura patratului
	public double getSide() {
		return super.getWidth();
	}
	
	// Metoda setSide() - seteaza latura patratului
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
	}
	
	// Metoda setWidth() - seteaza latura patratului (suprascriere)
	public void setWidth(double side) {
		super.setWidth(side);
	}
	
	// Metoda setLength() - seteaza latura patratului (suprascriere)
	public void setLength(double side) {
		super.setLength(side);
	}
	
	// Metoda toString()
	public String toString() {
		return "A Square with side " + this.getSide() + ", which is a subclass of " + super.toString();
	}

}
