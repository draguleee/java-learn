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

//Clasa publica Square
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