/*
 * Clasa Point
 */

package isp_l3_cvo;

// Clasa publica Point, care modeleaza utilizarea cuvantului cheie static
public class Point {
	
	// Atributele / variabilele de instanta ale clasei Point
	int x;
	static int y;
	
	// Metoda displayPoint() - afisarea punctului
	public void displayPoint() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("-------");
	}
	
	// Setter pentru atributul y
	public static void setY(int y) {
		y = y;
	}
	
	
	// Metoda main() - programul principal
	public static void main(String[] args) {
		
		// Crearea obiectelor de tip Point
		Point p1 = new Point();
		Point p2 = new Point();
		
		// Afisare punct p1
		p1.x = 10;
		p1.y = 15;
		p1.displayPoint();
		
		// Afisare punct p2
		p2.x = 256;
		p2.y = 128;
		p2.displayPoint();
		
		// Setare y - static
		Point.setY(200);
		p1.displayPoint();
		p2.displayPoint();
	}

}
