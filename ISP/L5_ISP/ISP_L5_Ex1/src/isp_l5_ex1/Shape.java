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

// Clasa publica Shape
public abstract class Shape {
	
	// Variabilele de instanta
	protected String color;				// Culoarea formei
	protected boolean filled;			// Statusul de umplere al formei
	
	// Constructor 1 - default
	public Shape() {
		this.color = "red";
		this.filled = true;
	}
	
	// Constructor 2 - parametrii: color (String), filled (boolean)
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	// Metoda getColor() - returneaza culoarea formei
	public String getColor() {
		return this.color;
	}
	
	// Metoda setColor() - seteaza culoarea formei
	public void setColor(String color) {
		this.color = color;
	}
	
	// Metoda isFilled() - returneaza statusul de umplere al formei
	public boolean isFilled() {
		return this.filled;
	}
	
	// Metoda setFilled() - seteaza statusul de umplere al formei
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	// Metoda getArea() - returneaza aria formei
	public abstract double getArea();
	
	// Metoda getPerimeter() - returneaza perimetrul formei
	public abstract double getPerimeter();
	
	// Metoda toString() - afiseaza detalii despre forma
	public String toString() {
		String f = "";
		if(this.filled == true) {
			f = "filled";
		}
		else if(this.filled == false) {
			f = "not filled";
		}
		return "A Shape with color of " + this.color + " and " + f;
	}

}
