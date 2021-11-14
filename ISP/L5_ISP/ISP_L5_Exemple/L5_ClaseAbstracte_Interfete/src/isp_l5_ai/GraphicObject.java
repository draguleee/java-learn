/*
 * Clasa GraphicObject
 */

package isp_l5_ai;

// Clasa abstracta GraphicObject
// Clasa abstracta: clasa ce nu poate fi instantiata
// Declarare clasa abstracta: modificatorul abstract
// O clasa abstracta poate contine metode abstracte (metoda ce nu are implementare, ci doar semnatura)
public abstract class GraphicObject {

	// Atributele / variabilele de instanta ale clasei GraphicObject
	int x;
	int y;
	
	// Metoda moveTo() - parametrii: newX (int), newY(int)
	// Mutarea obiectului grafic intr-un nou punct
	// Metoda normala
	public void moveTo(int newX, int newY) {
		System.out.println("Move graphic object to position: [" + this.x + "," + this.y + "]");
	}
	
	// Metoda draw() - fara parametrii
	// Deseneaza obiectul grafic
	// Metoda abstracta
	public abstract void draw();
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea unui obiect de tip Circle: Circle -> Circle
		Circle c1 = new Circle();
		c1.draw();
		System.out.println();
		
		// Crearea unui obiect de tip Circle: GraphicObject -> Circle
		GraphicObject c2 = new Circle();
		c2.draw();
		System.out.println();
		
		// Crearea unui obiect de tip Rectangle: Rectangle -> Rectangle
		Rectangle r1 = new Rectangle();
		r1.draw();
		System.out.println();
		
		// Crearea unui obiect de tip Rectangle: GraphicObject -> Rectangle
		GraphicObject r2 = new Rectangle();
		r2.draw();
		System.out.println();
	}
	
}


// Clasa Circle, care extinde / mosteneste clasa GraphicObject
class Circle extends GraphicObject {
	
	// Metoda draw() - fara parametrii
	// Deseneaza obiectul grafic
	public void draw() {
		System.out.println("Draw circle.");
	}

}


// Clasa Rectangle, care extinde / mosteneste clasa GraphicObject
class Rectangle extends GraphicObject {
	
	// Metoda draw() - fara parametrii
	// Deseneaza obiectul grafic
	public void draw() {
		System.out.println("Draw rectangle.");
	}
}
