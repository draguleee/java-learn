/*
 * Clasa Point
 * 
 * Exemplu de mostenire (generalizare)
 */

package isp_l5_pointcircle_mostenire;

// Clasa publica Point
public class Point {
	
	// Atributele / variabilele de instanta pentru clasa Point
	int x;
	int y;
	
	// Constructor - fara parametrii
	public Point() {
		System.out.println("Constructor default Point.");
		this.x = 1;
		this.y = 1;
	}
	
	// Constructor - parametrii: x (int), y (int)
	public Point(int x, int y) {
		System.out.println("Constructor cu argumente Point.");
		this.x = x;
		this.y = y;
	}
	
	// Metoda drawing() - fara parametrii
	// Deseneaza punctul
	void drawing() {
		System.out.println("Drawing point: [" + this.x + "," + this.y + "]");
	}

}
