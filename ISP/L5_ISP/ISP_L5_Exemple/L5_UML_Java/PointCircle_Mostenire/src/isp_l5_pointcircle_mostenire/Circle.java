/*
 * Clasa Circle
 * 
 * Exemplu de mostenire (generalizare)
 */

package isp_l5_pointcircle_mostenire;

// Clasa publica Circle
public class Circle extends Point{
	
	// Atributele / variabilele de instanta pentru clasa Circle
	int r;
	
	// Constructor - fara parametrii
	public Circle() {
		super();
		this.r = 1;
		System.out.println("Constructor default Circle.");
	}
	
	// Constructor - parametrii: x (int), y (int), r (int)
	public Circle(int x, int y, int r) {
		super(x,y);
		this.r = r;
		System.out.println("Constructor cu argumente Circle.");
	}
	
	// Metoda drawing() - fara parametrii
	// Deseneaza cercul
	void drawing() {
		System.out.println("Drawing circle: [" + this.x + "," + this.y + "," + this.r + "]");
	}

}
