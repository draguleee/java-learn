/* 
 * Exercitiul 2
 * 
 * O clasa numita Circle contine:
 * - Doua variabile private de instanta: radius (de tip double), si color (de tip String), cu 
 * valoarea default de 1.0 si respectiv "red"
 * - Doi constructori supraincarcati
 * - Doua metode publice: getRadius() si getArea()
 * 
 * Sa se scrie o clasa care modeleaza clasa Circle. Sa se scrie o clasa TestCircle care testeaza
 * clasa Circle.
 */

package isp_l3_ex2;

// Clasa publica TestCircle
public class TestCircle {
	
	// Metoda main()
	public static void main(String[] args) {
		
		// Crearea obiectelor de tip Circle
		Circle c1 = new Circle();
		Circle c2 = new Circle(3.5);
		Circle c3 = new Circle("yellow");
		Circle c4 = new Circle(1.0,"white");
		
		// Cercul c1
		double r1 = c1.getRadius();
		System.out.println("Raza cercului c1: " + r1);
		String col1 = c1.getColor();
		System.out.println("Culoarea cercului c1: " + col1);
		double p1 = c1.getPerimeter();
		System.out.println("Perimetrul cercului c1: " + p1);
		double a1 = c1.getArea();
		System.out.println("Aria cercului c1: " + a1);
		
		// Cercul c2
		System.out.println(" ");
		double r2 = c2.getRadius();
		System.out.println("Raza cercului c2: " + r2);
		double p2 = c1.getPerimeter();
		System.out.println("Perimetrul cercului c2: " + p2);
		double a2 = c1.getArea();
		System.out.println("Aria cercului c2: " + a2);
		
		// Cerciul c3
		System.out.println(" ");
		String col3 = c3.getColor();
		System.out.println("Culoarea cercului c3: " + col3);
		double p3 = c3.getPerimeter();
		System.out.println("Perimetrul cercului c3: " + p3);
		double a3 = c3.getArea();
		System.out.println("Aria cercului c3: " + a3);
		
		// Cercul c4
		System.out.println(" ");
		double r4 = c4.getRadius();
		System.out.println("Raza cercului c4: " + r4);
		String col4 = c4.getColor();
		System.out.println("Culoarea cercului c4: " + col4);
		double p4 = c4.getPerimeter();
		System.out.println("Perimetrul cercului c4: " + p4);
		double a4 = c4.getArea();
		System.out.println("Aria cercului c4: " + a4);
	}

}
